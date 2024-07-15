package com.mapping.SocialMedia.exception_handling;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import com.mapping.SocialMedia.custom_exception.NoUserPresentException;
import com.mapping.SocialMedia.custom_exception.UserNotFoundException;
import com.mapping.SocialMedia.custom_exception.UserNotSaveException;

@RestControllerAdvice
public class GlobalHandlingException {
	
	 @ExceptionHandler(MethodArgumentTypeMismatchException.class)
	    public ResponseEntity<String> handleMethodArgumentTypeMismatchException(MethodArgumentTypeMismatchException ex) {
	        String error = "Invalid parameter: " + ex.getName();
	        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	    }
	 
	 @ExceptionHandler(MethodArgumentNotValidException.class)
		public ResponseEntity<Map<String,String>> handleMethodVoliationException(MethodArgumentNotValidException ex) {
			Map<String, String> errors = new HashMap<>();

			ex.getBindingResult().getAllErrors().forEach(err -> {
				String fieldName = ((FieldError) err).getField();
				String message = err.getDefaultMessage();
				errors.put(fieldName, message);
			});
			return new ResponseEntity<>(errors,HttpStatus.BAD_REQUEST);
		}
	
	@ExceptionHandler(NoUserPresentException.class)
	public ResponseEntity<String> handleNoUserPresentException(NoUserPresentException ex) {
		return new ResponseEntity<>(ex.getMessage(),HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(UserNotSaveException.class)
	public ResponseEntity handleUserNotSavedException(UserNotSaveException ex) {
		return new ResponseEntity(ex.getMessage(),HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<String> handleUserNotFoundException(UserNotFoundException ex) {
		return new ResponseEntity<>(ex.getMessage(),HttpStatus.BAD_REQUEST);
	}

}

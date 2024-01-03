package Jpa.SpringJpaAssignment.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import Jpa.SpringJpaAssignment.entity.Student;
import Jpa.SpringJpaAssignment.repository.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	StudentRepository stdRepo;
	
	@PostMapping("/student")
	public String addStudent(Student stuObj) {
		stdRepo.save(stuObj);
		return "Student save in Database";
	}
	@GetMapping("/student/{stuId}")
	public Optional<Student> getStudentData(@PathVariable int stuId) {
		Optional<Student> obj = stdRepo.findById(stuId);
		return obj; 
	}
	@PutMapping("/student/{stuId},{stuName},{address},{phoneNo}")
	public String updateStudent(@PathVariable int stuId,
			@PathVariable String stuName,
			@PathVariable String address,
			@PathVariable int phoneNo) 
	{
		Optional<Student> studentObj = stdRepo.findById(stuId);
		if(studentObj.isPresent()) {
		
			 Student existingStudent = studentObj.get();
	         existingStudent.setStuName(stuName);
	         existingStudent.setAddress(address);
	         existingStudent.setPhoneNo(phoneNo);
		}
		return "Data Updated Successfully";
	}
	
	@DeleteMapping("/student/{stuId}")
	public String deleteStudent(@PathVariable int stuId) {
		stdRepo.deleteById(stuId);
		return "Student data is delete";
	}
}

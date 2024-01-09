package JPA.CustomQueryJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import JPA.CustomQueryJPA.entity.Student;
import JPA.CustomQueryJPA.entity.Trainer;
import JPA.CustomQueryJPA.service.DataService;

@RestController
public class DataContoller {

	@Autowired
	DataService newService;
	
	@PostMapping("/student")
	public String addStudent(Student studObj) {
		newService.addStudent(studObj);
		return "Student Data Added in database";
	}
	
	@PostMapping("/trainer")
	public String addTrainer(Trainer trObj) {
		newService.addTrainer(trObj);
		return "New Trainer added";
	}
	
	@GetMapping("/student/trainer/{trainername}")
	public List<Object[]> findAllStudentBasedOnName(@PathVariable String trainername){
		List<Object[]>studList = newService.getStudentBasedOnTrainer(trainername);
		return studList;
	}
}

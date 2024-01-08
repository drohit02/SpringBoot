package SpringService.SpringJPAServiceAnno;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import SpringService.SpringJPAServiceAnno.entity.Student;

@RestController
public class StudentController {
	
	@Autowired
	StudnentService srv;

	@PostMapping("/student")
	public String addStudent(Student studObj) {
		srv.addStudent(studObj);
		return "Student added successfully";
	}
	
	@GetMapping("/student")
	public List<Student> findAllStudent() {
		List<Student> myList = srv.findAllStudent();
		return myList;
	}
	
	@GetMapping("/student/marks/{mark}")
	public List<Student> getStudent(@PathVariable int mark) {
		List<Student> myList = srv.getStudent(mark);
		return myList;
	}
}


package SpringService.SpringJPAServiceAnno;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringService.SpringJPAServiceAnno.entity.Student;
import SpringService.SpringJPAServiceAnno.repository.StudentRepository;

@Service
public class StudnentService {
	
	@Autowired
	StudentRepository stdRepo;
	
	public String addStudent(Student studObj) {
		stdRepo.save(studObj);
		return "Data saed in database";
	}
	
	public List<Student> findAllStudent() {
		List<Student> myList = stdRepo.findAll();
		return myList;
	}
	
	public List<Student> getStudent(int marks){
		List<Student> myList = stdRepo.findByMarks(marks);
		return myList;
	}
	

}

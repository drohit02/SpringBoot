package JPA.CustomQueryJPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import JPA.CustomQueryJPA.entity.Student;
import JPA.CustomQueryJPA.entity.Trainer;
import JPA.CustomQueryJPA.repository.StudentRepository;
import JPA.CustomQueryJPA.repository.TrainerRepository;

@Service
public class DataService {

	@Autowired
	StudentRepository studRepo;
	
	@Autowired
	TrainerRepository trRepo;
	
	public void addStudent(Student studObj) {
		studRepo.save(studObj);
	}
	public void addTrainer(Trainer trObj) {
		trRepo.save(trObj);
	}
	public List<Object[]> getStudentBasedOnTrainer(String name){
		
		List<Trainer> trainerData = trRepo.findByTrainerName(name);
		int id = trainerData.get(0).getTrainerId(); 
		
		System.out.println(id);
		
		List<Object[]> studList = studRepo.findByTrainVarTrainerId(id);
		return studList;
		
	}
}

package JPA.CustomQueryJPA.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="trainer")
public class Trainer {

	@Id
	@Column(name="trainer_id")
	private int trainerId;
	@Column(name="trainer_name")
	private String trainerName;
	
	@OneToMany(targetEntity = Student.class ,cascade = CascadeType.ALL,mappedBy = "trainVar")
	List<Student> studList;
	
	public Trainer() {
		// TODO Auto-generated constructor stub
	}

	public Trainer(int trainerId, String trainerName, List<Student> studList) {
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		//this.studList = studList;
	}

	public int getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public List<Student> getStudList() {
		return studList;
	}

	public void setStudList(List<Student> studList) {
		this.studList = studList;
	}
	
	
	
	
}
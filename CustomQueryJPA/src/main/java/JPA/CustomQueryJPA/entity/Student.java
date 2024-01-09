package JPA.CustomQueryJPA.entity;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	@Column(name="stud_id")
	private int studId;
	@Column(name="stud_name")
	private String studName;
	@Column(name="marks")
	private int marks;

	@ManyToOne(targetEntity = Trainer.class)
	@JoinColumn(name="trainer_id")
	Trainer trainVar;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int studId, String studName, int marks, Trainer trainVar) {
		this.studId = studId;
		this.studName = studName;
		this.marks = marks;
		this.trainVar = trainVar;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Trainer getTrainVar() {
		return trainVar;
	}

	public void setTrainVar(Trainer trainVar) {
		this.trainVar = trainVar;
	}
	
	
	
	
}

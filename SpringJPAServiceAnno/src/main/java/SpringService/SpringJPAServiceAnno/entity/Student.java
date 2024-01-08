package SpringService.SpringJPAServiceAnno.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {

	@Id
	@Column(name="stud_id")
	private int studId;
	@Column(name="stud_name")
	private String studName;
	@Column(name="marks")
	private int marks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int studId, String studName, int marks) {
		this.studId = studId;
		this.studName = studName;
		this.marks = marks;
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
	
	
	
}

package Jpa.SpringJpaAssignment.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")

public class Student {

	@Id
	@Column(name="stud_id")
	private int stuId;
	@Column(name="stud-name")
	private String stuName;
	@Column(name="address")
	private String address;
	@Column(name="phono_no")
	private int phoneNo;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int stuId, String stuName, String address, int phoneNo) {
		this.stuId = stuId;
		this.stuName = stuName;
		this.address = address;
		this.phoneNo = phoneNo;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "{stuId=" + stuId + ", stuName=" + stuName + ", address=" + address + ", phoneNo=" + phoneNo
				+ "}";
	}
	
	
}

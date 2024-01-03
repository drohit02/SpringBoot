package Jpa.SpringJpaAssignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Jpa.SpringJpaAssignment.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{
	

}

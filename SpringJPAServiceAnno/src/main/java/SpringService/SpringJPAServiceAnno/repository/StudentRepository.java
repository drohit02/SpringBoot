package SpringService.SpringJPAServiceAnno.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import SpringService.SpringJPAServiceAnno.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{

	public List<Student> findByMarks(int marks);
}

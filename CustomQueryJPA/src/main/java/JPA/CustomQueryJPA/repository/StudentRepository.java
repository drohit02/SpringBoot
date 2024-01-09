package JPA.CustomQueryJPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import JPA.CustomQueryJPA.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{
	
	@Query("SELECT studId,studName from Student as s,Trainer as t where s.trainVar.trainerId = t.trainerId")
	public List<Object[]> findByTrainVarTrainerId(int trainerid);
}


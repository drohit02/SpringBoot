package JPA.CustomQueryJPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import JPA.CustomQueryJPA.entity.Trainer;

@Repository
public interface TrainerRepository extends JpaRepository<Trainer, Integer>{

	public List<Trainer> findByTrainerName(String name);
}

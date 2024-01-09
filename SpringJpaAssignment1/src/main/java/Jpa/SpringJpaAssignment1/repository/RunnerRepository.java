package Jpa.SpringJpaAssignment1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Jpa.SpringJpaAssignment1.entity.Runner;

@Repository
public interface RunnerRepository extends JpaRepository<Runner,Integer>{

	long countByCtCityId(int cityId);

	
}

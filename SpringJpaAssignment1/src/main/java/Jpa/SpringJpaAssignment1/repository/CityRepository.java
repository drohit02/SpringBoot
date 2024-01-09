package Jpa.SpringJpaAssignment1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Jpa.SpringJpaAssignment1.entity.City;

@Repository
public interface CityRepository extends JpaRepository<City,Integer>{

	List<City> findByCityName(String name);
}

package Jpa.SpringJpaAssignment1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Jpa.SpringJpaAssignment1.entity.City;
import Jpa.SpringJpaAssignment1.entity.Runner;
import Jpa.SpringJpaAssignment1.repository.CityRepository;
import Jpa.SpringJpaAssignment1.repository.RunnerRepository;

@Service
public class DataService {

	@Autowired
	RunnerRepository runRepo;
	
	@Autowired
	CityRepository ctRepo;
	
	public void addRunneer(Runner runObj) {
		runRepo.save(runObj);
	}
	public void addCity(City ctObj) {
		ctRepo.save(ctObj);
	}
	
	public long findAllRunnerInCity(String cityname) {
		List<City> ctData = ctRepo.findByCityName(cityname);
		int cityId = ctData.get(0).getCityId();
		System.out.println(cityId);
		long totalRunner = runRepo.countByCtCityId(cityId);
		System.out.println("Total Runner in city "+ cityname + " are :"+ totalRunner);
		return totalRunner;
	}
}

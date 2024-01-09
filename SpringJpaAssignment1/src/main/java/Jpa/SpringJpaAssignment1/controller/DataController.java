package Jpa.SpringJpaAssignment1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import Jpa.SpringJpaAssignment1.entity.City;
import Jpa.SpringJpaAssignment1.entity.Runner;

@RestController
public class DataController {

	@Autowired
	DataService myService;
	
	@PostMapping("/runner")
	public String addRunner(Runner runObj) {
		myService.addRunneer(runObj);
		return "New Runner enterd in City";
	}
	
	@PostMapping("/city")
	public String addCity(City ctObj) {
		myService.addCity(ctObj);
		return "New city avaliable";
	}
	@GetMapping("/runner/allRunnerInCity/{cityname}")
	public long getAllRunner(@PathVariable String cityname )
	{
		long count = myService.findAllRunnerInCity(cityname);
		return count;
	}
}

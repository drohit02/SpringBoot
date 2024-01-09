package Jpa.SpringJpaAssignment1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="runner")
public class Runner {
	
	@Id
	@Column(name="runner_id")
	private int runnerId;
	
	@Column(name="runner_name")
	private String runnerName;
	
	@Column(name="city_name")
	private String cityName;
	
	@ManyToOne(targetEntity = City.class)
	@JoinColumn(name="city_id")
	City ct;
	
	public Runner() {
		// TODO Auto-generated constructor stub
	}

	public Runner(int runnerId, String runnerName, String cityName, City ct) {
		this.runnerId = runnerId;
		this.runnerName = runnerName;
		this.cityName = cityName;
		this.ct = ct;
	}

	public int getRunnerId() {
		return runnerId;
	}

	public void setRunnerId(int runnerId) {
		this.runnerId = runnerId;
	}

	public String getRunnerName() {
		return runnerName;
	}

	public void setRunnerName(String runnerName) {
		this.runnerName = runnerName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public City getCt() {
		return ct;
	}

	public void setCt(City ct) {
		this.ct = ct;
	}

}

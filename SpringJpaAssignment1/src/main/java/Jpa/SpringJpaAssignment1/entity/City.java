package Jpa.SpringJpaAssignment1.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="city")
public class City {

	@Id
	@Column(name = "city_id")
	private int cityId;
	@Column(name="city_name")
	private String cityName;
	
	@OneToMany(targetEntity = Runner.class,cascade = CascadeType.ALL,mappedBy = "runnerId")
	List<Runner> runnerList ;
	
	public City() {
		// TODO Auto-generated constructor stub
	}

	public City(int cityId, String cityName, List<Runner> runnerList) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
		this.runnerList = runnerList;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public List<Runner> getRunnerList() {
		return runnerList;
	}

	public void setRunnerList(List<Runner> runnerList) {
		this.runnerList = runnerList;
	}
	
}

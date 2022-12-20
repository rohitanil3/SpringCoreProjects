package springDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import springDI.service.FotuneService;

@Component
public class BaseballCoach implements CoachInterface {

	@Autowired
	private FotuneService fortuneservice;
	@Value("${email}")
	private String email;
	@Value("${team}")
	private String team;

	public String getTeam() {
		return team;
	}

	public String getEmail() {
		return email;
	}

	public BaseballCoach() {
		System.out.println("Default constructor of BaseballCoach called.");
	}

	public void setFortuneservice(FotuneService fortuneservice) {
		System.out.println("setter method called...");
		this.fortuneservice = fortuneservice;
	}

	@Override
	public String getDailyWorkout() {
		return "spend 30 min in practice.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneservice.getFortune();
	}

}

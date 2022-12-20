package springDI;

import springDI.service.FotuneService;

public class BaseballCoach implements CoachInterface {
	
	private FotuneService fortuneservice;
	private String email;
	
	


	public String getEmail() {
		return email;
	}








	public void setEmail(String email) {
		System.out.println("Setter for email");
		this.email = email;
	}








	public BaseballCoach() {
		System.out.println("Default constructor of BaseballCoach called.");
	}



	




	public void setFortuneservice(FotuneService fortuneservice) {
		System.out.println("setter method called...");
		this.fortuneservice = fortuneservice;
	}




	@Override
	public String getDailyWorkout(){
		return "spend 30 min in practice.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneservice.getFortune();
	}

}

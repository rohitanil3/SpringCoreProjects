package springDI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("applicationcontext.xml");
		BaseballCoach baseballbean = applicationContext.getBean("mybasecoach",BaseballCoach.class);
		System.out.println(baseballbean.getDailyWorkout());
		System.out.println(baseballbean.getDailyFortune());
		System.out.println(baseballbean.getEmail());
		applicationContext.close();
		
		//so tomo supose I need to get update on cricket coach then i would simple change the 
		//implementation class in xml file rather hard coding here 

	}

}

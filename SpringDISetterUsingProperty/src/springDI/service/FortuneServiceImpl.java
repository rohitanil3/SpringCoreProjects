package springDI.service;

import org.springframework.stereotype.Component;

@Component
public class FortuneServiceImpl implements FotuneService{

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Om Shanti!";
	}

}

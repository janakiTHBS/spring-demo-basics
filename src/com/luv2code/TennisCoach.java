package com.luv2code;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("tennis")
//@Scope("prototype")
public class TennisCoach implements Coach {
	@Autowired
	private FortuneService fortuneService;
	@Value("${foo.email}")
	private String email;
	@Value("${foo.team}")
	private String team;
	
	public String getEmail() {
		return email;
	}
	
	public String getTeam() {
		return team;
	}
	
	/*@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}*/
    @PostConstruct
	public void doStartmystuff() {
		System.out.println("Init method");
	}
    @PreDestroy
    public void domyClean() {
    	System.out.println("domyclean()");
    }
	public TennisCoach() {
		System.out.println("inside default constructor");
	}
	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "work out daily backhand volley";
	}

	@Override
	public String getDailyFortune() {
	
		return fortuneService.getFortune();
	}

}

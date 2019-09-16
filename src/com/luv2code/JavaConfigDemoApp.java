package com.luv2code;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		//ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportsConfig.class);
		TennisCoach theCoach=context.getBean("tennisCoach",TennisCoach.class);
        System.out.println(theCoach.getDailyWorkOut());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getEmail());
        System.out.println(theCoach.getTeam());
        context.close();
	}

}

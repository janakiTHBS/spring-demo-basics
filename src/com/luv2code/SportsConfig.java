package com.luv2code;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
//@ComponentScan("com.luv2code")
@PropertySource("classpath:sports.properties")
public class SportsConfig {

	
	@Bean
    public static PropertySourcesPlaceholderConfigurer
                    propertySourcesPlaceHolderConfigurer() {
        
        return new PropertySourcesPlaceholderConfigurer();
    }
	@Bean
	public Coach tennisCoach() {
		TennisCoach tennis=new TennisCoach();
		return tennis;
	}
	@Bean
	public FortuneService fortuneService() {
		return new HappyFortuneService();
	}
}

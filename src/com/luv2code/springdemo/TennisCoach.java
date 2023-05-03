package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component()
//@Scope("prototype")
@Scope("singleton")
public class TennisCoach implements Coach{
    @Autowired
    private FortuneService fortuneService;

    /*@Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }*/

    /*@Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println(">> TennisCoach: inside setter setFortuneService");
        this.fortuneService = fortuneService;
    }*/

    public TennisCoach() {
        System.out.println(">> TennisCoach: inside default constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {

        return fortuneService.getFortune();
    }
}

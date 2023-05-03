package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        Coach theCoach = context.getBean("tennisCoach",Coach.class);
        Coach alphaCoach = context.getBean("tennisCoach",Coach.class);
        boolean result = (theCoach==alphaCoach);
        //printout the results
        System.out.println("\nPointing to the same object: "+result);
        System.out.println("\nMemory location for theCoach:"+ theCoach);
        System.out.println("\nMemory location for alphaCoach: "+alphaCoach+"\n");

        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getDailyWorkout());

        //close the context
        context.close();
    }
}
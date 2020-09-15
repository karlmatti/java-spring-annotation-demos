package matti.karl.app;

import matti.karl.model.BasketballCoach;
import matti.karl.model.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {

    public static void main(String[] args) {
        // read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        String coachBeanId = "basketballCoach";
        // get the bean from spring container
        BasketballCoach coach = context.getBean(coachBeanId, BasketballCoach.class);
        System.out.println(coach.getTeam() + " email is " + coach.getEmail());
        // call a method on the bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        // close the context
        context.close();
    }

}

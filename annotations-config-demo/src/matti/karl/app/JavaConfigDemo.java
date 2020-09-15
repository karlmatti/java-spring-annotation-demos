package matti.karl.app;

import matti.karl.config.SportConfig;
import matti.karl.model.BasketballCoach;
import matti.karl.model.Coach;
import matti.karl.model.SwimCoach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemo {
    public static void main(String[] args) {

        // read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        String coachBeanId = "swimCoach";
        // get the bean from spring container
        SwimCoach coach = context.getBean(coachBeanId, SwimCoach.class);
        System.out.println("Team " + coach.getTeam() + " email is " + coach.getEmail());
        // call a method on the bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        // close the context
        context.close();

    }
}

package matti.karl;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.SocketUtils;

public class MyApp {
    public static void main(String[] args) {
        // create a spring container
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve a bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Lunch theLunch = context.getBean("myLunch", Lunch.class);

        // call the methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyMotivation());
        System.out.println("Lunch for today is " + theLunch.getDailyDeal());

        // close the context
        context.close();
    }
}

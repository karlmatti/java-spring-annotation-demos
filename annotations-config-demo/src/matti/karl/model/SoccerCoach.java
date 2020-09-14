package matti.karl.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class SoccerCoach implements Coach {
    private FortuneService fortuneService;

    /*
    @Autowired
    public SoccerCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
     */

    public SoccerCoach(){
        System.out.println("SoccerCoach: inside default constructor");
    }

    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("SoccerCoach: inside setFortuneService method");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "penalty kicks with real keeper";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}

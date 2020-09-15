package matti.karl.model;

import matti.karl.model.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BasketballCoach implements Coach {
    @Qualifier("randomFortuneService")
    @Autowired
    private FortuneService fortuneService;

    @Value("${andresSober.email}")
    private String email;
    @Value("${andresSober.team}")
    private String team;

    /*
    @Autowired
    public BasketballCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }
     */
    public BasketballCoach(){
        System.out.println("BasketballCoach: inside default constructor");
    }

    /*@Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("BasketballCoach: inside setFortuneService method");
        this.fortuneService = fortuneService;
    }*/
    /*
    @Autowired
    public void myCustomMethod(FortuneService fortuneService) {
        System.out.println("BasketballCoach: inside myCustomMethod method");
        this.fortuneService = fortuneService;
    }*/

    @Override
    public String getDailyWorkout() {
        return "10 minute jump rope jumps";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}

package matti.karl.model;

import matti.karl.model.Coach;
import org.springframework.stereotype.Component;

@Component("theFastCoach")
public class BasketballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "10 minute jump rope jumps";
    }
}

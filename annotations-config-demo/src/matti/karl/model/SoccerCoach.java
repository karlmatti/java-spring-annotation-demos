package matti.karl.model;

import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "penalty kicks with real keeper";
    }
}

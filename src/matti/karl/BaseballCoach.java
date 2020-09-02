package matti.karl;

public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyMotivation() {
        return "One day or Day one - you decide";
    }
}

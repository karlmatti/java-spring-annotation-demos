package matti.karl;

public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyMotivation() {
        return "Today is your lucky day!";
    }
}

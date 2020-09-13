package matti.karl;

public class BaseballCoach implements Coach {
    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    // add an init method
    public void doMyStartupStuff(){
        System.out.println("BaseBallCoach: inside method doMyStartupStuff()");
    }

    // add a destroy method
    public void doMyCleanUpStuff(){
        System.out.println("BaseBallCoach: inside method doMyCleanUpStuff()");
    }
}

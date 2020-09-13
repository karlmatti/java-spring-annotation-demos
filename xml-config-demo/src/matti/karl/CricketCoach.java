package matti.karl;

public class CricketCoach implements Coach{
    private FortuneService fortuneService;
    private String email;
    private String firstName;


    public CricketCoach(){
        System.out.println("CricketCoach: inside no-arg constructor.");
    }

    public void setEmail(String email) {
        System.out.println("CricketCoach: inside setEmail.");
        this.email = email;
    }

    public void setFirstName(String firstName) {
        System.out.println("CricketCoach: inside setFirstName.");
        this.firstName = firstName;
    }



    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setFortuneService.");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice bowling 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }
}

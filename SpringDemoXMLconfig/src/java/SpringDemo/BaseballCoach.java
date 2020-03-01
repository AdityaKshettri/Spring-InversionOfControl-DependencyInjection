package SpringDemo;

public class BaseballCoach implements Coach {
    
    private FortuneService fortuneService;
    
    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    
    @Override
    public String getDailyWorkout() {
        return "spend 30 minutes on exercise";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
    
}

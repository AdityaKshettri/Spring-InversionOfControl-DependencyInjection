
package SpringDemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

    private FortuneService fortuneService;
    
    @Value("${email}")
    private String email;
    
    @Value("${team}")
    private String team;

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    
    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warmup";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
    
}

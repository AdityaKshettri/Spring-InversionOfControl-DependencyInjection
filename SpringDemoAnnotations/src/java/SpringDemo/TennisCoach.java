package SpringDemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
      
    @Autowired
    private FortuneService fortuneService;

    /*
    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    */
    
    public TennisCoach() {
        System.out.println("Inside TennisCoach default Constructor");
    }

    /*
    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside TennisCoach setter method");
        this.fortuneService = fortuneService;
    }
    */
    
    /*
    @Autowired
    public void func(FortuneService fortuneService) {
        System.out.println("Inside TennisCoach function func()");
        this.fortuneService = fortuneService;
    }
    */
    
    @Override
    public String getDailyWorkout() {
        return "Practice your tennis";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
    
    @PostConstruct
    public void startup() {
        System.out.println("Start");
    }
    
    @PreDestroy
    public void end() {
        System.out.println("End");
    }
}

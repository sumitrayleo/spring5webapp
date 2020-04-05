package ray.springframework.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import ray.springframework.di.service.GreetingService;

@Controller
public class SetterInjectedController {
    private GreetingService setterInjectedService;

    @Qualifier("SetterInjectedGreetingService")
    @Autowired
    public void setSetterInjectedService(GreetingService setterInjectedService) {
        this.setterInjectedService = setterInjectedService;
    }

    public void greetings(){
        setterInjectedService.greetings();
    }
}

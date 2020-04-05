package ray.springframework.di.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import ray.springframework.di.service.GreetingService;

@Controller
public class ConstructedInjectedController {

    GreetingService constructorInjectedGreetingService;

    public ConstructedInjectedController(@Qualifier("constructorInjectedGreetingService") GreetingService constructorInjectedGreetingService) {
        this.constructorInjectedGreetingService = constructorInjectedGreetingService;
    }

    public void greetings(){
        constructorInjectedGreetingService.greetings();
    }
}

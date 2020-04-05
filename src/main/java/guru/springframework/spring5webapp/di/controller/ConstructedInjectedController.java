package guru.springframework.spring5webapp.di.controller;

import guru.springframework.spring5webapp.di.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

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

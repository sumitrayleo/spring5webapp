package guru.springframework.spring5webapp.di.controller;

import guru.springframework.spring5webapp.di.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryBeanController {

    GreetingService greetingService;

    public PrimaryBeanController(@Qualifier("primaryBeanGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void greetings(){
        greetingService.greetings();
    }
}

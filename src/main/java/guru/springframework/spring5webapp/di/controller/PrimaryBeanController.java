package guru.springframework.spring5webapp.di.controller;

import guru.springframework.spring5webapp.di.service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryBeanController {

    GreetingService greetingService;

    public PrimaryBeanController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void greetings(){
        greetingService.greetings();
    }
}

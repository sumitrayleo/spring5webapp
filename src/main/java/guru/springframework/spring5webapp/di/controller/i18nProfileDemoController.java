package guru.springframework.spring5webapp.di.controller;

import guru.springframework.spring5webapp.di.service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class i18nProfileDemoController {
    private final GreetingService greetingService;

    public i18nProfileDemoController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void sayHello(){
        greetingService.greetings();
    }
}

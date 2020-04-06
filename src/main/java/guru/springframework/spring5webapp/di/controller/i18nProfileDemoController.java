package guru.springframework.spring5webapp.di.controller;

import guru.springframework.spring5webapp.di.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class i18nProfileDemoController {
    private final GreetingService greetingService;

    public i18nProfileDemoController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void sayHello(){
        greetingService.greetings();
    }
}

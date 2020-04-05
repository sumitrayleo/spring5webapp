package guru.springframework.spring5webapp.di.controller;

import guru.springframework.spring5webapp.di.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyInjectedGreetingService")
    @Autowired
    GreetingService propertyService;

    public void greetings(){
        propertyService.greetings();
    }

}

package ray.springframework.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import ray.springframework.di.service.GreetingService;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyInjectedGreetingService")
    @Autowired
    GreetingService propertyService;

    public void greetings(){
        propertyService.greetings();
    }

}

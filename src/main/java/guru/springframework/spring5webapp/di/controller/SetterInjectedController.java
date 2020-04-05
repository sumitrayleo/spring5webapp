package guru.springframework.spring5webapp.di.controller;

import guru.springframework.spring5webapp.di.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private GreetingService setterInjectedService;

    @Qualifier("setterInjectedGreetingService")
    @Autowired
    public void setSetterInjectedService(GreetingService setterInjectedService) {
        this.setterInjectedService = setterInjectedService;
    }

    public void greetings(){
        setterInjectedService.greetings();
    }
}

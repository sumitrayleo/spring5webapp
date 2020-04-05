package guru.springframework.spring5webapp.di.controller;

import guru.springframework.spring5webapp.di.service.SetterInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setSetterInjectedService(new SetterInjectedGreetingService());
    }

    @Test
    void setSetterInjectedService() {
        setterInjectedController.greetings();
    }
}
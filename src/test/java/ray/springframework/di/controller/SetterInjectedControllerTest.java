package ray.springframework.di.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ray.springframework.di.service.SetterInjectedGreetingService;

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
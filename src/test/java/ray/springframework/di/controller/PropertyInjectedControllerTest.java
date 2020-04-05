package ray.springframework.di.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ray.springframework.di.service.PropertyInjectedGreetingService;

class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp() {
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.propertyService = new PropertyInjectedGreetingService();
    }

    @Test
    void greetings() {
        propertyInjectedController.greetings();
    }
}
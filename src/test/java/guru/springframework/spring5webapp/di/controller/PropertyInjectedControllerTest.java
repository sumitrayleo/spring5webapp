package guru.springframework.spring5webapp.di.controller;

import guru.springframework.spring5webapp.di.service.PropertyInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
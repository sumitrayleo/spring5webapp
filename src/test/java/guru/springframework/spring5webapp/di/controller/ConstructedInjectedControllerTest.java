package guru.springframework.spring5webapp.di.controller;

import guru.springframework.spring5webapp.di.service.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructedInjectedControllerTest {

    ConstructedInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructedInjectedController(new ConstructorInjectedGreetingService());
    }

    @Test
    void greetings() {
        controller.greetings();
    }
}
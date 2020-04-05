package ray.springframework.di.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ray.springframework.di.service.ConstructorInjectedGreetingService;

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
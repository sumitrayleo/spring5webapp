package guru.springframework.spring5webapp.di.controller;

import guru.springframework.spring5webapp.di.service.PrimaryBeanGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrimaryBeanControllerTest {

    PrimaryBeanController controller;

    @BeforeEach
    void setUp() {
        controller = new PrimaryBeanController(new PrimaryBeanGreetingService());
    }

    @Test
    void greetings() {
        controller.greetings();
    }
}
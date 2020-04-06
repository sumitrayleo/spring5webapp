package guru.springframework.spring5webapp.seggregation;

import org.junit.jupiter.api.Test;

class ToyBuilderTest {

    @Test
    void buildToyBus() {
        ToyBus toyBus = ToyBuilder.buildToyBus();
        System.out.println(toyBus);
    }

    @Test
    void buildToyHelicopter() {
        ToyHelicopter toyHelicopter = ToyBuilder.buildToyHelicopter();
        System.out.println(toyHelicopter);
    }

    @Test
    void buildToyHouse() {
        ToyHouse toyHouse = ToyBuilder.buildToyHouse();
        System.out.println(toyHouse);
    }
}
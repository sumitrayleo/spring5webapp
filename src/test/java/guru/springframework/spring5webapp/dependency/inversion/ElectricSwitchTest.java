package guru.springframework.spring5webapp.dependency.inversion;

import org.junit.jupiter.api.Test;

class ElectricSwitchTest {

    @Test
    void press() {
        LightBulb bulb = new LightBulb();
        ElectricSwitch electricSwitch = new ElectricSwitch(bulb);
        electricSwitch.press();
        electricSwitch.press();

        Fan fan = new Fan();
        ElectricSwitch electricSwitch1 = new ElectricSwitch(fan);
        electricSwitch1.press();
        electricSwitch1.press();

    }
}
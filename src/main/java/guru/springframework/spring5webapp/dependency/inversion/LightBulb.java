package guru.springframework.spring5webapp.dependency.inversion;

public class LightBulb implements Appliance {
    @Override
    public void turnOff() {
        System.out.println("LightBulb is turned OFF ....");
    }

    @Override
    public void turnOn() {
        System.out.println("LightBulb is turned ON ....");
    }
}

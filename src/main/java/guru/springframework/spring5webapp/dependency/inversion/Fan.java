package guru.springframework.spring5webapp.dependency.inversion;

public class Fan implements Appliance {
    @Override
    public void turnOff() {
        System.out.println("Fan is turned OFF ....");
    }

    @Override
    public void turnOn() {
        System.out.println("Fan is turned ON ....");
    }
}

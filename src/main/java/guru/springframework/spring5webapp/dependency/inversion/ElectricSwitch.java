package guru.springframework.spring5webapp.dependency.inversion;

public class ElectricSwitch implements Switch {
    Appliance appliance;
    private boolean on;

    public ElectricSwitch(Appliance appliance) {
        this.appliance = appliance;
        this.on = false;
    }

    @Override
    public boolean isOn() {
        return this.on;
    }

    @Override
    public void press() {
        if(this.isOn()){
            appliance.turnOff();
            this.on = false;
        }
        else {
            appliance.turnOn();
            this.on = true;
        }
    }
}
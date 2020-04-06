package guru.springframework.spring5webapp.seggregation;

public class ToyBuilder {

    public static ToyBus buildToyBus(){
        ToyBus toyBus = new ToyBus();
        toyBus.setPrice(123.23);
        toyBus.setColor("RED");
        toyBus.move();
        return toyBus;
    }

    public static ToyHelicopter buildToyHelicopter(){
        ToyHelicopter toyHelicopter = new ToyHelicopter();
        toyHelicopter.setPrice(321.21);
        toyHelicopter.setColor("BLUE");
        toyHelicopter.fly();
        return toyHelicopter;
    }

    public static ToyHouse buildToyHouse(){
        ToyHouse toyHouse = new ToyHouse();
        toyHouse.setPrice(9999.99);
        toyHouse.setColor("GREY");
        return toyHouse;
    }
}

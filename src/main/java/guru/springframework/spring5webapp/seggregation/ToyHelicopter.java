package guru.springframework.spring5webapp.seggregation;

public class ToyHelicopter implements Toy, Flyable {

    private double price;
    private String color;

    @Override
    public void fly() {
        System.out.println("@@@ The Toy Helicopter can fly ....");
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ToyHelicopter{" +
                "price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}

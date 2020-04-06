package guru.springframework.spring5webapp.seggregation;

public class ToyBus implements Toy, Moveable {
    private double price;
    private String color;

    @Override
    public void move() {
        System.out.println("$$$ Toy bus can move ....");
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
        return "ToyBus{" +
                "price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}

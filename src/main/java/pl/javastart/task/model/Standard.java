package pl.javastart.task.model;

import pl.javastart.task.model.Ticket;

public class Standard extends Ticket {
    public static  final double LOGISTICS_PRICE = 5;

    public Standard(String eventName, Address address, double price,  double discount) {
        super(eventName, address, price,  discount);
    }

    @Override
    public String getType() {
        return "Standard";
    }

    @Override
    public double getFinalPrice() {
        return super.getFinalPrice() + LOGISTICS_PRICE;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + super.getFinalPrice() + "+" + LOGISTICS_PRICE  + "zł" + " = " + getFinalPrice() + "zł";
    }
}

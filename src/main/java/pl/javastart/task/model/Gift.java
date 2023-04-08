package pl.javastart.task.model;

import pl.javastart.task.model.Ticket;

import static pl.javastart.task.model.Standard.LOGISTICS_PRICE;

public class Gift extends Ticket {
    public Gift(String eventName, Address address, double price, String type, double discount) {
        super(eventName, address, price, type, discount);
    }

    @Override
    public double getFinalPrice() {
        return super.getFinalPrice() + LOGISTICS_PRICE  + super.getFinalPrice() * getDiscount();
    }

    @Override
    public String printInfo() {
        return super.printInfo() + super.getFinalPrice() + " zł + " + LOGISTICS_PRICE + "zł+(" + getDiscountInfo() + "*"
                + super.getFinalPrice() + "zł) = " + getFinalPrice() + "zł";
    }
}

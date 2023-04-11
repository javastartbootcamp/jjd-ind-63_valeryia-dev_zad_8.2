package pl.javastart.task.model;

import pl.javastart.task.model.Ticket;

public class Online extends Ticket {

    public Online(String eventName, Address address, double price, double discount) {
        super(eventName, address, price, discount);
    }

    @Override
    public String getType() {
        return "Online";
    }

    @Override
    public String printInfo() {
        return super.printInfo() + getFinalPrice() + "zł";
    }
}


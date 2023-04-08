package pl.javastart.task.model;

import pl.javastart.task.model.Ticket;

public class Online extends Ticket {

    public Online(String eventName, Address address, double price, String type, double discount) {
        super(eventName, address, price, type, discount);
    }

    @Override
    public String printInfo() {
        return super.printInfo() + getFinalPrice() + "zł";
    }
}


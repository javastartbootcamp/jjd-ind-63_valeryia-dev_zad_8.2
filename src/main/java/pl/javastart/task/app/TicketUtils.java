package pl.javastart.task.app;

import pl.javastart.task.model.*;

public class TicketUtils {

    public double getPrice(Ticket ticket) {
        return ticket.getFinalPrice();
    }

    public void printInfo(Ticket ticket) {
        System.out.println(ticket.printInfo());
    }

}

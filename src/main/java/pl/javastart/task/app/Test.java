package pl.javastart.task.app;

import pl.javastart.task.io.DataReader;
import pl.javastart.task.model.*;

public class Test {
    public static void main(String[] args) {
        TicketUtils utils = new TicketUtils();
        Address address1 = new Address("Nowoursynowska", "145D", "04-373");
        Ticket ticket = new Standard("Imagine Dragons", address1, 100, "Standard", 0.05);
        utils.printInfo(ticket);
        DataReader reader = new DataReader();
        reader.createAndReadTicket();
    }
}

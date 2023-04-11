package pl.javastart.task.io;

import pl.javastart.task.model.Address;
import pl.javastart.task.model.Gift;
import pl.javastart.task.model.Online;
import pl.javastart.task.model.Ticket;

import java.util.Scanner;

public class DataReader {
    private Scanner scanner = new Scanner(System.in);

    private Address createAndReadAddress() {
        System.out.println("Podaj ulicę, jej numer i kod pocztowy");
        String street = scanner.nextLine();
        String streetNumber = scanner.nextLine();
        String postalCode = scanner.nextLine();
        return new Address(street, streetNumber, postalCode);
    }

    public Ticket createAndReadTicket() {
        System.out.println("Podaj nazwę wydażenia:");
        String eventName = scanner.nextLine();
        Address address = createAndReadAddress();
        System.out.println("Podaj cenę biletu:");
        double price = scanner.nextInt();;
        scanner.nextLine();
        System.out.println("Podaj typ biletu:");
        String type = scanner.nextLine();
        System.out.println("Podaj zniżkę:");
        double discount = scanner.nextInt();;
        scanner.nextLine();
        if (type.equals("Online"))
        return new Online(eventName, address, price, discount);
        else if (type.equals("Gift"))
            return new Gift(eventName, address, price, discount);
        else
            return new Ticket(eventName, address, price, discount);
    }
}



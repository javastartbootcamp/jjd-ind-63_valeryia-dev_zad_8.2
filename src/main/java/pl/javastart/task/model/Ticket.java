package pl.javastart.task.model;

public class Ticket {
    private String eventName;
    private Address address;
    private double price;
    private String type;
    private double discount;
    private int id = 0;

    public Ticket(String eventName, Address address, double price, String type, double discount) {
        this.eventName = eventName;
        this.address = address;
        this.price = price;
        this.type = type;
        this.discount = discount;
        this.id++;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getFinalPrice() {
        return 100 - (price * discount);
    }

    public String getDiscountInfo() {
        return discount * 100 + "%";
    }

    public String printInfo() {
        return "Bilet " + type + ": cena podstawowa " + price + "zł, zniżka " + getDiscountInfo()
               + ", cena finalna wyniesie ";
    }
}

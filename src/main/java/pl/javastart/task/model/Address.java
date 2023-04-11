package pl.javastart.task.model;

public class Address {
    String street;
    String streetNumber;
    String postalCode;

    public Address(String street, String streetNumber, String postalCode) {
        this.street = street;
        this.streetNumber = streetNumber;
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String printInfo() {
        return street + " " + streetNumber + ", "  + postalCode;
    }
}

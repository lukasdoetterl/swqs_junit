package com.example.project.order;

public class Address implements Comparable<Address> {
    private String id = null;
    private String surname = null;
    private String firstname = null;
    private String street = null;
    private String city = null;
    private String postcode = null;
    private String countryISO = null;

    public Address(String id, String surname, String firstname, String street, String city,
                   String postcode, String countryISO) {
        super();
        this.id = id;
        this.surname = surname;
        this.firstname = firstname;
        this.street = street;
        this.city = city;
        this.postcode = postcode;
        this.countryISO = countryISO;
    }

    public String getId() {
        return this.id;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getStreet() {
        return this.street;
    }

    public String getCity() {
        return this.city;
    }

    public String getPostcode() {
        return this.postcode;
    }

    public String getCountryISO() {
        return this.countryISO;
    }

    public int compareTo(Address address) {
        int compare = this.surname.compareToIgnoreCase(address.surname);
        if (compare == 0) {
            compare = this.firstname.compareToIgnoreCase(address.firstname);
        }
        return (compare);
    }

}

/*
* File: Property.java
* Author: Boros Zoltán
* Copyright: 2023, BorosFather
* Group: Szoft II N
* Date: 2023-02-19
* Github: https://github.com/BorosFather
* Licenc: GNU GPL
*/
package models;

public class Property {
    
    String city;
    String address;
    String size;
    double price;

    
    public Property(String city, String address, String size, double price) {
        this.city = city;
        this.address = address;
        this.size = size;
        this.price = price;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springframework.springcoreadvances.Autowiring.Annotation;

/**
 *
 * @author spring
 */
class Address {

    private int houseNumber;
    private String street;
    private String city;

    public Address(int houseNumber, String street, String city) {

        this.setHouseNumber(houseNumber);
        this.setStreet(street);
        this.setCity(city);
    }

    /**
     * @return the houseNumber
     */
    public int getHouseNumber() {
        return houseNumber;
    }

    /**
     * @param houseNumber the houseNumber to set
     */
    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return " HouseNumber : " + this.getHouseNumber() + " Street : " + this.getStreet() + " City : " + this.getCity();

    }

}

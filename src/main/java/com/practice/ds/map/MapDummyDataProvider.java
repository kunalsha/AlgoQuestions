package com.practice.ds.map;

import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Map;

public class MapDummyDataProvider {
    public static Map<String, Student> getDummyMap(int size){
        Map<String, Student> studentMap = new HashMap<>();

        for(int i=0;i<size;i++) {
            Faker faker = new Faker();
            String name = faker.name().fullName();
            String streetName = faker.address().streetName();
            String number = faker.address().buildingNumber();
            String city = faker.address().city();
            String country = faker.address().country();

            studentMap.put(name, new Student(name, new Address(streetName, number,city,country)));
        }
        return studentMap;
    }
}

class Student {
    private String name;
    private Address address;

    public Student (String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student name: " + name + " address: " + address.toString();
    }
}

class Address {
    private String streetName;
    private String number;
    private String city;
    private String country;

    public Address(String streetName, String number, String city, String country){
        this.streetName = streetName;
        this.number = number;
        this.city = city;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getNumber() {
        return number;
    }

    public String getStreetName() {
        return streetName;
    }

    @Override
    public String toString() {
        return "Address: streetName: " + streetName + " number: " + number + " city: " + city + " country: " + country;
    }
}
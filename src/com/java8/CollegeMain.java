package com.java8;

import java.util.List;
import java.util.Objects;

class Country {
    Integer id;
    String countryName;

    public Country() {
    }

    public Country(Integer id, String countryName) {
        this.id = id;
        this.countryName = countryName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", countryName='" + countryName + '\'' +
                '}';
    }
}

public class CollegeMain {

    public static void main(String[] args) {
        List<Country> countries = getCountry();
        if (Objects.nonNull(countries)){
            System.out.println("inside the if block");
            countries.forEach(a-> System.out.println(a));
        }
        else{
            System.out.println("Null Value");
        }
    }

    private static List<Country> getCountry() {
        List<Country> countries = null;
        Country country = new Country();
        countries.add(country);
        return countries;
    }
}

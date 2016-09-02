package com.dermenji.jsf;

import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by fns02 on 9/1/2016.
 */
@ManagedBean
public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private String favoriteLanguage;
    List<String> countryOption;
    List<String> favoriteIDE;

    public Student() {
        countryOption = new ArrayList<>();
        countryOption.add("Brasil");
        countryOption.add("UK");
    }

    public List<String> getFavoriteIDE() {
        return favoriteIDE;
    }

    public void setFavoriteIDE(List<String> favoriteIDE) {
        this.favoriteIDE = favoriteIDE;
    }

    public List<String> getCountryOption() {
        return countryOption;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

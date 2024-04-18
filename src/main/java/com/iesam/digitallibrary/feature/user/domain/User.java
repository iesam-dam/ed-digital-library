package com.iesam.digitallibrary.feature.user.domain;

public class User {
    public final String dni;
    public final String name;
    public final String surname;
    public final String phoneNumber;
    public final String email;
    public final String dateBorn;

    public User(String dni, String name, String surname, String phoneNumber, String email, String dateBorn) {
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.dateBorn = dateBorn;
    }
}

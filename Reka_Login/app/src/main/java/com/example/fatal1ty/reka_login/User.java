package com.example.fatal1ty.reka_login;

/**
 * Created by Fatal1ty on 9/7/2015.
 */
public class User {

    String nama, username, password, email;
    int nohp;

    public User(String nama, int noHp, String email, String username, String password) {
        this.nama = nama;
        this.nohp = noHp;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public User(String username, String password) {
        this("", -1, "", username, password);
    }
}

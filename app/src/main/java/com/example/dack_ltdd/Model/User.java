package com.example.dack_ltdd.Model;

public class User {
    int $id;
    Object emergrnCies;
    Object histoRies;
    int id;
    String name;
    String username;
    String password;
    String phone;
    String email;
    Object authorization;

    public User(int $id, Object emergrnCies, Object histoRies, int id, String name, String username, String password, String phone, String email, Object authorization) {
        this.$id = $id;
        this.emergrnCies = emergrnCies;
        this.histoRies = histoRies;
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.authorization = authorization;
    }
//SETER
    public void set$id(int $id) {
        this.$id = $id;
    }

    public void setEmergrnCies(Object emergrnCies) {
        this.emergrnCies = emergrnCies;
    }

    public void setHistoRies(Object histoRies) {
        this.histoRies = histoRies;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAuthorization(Object authorization) {
        this.authorization = authorization;
    }
    //GETER

    public int get$id() {
        return $id;
    }

    public Object getEmergrnCies() {
        return emergrnCies;
    }

    public Object getHistoRies() {
        return histoRies;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public Object getAuthorization() {
        return authorization;
    }
}

package com.qst.bean;

public class Customer {
    private Integer id;
    private  String name;
    private  String gender;
    private  String telephone;
    private  String address;

    public Customer() {
    }

    public Customer(Integer id, String name, String gender, String telephone, String address) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.telephone = telephone;
        this.address = address;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

package com.bridgelabz;

public class Contacts {
    private String name;
    private int age;
    private long phoneNumber;
    private String city;
    private String state;
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String toString() {
        return "Contacts{" +
                "firstName='" + name + '\'' +
                ", Age=" + age +
                ", phoneNumber=" + phoneNumber +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}

package com.bridgelabz;

public class Contacts {
    private String name;
    private int age;
    private long phoneNumber;
    private String city;
    private String state;
    public String getName() {
        System.out.println();
        return name;
    }
    public void setName(String firstName) {
        this.name = firstName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int Age) {
        this.age = Age;
    }
    public long getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
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

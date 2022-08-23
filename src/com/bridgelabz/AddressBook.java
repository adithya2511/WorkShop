package com.bridgelabz;
import java.util.Scanner;

public class AddressBook {
    Contacts contact = new Contacts();
    Scanner scan = new Scanner(System.in);

    void createContact() {
        Contacts contact = new Contacts();
        contact.setName("Adithya");
        System.out.println(contact.getName());
        contact.setAge(24);
        System.out.println(contact.getAge());
        contact.setPhoneNumber(892378231);
        System.out.println(contact.getPhoneNumber());
        contact.setCity("Hyderabad");
        System.out.println(contact.getCity());
        contact.setState("Telangana");
        System.out.println(contact.getState());
    }
    void addContact() {
        System.out.println("Enter Name :");
        contact.setName(scan.next());
        System.out.println("Enter Age :");
        contact.setAge(scan.nextInt());
        System.out.println("Enter Phone Number :");
        contact.setPhoneNumber(scan.nextLong());
        System.out.println("Enter City :");
        contact.setCity(scan.next());
        System.out.println("Enter State:");
        contact.setState(scan.next());
    }
    Contacts display() {
        return contact;
    }
}

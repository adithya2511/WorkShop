package com.bridgelabz;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    ArrayList<Contacts> contactList = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    void addContact() {
        Contacts contacts = new Contacts();
        System.out.println("Enter Name :");
        contacts.setName(scan.next());
        System.out.println("Enter Age :");
        contacts.setAge(scan.nextInt());
        System.out.println("Enter Phone Number :");
        contacts.setPhoneNumber(scan.nextLong());
        System.out.println("Enter City :");
        contacts.setCity(scan.next());
        System.out.println("Enter State:");
        contacts.setState(scan.next());
        contactList.add(contacts);
    }
}

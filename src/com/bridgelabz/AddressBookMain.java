package com.bridgelabz;

public class AddressBookMain {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        addressBook.createContact();
        addressBook.addContact();
        System.out.println(addressBook.display());
    }
}
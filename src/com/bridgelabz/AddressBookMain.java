package com.bridgelabz;
import java.util.HashMap;
import java.util.Map;

public class AddressBookMain {
    static final String MY_ADDRESS_BOOK = "My AddressBook";
    public static void main(String[] args) {
        Map<String,AddressBook> addressBookMap = new HashMap<>();
        AddressBook addressBook1 = new AddressBook();
        addressBook1.addContact();
        System.out.println(addressBook1.contactList);
        AddressBook addressBook2 = new AddressBook();
        addressBook2.addContact();
        System.out.println(addressBook2.contactList);
        addressBookMap.put(MY_ADDRESS_BOOK,addressBook1);
        addressBookMap.put(MY_ADDRESS_BOOK,addressBook2);
    }
}
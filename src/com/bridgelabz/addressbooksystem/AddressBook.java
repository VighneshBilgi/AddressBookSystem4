package com.bridgelabz.addressbooksystem;


import java.util.HashSet;
import java.util.Scanner;

public class AddressBook {
    public HashSet<Contacts> addressBook = new HashSet<Contacts>();
    Scanner scan = new Scanner(System.in);

    public Contacts insertDetails() {

        System.out.print(" Enter the first name: ");
        String firstName = scan.next();

        System.out.print(" Enter the last name: ");
        String lastName = scan.next();

        System.out.print(" Enter the address: ");
        String address = scan.next();

        System.out.print(" Enter the city: ");
        String city = scan.next();

        System.out.print(" Enter the state: ");
        String state = scan.next();

        System.out.print(" Enter the zip: ");
        String zip = scan.next();

        System.out.print(" Enter the phone number: ");
        String phone = scan.next();

        System.out.print(" Enter the email: ");
        String email = scan.next();

        Contacts contact = new Contacts(firstName, lastName, address, city, state, zip, phone, email);

        return contact;

    }


    public void addContact() {

        System.out.print(" Please enter how many contacts you want to add: ");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {

            Contacts newContact = insertDetails();
            addressBook.add(newContact);

        }
        System.out.println();
    }
    public void displayContacts() {

        for (Contacts contact : addressBook) {
            System.out.println(contact);
        }
    }
    public Contacts findContact() {

        System.out.print(" Please enter the first name: ");
        String firstName = scan.next();

        for (Contacts contact : addressBook) {
            if (firstName.compareToIgnoreCase(contact.getFirstName()) == 0) {
                return contact;
            }
        }
        return null;
    }
    public void deleteContact() {
        Contacts contact = findContact();
        if (contact == null) {
            System.out.println(" Invalid contact");
            return;
        }
        addressBook.remove(contact);
        System.out.println(" Contact deleted successfully");
    }
    public void editContact() {
        Contacts contact = findContact();
        if (contact == null) {
            System.out.println(" Invalid contact");
            return;
        }
        System.out.println(" Contact found Enter new details of the contact");
        addressBook.remove(contact);
        addressBook.add(insertDetails());
    }
}

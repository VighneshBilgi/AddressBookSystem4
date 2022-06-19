package com.bridgelabz.addressbooksystem;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Welcome to the Address Book Program");

        AddressBookService addressBookServiceBook = new AddressBookService();
        boolean menuAgain =true;

        while (menuAgain) {

            System.out.println("Select options(1 to 9) below:");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contact");
            System.out.println("3. Edit Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Add Address Book");
            System.out.println("6. View Contacts by City or State");
            System.out.println("7. Count Contacts by City or State");
            System.out.println("8. Sort Contacts by Name, City or State");
            System.out.println("9. Exit Contacts Menu");


            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addressBookServiceBook.addContact();
                    break;
                case 2:
                    addressBookServiceBook.displayContacts();
                    break;
                case 3:
                    addressBookServiceBook.editContact();
                    break;
                case 4:
                    addressBookServiceBook.deleteContact();
                    break;
                case 5:
                    addressBookServiceBook.addAddressBook();
                    break;
                case 6:
                    addressBookServiceBook.viewContactsByCityOrState();
                    break;
                case 7:
                    addressBookServiceBook.countContactsByCityOrState();
                    break;
                case 8:
                        addressBookServiceBook.sortByContacts();
                    break;
                case 9:
                    System.out.println("Exiting Contacts menu");
                    menuAgain = false;
                    break;
                default:
                    System.out.println("Incorrect Input. Please enter options between 1 and 9.");
            }
        }
    }
}
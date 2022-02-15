package com.company;

import java.util.HashMap;
import java.util.Scanner;


class AddressBook {
    static Scanner input = new Scanner(System.in);
    static HashMap<String, Contact> map = new HashMap<String, Contact>();

    public static void main(String[] args) {
        add();
        search();
    }
    static void add(){
        while (!input.equals("END")){
            String name;
            String email;
            System.out.println("Please enter a name for a contact: ");
            name = input.next();
            if (name.equals("END")){
                break;
            }
            System.out.println("Please enter that contact's email address: ");
            email = input.next();
            Contact aContact = new Contact(name, email);
            map.put(aContact.getName(), aContact);

        }
    }
    static void search(){
        String string;
        System.out.println("Who's email would you like me to look for?");
        string = input.next();
        System.out.println(map.get(string));
    }
}

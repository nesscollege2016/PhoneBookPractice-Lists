package edu.tomer.ness;

import java.util.ArrayList;

/**
 * Created by Dev on 21/03/2016.
 */
public class PhoneBook {
    //Properties:
    ArrayList<Contact> contacts;

    //Constructor
    public PhoneBook() {
        contacts = new ArrayList<>();
    }

    //Actions / methods:
    void insertContact(){
        Contact c = new Contact();
        contacts.add(c);
    }

    void insertContact(String firstName ,String lastName, String phone){
        Contact c = new Contact(firstName, lastName, phone);
        contacts.add(c);
    }

    void dispAllContacts(){
        for (int i = 0; i < contacts.size(); i++) {
            Contact c = contacts.get(i);
            c.dispDetails();
        }
    }

    void dispDetails(String name){
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).firstName.startsWith(name)
                    || contacts.get(i).lastName.startsWith(name)){
                contacts.get(i).dispDetails();
            }
        }
    }

    void dispDetails(int index){
        if (index >= contacts.size()){
            System.out.println("No contact");
        }
        else {
            Contact c = contacts.get(index);
            c.dispDetails();
        }

    }
}

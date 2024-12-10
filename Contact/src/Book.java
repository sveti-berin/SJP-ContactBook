//This is the class Book where the contact book is made using a ArrayList

import java.util.ArrayList;

public class Book {
    private ArrayList<Contact> allContacts;

    //This constructor is called in main making the contact book
    public Book() {
        allContacts = new ArrayList<>();
    }

    //This method is called in the main and it adds the newly made object (Contact) to the arraylist and gives the user feedback
    public void addContact(Contact newcontact){
        allContacts.add(newcontact);
        System.out.println("A new Contact has been added name: " );
    }

    //This method displays all the contacts to the user if he chooses, in case that the user has not entered any contact it displays a message to them
    public void showContacts() {
        if (allContacts.isEmpty()){
            System.out.println("No contacts found! ");
        } else {
            for(Contact contact : allContacts) {
                contact.getContact();
                System.out.println("\n");
            }
        }
    }



}
// This is a showcase of a Contact book that I made while preparing for a quiz, it shows simple logic and OOP techniques
// The scanner is neccessary so that the user can choose
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        // I made a new scanner and a welcome message that is displayed running the program
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome to your Contact book, please type in an option to continue: " + "\n");

        //This lines calls the constructor in the Book class making a Array list that will "hold the contacts"
        Book book = new Book();

        // While true was used so that the program is constantly running until the user chooses to close it
        while (true) {

            System.out.print("1 - Add a new contact" + "\n");
            System.out.print("2 - List of all your contacts" + "\n");
            System.out.print("3 - Close" + "\n");

            String input = String.valueOf(sc.nextLine());

            if ( input.equals("1")) {
                //Without the line below the program does not wait for the first user input, because the \n needs to be consumed before
                sc.nextLine();
                System.out.print("Name of new contact: " );
                String name = String.valueOf(sc.nextLine());

                System.out.print("Last name of new contact: " );
                String lastName = String.valueOf(sc.nextLine());

                System.out.print("Country code of new contact: " );
                String countryCode = String.valueOf(sc.nextLine());

                System.out.print("Phone number: " );
                String phone = String.valueOf(sc.nextLine());

                /* After gathering user input and storing it into the variables we call the constructor of the Contact class to make an object,
                 after that added the contact to the contact book with the help of the method created in the Book class */
                Contact newContact = new Contact(name, lastName, countryCode, phone);
                book.addContact(newContact);

            } else if (input.equals("2")) {
                // Allows the user to display all contacts by using the method showContacts made in the class Book
                System.out.print("List of all your contacts: " + "\n");
                book.showContacts();

            }else if (input.equals("3")) {
                //Allows the user to close the program by breaking the while loop
                System.out.println("Goodbye! :)" + "\n");
                sc.nextLine();
                break;
            } else {
                // Just a precaution if the user does not choose a valid option
                System.out.println("Unrecognized option, please try again! " + "\n");
                sc.nextLine();
                continue;
            }
        }
    }

}
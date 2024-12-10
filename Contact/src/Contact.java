//This is the Contact class that takes the atributes of first name, last name, country code and phone number

public class Contact {
    private String _firstName;
    private String _lastName;
    private String _countryCode;
    private String _phone;

    //This is the constructor of the object
    public Contact(String firstName, String lastName, String countryCode, String phone) {
        this._firstName = firstName;
        this._lastName = lastName;
        this._countryCode = countryCode;
        this._phone = phone;
    }
    //This is a method that displays the contacts used in the class Book
    public void getContact() {
        System.out.println( "Name: " + _firstName + " " + _lastName + " Number: " + _countryCode + " " + _phone);
    }



}
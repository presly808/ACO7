package ua.artcode.week1.contact;

/**
 * Created by serhii on 12.07.15.
 */
public class Main {

    // user
    public static void main(String[] args) {

        Contact contact1 = null;

        ContactList contactList = new ContactList();

        Contact contact = new Contact();// create instance(object) of class
        // reference    =  object
        // link,control =  data(memory)
        contact.phone = "+380933091219";
        contact.age = 23;
        contact.name = "Serhii";

        contactList.addContact(contact);
        contact.showInfo();

        Contact contact2 = new Contact();// create instance(object) of class
        // reference    =  object
        // link,control =  data(memory)
        contact2.phone = "+380932331254";
        contact2.age = 30;
        contact2.name = "Anton";
        contactList.addContact(contact2);

        contact2.showInfo();
    }

    public static void addToContactList(int pos, ContactList contactList, Contact contact){
        contactList.contacts[pos] = contact;
    }
}

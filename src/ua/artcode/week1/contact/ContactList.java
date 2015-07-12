package ua.artcode.week1.contact;

/**
 * Created by serhii on 12.07.15.
 */
public class ContactList {

    Contact[] contacts = new Contact[10];// null
    int freePlace = 0;


    public void addContact(Contact contact){
        contacts[freePlace] = contact;
        freePlace++;
    }



}

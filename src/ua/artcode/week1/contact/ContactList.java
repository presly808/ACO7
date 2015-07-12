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

    public void showAll(){
        for (int i = 0; i < freePlace; i++) {
            Contact current = contacts[i];
            current.showInfo();
        }
    }

    public Contact removeLast(){
        freePlace--;
        Contact forRet = contacts[freePlace];
        contacts[freePlace] = null;
        return forRet;
    }

    public String find(String keyWord){
        return null;
    }



}

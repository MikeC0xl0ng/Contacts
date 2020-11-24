package contacts;

/**
 *
 * @author jass
 */

public class Contacts {
    static ContactsHashMap contacts;
    static Contact contact;
    
    public static void insertContact(){
        contacts.createContact();
    }
    
    public static void searchContact(){
        contacts.search().printContact();
    }
    
    public static void modifyContact(){
        contacts.modify();
    }
    
    public static void deleteContact(){
        contacts.delete();
    }
    
    public static void countContacts(){
        System.out.println("Your contacts' book contain "+contacts.size()+" contacts");
    }
    
    public static void printKeys(){
        System.out.println(contacts.keySet());
    }
    
    public static void printContacts(){
        contacts.printContacts();
    }
    
    public static void main(String[] args) {
        contacts = new ContactsHashMap();
        boolean exit = false;
        do{
           int usrChoice = contacts.printMenu();                                                              
           switch (usrChoice){  
              case 1: insertContact(); break;                                   // insert contact
              case 2: searchContact(); break;                                   // search for a contacts
              case 3: modifyContact(); break;                                   // modify contact
              case 4: deleteContact(); break;                                   // delete contact
              case 5: countContacts(); break;                                   // count contacts
              case 6: printKeys();     break;                                   // print keys
              case 7: printContacts(); break;                                   // print contacts' list
              case 0: exit = true;     break;                                   // exit
           }
        } while (exit == false);
    }
}


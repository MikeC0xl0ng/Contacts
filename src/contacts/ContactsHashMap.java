package contacts;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author jass
 */

public class ContactsHashMap {
    private HashMap <String, Contact> contacts;
    public Scanner sc = new Scanner(System.in);
    static Contact contact;
    
    public ContactsHashMap(){
        contacts = new HashMap<>(10);
    }
    
    public int size(){
        return contacts.size();
    }
    
    public void insert(Contact c){
        contacts.put(c.myKey(), c);
    }
    
    public void delete(Contact c){
        contacts.remove(c.myKey());
    }
    
    public void delete(){
        delete(search());
    }
    
    public void printContacts(){
        for(String i : contacts.keySet())
            System.out.println(contacts.get(i).contacToStr());
    }
    
    public Contact search(){
        String name = getSmthFromIn("name");
        String surname = getSmthFromIn("surname");
        //String key = contact.getKey(name, surname);                           bisogna risolvere questo piccolo difetto
        //return contacts.get(key);
        return contacts.get(name+"|"+surname);
    }
    
    public int whatChange(){
        boolean exit = true;
        int userChoice;
        do{
             System.out.println("What do you want to change?");
             System.out.println("1 - name");
             System.out.println("2 - surname");
             System.out.println("3 - tel number");
             userChoice = sc.nextInt();
             if(userChoice == 1 || userChoice == 2 | userChoice == 3)
                 exit = false;
        }while(exit);
        return userChoice;
    }
    
    public void modify(){
        Contact c = search();
        int userChoice = whatChange();
        if(userChoice == 1){
            String newName = getSmthFromIn("new name");
            insert(new Contact(newName, c.surname, c.telnum));
            delete(c);
        }
        else if(userChoice == 2){
            String newSurname = getSmthFromIn("new surname");
            insert(new Contact(c.name, newSurname, c.telnum));
            delete(c);
        }
        else if(userChoice == 3){
            String newTel = getSmthFromIn("new tel number");
            insert(new Contact(c.name, c.surname, newTel));
            delete(c);
        }
    }
    
    public String keySet(){
      Set s = contacts.keySet();
      String out = "";
      String[] ks = (String[]) s.toArray(new String[contacts.size()]);
      int i;
      for(i=0;i<ks.length;i++)
      {
         out = out + ks[i];
         if (i!=ks.length-1)
            out = out + "\n";
      }
      return out;
    }
    
    public static String getSmthFromIn(String smth){
        Scanner sc = new Scanner(System.in);
        String input = null;
        do{
            System.out.print("Type the "+smth+" -->");
            input = sc.nextLine();
        }while(input == null);
        return input;
    }
    
    public void createContact(){
        String name = getSmthFromIn("name");
        String surname = getSmthFromIn("surname");
        String tel = getSmthFromIn("tel number");
        insert(new Contact(name, surname, tel));
    }
    
    public int printMenu(){
      int n;
      Scanner s = new Scanner(System.in);
      do{
         System.out.println("=========================================");
         System.out.println("= 1) Insert new Contact                 =");
         System.out.println("= 2) Search for a contact               =");
         System.out.println("= 3) Modify a contact                   =");
         System.out.println("= 4) Delete a contact                   =");
         System.out.println("= 5) Count contact                      =");
         System.out.println("= 6) Print the keys                     =");
         System.out.println("= 7) Print contacts                     =");
         System.out.println("= 0) Exit                               =");
         System.out.println("=========================================");
         System.out.print("---->");      
         n = s.nextInt();
      } while (n<0 || n>7);
      return n;
   }
}

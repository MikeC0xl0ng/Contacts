package contacts;

import java.util.Scanner;

/**
 *
 * @author jass
 */

public class Contact {
    Scanner sc = new Scanner(System.in);
    String name;
    String surname;
    String telnum;
    
    public Contact(String n, String s, String tel){
        name = n;
        surname = s;
        telnum = tel;
    }
    
    public String myKey(){
        return name+"|"+surname;
    }
    
    public String getKey(String n, String s){
        return n+"|"+s;
    }
    
    public String contacToStr(){
        return "Surname: "+surname+" Name: "+name+" Tel number: "+telnum;
    }
    
    public void printContact(){
        System.out.println(contacToStr());
    }
    
    public static Contact createContact(String n, String s, String tel){
        return new Contact(n, s, tel);
    }
}

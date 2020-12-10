package rubrica;

import java.io.*;
import java.util.Scanner;
import javax.swing.DefaultListModel;

public class Rubrica_ {
    
    List[] contacts;
    List contacts_list;
    int n;
    String path;
    
    public Rubrica_(){
        n = 100;
        contacts = new List[n];
        for (int i=0; i<n; i++){
            contacts[i] = new List();
        }
        contacts_list = new List();
        try{
            path = new Scanner(new File("path.txt")).nextLine();
        }catch (Exception ex){
            path = "rubrica.txt";
        }
    }
    
    public Rubrica_(int n_){
        n = n_;
        contacts = new List[n];
        for (int i=0; i<n; i++){
            contacts[i] = new List();
        }
        contacts_list = new List();
        try{
            path = new Scanner(new File("path.txt")).nextLine();
        }catch (Exception ex){
            path = "rubrica.txt";
        }
    }    

    public void addContact(Contatto c, String key){
        c.key = key;
        contacts[computeHash(key)].addElement(c);
        contacts_list.addElement(c);
    }
    
    public Contatto getContact(String key){
        return contacts[computeHash(key)].getElement(key).c;
    }
    
    public void deleteContact(String key){
        contacts[computeHash(key)].deleteElement(key);
        contacts_list.deleteElement(key);
    }
    
    public void editContact(String key, Contatto c){
        contacts[computeHash(key)].editElement(key, c);
        contacts_list.editElement(key, c);
    }
    
    public void save(){
        try{
            new File(path).createNewFile();
        }catch (Exception ex){
            
        }
        FileWriter fw = null;
        try{
            fw = new FileWriter(path, false);
            fw.write("");
            fw.flush();
            fw.close();
        }catch (Exception ex){
            
        }
        try{
            fw = new FileWriter(path, true);
        }catch (Exception ex){
            
        }
        for (int i=0; i<contacts_list.getLength(); i++){
            try{
                fw.write(contacts_list.getElementAt(i).c.toStr() + "\r\n");
            }catch (Exception ex){
                
            }
        }
        try{
            fw.flush();
        }catch (Exception ex){
            
        }
    }
    
    public void load(){
        Scanner s = null;
        try{
            s = new Scanner(new File(path));
        }catch (Exception ex){
            return;
        }
        String[] c;
        while(s.hasNextLine()){
            c = s.nextLine().split("\\|");
            if (c.length == 4){
                if (c[3].length() > 0){
                    this.addContact(new Contatto(c[0], c[1], c[2], c[3]), c[3]);
                }
            }
        }
        loadJList();
    }
    
    public void loadJList(){
        DefaultListModel<String> m = new DefaultListModel<String>();
        Rubrica.window.jList1.setModel(m);
        for (int i=0; i<this.contacts_list.getLength(); i++){
            m.addElement(contacts_list.getElementAt(i).c.key);
        }
    }
    
    public int computeHash(String key){
        int hash = 0;
        int n_ = key.length();
        for (int i=0; i<n_; i++){
            hash += (int) key.charAt(i);
            hash = hash % n;
        }
        return hash;
    }
    
}

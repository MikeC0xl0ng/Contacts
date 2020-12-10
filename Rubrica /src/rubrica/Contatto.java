package rubrica;

public class Contatto {
    
    String name;
    String surname;
    String tel;
    String key;
    
    public Contatto(){
        name = "";
        surname = "";
        tel  = "";
        key = "";
    }
    
    public Contatto(String name_){
        name = name_;
        surname = "";
        tel  = "";
        key = "";
    }
    
    public Contatto(String name_, String surname_){
        name = name_;
        surname = surname_;
        tel  = "";
        key = "";
    }
    
    public Contatto(String name_, String surname_, String tel_){
        name = name_;
        surname = surname_;
        tel  = tel_;
        key = "";
    }
          
    public Contatto(String name_, String surname_, String tel_, String key_){
        name = name_;
        surname = surname_;
        tel  = tel_;
        key = key_;
    }
    
    public String toStr(){
        return name + "|" + surname + "|" + tel + "|" + key;
    }
    
}

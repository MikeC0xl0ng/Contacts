package rubrica;

import java.io.*;

public class Rubrica {
    
    public static Rubrica_ r;
    public static Interface window = new Interface();
    
    public static void main(String[] args) {
        try{
            File f = new File("path.txt");
            if (f.createNewFile()){
                FileWriter fw = new FileWriter("path.txt", false);
                fw.write("rubrica.txt");
                fw.flush();
                fw.close();
            }
        }catch (Exception ex){
            
        }
        r = new Rubrica_();
        r.load();
        window.setVisible(true);
    }
    
}
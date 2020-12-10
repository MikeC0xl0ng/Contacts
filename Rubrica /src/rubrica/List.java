package rubrica;

public class List {
    
    private Element first_elem;
    private int length;
    
    public List(){
        length = 0;
    }
    
    public int getLength(){
        return this.length;
    }
   
    public void addElement(Contatto c){
        if (!(this.contains(c.key))){
            int pos = getKeyPos(c.key);
            this.insertElementAt(c, pos);
            length++;
        }
    }
    
    private int getKeyPos(String key){
        if (first_elem == null){
            return 0;
        }
        Element e = first_elem;
        int pos = 0;
        while (isGreater(key.toUpperCase(), e.c.key.toUpperCase())){
            e = e.next;
            pos++;
            if (e == null){
                return pos;
            }
        }
        return pos;
    }
    
    private void insertElementAt(Contatto c, int pos){
        if (pos == 0){
            insertElementAtTop(c);
            return;
        }
        if (pos == this.length){
            insertElementAtBottom(c);
            return;
        }
        Element new_e = new Element(c);
        Element e = this.getElementAt(pos);
        new_e.next = e;
        new_e.prev = e.prev;
        new_e.prev.next = new_e;
        e.prev = new_e;
    }
    
    public void insertElementAtTop(Contatto c){
        if (first_elem == null){
            first_elem = new Element(c);
            return;
        }
        Element e = new Element(c);
        first_elem.prev = e;
        e.next = first_elem;
        first_elem = e;
    }
    
    private void insertElementAtBottom(Contatto c){
        Element e = getElementAt(this.length-1);
        Element new_e = new Element(c);
        e.next = new_e;
        new_e.prev = e;
    }
        
    public Element getElement(String key){
        Element e = first_elem;
        while (e != null){
            if (e.c.key.equals(key)){
                return e;
            }
            e = e.next;
        }
        return null;
    }
    
    public void deleteElement(String key){
        if (this.contains(key)){
            length--;
            Element e = this.getElement(key);
            if (e == first_elem){
                deleteFirstElement();
                return;
            }
            if (e.next == null){
                deleteLastElement(e);
                return;
            }
            e.prev.next = e.next;
            e.next.prev = e.prev;
            e.prev = null;
            e.next = null;
        }
    }
    
    private void deleteFirstElement(){
        Element e = first_elem;
        first_elem = first_elem.next;
        e.next = null;
        e = first_elem;
        if (e != null){
            e.prev = null;
        }
    }
    
    private void deleteLastElement(Element e){
        e.prev.next = null;
        e.prev = null;
    }
    
    public void editElement(String key, Contatto c){
        if (first_elem == null){
            first_elem = new Element(c);
            return;
        }
        Element e = this.getElement(key);
        this.deleteElement(e.c.key);
        this.addElement(c);
    }
    
    public Element getElementAt(int pos){
        Element e = first_elem;
        for (int i=0; i<pos; i++){
            if (e == null){
                return null;
            }
            e = e.next;
        }
        return e;
    }

    
    public boolean contains(String key){
        Element e = first_elem;
        while (e != null){
            if (e.c.key.toUpperCase().equals(key.toUpperCase())){
                return true;
            }
            e = e.next;
        }
        return false;
    }
    
    public static boolean isGreater(String s1, String s2){
        int min_length;
        boolean result;
        if (s1.length() < s2.length()){
            min_length = s1.length();
            result = false;
        }else{
            min_length = s2.length();
            result = true;
        }
        if (s1.substring(0, min_length).equals(s2.substring(0, min_length))){
            return result;
        }
        for (int i=0; i<min_length; i++){
            if ((int)(s1.charAt(i)) > (int)(s2.charAt(i))){
                return true;
            }else if ((int)(s1.charAt(i)) < (int)(s2.charAt(i))){
                return false;
            }
        }
        return result;
    }
    
    public static boolean isSmaller(String s1, String s2){
        int min_length;
        boolean result;
        if (s1.length() < s2.length()){
            min_length = s1.length();
            result = true;
        }else{
            min_length = s2.length();
            result = false;
        }
        if (s1.substring(0, min_length).equals(s2.substring(0, min_length))){
            return result;
        }
        for (int i=0; i<min_length; i++){
            if ((int)(s1.charAt(i)) < (int)(s2.charAt(i))){
                return true;
            }else if ((int)(s1.charAt(i)) > (int)(s2.charAt(i))){
                return false;
            }
        }
        return result;
    }
    
}
import java.util.LinkedList;
import java.util.ListIterator;
class link2{
    public static void main(String[] args) {
        LinkedList<String > link = new LinkedList<>();
        link.add("Microsoft");
        link.add("is a ");
        link.add("great");
        link.add("Operating ");
        link.add("System");
        ListIterator iter = link.listIterator(0); 
        System.out.println("The list is as follows:"); 
        while(iter.hasNext()){ 
           System.out.println(iter.next()); 
        } 

    }
        
    }   

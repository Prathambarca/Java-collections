import java.util.HashSet;
import java.util.*;
class hash5{
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();
        h.add(83);
        h.add(12);
        h.add(32);
        h.add(9);
        h.add(100);
        h.add(29);
        h.add(31);
        
        System.out.println(" elements in the hashset are"+h);
        if(h.isEmpty()){
            System.out.println("Hashset is empty");
        }
       else  System.out.println("HashSet is not empty");
    }
}
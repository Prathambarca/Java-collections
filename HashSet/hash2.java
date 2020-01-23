import java.util.HashSet;
import java.util.*;
class hash2{
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();
        h.add(83);
        h.add(12);
        h.add(32);
        h.add(9);
        h.add(100);
        h.add(29);
        h.add(31);
        Iterator value = h.iterator();
        System.out.println("The list values are :");
        while(value.hasNext()){
            System.out.println(value.next());
        }
      

    }
}
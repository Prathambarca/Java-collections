import java.util.HashSet;
import java.util.*;
class hash12{
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();
        h.add(83);
        h.add(12);
        h.add(32);
        h.add(9);
        h.add(100);
        h.add(29);
        h.add(31);
     
        // System.out.println("no of elements in the hashset are" +h.size());
       h.clear();
       System.out.println("after removing all elements" +h);

    }
}
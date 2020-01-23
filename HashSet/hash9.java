import java.util.HashSet;
import java.util.*;
class hash9{
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();
        h.add(83);
        h.add(12);
        h.add(32);
        h.add(9);
        h.add(100);
        h.add(29);
        h.add(31);
        //  Set<Integer> tree = new TreeSet<>(h);
        List<Integer> list = new ArrayList<>(h);

        // HashSet<Integer> hnew = new HashSet<>();
        // h.toArray();
        // hnew = (HashSet)h.clone(); 
        System.out.println(h);
       
}
}
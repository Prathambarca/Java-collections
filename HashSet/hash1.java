import java.util.HashSet;
class hash1{
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();
        h.add(83);
        h.add(12);
        h.add(32);
        h.add(9);
        System.out.println(h);

        h.add(100);
        h.add(29);
        h.add(31);
        
        System.out.println("After appending " +h);

    }
}
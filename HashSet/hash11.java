import java.util.HashSet;
class hash11{
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();
        h.add(83);
        h.add(12);
        h.add(32);
        h.add(9);
        h.add(100);
        h.add(6);
        h.add(3);
        System.out.println(h);
        HashSet<Integer> hnew = new HashSet<>();
        hnew.add(83);
        hnew.add(12);
        hnew.add(32);
        hnew.add(9);
        hnew.add(100);
        h.retainAll(hnew);
        System.out.println("After comparing and retaining" +h);
    }
}
import java.util.HashSet;
class hash10{
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();
        h.add(83);
        h.add(12);
        h.add(32);
        h.add(9);
        h.add(100);
        HashSet<Integer> hnew = new HashSet<>();
        hnew.add(83);
        hnew.add(12);
        hnew.add(32);
        hnew.add(9);
        hnew.add(100);
        boolean value= h.equals(hnew);
        System.out.println("Are both sets equal"+value); 

    }
}
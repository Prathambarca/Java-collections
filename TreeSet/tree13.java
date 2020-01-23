
import java.util.*;
class tree13{
    public static void main(String[] args) {
        TreeSet <Integer> colors = new TreeSet<>();
        colors.add(29);
        colors.add(12);
        colors.add(34);
        colors.add(50);
        colors.add(7);
        System.out.println(colors);
        System.out.println("Element strictly less than 50:"+colors.lower(50));
    


    }
}
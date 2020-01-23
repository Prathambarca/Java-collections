
import java.util.*;
class tree6{
    public static void main(String[] args) {
        TreeSet <Integer> colors = new TreeSet<>();
        colors.add(29);
        colors.add(12);
        colors.add(34);
        colors.add(50);
        colors.add(7);
        TreeSet <Integer> colorcopy = new TreeSet<>(colors);
        // System.out.println(colors);
        System.out.println("elements in colorcopy set "+colorcopy);
        


    }
}
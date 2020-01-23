
import java.util.*;
class tree16{
    public static void main(String[] args) {
        TreeSet <String> colors = new TreeSet<>();
        colors.add("green");
        colors.add("yellow");
        colors.add("blue");
        colors.add("white");
        colors.add("indigo");
        System.out.println(colors);
        colors.remove("white");
        System.out.println("After removing an element"+colors);
        


    }
}
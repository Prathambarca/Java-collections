
import java.util.*;
class tree14{
    public static void main(String[] args) {
        TreeSet <String> colors = new TreeSet<>();
        colors.add("green");
        colors.add("yellow");
        colors.add("blue");
        colors.add("white");
        colors.add("indigo");
        colors.add("violet");
        System.out.println("Initial treeset"+colors);
        System.out.println("after removing first element: " +colors.remove(colors.first()));
        System.out.println(colors);


    }
}
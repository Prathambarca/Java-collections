
import java.util.*;
class tree8{
    public static void main(String[] args) {
        TreeSet <String> colors = new TreeSet<>();
        colors.add("green");
        colors.add("yellow");
        colors.add("blue");
        colors.add("white");
        colors.add("indigo");
        System.out.println(colors);
        TreeSet <String> colorcopy = new TreeSet<>();
        colorcopy.add("green");
        colorcopy.add("yellow");
        colorcopy.add("blue");
        colorcopy.add("white");
        colorcopy.add("indigo");
        boolean value = colors.equals(colorcopy);
        System.out.println("Are 2 sets equal"+value);
        


    }
}
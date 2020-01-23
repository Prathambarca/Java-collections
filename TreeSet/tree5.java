
import java.util.*;
class tree5{
    public static void main(String[] args) {
        TreeSet <String> colors = new TreeSet<>();
        colors.add("green");
        colors.add("yellow");
        colors.add("blue");
        colors.add("white");
        System.out.println(colors);
        System.out.println("First element is: "+colors.first());
        
        System.out.println("last element is: "+colors.last());
        


    }
}
import java.util.*;
public class arraylist2 {
  public static void main(String[] args) {
  // Write your code here
  List<String> colors = new ArrayList<>();
  colors.add("green");
  colors.add("yellow");
  colors.add("blue");
  colors.add("white");

   Iterator<String> iterate =colors.iterator();
    System.out.println(colors);
    System.out.println("\nThe iterator values"
                           + " of list are: "); 
        while (iterate.hasNext()) { 
            System.out.print(iterate.next() + " "); 
        } 
 }
}
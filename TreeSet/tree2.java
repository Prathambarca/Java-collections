import java.util.*;
public class tree2 {
  public static void main(String[] args) {
  // Write your code here
  TreeSet <String> colors = new TreeSet<>();

  colors.add("green");
  colors.add("yellow");
  colors.add("blue");
  colors.add("white");

   Iterator<String> iterate =colors.iterator();
    System.out.println(colors);
    System.out.println("\nThe iterator values"
                           + " of treeset are: "); 
        while (iterate.hasNext()) { 
            System.out.print(iterate.next() + " "); 
        } 
 }
}
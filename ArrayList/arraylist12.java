import java.util.*;
import java.util.concurrent.atomic.AtomicIntegerArray;
public class arraylist12 {
  public static void main(String[] args) {
  // Write your code here
  
  List<String> colors = new ArrayList<>();
  colors.add("green");
  colors.add("yellow");
  colors.add("blue");
  colors.add("violet");
  colors.add("purple");
  colors.add("bronze");

  
 
//   colorcopy.add("hue");
//   colorcopy.add("lightblue");
//   Collections.reverse(colors);
  System.out.println(colors.subList(2,5));
 }
}
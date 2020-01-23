import java.util.*;
public class arraylist14 {
  public static void main(String[] args) {
  // Write your code here
  
  List<String> colors = new ArrayList<>();
  colors.add("green");
  colors.add("yellow");
  colors.add("blue");
  colors.add("violet");
  colors.add("purple");
  colors.add("bronze");
  Collections.swap(colors, 1, 3);
  System.out.println(colors);

 }
}
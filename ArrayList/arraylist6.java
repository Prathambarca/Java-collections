import java.util.*;
public class arraylist6 {
  public static void main(String[] args) {
  // Write your code here
  List<String> colors = new ArrayList<>();
  colors.add("green");
  colors.add("yellow");
  colors.add("blue");
  colors.add("violet");
  colors.add("purple");
  colors.add("bronze");
  colors.remove(3);

  System.out.println(colors);
 }
}
import java.util.*;

public class arraylist20 {
  public static void main(String[] args) {
  // Write your code here
  
  List<String> colors = new ArrayList<>(5);
  colors.add("green");
  colors.add("yellow");
  colors.add("blue");
  colors.add("violet");
  colors.add("purple");
  colors.add("bronze");
  colors.ensureCapacity(10);
  colors.add("chromium");
  colors.add("silver");

//   colorcopy.add("hue");
//   colorcopy.add("lightblue");

  System.out.println(colors);
 }
}
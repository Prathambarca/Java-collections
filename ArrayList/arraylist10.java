import java.util.*;

public class arraylist10 {
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
  Collections.shuffle(colors);
  System.out.println(colors);
 }
}
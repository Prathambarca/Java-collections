import java.util.*;

public class arraylist9 {
  public static void main(String[] args) {
  // Write your code here
  
  List<String> colors = new ArrayList<>();
  colors.add("green");
  colors.add("yellow");
  colors.add("blue");
  colors.add("violet");
  colors.add("purple");
  colors.add("bronze");
  
  
  List<String> colorcopy =  new ArrayList<>(colors);
//   colorcopy.add("hue");
//   colorcopy.add("lightblue");

  System.out.println(colorcopy);
 }
}
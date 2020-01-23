import java.util.*;
public class arraylist13 {
  public static void main(String[] args) {
  // Write your code here
  
  List<String> colors = new ArrayList<>();
  colors.add("green");
  colors.add("yellow");
  colors.add("blue");
  colors.add("violet");
  colors.add("purple");
  colors.add("bronze");

  List<String> colorcopy = new ArrayList<>();
  colorcopy.add("blue");
  colorcopy.add("violet");
  colorcopy.add("purple");
  colorcopy.add("bronze");
  Collections.sort(colors);
        Collections.sort(colorcopy);

        boolean isEqual = colors.equals(colorcopy);      //false
        System.out.println(isEqual);
//   colorcopy.add("hue");
//   colorcopy.add("lightblue");
//   Collections.reverse(colors);
//   System.out.println(colors);
 }
}
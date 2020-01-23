import java.util.*;
public class arraylist22 {
  public static void main(String[] args) {
  // Write your code here
  
  List<String> colors = new ArrayList<>(12);
  colors.add("green");
  colors.add("yellow");
  colors.add("blue");
  colors.add("violet");
  colors.add("purple");
  colors.add("bronze");
  
  int m = colors.size();
     for (int index =0;index < m;index++){
         System.out.println(colors.get(index));
     }
        // prints all the elements 
        // for (String color : colors) { 
        //     System.out.println("Colors are = " + color); 
        // } 
}
}
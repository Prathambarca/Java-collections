import java.util.*;
public class arraylist21 {
  public static void main(String[] args) {
  // Write your code here
  
  List<Integer> colors = new ArrayList<>(12);
  colors.add(12);
  colors.add(6);
  colors.add(7);
  colors.add(34);
  colors.add(2,71);
  colors.remove(2);
  colors.add(2,134);

     
        System.out.println(colors);
        // prints all the elements 
        // for (String color : colors) { 
        //     System.out.println("Colors are = " + color); 
        // } 
}
}
import java.util.*;
public class arraylist15 {
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
  colorcopy.add("chromium");
  colorcopy.add("silver");
  Set<String> set = new LinkedHashSet<>(colors);
  set.addAll(colorcopy);
  List<String> combined = new ArrayList<>(set);
         
        System.out.println(combined);
        
 
 }
}
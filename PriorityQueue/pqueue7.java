import java.util.*;
class pqueue7{
    public static void main(String[] args) {
        
    
    PriorityQueue<String> colors = new PriorityQueue<String>();
    colors.add("greeen");
    colors.add("white");
    colors.add("blue");
    colors.add("black");
    colors.add("red");
    System.out.println(colors);
    PriorityQueue<String> colors2 = new PriorityQueue<String>();
    colors.add("greeen");
    colors.add("white");
    colors.add("black");
    
    for (String element : colors){
       
        System.out.println(colors2.contains(element) ? "Yes" : "No");
     }    
    }
}
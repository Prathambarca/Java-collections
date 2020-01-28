import java.util.*;
class pqueue10{
    public static void main(String[] args) {
        PriorityQueue<String> colors = new PriorityQueue<String>();
          colors.add("greeen");
          colors.add("white");
          colors.add("blue");
          colors.add("black");
          colors.add("red");
          System.out.println(colors);
          Object[] arr = colors.toArray(); 
  
        System.out.println("The array is:"); 
        for (int j = 0; j < arr.length; j++) 
            System.out.println(arr[j]); 
    }
}   
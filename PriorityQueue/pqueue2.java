import java.util.*;
class pqueue2{
    public static void main(String[] args) {
        PriorityQueue<String> colors = new PriorityQueue<String>();
          colors.add("greeen");
          colors.add("white");
          colors.add("blue");
          colors.add("black");
          colors.add("red");
        //   System.out.println(colors);
          Iterator value = colors.iterator(); 
  
          // Displaying the values after iterating through the queue 
          System.out.println("The iterator values are: "); 
          while (value.hasNext()) { 
              System.out.println(value.next()); 
          
    }
}
}
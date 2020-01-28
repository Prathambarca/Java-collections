import java.util.*;
class pqueue11{
    public static void main(String[] args) {
        PriorityQueue<String> colors = new PriorityQueue<String>();
          colors.add("greeen");
          colors.add("white");
          colors.add("blue");
          colors.add("black");
          colors.add("red");
          System.out.println(colors);
          
   String str1 = colors.toString();
   System.out.println("String representation of the Priority Queue: "+str1);    

    }
}
import java.util.*;
class pqueue3{
    public static void main(String[] args) {
        PriorityQueue<String> colors = new PriorityQueue<String>();
          colors.add("greeen");
          colors.add("white");
          colors.add("blue");
          colors.add("black");
          colors.add("red");
          PriorityQueue<String> colorcopy = new PriorityQueue<String>(colors);
          
          System.out.println(colorcopy);
    }
}
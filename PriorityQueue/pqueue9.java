import java.util.*;
class pqueue9{
    public static void main(String[] args) {
        PriorityQueue<String> colors = new PriorityQueue<String>();
          colors.add("greeen");
          colors.add("white");
          colors.add("blue");
          colors.add("black");
          colors.add("red");
          System.out.println("First element  in queue"+colors.peek());
          colors.remove("black");
          System.out.println("After removing 1st element"+colors);

    }
}
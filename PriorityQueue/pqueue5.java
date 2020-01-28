import java.util.*;
class pqueue5{
    public static void main(String[] args) {
        PriorityQueue<String> colors = new PriorityQueue<String>();
          colors.add("greeen");
          colors.add("white");
          colors.add("blue");
          colors.add("black");
          colors.add("red");
          System.out.println(colors);
          colors.clear();
          System.out.println(colors);

    }
}
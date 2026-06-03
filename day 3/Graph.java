
import java.util.*;



public class Graph {
    int v = 4;
    List<List<Integer>> adi = new ArrayList<>();

    public Graph() {
        for (int i = 0; i < v; i++) {
            adi.add(new ArrayList<>());
        }
        adi.get(0).add(1);
        adi.get(0).add(3);
        adi.get(1).add(3);
        adi.get(1).add(0);
        adi.get(2).add(3);
        adi.get(2).add(0);
        adi.get(2).add(1);
        adi.get(3).add(1);
        adi.get(3).add(2);
        for (int i = 0; i < v; i++) {
            System.out.println(i + "->" + adi.get(i));
        }
    }
    public static void main(String[] args) {
        new Graph();
    }
}


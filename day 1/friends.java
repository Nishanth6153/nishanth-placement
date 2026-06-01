
/* This is a simple graph implementation to represent friendships */

import java.util.ArrayList;

public class friends {
    public static void main(String[] args) {

        String[] names = {"Alice", "Bob", "Charlie", "David"};

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < names.length; i++) {
            graph.add(new ArrayList<>());
        }

        // Alice is connected to Bob and Charlie
        graph.get(0).add(1);
        graph.get(0).add(2);

        System.out.println("Friends of Alice are:");

        for (int friend : graph.get(0)) {
            System.out.println(friend + " - " + names[friend]);
        }
    }
}

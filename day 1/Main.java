/* This is a simple graph implementation to represent road connections */

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String[] places = {
            "Restaurant",        // 0
            "Main Road",         // 1
            "Market Road",       // 2
            "Signal Junction",   // 3
            "Bus Stand",         // 4
            "Customer House"     // 5
        };

        ArrayList<Integer>[] graph = new ArrayList[6];

        for (int i = 0; i < 6; i++) {
            graph[i] = new ArrayList<>();
        }

        // Road Connections
        graph[0].add(1); // Restaurant -> Main Road
        graph[0].add(2); // Restaurant -> Market Road

        graph[1].add(5); // Main Road -> Customer House (Short Path)

        graph[2].add(3); // Market Road -> Signal Junction
        graph[3].add(4); // Signal Junction -> Bus Stand
        graph[4].add(5); // Bus Stand -> Customer House

        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[6];
        int[] distance = new int[6];

        q.add(0); // Restaurant
        visited[0] = true;

        while (!q.isEmpty()) {
            int current = q.poll();

            for (int next : graph[current]) {
                if (!visited[next]) {
                    visited[next] = true;
                    distance[next] = distance[current] + 1;
                    q.add(next);
                }
            }
        }

        System.out.println("Source : " + places[0]);
        System.out.println("Destination : " + places[5]);
        System.out.println("Minimum Roads Required : " + distance[5]);
    }
}
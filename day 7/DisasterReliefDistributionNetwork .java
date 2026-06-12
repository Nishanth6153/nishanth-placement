import java.util.*;

class Village {
    String name;
    int priority;

    Village(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }
}

class Road {
    String destination;
    int distance;
    boolean blocked;

    Road(String destination, int distance) {
        this.destination = destination;
        this.distance = distance;
        this.blocked = false;
    }
}

class Node {
    String location;
    int distance;

    Node(String location, int distance) {
        this.location = location;
        this.distance = distance;
    }
}

class DisasterNetwork {

    private Map<String, List<Road>> graph = new HashMap<>();

    public void addLocation(String location) {
        graph.putIfAbsent(location, new ArrayList<>());
    }

    public void addRoad(String source, String destination, int distance) {
        graph.get(source).add(new Road(destination, distance));
        graph.get(destination).add(new Road(source, distance));
    }

    public void blockRoad(String source, String destination) {

        for (Road road : graph.get(source)) {
            if (road.destination.equals(destination)) {
                road.blocked = true;
            }
        }

        for (Road road : graph.get(destination)) {
            if (road.destination.equals(source)) {
                road.blocked = true;
            }
        }
    }

    public Set<String> bfs(String start) {

        Set<String> visited = new LinkedHashSet<>();
        Queue<String> queue = new LinkedList<>();

        visited.add(start);
        queue.add(start);

        while (!queue.isEmpty()) {

            String current = queue.poll();

            for (Road road : graph.get(current)) {

                if (!road.blocked &&
                        !visited.contains(road.destination)) {

                    visited.add(road.destination);
                    queue.add(road.destination);
                }
            }
        }

        return visited;
    }

    public void findUnreachableVillages(String start) {

        Set<String> reachable = bfs(start);

        System.out.println("\nUnreachable Villages:");

        boolean found = false;

        for (String location : graph.keySet()) {

            if (location.startsWith("V") &&
                    !reachable.contains(location)) {

                System.out.println(location);
                found = true;
            }
        }

        if (!found) {
            System.out.println("None");
        }
    }

    public void dijkstra(String source) {

        Map<String, Integer> dist = new HashMap<>();

        for (String node : graph.keySet()) {
            dist.put(node, Integer.MAX_VALUE);
        }

        dist.put(source, 0);

        PriorityQueue<Node> pq =
                new PriorityQueue<>((a, b) ->
                        Integer.compare(a.distance, b.distance));

        pq.add(new Node(source, 0));

        while (!pq.isEmpty()) {

            Node currentNode = pq.poll();
            String current = currentNode.location;

            for (Road road : graph.get(current)) {

                if (road.blocked)
                    continue;

                int newDist =
                        dist.get(current) + road.distance;

                if (newDist < dist.get(road.destination)) {

                    dist.put(road.destination, newDist);

                    pq.add(
                            new Node(
                                    road.destination,
                                    newDist
                            )
                    );
                }
            }
        }

        System.out.println("\nShortest Distances from " + source);

        for (String node : dist.keySet()) {

            if (dist.get(node) == Integer.MAX_VALUE)
                System.out.println(node + " : Unreachable");
            else
                System.out.println(node + " : " + dist.get(node) + " km");
        }
    }

    public void generateDeliveryPlan(List<Village> villages) {

        PriorityQueue<Village> pq =
                new PriorityQueue<>(
                        (a, b) ->
                                Integer.compare(b.priority, a.priority));

        pq.addAll(villages);

        System.out.println("\nDelivery Sequence:");

        int count = 1;

        while (!pq.isEmpty()) {

            Village v = pq.poll();

            System.out.println(
                    count + ". " +
                    v.name +
                    " (Priority " +
                    v.priority + ")"
            );

            count++;
        }
    }
}

public class Main {

    public static void main(String[] args) {

        DisasterNetwork network = new DisasterNetwork();

        // Relief Centers
        network.addLocation("C1");
        network.addLocation("C2");
        network.addLocation("C3");

        // Villages
        network.addLocation("V1");
        network.addLocation("V2");
        network.addLocation("V3");
        network.addLocation("V4");
        network.addLocation("V5");

        // Roads
        network.addRoad("C1", "V1", 4);
        network.addRoad("C1", "V2", 5);
        network.addRoad("V2", "V3", 2);
        network.addRoad("V2", "C2", 4);
        network.addRoad("C2", "V4", 3);
        network.addRoad("C2", "C3", 6);
        network.addRoad("C3", "V5", 2);

        // Block road between C2 and C3
        network.blockRoad("C2", "C3");

        System.out.println("Reachable Locations:");
        System.out.println(network.bfs("C1"));

        network.findUnreachableVillages("C1");

        network.dijkstra("C1");

        List<Village> villages = Arrays.asList(
                new Village("V4", 4),
                new Village("V2", 3),
                new Village("V5", 2),
                new Village("V1", 1)
        );

        network.generateDeliveryPlan(villages);
    }
}
import java.util.ArrayList;
import java.util.List;

public class CaveExplorer {

    static List<Integer> forwardPath = new ArrayList<>();
    static List<Integer> returnPath = new ArrayList<>();
    static boolean[] visited;

    public static void main(String[] args) {

        int numberOfRooms = 5; 
        visited = new boolean[numberOfRooms];

        List<List<Integer>> cave = new ArrayList<>();
        for (int i = 0; i < numberOfRooms; i++) {
            cave.add(new ArrayList<>());
        }
     
        cave.get(0).add(1);
        cave.get(0).add(2);
        cave.get(1).add(3);
        cave.get(1).add(4);

        System.out.println("Starting exploration from Room 0...\n");
        exploreCave(0, cave);

        System.out.println("Forward Path (Going Deeper): " + forwardPath);
        System.out.println("Return Path (Backtracking):   " + returnPath);
    }
    public static void exploreCave(int currentRoom, List<List<Integer>> cave) {
        visited[currentRoom] = true;
        forwardPath.add(currentRoom);
        for (int neighbor : cave.get(currentRoom)) {
            if (!visited[neighbor]) {
                exploreCave(neighbor, cave);
            }
        }
        returnPath.add(currentRoom);
    }
}
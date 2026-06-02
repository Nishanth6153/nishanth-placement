import java.util.*;
public class HashLinked {
    public static void main(String[] args) {
        class node {int d;node i,r;node(int d){this.d=d;}}
        node root = new node(2);
        root.i = new node(1);
        root.r = new node(3);
        
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        LinkedList<String> list = new LinkedList<>();
        list.add("Task");

        System.out.println(root.i.d+" "+root.d+" "+root.r.d);
        System.out.println(map.get(1)+" "+ map.get(2)+ " "+map.get(3));
        System.out.println(list);
    }
}

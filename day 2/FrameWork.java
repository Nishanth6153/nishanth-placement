import java.util.*;
public class FrameWork {
    public static void main(String[] args) {
         
        List<String> cart = new ArrayList<>();
        cart.add("Laptop");
        cart.add("Mouse");
        cart.add("Keyboard");
        for (String i : cart) {
            System.out.println(i);
        }

        Set<String> categoris = new HashSet<>();
        categoris.add("Electronics");
        categoris.add("Clothing");
        categoris.add("Books");
        for (String i : categoris) {
            System.out.println(i);
        }
        Map<Integer, String> products = new HashMap<>();
        products.put(1001, "Laptop");
        products.put(1002, "Mouse");
        products.put(1003, "Keyboard");
        for (Map.Entry<Integer, String> entry : products.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Product: " + entry.getValue());
        }
    }
}


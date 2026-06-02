// 5 products name , price i need output total amount of price and which is more expensive product in that 5 
import java.util.*;

public class ProductStore {

    public static void main(String[] args) {

        ArrayList<String> products = new ArrayList<>();
        ArrayList<Integer> prices = new ArrayList<>();

        products.add("Laptop");
        prices.add(50000);

        products.add("Mouse");
        prices.add(800);

        products.add("Keyboard");
        prices.add(1500);

        products.add("Monitor");
        prices.add(12000);

        products.add("Headphone");
        prices.add(2500);

        int total = 0;
        int maxPrice = 0;

        for (int price : prices) {
            total += price;
            maxPrice = Math.max(maxPrice, price);
        }

        int index = prices.indexOf(maxPrice);

        System.out.println("Total Price = ₹" + total);
        System.out.println("Most Expensive Product = " + products.get(index));
        System.out.println("Maximum Price = ₹" + maxPrice);
    }
}
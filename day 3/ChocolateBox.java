public class ChocolateBox {

    public static void main(String[] args) {

        int chocolates = 18;
        int[] boxes = {10, 5, 2, 1};

        int count = 0;

        for (int box : boxes) {

            while (chocolates >= box) {
                chocolates -= box;
                count++;

                System.out.println("Used box: " + box);
            }
        }

        System.out.println("Total Boxes Used = " + count);
    }
}
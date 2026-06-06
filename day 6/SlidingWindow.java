public class SlidingWindow {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60};
        int k = 3;

        int sum = 0;

        // First Window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        System.out.println("Window 1:");
        System.out.println(arr[0] + " + " + arr[1] + " + " + arr[2] + " = " + sum);
        System.out.println();

        // Remaining Windows
        int window = 2;

        for (int i = k; i < arr.length; i++) {

            int oldSum = sum;
            int removed = arr[i - k];
            int added = arr[i];

            sum = sum - removed + added;

            System.out.println("Window " + window + ":");
            System.out.println(oldSum + " - " + removed + " + " + added + " = " + sum);
            System.out.println();

            window++;
        }
    }
}
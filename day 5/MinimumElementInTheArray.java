public class MinimumElementInTheArray {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int mid = (left + right) / 2;

            right = mid; 
        }

        System.out.println("Minimum Element = " + arr[left]);
        System.out.println("Index = " + left);
    }
}
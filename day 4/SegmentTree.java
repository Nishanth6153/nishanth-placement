public class SegmentTree {

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 9, 11};
        int left = 1;
        int right = arr.length-2;
        int sum = 0;

        System.out.print("Query [" + left + "-" + right + "] = ");

        for (int i = left; i <= right; i++) {

            sum += arr[i];

            System.out.print(arr[i]);

            if (i < right) {
                System.out.print(" + ");
            }
        }

        System.out.println(" = " + sum);
    }
}
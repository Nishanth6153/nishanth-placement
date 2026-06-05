public class SearchNumberInSortedMatrix {

    public static void main(String[] args) {

        int[][] matrix = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        int target = 50;

        for (int i = 0; i < matrix.length; i++) {

            int left = 0;
            int right = matrix[i].length - 1;

            while (left <= right) {

                int mid = (left + right) / 2;

                if (matrix[i][mid] == target) {
                    System.out.println("Found at [" + i + "][" + mid + "]");
                    return;
                }

                if (matrix[i][mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        System.out.println("Element not found");
    }
}
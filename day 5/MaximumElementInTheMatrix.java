public class MaximumElementInTheMatrix {

    public static void main(String[] args) {

        int[][] matrix = {
            {10, 25, 15},
            {40, 5, 30},
            {20, 35, 50}
        };

        int max = matrix[0][0];
        int row = 0;
        int col = 0;

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        System.out.println("Largest Element = " + max);
        System.out.println("Index = [" + row + "][" + col + "]");
    }
}
public class PerformanceTest {

    public static void main(String[] args) {

        // Start Time
        long startTime = System.nanoTime();

        // Memory Before Execution
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();

        long memoryBefore =
                runtime.totalMemory() -
                runtime.freeMemory();

        // ----------------------------
        // Your Program Logic
        // ----------------------------

        int n = 100000;

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        System.out.println("Sum = " + sum);

        // ----------------------------
        // End of Program Logic
        // ----------------------------

        long endTime = System.nanoTime();

        long memoryAfter =
                runtime.totalMemory() -
                runtime.freeMemory();

        long executionTime =
                endTime - startTime;

        long memoryUsed =
                memoryAfter - memoryBefore;

        System.out.println("\n===== Performance Report =====");

        System.out.println(
                "Execution Time (ns): "
                        + executionTime);

        System.out.println(
                "Execution Time (ms): "
                        + (executionTime / 1000000.0));

        System.out.println(
                "Memory Used (bytes): "
                        + memoryUsed);

        System.out.println(
                "Memory Used (KB): "
                        + (memoryUsed / 1024.0));

        // Complexity Information
        System.out.println("\n===== Complexity =====");
        System.out.println("Time Complexity : O(n)");
        System.out.println("Space Complexity: O(n)");
    }
}
public class JobScheduling {

    public static void main(String[] args) {

        String[] jobs = {"A", "B", "C"};
        int[] deadline = {2, 1, 3};
        int[] profit = {200, 100, 500};

        boolean[] slot = new boolean[4];
        int totalProfit = 0;

        for (int i = 0; i < jobs.length; i++) {

            if (!slot[deadline[i]]) {
                slot[deadline[i]] = true;
                totalProfit += profit[i];

                System.out.println("Scheduled Job: " + jobs[i] + " with profit: " + profit[i]);
            
            }
        }

        System.out.println("Maximum Profit = " + totalProfit);
    }
}
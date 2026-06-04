class WaterTank {

    public static void main(String[] args) {

        int water = 73;
        int[] buckets = {50, 20, 10, 5, 2, 1};

        int count = 0;

        for (int bucket : buckets) {

            while (water >= bucket) {
                water -= bucket;
                count++;

                System.out.println("Used Bucket: " + bucket + "L");
            }
        }

        System.out.println("Total Buckets Used = " + count);
    }
}

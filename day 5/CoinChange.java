public class CoinChange {

    public static void main(String[] args) {

        int[] coins = {10, 5, 2, 1};
        int amount = 18;

        int count = 0;

        for (int i = 0; i < coins.length; i++) {

            while (amount >= coins[i]) {

                amount = amount - coins[i];
                count++;

                System.out.println("Coin Used: " + coins[i]);
            }
        }

        System.out.println("Minimum Coins = " + count);
    }
}
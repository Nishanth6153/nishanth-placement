

public class SuperMarket {
    public static void main(String[] args) {
        int [] amounts = {100,200,300,400,500,600,700,800};
        int FirstHalf = amounts[0]+amounts[1]+amounts[2]+amounts[3];
        int SecondHalf = amounts[4]+amounts[5]+amounts[6]+amounts[7];

        int total = FirstHalf + SecondHalf;
        System.out.println("Total amount spent in the supermarket: " + total);
    }
}

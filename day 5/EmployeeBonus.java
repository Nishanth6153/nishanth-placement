import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Monthly Sales: ");
        int sales = sc.nextInt();

        System.out.print("Enter Projects Completed: ");
        int projects = sc.nextInt();

        System.out.print("Enter Years of Experience: ");
        int experience = sc.nextInt();

        System.out.print("Enter Profit Contribution: ");
        int profit = sc.nextInt();

        int score = 0;

        // Sales Score
        if (sales >= 500)
            score += 40;
        else if (sales >= 300)
            score += 30;
        else if (sales >= 100)
            score += 20;
        else
            score += 10;

        // Project Score
        if (projects >= 10)
            score += 30;
        else if (projects >= 5)
            score += 20;
        else if (projects >= 2)
            score += 10;
        else
            score += 5;

        // Experience Score
        if (experience >= 10)
            score += 20;
        else if (experience >= 5)
            score += 15;
        else if (experience >= 2)
            score += 10;
        else
            score += 5;

        // Profit Score
        if (profit >= 500)
            score += 10;
        else if (profit >= 200)
            score += 8;
        else if (profit >= 100)
            score += 5;
        else
            score += 2;

        System.out.println("\nPerformance Score = " + score);

        if (score >= 80)
            System.out.println("Excellent Bonus");
        else if (score >= 60)
            System.out.println("Standard Bonus");
        else
            System.out.println("No Bonus");

        sc.close();
    }
}
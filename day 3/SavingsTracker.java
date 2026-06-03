public class SavingsTracker {
    public static void main(String[] args) {
        int months = 6;
       
        int prev2 = 0; 
        int prev1 = 1; 
        
        System.out.println("Savings for the first 6 months:");
        System.out.println("Month 1: " + prev2);
        System.out.println("Month 2: " + prev1);
        
      
        for (int i = 3; i <= months; i++) {
            int currentMonthSaving = prev1 + prev2;
            System.out.println("Month " + i + ": " + currentMonthSaving);
            
          
            prev2 = prev1;
            prev1 = currentMonthSaving;
        }
    }
}



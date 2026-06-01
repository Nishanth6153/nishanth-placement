public class TaskSheduling{
    public static int gcd(int a , int b ){
        while(b!=0){
            int temp = b;
            b = a%b;
            a=temp; 
        }
        return a;
    }
    public static int lcm(int a , int b ){
        return (a*b)/gcd(a,b);
    }
    public static void main (String[] args){
        int result = lcm(12,18);
        result = lcm(result,30);
        System.out.println("All servers refresh together after "+ result+ " Seconds");
    }
}
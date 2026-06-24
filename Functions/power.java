import java.util.*;

public class power {
    public static double calculatePower(int x, int n){
        double result = Math.pow(x,n);
        return result;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of x:- ");
        int x = sc.nextInt();

        System.out.print("Enter the value of n:- ");
        int n = sc.nextInt();

        double result = calculatePower(x,n);

        System.out.println("value of " + x + " raised to the power of " + n + " = " + result);
        sc.close();
    }
}

import java.util.*;

public class sum {
    public static int calculateSum(int a, int b) {

        int result = a+b;

        return result;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number to sum: ");
        int a = sc.nextInt();

        System.out.print("Enter second number to sum: ");
        int b = sc.nextInt();

        int result = calculateSum(a,b);

        System.out.println("Sum of the numbers = " + result);
        sc.close();
    }
}
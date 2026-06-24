import java.util.*;

public class product {
    public static int calculateProduct( int a, int b){

        int result = a*b;

        return result;

    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st no. ");
        int a = sc.nextInt();

        System.out.print("Enter the 2nd no. ");
        int b = sc.nextInt();

        int result = calculateProduct(a,b);

        System.out.println("Product of the two numbers = " + result);
        sc.close();
    }
}

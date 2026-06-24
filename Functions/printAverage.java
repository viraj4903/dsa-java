import java.util.*;

public class printAverage {
    public static int calculateAverage(int a, int b, int c){

        int result = (a+b+c)/3;
        return result;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st no. ");
        int a = sc.nextInt();

        System.out.print("Enter the 2nd no. ");
        int b = sc.nextInt();

        System.out.print("Enter the 3rd no. ");
        int c = sc.nextInt();

        int result = calculateAverage(a, b, c);

        System.out.print("Average of the 3 numbers = " + result);

        sc.close();
    }

}

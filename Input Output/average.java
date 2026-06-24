import java.util.*;

public class average {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int a,b,c;
        float sum,average;

        System.out.println("Enter the 1st no.");

        a = sc.nextInt();

        System.out.println("Enter the 2nd no.");

        b = sc.nextInt();

        System.out.println("Enter the 3rd no.");

        c = sc.nextInt();

        sum = a+b+c;
        average = (sum)/3;

        System.out.println("Sum of all the numbers = " + sum);

        System.out.println("Average of all the numbers = " + average);

        sc.close();
    }
    
}

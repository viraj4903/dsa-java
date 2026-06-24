import java.util.*;

public class input_output {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the 1st number: ");

        int a = sc.nextInt();

        System.out.println("Enter the 2nd number: ");

        int b = sc.nextInt();

        int sum = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        int mod = a%b;


        System.out.println("Addition of the numbers=" + sum);
        System.out.println("Subtraction of the numbers=" + sub);
        System.out.println("Multiplication of the numbers=" + mul);
        System.out.println("Division of the numbers=" + div);
        System.out.println("Remainder of the numbers=" + mod);

        sc.close();
        
    }
    
}

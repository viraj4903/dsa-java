import java.util.*;

public class fibonacci{
    public static void printFibonacci(int n){

        int a=0;
        int b=1;

        System.out.print(a + " " + b);

        for(int i=1; i<=n-2; i++){
            int result = a+b;
            System.out.print(" " + result);
            a=b;
            b=result;
        }
        return;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of terms:- ");
        int n = sc.nextInt();

        printFibonacci(n);

        sc.close();
    }
}
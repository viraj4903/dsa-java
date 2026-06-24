import java.util.*;

public class factorial {
    public static int calculateFactorial(int n){
        int result = 1;

        if(n<0){
            return -1;
        }
        for(int i=n; i>=1; i--){
            result = result*i;
        }
        return result;
}
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. to calculate its factorial :- ");
        int n = sc.nextInt();

        int result = calculateFactorial(n);

        if(result==-1){
            System.out.println("Invalid no.");
        }
        else{
            System.out.println("Factorial of the number = " + result);
        }
        sc.close();
    }
}

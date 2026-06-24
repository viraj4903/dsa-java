import java.util.*;

public class primeOrNot {
    public static boolean isPrime(int n){

        if(n<=1){
            return false;
        }
        for(int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number you want to check:- ");
        int n = sc.nextInt();

        boolean result = isPrime(n);

        if(result){
            System.out.println(n + " is a prime no.");
        }
        else{
            System.out.println(n + " is not a prime no.");
        }
        sc.close();
    }
}

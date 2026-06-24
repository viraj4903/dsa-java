import java.util.*;

public class prime {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number you want to check");
        int n = sc.nextInt();

        boolean test = true;

        if(n<=1){
            test = false;
        }
        else {
            for (int i = 2; i<n; i++){
                if(n%i==0){
                    test = false;
                    break;
                }
            }
        }

        if(test){
            System.out.println(n + " is a prime no.");
        }
        else {
            System.out.println(n + " is not a prime no.");
        }
        sc.close();
    }
}
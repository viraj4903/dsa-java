import java.util.*;

public class odd_even {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. you want to check");

        int n = sc.nextInt();

        if(n%2 == 0){
            System.out.println("No. is even");
        }  

        else{
            System.out.println("No. is odd");
        }

        sc.close();
    }
}

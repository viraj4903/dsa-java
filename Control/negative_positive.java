import java.util.*;

public class negative_positive {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. you want to check");

        int n = sc.nextInt();

        if(n<0){
            System.out.println("No. is negative");
        }

        else if(n==0){
            System.out.println("Enter a non zero no.");
        }

        else{
            System.out.println("No. is positive");
        }

        sc.close();
    }
}

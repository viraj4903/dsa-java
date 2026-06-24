import java.util.*;

public class natural {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int i=1,j=0;

        System.out.println("Enter the no. of terms of which you would like to print the sum: ");
        int n = sc.nextInt();

        sc.close();

        for(i=1; i<=n; i++){
            j = i+j;
        }

        System.out.println("Sum of n natural numbers = " + j);

    }
}

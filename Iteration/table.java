import java.util.*;

public class table {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. which you would like to print the table of: ");
        int n = sc.nextInt();

        System.out.println();

        for(int i=1;i<=10;i++){
            System.out.println(n + " x " + i + " = " + n*i );
        }

        sc.close();
        
    }
}

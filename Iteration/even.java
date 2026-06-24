import java.util.*;

public class even {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. upto which you want to print the even numbers: ");
        int n = sc.nextInt();

        for(int i=0; i<=n; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
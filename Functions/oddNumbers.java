import java.util.*;

public class oddNumbers{
    public static int calculateSum(int n){

        int result=0;

        for(int i =1 ; i<=n; i++){
            if(i%2!=0){
                result = result + i;
            }
        }
        return result;
    }
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n:- ");
        int n = sc.nextInt();

        int result = calculateSum(n);

        if(result<=0){
            System.out.println("Enter a valid value");
        }
        else{
        System.out.println("Sum of odd no. upto n = " + result);
        }

        sc.close();
    }
}
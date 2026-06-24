import java.util.*;

public class evenOrNot {
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. you want to check:- ");
        int n = sc.nextInt();

        boolean result = isEven(n);

        if(result){
            System.out.println(n + " is an even no.");
        }
        else{
            System.out.println(n + " is an odd no.");
        }
        sc.close();
    }
}

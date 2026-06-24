import java.util.*;

public class twoNumbers {
    public static int greaterNumber(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st number:- ");
        int a = sc.nextInt();

        System.out.print("Enter the 2nd number:- ");
        int b = sc.nextInt();

        int result = greaterNumber(a,b);

        System.out.println("The greater no. is " + result);

        sc.close();
    }
}

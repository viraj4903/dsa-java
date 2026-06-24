import java.util.*;

public class vote {
    public static boolean age(int n){

        if(n>=18){
            return true;
        }
        return false;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter you age:- ");
        int n = sc.nextInt();

        boolean result = age(n);

        if(result){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are not eligible to vote");
        }
        sc.close();
    }
}

import java.util.*;

public class printTable {
    public static void printTheTable(int n){
        for(int i=1; i<=10; i++){
            int result = n*i;

            System.out.println(n + " x " + i + " = " + result);
        }
        return;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number:- ");
        int n = sc.nextInt();

        printTheTable(n);

        sc.close();
    }
}

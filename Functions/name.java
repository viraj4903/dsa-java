import java.util.*;

public class name {
    public static void printMyName(String name) {
        System.out.print("your name :- " + name);
        return;
    }
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println();

        printMyName(name);
        
        sc.close();
    }
}
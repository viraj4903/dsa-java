import java.util.*;

public class names {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array:- ");
        int size = sc.nextInt();
        
        String name[] = new String[size];
        System.out.println("Enter the elements of array: ");

        for(int i=0; i<size; i++){
            name[i] = sc.next();
        }

        System.out.println("List of names -> ");
        for(int i=0; i<size; i++){
            System.out.println(name[i]);
        }
        sc.close();
    }
}

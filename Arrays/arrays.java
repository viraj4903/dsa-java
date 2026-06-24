import java.util.*;

public class arrays {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array:- ");
        int size = sc.nextInt();

        int marks[] = new int[size];
        System.out.println("Enter the elements of array: ");

        for(int i=0; i<size; i++){
            marks[i] = sc.nextInt();
        }

        System.out.print("marks -> ");
        for(int i=0; i<size; i++){
            System.out.print(marks[i] + " ");
        }

        sc.close();
    }
}
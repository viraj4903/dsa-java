import java.util.*;

public class ascendingOrNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array:- ");
        int size = sc.nextInt();

        int order[] = new int[size];
        System.out.println("Enter the elements of array: ");

        for(int i=0; i<size; i++){
            order[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for(int i=0; i<size-1; i++){
            if(order[i] > order[i+1]){
                isAscending=false;
            }
        }

        if(isAscending){
            System.out.println("Array is in ascending order");
        }
        else{
            System.out.println("Array is not in ascending order");
        }
        sc.close();
    }
}

import java.util.*;

public class arrays_v2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of rows:- ");
        int m = sc.nextInt();

        System.out.print("Enter the no. of columns:- ");
        int n = sc.nextInt();

        int[][] numbers = new int[m][n];
        System.out.println("Enter the elements of array: ");

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
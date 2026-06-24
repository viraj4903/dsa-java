import java.util.*;

public class search {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of rows:- ");
        int m = sc.nextInt();

        System.out.print("Enter the no. of columns:- ");
        int n = sc.nextInt();

        int array[][] = new int[m][n];
        System.out.println("Enter the elements of array: ");

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                array[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the no. you want to search:- ");
        int x = sc.nextInt();

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(x==array[i][j]){
                    System.out.println("Element found at location: " + i + "," + j);
                }
            }
        }
        sc.close();
    }
}

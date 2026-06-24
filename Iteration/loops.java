import java.util.*;

public class loops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i,j=1,k=1;

        int n = sc.nextInt();

        sc.close();
        
        for(i = 1; i<n; i++){
            System.out.println(i);
        }

        System.out.println("");

        while(j<n){
            System.out.println(j);
            j++;
        }

        System.out.println("");

        do{
            System.out.println(k);
            k++;
        }
        while(k<n);

    }
}
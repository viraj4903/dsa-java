import java.util.*;

public class marks {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n,m=0;

        System.out.println("Would you like to enter the marks?");
        System.out.println("Press 1 for YES, 0 for NO ");
        n = sc.nextInt();

        do{
            System.out.println("Enter the marks obtained out of 100: ");
            m = sc.nextInt();

            if(m>=90){
            System.out.println("This is good");
            }
            else if(m<90 && m>=60){
            System.out.println("This is also good");
            }
            else if(m<60 && m>0){
            System.out.println("This is good as well");
            }
            else {
            System.out.println("you didn't enter marks");
            }
            
        }   
        while(n==1);

        sc.close();
    }
}
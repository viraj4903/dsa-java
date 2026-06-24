import java.util.*;

public class calculator {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.println("\nCalculator Menu:- \n");

        System.out.println("1. Addition");
        System.out.println("2. Substaction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Remainder");

        System.out.println("\nPlease choose one of the button from the menu.\n");

        int button = sc.nextInt();

        System.out.println(" ");

        switch(button){

            case 1 : System.out.println("a + b = " + (a+b));
            break;

            case 2 : System.out.println("a - b = " + (a-b));
            break;

            case 3 : System.out.println("a x b = " + (a*b));
            break;

            case 4 : if(b==0){
                        System.out.println("Invalid division");
                    }
                     else{
                     System.out.println("a / b = " + (a/b));
                    }
            break;

            case 5 : if(b==0){
                        System.out.println("Invalid Division");
                    }
                     else{
                     System.out.println("a % b = " + (a%b));
                    }
            break;

            default :System.out.println("Invalid Button");

        }

        System.out.println("\n");

        sc.close();

    }
}

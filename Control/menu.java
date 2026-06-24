import java.util.*;

public class menu {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Shop Menu: \n");
        System.out.println("1. Keyboard  ...  200$ \n2. Mouse     ...  100$ \n3. Monitor   ...  900$ \n4. Printer   ...  500$ \n");
        System.out.print("Please select one of the button from the menu:- ");

        int button = sc.nextInt();

        switch(button){

            case 1 : System.out.println("Keyboard  ...  200$");
                     int a = sc.nextInt();
                     if(a==200){
                        System.out.println("Keyboard");
                     }
                     else{
                        System.out.println("Inappropriate amount");
                     }
            break;

            case 2 : System.out.println("Mouse     ...  100$");
                     int b = sc.nextInt();
                     if(b==100){
                        System.out.println("Mouse");
                     }
                     else{
                        System.out.println("Inappropriate amount");
                     }
            break;

            case 3 : System.out.println("Monitor   ...  900$");
                     int c = sc.nextInt();
                     if(c==900){
                        System.out.println("Monitor");
                     }
                     else{
                        System.out.println("Inappropriate amount");
                     }
            break;

            case 4 : System.out.println("Printer   ...  500$");
                     int d = sc.nextInt();
                     if(d==500){
                        System.out.println("Printer");
                     }
                     else{
                        System.out.println("Inappropriate amount");
                     }
            break;

            default : System.out.println("Invalid Button");

            sc.close();

        }
    }
}

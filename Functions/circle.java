import java.util.*;

public class circle {
    public static double calculateCircumferance(int radius){

        double result = 2*3.14*radius;
        return result;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle:- ");
        int radius = sc.nextInt();

        double result = calculateCircumferance(radius);

        System.out.println("Circumferance of the circle is = " + result);

        sc.close();
    }
}

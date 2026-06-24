import java.util.*;

public class area_of_circle {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the radius of the circle");
        int r = sc.nextInt();

        double pi = 3.14;
        double area = pi * r * r ;
        double perimeter = 2*pi*r;

        System.out.println(" Area of the circle = " + area);
        System.out.println(" Perimeter of the circle = " + perimeter);

        sc.close();

    }
}

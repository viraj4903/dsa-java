import java.util.*;

public class area_of_rectangle {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int length,width,area,perimeter;

        System.out.println("Enter the length of the rectangle");
        length = sc.nextInt();

        System.out.println("Enter the width of the rectangle");
        width = sc.nextInt();

        area = length*width;
        perimeter = 2 * (length + width);
        
        System.out.println("Area of the rect. = " + area);

        System.out.println("Perimeter of the rect. = " + perimeter);

        sc.close();
    }  
}

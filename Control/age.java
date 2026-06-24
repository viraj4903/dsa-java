import java.util.*;

public class age {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name");
        String name = sc.nextLine();

        System.out.println("Enter Your Age");
        int age = sc.nextInt();

         if(age<= 18){
            System.out.println("Hey " + name + ", you are under 18");
         }

         else if(age<=35 && age>18){
            System.out.println("Hey " + name + ", you are an adult");
         }

         else{
            System.out.println("Hey " + name + ", you are a senior");
         }
         
         sc.close();
    }
}

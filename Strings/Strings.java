import java.util.*;

public class Strings {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // String declaration = "My name is Tony Stark.";

        System.out.print("Enter your name:- ");
        String yourName = sc.nextLine();
        System.out.println("Your name is : " + yourName);

        // Concatenation

        String firstName = "Tony";
        String lastName = "Stark";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        System.out.println(fullName.length());

        //charAt

        for(int i=0; i<fullName.length(); i++){
            System.out.print(fullName.charAt(i) + " ");
        }

        //compareTo

        String name1 = "tony";
        String name2 = "tony";

        if(name1.compareTo(name2)==0){
            System.out.println("\nStrings are equal");
            System.out.println(name1.compareTo(name2));
        }
        else if(name1.compareTo(name2)>0){
            System.out.println("\nString 1 is greater");
            System.out.println(name1.compareTo(name2));
        }
        else{
            System.out.println("\nString 2 is greater");
            System.out.println(name1.compareTo(name2));
        }

        //Substring

        String sentence = "my name is Tony";
        String name = sentence.substring(11);
        System.out.println(name);

        sc.close();
    }
}
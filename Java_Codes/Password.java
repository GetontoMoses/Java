import java.util.Scanner;

public class Password {
    public static void main(String[] args){
        String password ="WeeMzee";
        String passWord;
        Scanner mypass= new Scanner(System.in);
        System.out.println("Enter Password");
        passWord=mypass.nextLine();

        if (password.compareTo(passWord)==0){
            System.out.println("Correct password");
           double radius,height; 
           double volume;
        Scanner myInput= new Scanner(System.in);
        System.out.println("Enter radius metres");
        radius=myInput.nextDouble();
        System.out.println("Enter height in metres");
        height=myInput.nextDouble();

        volume= (22/7)*radius*radius*height;
        
         System.out.println("The capacity is: "+ volume+" litres");
        
       }
       else {
            System.out.println("incorrect Your password you connot use the system");
       }
    }
    
}

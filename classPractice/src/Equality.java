import java.util.Scanner;

public class Equality {
    public static void main(String[] args){
        int password = 123456;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a pin: ");
        int userPass = input.nextInt();

        if(password == userPass){
            System.out.println("Correct pass");
        }else {
            System.out.println("wrong pass!!");
        }
    }
}

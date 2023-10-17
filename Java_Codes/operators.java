import java.util.Scanner;

public class operators {
    public static void main( String[] args){
        int userNumber;

        System.out.println("Enter any number");
        Scanner input= new Scanner(System.in);
        userNumber =input.nextInt();

        if (userNumber%11 == 0){
            System.out.println("Divisible by 11");
        }
        else{
             System.out.println("Not divisible by 11");
        }
    }
    
}

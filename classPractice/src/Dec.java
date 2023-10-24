import java.util.Scanner;

public class Dec {
    public static void main (String[] args){
        int num;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = input.nextInt();

        for( int i = num; i>0; i--){
            System.out.println(i);
        }
    }
}

import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {
        int num;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        num = input.nextInt();

        if ((num%2) == 0){
            System.out.println("Num is even");
        }else {
            System.out.println("Num is odd");
        }
    }
}

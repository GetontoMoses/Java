import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        int num1 ;
        Scanner myInput= new Scanner(System.in);                      
        System.out.println("Enter a number");
        num1 = myInput.nextInt();
        int num2 = 50;
        int sum = num1+num2;
        System.out.println("The sum of" + num1 + "and "+num2+" is"+ sum);

    }
}
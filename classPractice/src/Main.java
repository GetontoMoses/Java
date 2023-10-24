import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int year;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
        year = input.nextInt();

        if ((year%4) == 0){
            System.out.println("The year is Leap");
        }else {
            System.out.println("Non-Leap Year");
        }
    }
}
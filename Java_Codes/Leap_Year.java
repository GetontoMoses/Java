import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args){
    int year;
        Scanner myInput= new Scanner(System.in);
        System.out.println("Enter a year in digit format");
        year = myInput.nextInt();

        if(year%4==0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}

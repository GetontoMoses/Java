import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       double a;
        Scanner myInput= new Scanner(System.in);
        System.out.println("Enter a number");
        
        a = myInput.nextDouble();
        System.out.println(twice(a));
       }
    public static double twice(double a){
        return a*2;
    }
}
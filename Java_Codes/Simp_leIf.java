import java.util.Scanner;

public class Simp_leIf {
    public static void main(String[] args){
        int a;
        Scanner myInput= new Scanner(System.in);
        System.out.println("Enter value 1");
        a = myInput.nextInt();

        if(a > 50){
            System.out.println(a*2);
        }
        else{
            System.out.println(a);
        }
    }
}

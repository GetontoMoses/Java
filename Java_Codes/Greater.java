import java.util.Scanner;

public class Greater {
    public static void main(String[] args){
        int a,b,c;
        Scanner myInput= new Scanner(System.in);
        System.out.println("Enter value 1");
        a = myInput.nextInt();
        System.out.println("Enter value 2");
        b = myInput.nextInt();
        System.out.println("Enter value 3");
        c= myInput.nextInt();
        
        if((a>b) && (a>b)) {
            System.out.println(a + "is the largest");
         }

        else if((b>a) && (b>c)) {
            System.out.println(b + "is the largest");
         }
        else{
            System.out.println( c + "is the largest");
         }

    }
}

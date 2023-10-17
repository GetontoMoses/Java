import java.util.Scanner;

public class Switch_Case {
     public static void main(String[] args){
        int choice;
        Scanner myInput= new Scanner(System.in);
        System.out.println("Enter choice");
        choice = myInput.nextInt();
        switch(choice){
            case 1:
            System.out.println("one");
            break;
            case 2:
            System.out.println("two");
            break;
            case 3:
            System.out.println("three");
            break;
            default:
            System.out.println("did not match any case");
            break;
        }
    
    }
}


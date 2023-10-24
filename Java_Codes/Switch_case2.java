import java.util.Scanner;

public class Switch_case2 {
    public static void main(String[] args){
        System.out.println("Enter a number for a day of the week btn 1-7");

        int Day;
        Scanner myInput=new Scanner(System.in);
        Day=myInput.nextInt();

        switch(Day){
            case 1:
            System.out.println("Sunday");
            break;
            case 2:
            System.out.println("Monday");
            break;
            case 3:
            System.out.println("Tuesday");
            break;
            case 4:
            System.out.println("Wednesday");
            break;
            case 5:
            System.out.println("Thursday");
            break;
            case 6:
            System.out.println("Friday");
            break;
            case 7:
            System.out.println("Saturday");
            break;
            default:
            System.out.println("Invalid choice enter between 1-7");  
            break;      
        }
        
    }
}

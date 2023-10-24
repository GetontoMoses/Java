import java.util.Scanner;

public class LogicalAND {
    public static void main (String[] args){
        float gpa;
        int year;
        boolean graduate;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
        year = input.nextInt();

        System.out.println("Enter GPA: ");
        gpa = input.nextFloat();

        if (year == 4 && gpa > 2.0){
            graduate = true;
            System.out.println("Proceed to graduation");
        }else {
            graduate = false;
            System.out.println("Unable to verify graduation. Kindly visit your HOD for mor info");
        }
    }
}

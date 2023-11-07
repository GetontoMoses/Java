import java.util.Scanner;

public class MainCircle {
    public static void main(String[] args){
        double radiusMain;
        Scanner myInput= new Scanner(System.in);
        System.out.println("Enter the radius");
        radiusMain = myInput.nextDouble();

        Circle sufuri =new Circle();
        sufuri.Area(radiusMain);
        sufuri.DisplayArea();

    }
    //double showRadius(double radiusMain){
      // return radiusMain;
    //}
}

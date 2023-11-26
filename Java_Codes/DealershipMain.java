import java.util.ArrayList;
import java.util.Scanner;

public class DealershipMain {
   public static void main(String[] args) {
     String make;
     String model;
     int numberofpassangers;
     double price;
     Double batteryCapacity;
     int lifeSpan;
     Double engineCapacity;
     String  fuelType;
     int n;
     char answer;

     ArrayList<Dealership> Car =new ArrayList<>();
     System.out.println("How many cars do you want?");
     Scanner myInput =new Scanner(System.in);
     n=myInput.nextInt();
     System.out.println("Enter the Car details");
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Car "+ (i+1)+ " details");
            System.out.println("Enter the Make");
            make=myInput.next();
            System.out.println("Enter the model");
            model = myInput.next();
            System.out.println("Enter the number of passangers");
            numberofpassangers = myInput.nextInt();
            System.out.println("Enter the price");
            price = myInput.nextDouble();

            System.out.println("Is the car electric or Ordinary('E' for Electric 'O' for Ordinary)");
            answer=myInput.next().charAt(0);
            if (answer=='E'){
            System.out.println("Enter the battery capacity");
            batteryCapacity = myInput.nextDouble();
            System.out.println("Enter the battery life span in years");
            lifeSpan = myInput.nextInt();
           ElectricCar electric=new ElectricCar(make, model, numberofpassangers, price, batteryCapacity, lifeSpan);
           Car.add(electric);
            }
           else if (answer=='O'){
             System.out.println("Enter the Engine capacity");
            engineCapacity = myInput.nextDouble();
            System.out.println("Enter the fuel type");
            fuelType = myInput.next();
            OrdinaryCar ordinary=new OrdinaryCar(make, model, numberofpassangers, price, engineCapacity, fuelType);
            Car.add(ordinary);
           }
           else{
            System.out.println("Invalid input");
           }
        }
     System.out.println("Here are the:");
        for(int j=0; j<Car.size();j++){
            System.out.println("Car "+ (j+1)+ " details");
            Car.get(j).Displaydetails();
        }
}

}

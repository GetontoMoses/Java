import java.util.ArrayList;
import java.util.Scanner;

public class CarsMain {
    public static void main(String[] args) {
        ArrayList<Cars> cars = new ArrayList<Cars>();

        Scanner myInput =new Scanner(System.in);
        String model;
        String make;
        double price;
        double sum=0;

        System.out.println("Enter the Car details");
        for(int i=0;i<5;i++){
            System.out.println("Enter car "+ (i+1)+ " details");
            System.out.println("Enter the Model");
            model=myInput.next();
            System.out.println("Enter the Make");
          make=myInput.next();
            System.out.println("Enter the price");
            price=myInput.nextDouble();

            Cars car=new Cars(model, model, price);
            cars.add(car);
    }
    for(int i=0; i<cars.size();i++){
        cars.get(i).getDetails();
        cars.get(i).Showdetails();
    }
    
    double avgAge=(float) sum/cars.size();
    System.out.println("Average price" + avgAge);

    for(int i=0; i<cars.size();i++){
       sum=sum+cars.get(i).getPrice();
    }
    System.out.println("Total Cost: "+ sum);
    
 }

}

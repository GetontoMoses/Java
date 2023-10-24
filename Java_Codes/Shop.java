import java.util.Scanner;

public class Shop {
    public static void main(String[] args){
        int size;
        double sum =0;
        double avg;

        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of values");
        size=input.nextInt();
        double[] prices= new double[size];
        System.out.println("Enter prices");
        for(int i=0; i<prices.length;i++){
         System.out.println("Enter price "+ (i+1));
         prices[i]=input.nextDouble();
         sum+=prices[i];
        
     }
     System.out.println("Sum = " +sum);
     avg=sum/prices.length;
     System.out.println("Average = " +avg);

     for(int n=0;n<prices.length;n++){
       prices[n] =1.16*prices[n]; 
      System.out.println("New price =" + prices[n]);
    }

     }

}

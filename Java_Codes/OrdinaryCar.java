public class OrdinaryCar extends Dealership {
    private Double engineCapacity;
    private String  fuelType;

public OrdinaryCar(String make,String model,int numberofpassangers, double price,Double engineCapacity,String fuelType){
    super(make,model,numberofpassangers,price);
    this.engineCapacity= engineCapacity;
    this.fuelType= fuelType;
}
    public Double getengineCapacity() {
        return engineCapacity;
    }
    public String getFuelType() {
        return fuelType;
    }

    public void Displaydetails(){
        super.Displaydetails();
        System.out.println("Engine Capacity: " + engineCapacity);
        System.out.println("Fuel Type: " + fuelType);
    }
    
}

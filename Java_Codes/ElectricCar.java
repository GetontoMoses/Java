public class ElectricCar extends Dealership {
    private Double batteryCapacity;
    private int lifeSpan;

public ElectricCar(String make,String model,int numberofpassangers, double price,Double batteryCapacity,int lifeSpan){
    super(make,model,numberofpassangers,price);
    this.batteryCapacity= batteryCapacity;
    this.lifeSpan= lifeSpan;
}
    public Double getBatteryCapacity() {
        return batteryCapacity;
    }
    public int getLifeSpan() {
        return lifeSpan;
    }

    public void Displaydetails(){
        super.Displaydetails();
        System.out.println("Battery Capacity: " + batteryCapacity);
        System.out.println("Battery Lifespan: " + lifeSpan);
    }
}

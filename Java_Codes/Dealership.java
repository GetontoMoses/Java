public class Dealership {
    private String make;
    private String model;
    private int numberofpassangers;
    private double price;

    public Dealership(String make,String model,int numberofpassangers, double price){
        this.make= make;
        this.model= model;
        this.numberofpassangers= numberofpassangers;
        this.price =price;
    }
    
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getNumberofpassangers() {
        return numberofpassangers;
    }
    public double getPrice() {
        return price;
    }
    public void Displaydetails(){
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Passanger capacity: " + numberofpassangers);
        System.out.println("Price: " + price);
    }
}

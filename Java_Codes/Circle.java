public class Circle {
    private double radius;
    private double area;
    
    //void getRadius(){
   //MainCircle myradius =new MainCircle();
   //this.radius=myradius.showRadius(radius) ;
    //}
    void Area(double radius){
       this.radius=radius;
       this.area=(3.142)*radius*radius;
    }
    void DisplayArea(){
        System.out.println(area);
    }
}

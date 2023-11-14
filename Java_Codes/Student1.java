public class Student1 {
    private String name;
    private int age;
     public Student1(String name,int age){
        this.name = name;
        this.age=age;
     }
     void getDetails(){
        System.out.println("name " + name);
        System.out.println("Age " + age);
     }

     int getAge(){
     return age;
     }
   
     void Displadetails(){
      System.out.println("Name "+ name +" age"+ age);
     }
}

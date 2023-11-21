public class NativeStudent extends AllStudents {

     private String county;
    public NativeStudent(String name, String county){
        super (name);
        this.county= county;
    }
    void studentDetails(){
        System.out.println("County: " +county);
    }
}
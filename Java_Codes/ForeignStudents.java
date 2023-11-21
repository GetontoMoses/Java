public class ForeignStudents extends AllStudents {
    private String passportNumber;

    public ForeignStudents(String name, String passportNumber){
        super (name);
        this.passportNumber=passportNumber;
    }
    void studentDetails(){
        System.out.println("Passport: " + passportNumber);
    }
}

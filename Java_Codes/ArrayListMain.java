import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMain {
    public static void main(String[] args) {
        ArrayList<Student1>studentList=new ArrayList<>();
        Scanner myInput =new Scanner(System.in);
        String name;
        int age;
        int sum =0;
        System.out.println("Enter Student details");
        for(int i=0;i<5;i++){
            System.out.println("Enter Student "+ (i+1)+ " details");
            System.out.println("Enter Name");
            name=myInput.next();
            System.out.println("Enter Age");
            age = myInput.nextInt();
            Student1 student=new Student1(name, age);
            studentList.add(student);
        }
        for(int i=0; i<studentList.size();i++){
            studentList.get(i).getDetails();
            studentList.get(i).Displadetails();
        }

        for(int i=0; i<studentList.size();i++){
           sum=sum+studentList.get(i).getAge();
        }
        double avgAge=(float) sum/studentList.size();
        System.out.println("Average age" + avgAge);
    }
}

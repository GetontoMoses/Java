public class Student {
    private String name;
    private String major;
    private int age;

    public Student(String name, String major,int age){
        this.name=name;
        this.major=major;
        this.age= age;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public int getAge() {
        return age;
    }


}

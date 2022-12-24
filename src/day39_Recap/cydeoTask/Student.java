package day39_Recap.cydeoTask;

public class Student extends Person {

    private int studentId;
    private String fieldfOfStudy;

    public Student(String name, int age, char gender, int studentId, String fieldfOfStudy) {
        super(name, age, gender);
        setStudentId(studentId);
        setFieldfOfStudy(fieldfOfStudy);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFieldfOfStudy() {
        return fieldfOfStudy;
    }

    public void setFieldfOfStudy(String fieldfOfStudy) {
        this.fieldfOfStudy = fieldfOfStudy;
    }
    public void study(){

        System.out.println(getName() + " is studying");

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                "studentId=" + studentId +
                ", fieldfOfStudy='" + fieldfOfStudy + '\'' +
                '}';
    }
}

package day30_CustomClass;

public class Employee {

    public String name;

    public int id;

    public char gender;

    public  void setInfo(String name, int id, char gender, int age, String jobTitle, double salary, boolean isFullTime) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.age = age;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    public int age;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", gender=" + gender +
                ", age=" + age +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public String jobTitle;

    public double salary;

    public boolean isFullTime;

}

package day39_Recap.cydeoTask;

public class Employee {

    private int employeeId;
    private String jobTitle;
    private double salary;

    public Employee(int employeeId, String jobTitle, double salary) {
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    //new Employee("Layan", -1000)

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void work(){
        System.out.println();
    }
}
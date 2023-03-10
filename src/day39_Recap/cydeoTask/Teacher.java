package day39_Recap.cydeoTask;

import day39_Recap.shapeTask.ShapeObjects;

public class Teacher extends  Employee {

    public Teacher(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + "" + getName() + " is teaching");
    }
}

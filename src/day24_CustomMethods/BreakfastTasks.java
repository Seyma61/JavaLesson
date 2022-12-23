package day24_CustomMethods;

public class BreakfastTasks {
    public static void main(String[] args) {
        initials("wooden", "spoon");
        System.out.println("............");
        domain("Cydeo.School@gmail.com");
    }
// 1) create a method that can display the initials of the person, initials(String firstname,String last name)

    public static void initials(String firstName, String lastName) {
        // System.out.println("Hello World!"); wrong approach
        String initial = firstName.charAt(0) + "." + lastName.charAt(0);
        initial = initial.toUpperCase();// baş harfleri büyük yapmak için
        System.out.println("initial = " + initial);
    }

// 2) create a method that can display the domain of the email, domain(String email)

    public static void domain(String email) { //Cydeo@gmail.com
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);

        System.out.println("..................");
        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "gulsen@gmail.com"};


        //for (String email : emails) {

        //domain(email);
        System.out.println(".............");
        nameOfMonth(11);


    }


// 3) Create a method that can display the name of the month based on the given number to the method

    public static void nameOfMonth(int number) {
        String name = "";
        if (number >= 1 && number <= 12) {
            name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "Mar" : (number == 4) ? "Apr" : (number == 5) ? "May" : (number == 6) ? "Jun" : (number == 7) ? "Jul" : (number == 8) ? "Aug" : (number == 9) ? "Sep" : (number == 10) ? "Sep" : (number == 11) ? "Nov" : "Dec";
        }else {
            name = "Invalid";
        }


            System.out.println("Month name = " + name);
        }

// 4)create a method that can print the name of the day based  on the given number to the method
    public  static void nameOfDay(int number){

    }
// 5) Create a method that can print how many days a month has
public static void  dayInMonth(int number){

}

// 6) ageGroups(int age)

}




package day24_CustomMethods;

public class ReturnStatement2 {

    public static void main(String[] args) {
        nameOfMont(30);
    }
    public static void nameOfMont(int number) {


        if (number < 1 || number > 12) {
            System.out.println("Invalid");
            return;// exits nameOfMethodi remaining code fragemnts of the method never get executed


        }

           String name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "Mar" : (number == 4) ? "Apr" : (number == 5) ? "May" : (number == 6) ? "Jun" : (number == 7) ? "Jul" : (number == 8) ? "Aug" : (number == 9) ? "Sep" : (number == 10) ? "Sep" : (number == 11) ? "Nov" : "Dec";
            System.out.println("Month name = " + name);


        }
    }


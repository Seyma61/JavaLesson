package PracticeJava;

public class CustomMethod {
    //1. create a method that can print odd numbers between 1~100 in a same line saperated by space

    public static void main(String[] args) {
        oddNumbers();
        evenNumbers();
    }
    public  static void oddNumbers() {
        for (int i = 1; i < 100; i += 2) {
            System.out.print(i + " ");

        }
    }
            //2. create a method that can print even numbers between 1~100 in a same line saperated by space


           public static void evenNumbers() {
            for (int j = 0; j <= 100; j += 2) {
                System.out.print(j+ " ");
            }



    }

}

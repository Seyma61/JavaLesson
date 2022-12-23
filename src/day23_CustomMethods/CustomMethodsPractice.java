package day23_CustomMethods;

public class CustomMethodsPractice {

    //create a function that can print hello world 5 times=> helloworld5times

    public static void main(String[] args) {


        helloworld5times();
        helloCydeo5times();
        evenNumbers();
    }

    public static void helloworld5times() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");

        }
    }

    //create a function that  can print hello Cydeo 5 times=>helloCydeo5times
    public static void helloCydeo5times() {
        for (int i = 0; i < 5; i++) {

            System.out.println("Hello Cydeo");

        }

    }

//create a function that can print all the  numbers from 1-10

    public static void evenNumbers(){

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }











}

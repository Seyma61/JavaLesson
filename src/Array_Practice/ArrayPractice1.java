package Array_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice1 {
    public static void main(String[] args) {

       // 1. create an array that has the numbers 1 to 100

        int [] numbers= new int[100];
        for (int i = 0; i < numbers.length; i++) {

        numbers[i]=i+1;
        }
        System.out.println(Arrays.toString(numbers));


       // 1. create an array that has the numbers 100 to 1

        int numbers1[]=new int[100];

        for (int i = numbers1.length-1; i >=0; i--) {
            numbers1[i] = numbers1.length-i;

        }
        System.out.println(Arrays.toString(numbers1));

      /*  3. Write a program that asks user to enter a number 10 times:
        1. store all user entered numbers in an array
        2. find the max number
        3. find the min number

*/
        Scanner scan= new Scanner(System.in);
        int number[] = new int  [10];




        for (int i = 0; i <10 ; i++) {
            System.out.println("Enter a number:");
            number[i] = scan.nextInt();
        }

        int max= number[0];
        int min=number[0];
        for (int i = 0; i < numbers.length; i++) {


            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
            System.out.println(Arrays.toString(number));

            System.out.println("min = "+  min);
          System.out.println("max = " + max);










    }
}

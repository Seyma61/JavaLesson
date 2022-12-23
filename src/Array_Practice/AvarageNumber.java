package Array_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class AvarageNumber {
    public static void main(String[] args) {
        
    
    
    /*
    4. AverageNumber:
            1. Ask the user how many numbers they want to enter
			2. get all the inputs from the user and store them into an array
			3. Iterate the array & return the average number

     */

        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int number= scan.nextInt();
        int num[]=new int [number];
        
        for (int i = 0; i <num.length ; i++) {
            System.out.println("Enter a number:");
            num[i]= scan.nextInt();
        }
        System.out.println(Arrays.toString(num));
        int sum=0;
        for (int i = 0; i < num.length; i++) {
            sum+= num[i];
            
        }
    double avarageNumber=sum/num.length;
        System.out.println("avarageNumber = " + avarageNumber);
    
    
    }

    }

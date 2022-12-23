package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDublicates {

    public static void main(String[] args) {

        int[] arr={1,1,1,2,2,2,2,3,3,3,3,3,4,4,4,4,4,4};
        arr=removeDublicates(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("..............................");
String[] words={"Java","Java","Python","C#","Java","Java"};
words=removeDublicates(words);

        System.out.println(Arrays.toString(words));


        }



// removes the dublicates from the given array, returns the new array
    //                              {1,1,2,2,3,3}
    public static int[]removeDublicates(int[]array){
int[] result={}; // 1
        for (int each : array) {
            if (!ArraysUtility.contains(result,each)){
               result= ArraysUtility.addElement(result,each);

            }


        }
return  result;
    }


    public static double[]removeDublicates(double[]array){
        double[] result={}; // 1
        for (double each : array) {
            if (!ArraysUtility.contains(result,each)){
                result= ArraysUtility.addElement(result,each);

            }


        }
        return  result;
    }
    public static char[]removeDublicates(char[]array){
        char[] result={}; // 1
        for (char each : array) {
            if (!ArraysUtility.contains(result,each)){
                result= ArraysUtility.addElement(result,each);

            }


        }
        return  result;
    }
    public static String[]removeDublicates(String[]array){
        String[] result={}; // 1
        for (String each : array) {
            if (!ArraysUtility.contains(result,each)){
                result= ArraysUtility.addElement(result,each);

            }


        }
        return  result;
    }

}

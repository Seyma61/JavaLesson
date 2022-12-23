package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class AddElementsToArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        arr = addInteger(arr, 5); // {1,2,3,4,5}
        System.out.println(Arrays.toString(arr));

        System.out.println("...........");

        double[] arr2 = {1.5, 2.5, 3.5, 4.5};
        arr2 = addDouble(arr2, 5.5);
        System.out.println(Arrays.toString(arr2));
        System.out.println("..........");

        String[] names = {"Talha", "Merve", "Nisa", "Deniz"};
        names = addString(names, "Selin");
        names = addString(names, "Nida");
        System.out.println(Arrays.toString(names));

        System.out.println(".........");
   char[] names1={'a','b','c','d'};
    names1=addChar(names1,'e');
        System.out.println(Arrays.toString(names1));

    }

    // 1) create a return method called addInteger that can add an Integer after the Last Index of an integer array
    public static int[] addInteger(int[] array, int element) {

        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;

        }
        result[i] = element;
        return result;

    }

    // 2) create a return method called addDouble that can add an double after the Last Index of a double array
    public static double[] addDouble(double[] array, double element) {
        double[] result = new double[array.length + 1];
        int i = 0;
        for (double each : array) {
            result[i++] = each;


        }

        result[i] = element;
        return result;
    }




    // 1) create a return method called addInteger that can add an Integer after the Last Index of an integer array


    // 3)     //create a return methoD called addString that can add an String after the Last Index of a String array
    public static String[] addString(String[] array, String element) {

        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;


    }
// 4)     //create a return method called addChar that can add a char after the Last Index of a char array


    public static char[] addChar(char[] array, char element) {

        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;

    }
}

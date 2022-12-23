package day22_MultiDimensionalArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {


        String[] group1 = {"John", "Joes", "James"};
        String[] group2 = {"John", "Joes", "James"};
        String[] group3 = {"John", "Joes", "James"};

        String[][] groups = new String[3][]; //index:0,1,2
        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;
        // System.out.println(Arrays.toString(groups)); => to string methot is for single dimensional array
        System.out.println(Arrays.deepToString(groups));
        System.out.println(".................................");

    /*
    {1,2,3}
    {4,5,6,7}
    {8,9,10,11,12}
     */
        //index of the elements:0 1 2   0,1,2,3    0,1,2,3,4
        int[][] arr20 = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};

        //    index of array:           0        1        2
        System.out.println(Arrays.deepToString(arr20));

        // {4,5,6,7}
        System.out.println(Arrays.toString(arr20[1]));
        //11
        System.out.println(arr20[2][3]);

        System.out.println("..................");

        for (int i = 0; i < arr20.length; i++) {

            for (int j = arr20[i].length - 1; j >= 0; j--) {
                System.out.print(arr20[i][j]+" ");


            }
            System.out.println();
        }
    }



    }


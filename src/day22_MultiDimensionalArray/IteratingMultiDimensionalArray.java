package day22_MultiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {
    public static void main(String[] args) {
        int[][] arr20 = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};

        for (int i=0; i< arr20.length; i++) { // i: index numbers of single dieomansional array
           // System.out.println(Arrays.toString(arr20[i]));

            for (int j = 0; j < arr20[i].length; j++) { // j: index number of elements
                System.out.print(arr20[i][j]+ " ");



            }
            System.out.println();

        }








    }
}

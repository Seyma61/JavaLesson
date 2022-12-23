package Short_Videos_Practice;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        int[] arr1 ={10,20,30};
        int[] arr2 ={40,50};
        int[] arr3 ={60,70,80,90};

      /*  int[][] arr2D= new int[3][];
        arr2D[0]=arr1;
        arr2D[1]=arr2;
        arr2D[2]=arr3;
    */

        int[][] arr2D={{10,20,30},{40,50},{60,70,80,90}};
        System.out.println(Arrays.deepToString(arr2D));

        //40,50
        System.out.println(Arrays.toString(arr2D[1]));

       //80
        System.out.println((arr2D[2][2]));




    }
}

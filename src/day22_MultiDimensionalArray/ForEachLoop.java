package day22_MultiDimensionalArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[][] arr20 = {{1,2,3},{4,5,6,7,8},{9,10,11,12,13}};
       //for ( int[] each10Array: arr20){
           //System.out.println(Arrays.toString(each10Array));

           for (int[] each10Array : arr20) {
             for (int eachElement: each10Array){
                 System.out.println(eachElement);
           }


       }




    }
}

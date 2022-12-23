package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

public class RemoveElements2 {
    public static void main(String[] args) {

    }

    //removes the index from the array, returns new array
    public static int[] removeElement(int[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index:" + index);
            System.exit(0);
        }


        int[] result = {};
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                // result=ArraysUtility.addElement(result,array[i]);

            }

        }
        return result;
    }
// merge
public static int[] merge( int[] arr1, int[] arr2) {

int[] result={};
for (int each: arr1){
    //result = addElement(result,each);

}
    for (int each : arr2) {
      //  result=addElemenet(result,each);

    }
return result;

    }
    }




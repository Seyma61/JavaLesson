package day26_CustomMethodsPractice;

import java.util.Arrays;

public class RemoveElements1 {
    public static void main(String[] args) {
        int[] numbers={100,200,300,400,500,600};
      numbers=  removeElements(numbers,1); //100,300,400,500,600
       numbers=removeElements(numbers,1); //100-400-500-600
        System.out.println(Arrays.toString(numbers));
    }

      //                                {1,2,3,4,3}   ,  4
    public static int[] removeElements(int[] array, int index){

        if (index<0 ||  index> array.length-1){
            System.out.println("Invalid Index:" + index);
        System.exit(0);
        }
        int[] result= new int[array.length-1]; //1,2

int j=0;
for (int i=0; i<array.length; i++){// if the index of array is matching with the  given index
            if (i==index){
                continue; //skip

            }
            result[j++] = array[i];
        }
    return  result;

    }
}

package day22_MultiDimensionalArray;

public class IteratingMultiDiemnsionalArray2 {
    public static void main(String[] args) {
        int[][] arr20 = {{1,2,3},{4,5,6,7,8},{9,10,11,12,13}};

        for (int i =arr20.length-1; i>=0; i--){ //


            for (int j = 0; j < arr20[i].length; j++) { // j: index number of element

                System.out.print(arr20[i][j]+ " ");

            }

            System.out.println();
        }





    }
}

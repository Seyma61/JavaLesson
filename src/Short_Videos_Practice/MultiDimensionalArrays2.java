package Short_Videos_Practice;

import java.util.Arrays;

public class MultiDimensionalArrays2 {
    public static void main(String[] args) {
   /*
   group1={"Ahmet", "Jimmy"};
   group2={"Breanna","Victoria","Dainel"}
   group3={"Natalia","Aaron", "Christina", "Josh"};

    */

   String[][] groups ={{"Ahmet", "Jimmy"},{"Breanna","Victoria","Dainel"},{"Natalia","Aaron", "Christina", "Josh"}};
        System.out.println(Arrays.toString(groups[1]));
        System.out.println(groups[2][0]);
        System.out.println(Arrays.deepToString(groups));

    }
}

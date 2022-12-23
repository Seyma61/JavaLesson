package day25_CustomMethods_Overloading;

import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {


        String s2 = "aaaaabbbbbbcccccddddd";
        String nonDup = StringUtility.removeDublicates(s2);
        System.out.println(nonDup);
    }
}
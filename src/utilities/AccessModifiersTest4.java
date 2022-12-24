package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

import java.util.concurrent.Callable;

public class AccessModifiersTest4 extends ProtectedAccessModifier {

    public static void main(String[] args) {

       //  System.out.println(AccessModifiersTest4.name1); // default is not visible  outside the package
        System.out.println(AccessModifiersTest4.name2); // protected is visible for outside the package in subclass

       // AccessModifiersTest4.method1();default is not visible  outside the package
        AccessModifiersTest4.method2(); // protected is visible for outside the package in subclass


            }




    }



package utilities;

public class StringUtility {

    //prints each character of the given string

public static void printEachChar(String str){
    for (int i = 0; i < str.length(); i++) {
        System.out.println(str.charAt(i));


    }
}


// reverses the given string and returns the reversed str
public static String reverse(String str){ //"Java
    String result="";

    for (int i = str.length()-1; i >=0 ; i--) {
        result += str.charAt(i);

    }

return result; //"avaJ"

}

public static String removeDublicates(String str){
    String result="";

    for (int i = 0; i <str.length(); i++) {
        char each=str.charAt(i); //aaabbbbbcc

        if (!result.contains(""+ each)){
            result +=each;

        }
    }
    return  result;
}
    
}


package Short_Videos_Practice;

public class CustomMethods_Return {

    public static void main(String[] args) {

    int total=sum(20,40)*3;
        System.out.println("...................");
String s1=reverse("Wooden Spoon");
        System.out.println(s1);
        System.out.println("..........");
        System.out.println(isPalindrome("Java"));
    }


    public static int  sum(int num1,int num2){
        int result=num1 + num2;
        System.out.println(result);

    return  result;
    }

    public static  String reverse(String str){
        String result= "";
        for (int i= str.length()-1; i>=0; i--){
            result+= str.charAt(i);

        }
        return result;
    }

public static boolean isPalindrome(String str){
        String reversed= reverse(str); //avaJ
        return reversed.equalsIgnoreCase(str);

}

}

package Short_Videos_Practice;

public class CustomMethods_parameters {

    public static void main(String[] args) {
        displayValue(12);
        System.out.println("...........");

    eligibleToVote(18,true);

        System.out.println("..........");
    oddOrEven(200);
    }
    public static void  displayValue(int num){

        System.out.println("The value is:"+ num);


    }


public static void eligibleToVote(int age, boolean isUSCitizen){

if (age>=18 && isUSCitizen){
    System.out.println("Eligible to Vote");
}else {
    System.out.println("Not Eligible");
}

    }

public static void oddOrEven(int number){

if (number% 2 ==0){
    System.out.println(number + " is even number");

}else{
    System.out.println( number + " is odd number");

}
    }


}

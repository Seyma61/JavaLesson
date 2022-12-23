package day37_Inheritance.animalTask.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 12", "6.7 inches", 1000, "Black");
        Samsung samsung = new Samsung("galaxy s19", "6 inches", 900, "white");
        Nokia nokia = new Nokia("brick", "4 inches", 50, "gray");
        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);
        iphone.call(911);
        iphone.text(123456789);
        iphone.faceTime(78945613);
        iphone.faceTime("yahoo@gmail.com");

        System.out.println("..............................");

        samsung.call(911);
        samsung.text(123456789);
        samsung.freeze();

        System.out.println("...............................");

        nokia.call(4353276);
        nokia.text(736635536);
        nokia.selfDefence();

        System.out.println("...........................");

        System.out.println(Phone.hasBattery);
        System.out.println(Iphone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println(Nokia.hasBattery);
    }
}

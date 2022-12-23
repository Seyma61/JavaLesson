package day36_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 'M', 2, "Small", "Brown");

       dog.eat();
       dog.drink();
       dog.sleep();
       dog.move();
       dog.bark();

       // dog.hunt();  // can't
       // dog.scratch(); // can't

        Cat cat = new Cat();
        cat.setInfo("Tarcin", "British", 'M', 3, "Small", "White");

        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();

        //cat.bark(); can't
        //cat.hunt(); can't

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", 'M', 4, "Large", "Red");

        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();

        tiger.roar();
        tiger.roar();

        // tiger.bark(); can't
        System.out.println(tiger);
    }
}

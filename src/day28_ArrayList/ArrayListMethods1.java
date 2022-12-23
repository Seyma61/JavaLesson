package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(10); //0
        numbers.add(20); //1
        numbers.add(20); //2
        numbers.add(20); //3
        numbers.add(20); //4

        System.out.println(numbers);

        ArrayList<Integer> number= new ArrayList<>();
        number.add(10); //0
        number.add(20); //1
        number.add(30); //2
        number.add(40); //3
        number.add(50); //4

        number.add(2,25);
        number.add(5,45);

        System.out.println(number);

        System.out.println(number.size());

        int lastIndex = number.size()-1;
        System.out.println("lastIndex = " + lastIndex);

       Integer num=  number.get(3);
        System.out.println("num = " + num);

        System.out.println(".....................");

        for (int i = 0; i <number.size() ; i++) {
            System.out.println(number.get(i));

        }
        System.out.println("..................");

        ArrayList<String> list=new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        list.set(2,"JavaScript"); //replace
        list.set(3,"C++");

        System.out.println(list);

    }
}

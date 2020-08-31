package datastructure;

import java.util.HashSet;

public class HashSetDemo {

    /**
     * @author Jahidul Islam
     * Create HashSet and store data
     * Get the data from HashSet and print
     * Get the data from HashSet and insert it in db table
     *
     * */
    public static void main(String[] args) {


        HashSet<String> cars = new HashSet<String>();
        cars.add("Toyota");
        cars.add("Ford");
        cars.add("Nissan");
        cars.add("Audi");
        cars.add("Lexus");
        System.out.println(cars);
        cars.remove("Ford");
        cars.contains("Lexus");
        cars.clear();
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
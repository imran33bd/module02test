package datastructure;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    /**
     * @author Jahidul Islam
     * Create a Map reference variable and store information as you like
     * Show me all possible retrieval process
     * Store map in DB
     *
     * */
    public static void main(String[] args) {

        HashMap<String, Integer> people = new HashMap<String, Integer>();


        // Add keys and values (Name, Age)
        people.put("Peter", 20);
        people.put("Bob", 30);
        people.put("Sam", 40);

        for (String i : people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));
        }
        for (int x : people.values()) {
            System.out.println(x);
        }
    }
}
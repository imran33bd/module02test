package datastructure;

import java.util.HashMap;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/**
		 * @author Jahidul Islam
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * You can use any other retrieval process
		 * Use any databases[ Postgresql] to store data and retrieve data.
		 */

		Map<Integer,String> studentInfo=new HashMap<>();
		studentInfo.put(101,"Salman");
		studentInfo.put(102,"Imran");
		studentInfo.put(103,"Kamran");

		System.out.println(studentInfo.size());
		System.out.println(studentInfo.get(101));

		for (Map.Entry<Integer,String> entry:studentInfo.entrySet()){
			System.out.println("ID: "+ entry.getKey()+" and Name: "+ entry.getValue());
		}

		HashMap<Integer, String> country = new HashMap<Integer, String>();
		country.put(1,"Bangladesh");
		country.put(2, "Pakistan");
		country.put(3, "India");
		country.put(4, "USA");
		country.put(5, "UK");
		System.out.println("Five different countries in the world: "+ country);

		country.remove(5);
		System.out.println("After removing UK: "+ country);

	}

}

package api;

import java.util.ArrayList;

public class DeepDiveArrayList {

    /**
     * @author Jahiudl Islam
     * ArrayList JDK 8 API documantation to be read and ArrayList source code to be viewed
     * Demonastrate your understanding on ArrayList after reading the document
     * You are free to document your understanding using comment
     *
     * */

    public static void main(String[] args) {

        // declares an array of integers
        int[] anArray;

        // allocates memory for 10 integers
        anArray = new int[10];

        // initialize first element
        anArray[0] = 10;
        // initialize second element
        anArray[1] = 20;
        // and so forth
        anArray[2] = 30;
        anArray[3] = 40;
        anArray[4] = 50;
        anArray[5] = 60;
        anArray[6] = 70;
        anArray[7] = 80;
        anArray[8] = 90;
        anArray[9] = 100;

        System.out.println("Element at index 0: "
                + anArray[0]);
        System.out.println("Element at index 1: "
                + anArray[1]);
        System.out.println("Element at index 2: "
                + anArray[2]);
        System.out.println("Element at index 3: "
                + anArray[3]);
        System.out.println("Element at index 4: "
                + anArray[4]);
        System.out.println("Element at index 5: "
                + anArray[5]);
        System.out.println("Element at index 6: "
                + anArray[6]);
        System.out.println("Element at index 7: "
                + anArray[7]);
        System.out.println("Element at index 8: "
                + anArray[8]);
        System.out.println("Element at index 9: "
                + anArray[9]);
    }


}

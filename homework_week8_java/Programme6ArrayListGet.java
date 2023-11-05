package homework_week8_java;

import java.util.ArrayList;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given array list.
 */
public class Programme6ArrayListGet {
    public static void main(String[] args) {
        Programme6ArrayListGet g = new Programme6ArrayListGet();
        g.arrayListGet();
    }

    public void arrayListGet() {
        //Creating an Empty Integer arrayList
        ArrayList<Integer> arr = new ArrayList<Integer>(5);
        //Using add() to initialize values
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        // Printing elements of list
        System.out.println("List: " + arr);
        //Getting elements at index 2
        int element = arr.get(2);
        // print element in index
        System.out.println("The element at index 2 is " + element);
    }

}

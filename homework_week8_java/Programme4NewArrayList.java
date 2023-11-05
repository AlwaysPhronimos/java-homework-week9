package homework_week8_java;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */


public class Programme4NewArrayList {
    public static void main(String[] args) {
        Programme4NewArrayList a = new Programme4NewArrayList();
        a.arrayList();
    }

    public void arrayList() {
        // Create a new array list to  store colour strings
        List<String> colourList = new ArrayList<>();
        colourList.add("Blue");
        colourList.add("Green");
        colourList.add("Yellow");
        colourList.add("White");
        colourList.add("Orange");

        //Print out the collection using a for loop
        System.out.println("Colors in the ArrayList: ");
        for (String colour : colourList) {
            System.out.println(colour);
        }
    }
}

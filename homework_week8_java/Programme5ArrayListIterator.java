package homework_week8_java;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a Java program to iterate through all elements in an array list using Iterator.
 */
public class Programme5ArrayListIterator {
    public static void main(String[] args) {
        arrayIterator();
    }

    public static void arrayIterator() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("JAVA");
        arrayList.add("API");
        arrayList.add("SQL");
        arrayList.add("Selenium");
        arrayList.add("Cucumber");

        // Obtain an Iterator for the arraylist
        Iterator<String> iterator = arrayList.iterator();

        // Use a while loop to iterate through the elements
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}

package homework_week8_java;

import java.util.ArrayList;

/**
 * Declare following two arrylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */
public class Programme11CompareArray {
    public static void main(String[] args) {
        Programme11CompareArray a = new Programme11CompareArray();
        a.compareArray();
    }
    public void compareArray() {
        // First arraylist
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("Red");
        a1.add("Green");
        a1.add("Black");
        a1.add("White");
        a1.add("Pink");
        // Second arraylist
        ArrayList<String > a2 = new ArrayList<String>();
        a2.add("Red");
        a2.add("Green");
        a2.add("Black");
        a2.add("Pink");

        // Comparing two arraylist
        System.out.println(a1.equals(a2));
    }
}

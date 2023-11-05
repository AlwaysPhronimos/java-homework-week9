package homework_week8_java;

import java.util.ArrayList;

/**
 * Write a Java program to test if an array list is empty or not.
 */
public class Programme7ArrayListEmptyOrNot {
    public static void main(String[] args) {
        arrayEmpty();
    }
    //declare static method
    public static void arrayEmpty(){
        // creating an empty Integer Arraylist
        ArrayList<Integer> arr = new ArrayList<Integer>(10);
        //Check if the list is empty or not using function
        boolean ans = arr.isEmpty();
        if (ans == true) {
            System.out.println("The ArrayList is empty");
        }else {
            System.out.println("The ArrayList is not empty");
        }
        // addition of a element  to the ArrayList
        arr.add(1);
        //Check if the list is empty or not
        ans = arr.isEmpty();
        if (ans == true){
            System.out.println("The Array List is empty");
        } else {
            System.out.println("The Array List is not empty");
        }
    }
}

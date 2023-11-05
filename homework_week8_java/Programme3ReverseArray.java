package homework_week8_java;

/**
 * Write a Java program to reverse an array of integer values.
 */
public class Programme3ReverseArray {
    public static void main(String[] args) {
        reverseArray();
    }

    public static void reverseArray() {
        //initialize array
        int[] array = new int[]{1, 2, 3, 4, 5};
        System.out.println("Original Array: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Array in reverse order: ");
        // Loop through the array in reverse order
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}

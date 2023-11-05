package homework_week8_java;

import java.util.HashSet;

/**
 * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if else)
 */
public class Programme8HashSet {
    public static void main(String[] args) {
        Programme8HashSet h = new Programme8HashSet();
        h.hashSet();
    }
    // create instance method

    public void hashSet() {
        HashSet<Integer> numberSet = new HashSet<>();
        //Add numbers 4,7 and 8 to the set
        numberSet.add(4);
        numberSet.add(7);
        numberSet.add(8);

        // Iterate through numbers 1 to 10 and check if they are in the set
        for (int i = 1; i <= 10; i++) {
            if (numberSet.contains(i)) {
                System.out.println(i + " is in the set.");
            } else {
                System.out.println(i + " is not in the set.");
            }
        }
    }
}

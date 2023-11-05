package homework_week8_java;

import java.util.HashMap;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme9HashMapObject {
    public static void main(String[] args) {
        mapObject();
    }

    public static void mapObject() {
        //create a hashmap to store String keys and Integer values
        HashMap<String, Integer> peopleKey = new HashMap<>();

        // Adding elements to the Map using standard put() method
        peopleKey.put("Virat", 85);
        peopleKey.put("Rohit", 90);
        peopleKey.put("Hardik", 79);
        peopleKey.put("Rahul", 68);
        //Iterate through the values in the hashmap using a for each loop
        for (HashMap.Entry < String, Integer> key : peopleKey.entrySet()) {
            System.out.println(key.getKey() + "'s " + key.getValue());
        }
    }
}

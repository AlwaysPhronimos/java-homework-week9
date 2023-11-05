package homework_week8_java;

import java.util.HashMap;

/**
 * Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */
public class Programme10Stations {
    public static void main(String[] args) {
       tubeStation();
    }

    public static void tubeStation() {
        //creating a map to store station
        HashMap<String, String> stationLine = new HashMap();

        //Define Zone 1 stations and their corresponding lines

            stationLine.put("Baker Street", "Victoria line");
            stationLine.put("Kings Cross", "Northern line");
            stationLine.put("Oxford Circus", "Bakerloo");
            stationLine.put("Leicester Square", "Piccadilly square");

        String stationTarget = "Kings Cross"; //check the station

        if (stationLine.containsKey(stationTarget))
        {
            String lines = stationLine.get(stationTarget);
            System.out.println("Tube line passing through " + stationTarget + " to " + lines);
        } else {
            System.out.println(stationLine + " is not in Zone 1.");
        }
    }
}

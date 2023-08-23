package map;

import java.util.*;
import java.util.Map.Entry;

// representing hospital codes

public class UsingMap {
    public static void main(String[] args) {
        // Map.of() creates an immutable Map
        Map<String, String> immutableMap = Map.of(
            "BLUE", "critical medical emergency",
            "RED", "fire or smoke",
            "BLACK", "bomb threat",
            "VIOLET", "violent person",
            "ORANGE", "hazardous spill",
            "BROWN", "severe weather"
        );

        // assign contents of immutable Map to a mutable Map
        HashMap<String, String> hospitalCodes = new HashMap<>(immutableMap);
        System.out.println(hospitalCodes);

        // put
        hospitalCodes.put("PINK", "infant emergency");
        System.out.println(hospitalCodes);
        
        // get
        System.out.println(hospitalCodes.get("VIOLET"));

        // iterating over the entries
        System.out.println("Iterating over keys: ");
        Set<String> keys = hospitalCodes.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

        System.out.println("Iterating over values: ");
        Collection<String> values = hospitalCodes.values();
        for (String value : values) {
            System.out.println(value);
        }

        System.out.println("Iterating over entries: ");
        Set<Entry<String, String>> entries = hospitalCodes.entrySet();
        for (Entry<String, String> entry : entries) {
            System.out.println(entry);
        }
    }
}

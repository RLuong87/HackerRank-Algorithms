package com.company;

import java.util.*;

public class MigratoryBirds {

    public static int migratoryBirds(List<Integer> arr) {

        /*
        Iterate through the list
        Create a hashmap to store the count of each bird type
        Iterate
        Determine which bird type was spotted more than once
         */

        HashMap<Integer, Integer> birdsSpotted = new HashMap<>();

        int amountSpotted = 0, birdKey = 0;

        for (Integer count : arr) {

            if (!birdsSpotted.containsKey(count)) {

                birdsSpotted.put(count, 1);
            } else {
                birdsSpotted.put(count, birdsSpotted.get(count) + 1);
            }
        }
        System.out.println(birdsSpotted);

        for (Map.Entry<Integer, Integer> birdId : birdsSpotted.entrySet()) {

            if (birdId.getValue() > amountSpotted) {
                birdKey = birdId.getKey();
                System.out.println("Bird id " + birdKey);
            }
            if (birdId.getValue() > amountSpotted) {
                amountSpotted = birdId.getValue();

            } else if (amountSpotted == birdId.getValue() && birdId.getKey() < birdKey) {
                birdKey = birdId.getKey();
            }
            System.out.println("Bird ID " + birdKey);
        }
        return birdKey;
    }

    public static void main(String[] args) {

        List<Integer> birdsTypes = new ArrayList<>() {{
            add(1);
            add(1);
            add(2);
            add(2);
            add(3);
//            add(4);
//            add(3);
//            add(2);
//            add(1);
//            add(3);
//            add(4);
//            1 4 4 4 5 3 / Expected output: 4
//            1 2 3 4 5 4 3 2 1 3 4 / Expected output: 3
        }};
        System.out.println(migratoryBirds(birdsTypes));
    }
}

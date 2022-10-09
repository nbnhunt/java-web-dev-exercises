package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MoonHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> moons = new HashMap<>();
        moons.put("Mercury", 0);
        moons.put("Venus", 0);
        moons.put("Earth", 1);
        moons.put("Mars", 2);
        moons.put("Jupiter", 79);
        moons.put("Saturn", 82);
        moons.put("Uranus", 27);
        moons.put("Neptune", 14);

        for (Map.Entry<String, Integer> numMoons : moons.entrySet()) {
            System.out.println(numMoons.getKey() + " (" + numMoons.getValue() + ")");
        }

    }
}

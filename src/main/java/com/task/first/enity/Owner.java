package com.task.first.enity;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Owner {

    private ArrayList<Thing> things = new ArrayList<Thing>();

    public ArrayList<Thing> getThings() {
        return things;
    }

    public void bringThing(String name, String Price, Double weight) {
        Thing thing = new Thing();

        BigDecimal price = new BigDecimal(Price);
        thing.setName(name);
        thing.setPrice(price);
        thing.setWeight(weight);

        things.add(thing);

        System.out.println(" Owner brought " + thing.getName() + " into the house.");
    }
}

package com.task.first.enity;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

import static java.util.Collections.*;

public class Thief {

    private Backpack backpack;

    public void setBackpack(Backpack backpack) {
        this.backpack = backpack;
    }

    public void stealThings(ArrayList<Thing> things) {

        Double restWeight = this.backpack.getLimitWeight();
        sort(things);
        for (int i = things.size() - 1; i >= 0; i--) {
            if (things.get(i).getWeight() <= restWeight) {
                System.out.println(" Thief stole " + things.get(i).getName() + " from the house.");
                restWeight -= things.get(i).getWeight();
            }
        }
    }

}

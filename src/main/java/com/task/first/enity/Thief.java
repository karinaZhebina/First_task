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

  public boolean stealThings(ArrayList<Thing> things) {
    sort(things);
    for (int i = things.size() - 1; i >= 0; i--) {
      if (things.get(i).getWeight() <= backpack.getRestWeight()) {
        System.out.println(" Thief stole " + things.get(i).getName() + " from the house.");
        backpack.setRestWeight(backpack.getRestWeight() - things.get(i).getWeight());
        System.out.println(" Current rest weight is " + backpack.getRestWeight());
        things.remove(i);
      }
    }
    if (backpack.getLastRestWeight().compareTo(backpack.getRestWeight()) == 0) {
      return false;
    }
    backpack.setLastRestWeight(backpack.getRestWeight());
    return true;
  }

}

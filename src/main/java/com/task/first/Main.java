package com.task.first;

import com.task.first.enity.Backpack;
import com.task.first.enity.Owner;
import com.task.first.enity.Thief;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");

        Owner owner = new Owner();
        Thief thief = new Thief();
        Backpack backpack = new Backpack();
        backpack.setLimitWeight(9.0);
        thief.setBackpack(backpack);

        Runnable taskPut = new Runnable() {
            @Override
            public void run() {
                owner.bringThing("book", "10", 0.5);
                owner.bringThing("money", "2345", 0.2);
                owner.bringThing("ring", "450", 0.05);
                owner.bringThing("box", "25", 3.4);
                owner.bringThing("fridge", "300", 30.0);
                owner.bringThing("laptop", "2800", 2.8);
                owner.bringThing("wallet", "756", 0.2);
                owner.bringThing("table", "180", 15.0);
                owner.bringThing("blackboard", "50", 3.0);
            }
        };

        Runnable taskSteal = new Runnable() {
            @Override
            public void run() {
                thief.stealThings(owner.getThings());
            }
        };

        Thread threadOwner = new Thread(taskPut);
        Thread threadThief = new Thread(taskSteal);


        threadOwner.start();
        try {
            threadOwner.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        threadThief.start();
        try {
            threadThief.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

package com.task.first.enity;

import java.math.BigDecimal;

public class Thing implements Comparable<Thing> {

    private String name;
    private BigDecimal price;
    private Double weight;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Double getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Thing o) {
        return this.price.compareTo(o.getPrice());
    }

}

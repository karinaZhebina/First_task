package com.task.first.enity;

public class Backpack {

    private Double limitWeight;
    private Double restWeight;
    private Double lastRestWeight;

    public Backpack (Double limitWeight) {
        this.limitWeight = limitWeight;
        this.restWeight = limitWeight;
        this.lastRestWeight = this.restWeight;
    }

    public Double getLimitWeight() {
        return limitWeight;
    }

    public void setLimitWeight(Double limitWeight) {
        this.limitWeight = limitWeight;
    }

    public Double getRestWeight() {
        return restWeight;
    }

    public void setRestWeight(Double restWeight) {
        this.restWeight = restWeight;
    }

    public Double getLastRestWeight() {
        return lastRestWeight;
    }

    public void setLastRestWeight(Double lastRestWeight) {
        this.lastRestWeight = lastRestWeight;
    }
}

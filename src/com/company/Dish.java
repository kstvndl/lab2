package com.company;

public class Dish {
    private double cost;
    private String name;
    private String description;

    public Dish(String name, String description) {
        this.name = name;
        this.description = description;
        this.cost = 0;
    }

    public Dish(String name, String description, double cost) {
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    public Dish() {
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

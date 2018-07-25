package com.company;

public class Dish {
    private double cost;
    private String name;
    private String description;

    // TODO: меньший конструктор должен вызывать больший конструктор
    public Dish(String name, String description) {
        this.name = name;
        this.description = description;
        // TODO: вынести cost в константу
        this.cost = 0;
    }

    public Dish(String name, String description, double cost) {
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    // TODO: вынести выше
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

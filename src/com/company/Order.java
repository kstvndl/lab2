package com.company;

public class Order {
    private int size;
    private Dish[] dishes;
    private static final int DEFAULT_SIZE = 16;

    public Order() {
        this.dishes = new Dish[DEFAULT_SIZE];
    }

    public Order(int size) {
        this.dishes = new Dish[size];
    }

    public Order(Dish[] dishes) {
        this.dishes = dishes;
    }

    // TODO: если элементов больше чем DEFAULT_SIZE возникнет ошибка
    public boolean add(Dish dish) {
        dishes[size] = dish;
        size++;
        return true;
    }

    public boolean remove(String dishName) {
        for (int i = 0; i < size; i++) {
            if (dishes[i].getName().equals(dishName)) {
                dishes[i] = null;
                for (int j = i+1; j < size; j++) {
                    dishes[j-1] = dishes[j];
                }
                size--;
                return true;
            }
        }
        return false;
    }

    public int removeAll(String dishName) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (dishes[i].getName().equals(dishName)){
                dishes[i] = null;
                for (int j = i+1; j < size; j++) {
                    dishes[j-1] = dishes[j];
                }
                size--;
                count++;
            }
        }
        return count;
    }

    public int dishQuantity() {
        return size;
    }

    public Dish[] getDishes() {
        Dish[] newDishes = new Dish[size];
        for (int i = 0; i < size; i++) {
            newDishes[i] = dishes[i];
        }
        return newDishes;
    }

    public double costTotal() {
        double cost = 0;
        for (int i = 0; i < size; i++) {
            cost += dishes[i].getCost();
        }
        return cost;
    }

    public int dishQuantity(String name) {
        int quantity = 0;
        for (int i = 0; i < size; i++) {
            if (dishes[i].getName().equals(name)) {
                quantity++;
            }
        }
        return quantity;
    }

    public String[] dishesNames() {
        String[] names = new String[size];
        boolean isFinded;
        int count = 0;
        for (int i = 0; i < size; i++) {
            isFinded = false;
            //TODO: Не использовать continue
            for (String name:names) {
                if (name == null) continue;
                if (name.equals(dishes[i].getName())) {
                    isFinded = true;
                }
            }
            if (!isFinded) {
                names[count] = dishes[i].getName();
                count++;
            }
        }
        String[] names1 = new String[count];
        for (int i = 0; i < count; i++) {
            names1[i] = names[i];
        }
        return names1;
    }

    public Dish[] sortedDishesByCostDesc() {
        Dish[] numbers = getDishes();
        Dish temp;
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 1; j < (numbers.length-i); j++) {
                if(numbers[j-1].getCost() < numbers[j].getCost()) {
                    temp = numbers[j-1];
                    numbers[j-1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }
}



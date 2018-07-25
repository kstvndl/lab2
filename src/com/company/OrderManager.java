package com.company;

public class OrderManager {
    private Order[] orders;

    public OrderManager(int tables) {
        this.orders = new Order[tables];
    }

    public void add(Order order, int tableNumber) {
        this.orders[tableNumber] = order;
    }

    public Order getOrder(int tableNumber) {
        return this.orders[tableNumber];
    }

    public void addDish(Dish dish, int tableNumber) {
        getOrder(tableNumber).add(dish);
    }

    public void removeOrder(int tableNumber) {
        this.orders[tableNumber] = null;
    }


    public int freeTableNumber() {
        int free = -1;
        for (int i = 0; i < this.orders.length; i++) {
            if (this.orders[i] == null) {
                free = i;
                break;
            }
        }
        return free;
    }

    public int[] freeTableNumbers() {
        int count = 0;
        int[] all = new int[this.orders.length];
        for (int i = 0; i < this.orders.length; i++) {
            if (this.orders[i] == null) {
                all[count] = i;
                count++;
            }
        }
        int[] free = new int[count];
        for (int i = 0; i < count; i++) {
            free[i] = all[i];
        }
        return free;
    }

    public int[] orderedTableNumbers() {
        int count = 0;
        int[] all = new int[this.orders.length];
        for (int i = 0; i < this.orders.length; i++) {
            if (this.orders[i] != null) {
                all[count] = i;
                count++;
            }
        }
        int[] ordered = new int[count];
        for (int i = 0; i < count; i++) {
            ordered[i] = all[i];
        }
        return ordered;
    }

    public Order[] getOrders() {
        return orders;
    }

    public double ordersCostSummary() {
        double totalCost = 0;
        for (int i = 0; i < this.orders.length; i++) {
            if (this.orders[i] == null) {
                continue;
            }
            totalCost += this.orders[i].costTotal();
        }
        return totalCost;
    }

    public int dishQuantity(String dishName) {
        int quantity = 0;
        for (int i = 0; i < this.orders.length; i++) {
            if (this.orders[i] == null) continue;
            for (int j = 0; j < getOrder(i).dishQuantity(); j++) {
                    if (this.orders[i].getDishes()[j].getName().equals(dishName)) {
                        quantity++;
                    }
            }
        }
        return quantity;
    }
}

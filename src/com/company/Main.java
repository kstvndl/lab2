package com.company;

public class Main {

    public static void main(String[] args) {
        Dish okroshka = new Dish("Okroshka","Kvass, kolbasa, eggs.", 55);
        Dish vodka = new Dish("Vodka","Kvass, kolbasa, eggs.", 65);
        Dish pivo = new Dish("Pivo","Kvass, kolbasa, eggs.", 75);
        Dish vape = new Dish("Vape","Kvass, kolbasa, eggs.", 95);
        Order first = new Order();
        Order second = new Order();
        first.add(okroshka);
        first.add(pivo);
        first.add(vodka);
        first.add(vape);
        first.add(pivo);
        first.add(vape);
        second.add(pivo);
        second.add(pivo);
        second.add(vodka);
        second.add(vape);
        second.add(pivo);
        second.add(vape);
        OrderManager orderManager = new OrderManager(10);
        orderManager.add(first, 0);
        orderManager.add(first, 1);
        orderManager.add(second, 2);
        orderManager.add(first, 3);
        orderManager.add(first, 4);
        orderManager.add(second, 5);
        orderManager.add(first, 6);
        orderManager.add(first, 7);
        orderManager.add(first, 8);
        orderManager.add(second, 9);
        System.out.println(orderManager.getOrder(0));
        orderManager.addDish(pivo, 0);
        for (Dish i:first.getDishes()) {
            System.out.println(i.getName());
        }

        orderManager.removeOrder(0);
        orderManager.removeOrder(3);
        orderManager.removeOrder(5);

        System.out.println();


        for (int i = 0; i < orderManager.getOrders().length; i++){
            System.out.println(orderManager.getOrders()[i]);
        }
        System.out.println();

        System.out.println(orderManager.freeTableNumber());
        System.out.println();

        for (int i = 0; i < orderManager.freeTableNumbers().length; i++) {
            System.out.print(orderManager.freeTableNumbers()[i] + " ");
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < orderManager.orderedTableNumbers().length; i++) {
            System.out.print(orderManager.orderedTableNumbers()[i] + " ");
        }
        System.out.println();

        System.out.println(orderManager.ordersCostSummary());

        System.out.println();
        System.out.println(orderManager.dishQuantity("Okroshka"));
    }
}

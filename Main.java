
package com.smartwarehouse;

public class Main {

    public static void main(String[] args) {

        System.out.println("Smart Warehouse System Started");

        InventoryRepository repo = new InventoryRepository();

        System.out.println("Inventory Loaded Successfully");

        OrderService service = new OrderService(repo);

        Order o1 = new Order(101, 1, 90, CustomerType.PREMIUM);

        Order o2 = new Order(102, 1, 20, CustomerType.NORMAL);

        service.processOrder(o1);

        service.processOrder(o2);
    }
}
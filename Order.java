
package com.smartwarehouse;

public class Order {

    int id;
    int itemId;
    int quantity;
    CustomerType customerType;
    OrderStatus status;

    public Order(int id, int itemId, int quantity, CustomerType customerType) {
        this.id = id;
        this.itemId = itemId;
        this.quantity = quantity;
        this.customerType = customerType;
        this.status = OrderStatus.PENDING;
    }
}
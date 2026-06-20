
package com.smartwarehouse;

public class InventoryItem {

    int id;
    int stockQuantity;
    int restockThreshold;

    public InventoryItem(int id, int stockQuantity, int restockThreshold) {
        this.id = id;
        this.stockQuantity = stockQuantity;
        this.restockThreshold = restockThreshold;
    }
}
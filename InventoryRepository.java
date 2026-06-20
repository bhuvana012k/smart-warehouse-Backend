
package com.smartwarehouse;

import java.util.concurrent.ConcurrentHashMap;

public class InventoryRepository {

    ConcurrentHashMap<Integer, InventoryItem> inventory =
            new ConcurrentHashMap<>();

    public InventoryRepository() {

        inventory.put(1, new InventoryItem(1, 100, 20));
        inventory.put(2, new InventoryItem(2, 50, 10));
        inventory.put(3, new InventoryItem(3, 30, 5));
    }

    public InventoryItem getItem(int id) {
        return inventory.get(id);
    }
}
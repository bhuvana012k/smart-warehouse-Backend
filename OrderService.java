package com.smartwarehouse;


    public class OrderService {

        InventoryRepository repo;

        public OrderService(InventoryRepository repo) {
            this.repo = repo;
        }

        	public synchronized void processOrder(Order order) {

            InventoryItem item = repo.getItem(order.itemId);

            if (item == null) {
                System.out.println("Item not found");
                return;
            }

            if (item.stockQuantity >= order.quantity) {

                item.stockQuantity =
                        item.stockQuantity - order.quantity;

                order.status = OrderStatus.PROCESSED;

                System.out.println("Order Processed");

                if (item.stockQuantity <= item.restockThreshold) {

                    System.out.println(
                    "WARNING: Item[" +
                    item.id +
                    "] below threshold");
                }

            } else {

                order.status = OrderStatus.BACKORDERED;

                System.out.println("BACKORDERED");
            }
        }
    }

# Smart Warehouse Inventory & Order Dispatcher (Backend)

## Overview

This project is a Core Java implementation of a Smart Warehouse Inventory and Order Dispatcher system. It manages inventory, processes customer orders, and handles stock availability using an in-memory repository.

## Features

* In-memory inventory repository with pre-seeded items.
* Inventory management and stock tracking.
* Order processing with stock validation.
* PREMIUM and NORMAL customer types.
* Automatic BACKORDERED status for insufficient stock.
* Warning message when inventory falls below the restock threshold.
* Thread-safe inventory storage using ConcurrentHashMap.
* Order status management using enums.

## Technologies Used

* Java
* Core Java Collections
* ConcurrentHashMap
* Object-Oriented Programming (OOP)

## Project Structure

```
InventoryItem.java
Order.java
CustomerType.java
OrderStatus.java
InventoryRepository.java
OrderService.java
Main.java
```

## Sample Output

```
Smart Warehouse System Started
Inventory Loaded Successfully
Order Processed
WARNING: Item[1] below threshold
BACKORDERED
```

## Business Logic

1. Load inventory items into memory.
2. Accept customer orders.
3. Check stock availability.
4. Process the order if stock is sufficient.
5. Mark the order as BACKORDERED if stock is insufficient.
6. Display a warning when stock falls below the threshold.

## Future Enhancements

* PREMIUM order priority using PriorityQueue.
* REST API integration with Spring Boot.
* React frontend for inventory and order management.
* Database integration using MySQL or H2.
* Real-time inventory updates.

## Author

BHUVANEESWARI K

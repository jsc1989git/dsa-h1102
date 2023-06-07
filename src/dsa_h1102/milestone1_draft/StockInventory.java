package dsa_h1102.milestone1_draft;

import java.util.HashMap;

public class StockInventory {
    private HashMap<String, ItemDetails> inventory;

    public StockInventory() {
        inventory = new HashMap<>();
    }

    public void addStockInventory(ItemDetails itemDetails) {
        String hashKey = generateHashKey(itemDetails.getItemName());

        if (!inventory.containsKey(hashKey)) {
            // The item does not exist in the inventory
            ItemDetails newEntry = createEntry(itemDetails);
            inventory.put(hashKey, newEntry);
        } else {
            // The item already exists in the inventory
            ItemDetails existingEntry = inventory.get(hashKey);
            existingEntry.setQuantity(existingEntry.getQuantity() + itemDetails.getQuantity());
            existingEntry.setPrice(itemDetails.getPrice());
        }
    }

    public void printInventory() {
        System.out.println("Stock Inventory:");
        for (ItemDetails item : inventory.values()) {
            System.out.println("Item Name: " + item.getItemName());
            System.out.println("Quantity: " + item.getQuantity());
            System.out.println("Price: " + item.getPrice());
            System.out.println("------------------------");
        }
    }

    private String generateHashKey(String itemName) {
        // Simple hash function that sums the ASCII values of characters in the item name
        int sum = 0;
        for (char c : itemName.toCharArray()) {
            sum += (int) c;
        }
        return Integer.toString(sum);
    }

    private ItemDetails createEntry(ItemDetails itemDetails) {
        // Create a new entry with the given item details
        return new ItemDetails(
                itemDetails.getItemName(),
                itemDetails.getQuantity(),
                itemDetails.getPrice()
        );
    }

    public static void main(String[] args) {
        StockInventory stockInventory = new StockInventory();

        // Example usage
        ItemDetails item1 = new ItemDetails("Item 1", 10, 5.99);
        stockInventory.addStockInventory(item1);

        ItemDetails item2 = new ItemDetails("Item 2", 5, 9.99);
        stockInventory.addStockInventory(item2);

        // Print the inventory
        stockInventory.printInventory();
    }
}

class ItemDetails {
    private String itemName;
    private int quantity;
    private double price;

    public ItemDetails(String itemName, int quantity, double price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters and Setters

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

public class Item {
    private String itemId;
    private String name;
    private int quantity;
    private double unitPrice;

    public Item(String itemId, String name, int quantity, double unitPrice) {
        this.itemId = itemId;
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    @Override
    public String toString() {
        return "Item ID: " + itemId + ", Name: " + name + ", Quantity: " + quantity + ", Unit Price: " + unitPrice;
    }
}


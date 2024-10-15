import java.util.ArrayList;
import java.util.List;

public class PurchaseOrder {
    private String orderId;
    private Supplier supplier;
    private String orderDate;
    private List<Item> items;
    private double totalCost;

    public PurchaseOrder(String orderId, Supplier supplier, String orderDate) {
        this.orderId = orderId;
        this.supplier = supplier;
        this.orderDate = orderDate;
        this.items = new ArrayList<>();
        this.totalCost = 0.0;
    }

    public void addItem(Item item) {
        items.add(item);
        totalCost += item.getQuantity() * item.getUnitPrice();
    }

    public double calculateTotal() {
        return totalCost;
    }

    // Getter methods
    public String getOrderId() {
        return orderId;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public List<Item> getItems() {
        return items;
    }

    public double getTotalCost() {
        return totalCost;
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId + ", Supplier: " + supplier.getName() + ", Order Date: " + orderDate + ", Total Cost: " + totalCost;
    }
}



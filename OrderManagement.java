import java.util.ArrayList;
import java.util.List;

public class OrderManagement {
    private List<PurchaseOrder> purchaseOrders;

    public OrderManagement() {
        this.purchaseOrders = new ArrayList<>();
    }

    public void createOrder(PurchaseOrder order) {
        purchaseOrders.add(order);
    }

    public void removeOrder(String orderId) {
        purchaseOrders.removeIf(order -> order.getOrderId().equals(orderId));
    }

    public List<PurchaseOrder> listOrders() {
        return purchaseOrders;
    }
}


import java.util.Scanner;

public class MainFinals {
    private static SupplierManagement supplierManager = new SupplierManagement();
    private static OrderManagement orderManager = new OrderManagement();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("---------------------------------------------");
            System.out.println("Supplier and Purchase Order Management System");
            System.out.println("---------------------------------------------");
            System.out.println("1. Add Supplier");
            System.out.println("2. List Suppliers");
            System.out.println("3. Create Purchase Order");
            System.out.println("4. List Purchase Orders");
            System.out.println("5. Exit");
            System.out.println("---------------------------------------------");
            System.out.print("Choose an option: ");
            

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                Supplier supplier = Supplier.addSupplier(); // Call the static method
                supplierManager.addSupplier(supplier);
                    break;
                case 2:
                    listSuppliers();
                    break;
                case 3:
                    createPurchaseOrder();
                    break;
                case 4:
                    listPurchaseOrders();
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    

    private static void listSuppliers() {
        System.out.println("List of Suppliers:");
        for (Supplier supplier : supplierManager.listSuppliers()) {
            System.out.println(supplier);
        }
    }

    private static void createPurchaseOrder() {
        System.out.print("Enter Order ID: ");
        String orderId = scanner.nextLine();
        System.out.print("Enter Supplier ID: ");
        String supplierId = scanner.nextLine();
        
        // Find the supplier by ID
        Supplier supplier = null;
        for (Supplier s : supplierManager.listSuppliers()) {
            if (s.getSupplierId().equals(supplierId)) {
                supplier = s;
                break;
            }
        }

        if (supplier == null) {
            System.out.println("Supplier not found.");
            return;
        }

        System.out.print("Enter Order Date: ");
        String orderDate = scanner.nextLine();
        
        PurchaseOrder order = new PurchaseOrder(orderId, supplier, orderDate);

        while (true) {
            System.out.print("Do you want to add an item to the order? (yes/no): ");
            String addItem = scanner.nextLine();

            if (addItem.equalsIgnoreCase("no")) {
                break;
            }

            System.out.print("Enter Item ID: ");
            String itemId = scanner.nextLine();
            System.out.print("Enter Item Name: ");
            String itemName = scanner.nextLine();
            System.out.print("Enter Quantity: ");
            int quantity = scanner.nextInt();
            System.out.print("Enter Unit Price: ");
            double unitPrice = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            Item item = new Item(itemId, itemName, quantity, unitPrice);
            order.addItem(item);
        }

        orderManager.createOrder(order);
        System.out.println("Purchase order created successfully.");
    }

    private static void listPurchaseOrders() {
        System.out.println("List of Purchase Orders:");
        for (PurchaseOrder order : orderManager.listOrders()) {
            System.out.println(order);
        }
    }
}

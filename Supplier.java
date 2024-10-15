import java.util.Scanner;

public class Supplier {

    private String supplierId;
    private String name;
    private String supplierType; // e.g., outsourcing, service, commodity, importer
    private String supplyType; // e.g., non-critical, perishable, medical, utility, office
    private String contactInfo; // e.g., email, phone, address

    public Supplier(String supplierId, String name, String supplierType, String supplyType, String contactInfo) {
        this.supplierId = supplierId;
        this.name = name;
        this.supplierType = supplierType;
        this.supplyType = supplyType;
        this.contactInfo = contactInfo;
    }

    public static Supplier addSupplier() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Supplier ID: ");
        String supplierId = scanner.nextLine();
        System.out.print("Enter Supplier Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Supplier Type: ");
        String supplierType = scanner.nextLine();
        System.out.print("Enter Supply Type: ");
        String supplyType = scanner.nextLine();
        System.out.print("Enter Contact Info: ");
        String contactInfo = scanner.nextLine();
        System.out.println("Supplier added successfully.");
        scanner.close();
        return new Supplier(supplierId, name, supplierType, supplyType, contactInfo);
    }

    public void updateInfo(String name, String supplierType, String supplyType, String contactInfo) {
        this.name = name;
        this.supplierType = supplierType;
        this.supplyType = supplyType;
        this.contactInfo = contactInfo;
    }

    // Getter methods
    public String getSupplierId() {
        return supplierId;
    }

    public String getName() {
        return name;
    }

    public String getSupplierType() {
        return supplierType;
    }

    public String getSupplyType() {
        return supplyType;
    }

    public String getContactInfo() {
        return contactInfo;
    }



    @Override
    public String toString() {
        return "Supplier ID: " + supplierId + ", Name: " + name + ", Type: " + supplierType + ", Supply Type: " + supplyType + ", Contact Info: " + contactInfo;

    }

}

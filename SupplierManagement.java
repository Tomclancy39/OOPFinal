import java.util.ArrayList;
import java.util.List;

public class SupplierManagement {
    private List<Supplier> suppliers;

    public SupplierManagement() {
        this.suppliers = new ArrayList<>();
    }

    public void addSupplier(Supplier supplier) {
        suppliers.add(supplier);
    }

    public void removeSupplier(String supplierId) {
        suppliers.removeIf(supplier -> supplier.getSupplierId().equals(supplierId));
    }

    public void updateSupplier(String supplierId, String name, String supplierType, String supplyType, String contactInfo) {
        for (Supplier supplier : suppliers) {
            if (supplier.getSupplierId().equals(supplierId)) {
                supplier.updateInfo(name, supplierType, supplyType, contactInfo);
                break;
            }
        }
    }

    public List<Supplier> listSuppliers() {
        return suppliers;
    }
}

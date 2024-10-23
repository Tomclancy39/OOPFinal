public class OutsourcingSupplier extends Supplier {
    private String outsourcedServices;

    public OutsourcingSupplier(String supplierId, String name, String supplyType, String contactInfo, String outsourcedServices) {
        super(supplierId, name, "Outsourcing", supplyType, contactInfo);
        this.outsourcedServices = outsourcedServices;
    }

    @Override
    public String toString() {
        return super.toString() + ", Outsourced Services: " + outsourcedServices;
    }
}


public class ServiceSupplier extends Supplier {
    private String serviceProvided;

    public ServiceSupplier(String supplierId, String name, String supplyType, String contactInfo, String serviceProvided) {
        super(supplierId, name, "Service", supplyType, contactInfo);
        this.serviceProvided = serviceProvided;
    }

    @Override
    public String toString() {
        return super.toString() + ", Service Provided: " + serviceProvided;
    }
}

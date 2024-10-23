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

public class CommoditySupplier extends Supplier {
    private String commodityType;

    public CommoditySupplier(String supplierId, String name, String supplyType, String contactInfo, String commodityType) {
        super(supplierId, name, "Commodity", supplyType, contactInfo);
        this.commodityType = commodityType;
    }

    @Override
    public String toString() {
        return super.toString() + ", Commodity Type: " + commodityType;
    }
}

public class ImporterSupplier extends Supplier {
    private String countryOfOrigin;

    public ImporterSupplier(String supplierId, String name, String supplyType, String contactInfo, String countryOfOrigin) {
        super(supplierId, name, "Importer", supplyType, contactInfo);
        this.countryOfOrigin = countryOfOrigin;
    }

    @Override
    public String toString() {
        return super.toString() + ", Country of Origin: " + countryOfOrigin;
    }
}

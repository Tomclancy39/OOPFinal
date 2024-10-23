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

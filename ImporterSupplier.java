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

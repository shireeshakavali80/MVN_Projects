package constructor;
public class ElectronicProduct extends Product {

    private String manufacturer;
    public ElectronicProduct(String productName, String manufacturer) {
        super(productName);
        this.manufacturer = manufacturer;
    }
    public ElectronicProduct(String manufacturer) {
        super("DefaultProductName");
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
package constructor;

public class Main {
    public static void main(String[] args) {

        ElectronicProduct electronicProduct1 = new ElectronicProduct("Smartphone", "Iphone");
        System.out.println("Product Name: " + electronicProduct1.getProductName());
        System.out.println("Manufacturer: " + electronicProduct1.getManufacturer());

        ElectronicProduct electronicProduct2 = new ElectronicProduct("Apple");
        System.out.println("Product Name: " + electronicProduct2.getProductName());
        System.out.println("Manufacturer: " + electronicProduct2.getManufacturer());
    }
}


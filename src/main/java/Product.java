public class Product {
    private double price;
    public double getPrices() { //getter
        return price;
    }

    public void setPrice(double price) { //setter
        this.price = price;
    }

    public double getPrices(int quantity) {   //overloading
        return price * quantity;
    }

    public static void main(String[] args) {
        Product laptop = new Product();

        laptop.setPrice(1099.0);

        System.out.println("Price for a single laptop: $" + laptop.getPrices());

        System.out.println("Price for 3 laptops: $" + laptop.getPrices(3));
    }

}
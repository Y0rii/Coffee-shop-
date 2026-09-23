public class Dessert {

    private final String name;
    private final double price;

    public Dessert(String name) {
        this.name = name;
        this.price = CalculatePrice.getDessertPrice(name);
    }

    public String DisplayOrder() {
        return "\nDessert: \n-name: " + name + "\n-totall price: " + price;
    }

    public double getprice() {
        return price;
    }
}

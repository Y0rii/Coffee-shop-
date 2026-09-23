public class Coffee {

    private final String type;
    private final String size;
    private final boolean extraShot;
    private final String milkType;
    private final double price;

   


    public Coffee(String type, String size, boolean extraShot, String milkType) {
        this.type = type;
        this.size = size;
        this.extraShot = extraShot;
        this.milkType = milkType;
        this.price=CalculatePrice.getCoffeePrice(type, size, extraShot);
        
    }

    public String DisplayOrder() {
        return "--Order Summary-- \nCoffee Order: \n-type: " + type + " \n-size: " + size +  "\n-Extra shot: " + (extraShot ? "yes" : "no") + "\n-Milk type: " + milkType+" \n-totall price: "+ price;
    }

    public double getprice() {
        return price;
    }
}
public class CalculatePrice {

    public static double getCoffeePrice(String type, String size, boolean extraShot) {
        double price = 0;

        switch (type.toLowerCase()) 
        {
            //
            case "black":
                price = 10.0;
                break;
            //
            case "latte":
                price = 20.0;
                break;
            //
            case "flat-white":
                price = 25.0;
                break;
            default:
                price = 0.0;
        }

        switch (size.toLowerCase()) 
        {
            //
            case "small":
                break;
            //
            case "medium":
                price += 2.0;
                break;
            //
            case "large":
                price += 4.0;
                break;
            default:
                price += 0.0;
        }

        if (extraShot) {
            price += 1.5;
        }

        return price;
    }

    public static double getDessertPrice(String name) {
        double price=0.0;

        switch (name.toLowerCase()) 
        {
            //
            case "muffin":
                price= 9.0;
                break;
            //
            case "brownie":
                price= 12.0;
                break;
            default:
                price=0.0;
        }

        return price;
    }
   
}
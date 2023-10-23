package Week06Ass;

public class Electronics extends Product{
     double powerConsumption;
     String warranty;
    public Electronics(String productName, int stockQuantity, double price, String productID, String taxation,
                       double powerConsumption,String warranty) {
        super(productName, stockQuantity, price, productID, taxation);
        this.powerConsumption=powerConsumption;
        this.warranty=warranty;
    }
    @Override
    public String getCategory() {
        return "Electronics";
    }
}

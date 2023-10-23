package Week06Ass;

public class Grocery extends Product{
    String ExpiryDate;
    String nutritionalValue;
    public Grocery(String productName, int stockQuantity, double price, String productID, String taxation,
                   String ExpiryDate,String nutritionalValue) {
        super(productName, stockQuantity, price, productID, taxation);
        this.ExpiryDate=ExpiryDate;
        this.nutritionalValue=nutritionalValue;
    }
    @Override
    public String getCategory() {
        return "GROCERY";
    }
    @Override
    public String toString() {
        return "ProductID :" + getProductID() +"\nProduct name:" + getProductName()+ "\nProduct Price :"+ getPrice()
                + "\n Taxation :" + getTaxation() + "\nExpiry Date:'" + ExpiryDate+ " \n Nutritional Value :" + nutritionalValue;

    }
}

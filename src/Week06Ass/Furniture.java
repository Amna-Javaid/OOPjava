package Week06Ass;

public class Furniture extends Product{
    String material;
    String dimension;

    public Furniture(String productName, int stockQuantity, double price, String productID, String taxation
            , String material,String dimension) {
        super(productName, stockQuantity, price, productID, taxation);
        this.dimension=dimension;
        this.material=material;
    }

    @Override
    public String toString() {
        return "ProductID :" + getProductID() +"\nProduct name:" + getProductName()+ "\nProduct Price :"+ getPrice()
                + "\n Taxation :" + getTaxation() + "\nmaterial:'" + material + " \nDimension :" + dimension;

    }

    @Override
    public String getCategory() {
        return "Furniture";
    }
}

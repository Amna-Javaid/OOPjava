package Week06Ass;

public class Seating  extends Furniture{

    int loadCapacity;

    public Seating(String productName, int stockQuantity, double price, String productID, String taxation,String material,
                   String dimension,int loadCapacity) {

        super(productName, stockQuantity, price, productID, taxation,material,dimension);
        this.loadCapacity=loadCapacity;
    }
    @Override
    public String getCategory() {
        return "Furniture - Seating";
    }
    @Override
    public String toString() {
        return "ProductID :" + getProductID() +"\nProduct name:" + getProductName()+ "\nProduct Price :"+ getPrice()
                + "\n Taxation :" + getTaxation() + "\nmaterial:'" + material + " \nDimension :" + dimension
                + "\nLoad Capacity :" + loadCapacity;

    }
}

package Week06Ass;

public class Table extends Furniture{
    String shape;
    public Table(String productName, int stockQuantity, double price, String productID, String taxation,String material,
                 String dimension,String shape) {
        super(productName, stockQuantity, price, productID, taxation,material,dimension);
        this.shape=shape;
    }
    @Override
    public String getCategory() {
        return "Furniture - Table";
    }
    @Override
    public String toString() {
        return "ProductID :" + getProductID() +"\nProduct name:" + getProductName()+ "\nProduct Price :"+ getPrice()
                + "\n Taxation :" + getTaxation() + "\nmaterial:'" + material + " \nDimension :" + dimension +"\nShape :"
                + shape;

    }
}

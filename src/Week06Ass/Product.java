package Week06Ass;

public  class Product {
    private String productName;
    private int stockQuantity;
    private double price;
    private String productID;
    private String taxation;

    public Product(String productName, int stockQuantity, double price, String productID, String taxation) {
        this.productName = productName;
        this.stockQuantity = stockQuantity;
        this.price = price;
        this.productID = productID;
        this.taxation = taxation;

    }

    public String getProductName() {
        return productName;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public double getPrice() {
        return price;
    }

    public String getProductID() {
        return productID;
    }

    public String getTaxation() {
        return taxation;
    }


    public String toString(){
       return "ProductID :" + getProductID() +"\nProduct name:" + getProductName()+ "\nProduct Price :"+ getPrice()
               + "\n Taxation :" + getTaxation();
    }

    public void updatePrice(double newPrice){
        double oldPrice = this.price;
        this.price = newPrice;
        System.out.println("Price updated from " + oldPrice + " to " + newPrice);
    }


    public void updateStock(int newStock)
    {

        int oldStock = this.stockQuantity;
        this.stockQuantity = newStock;
        System.out.println("Stock quantity updated from " + oldStock + " to " + newStock);
    }

    public String getCategory(){
        return "General";
    }


}

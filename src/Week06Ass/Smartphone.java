package Week06Ass;

public class Smartphone  extends Electronics{
    private String operatingSystem;
    private int storageCapacity;
    private int cameraResolution;
    public Smartphone(String productName, int stockQuantity, double price, String productID,
                      String taxation, double powerConsumption,String warranty,String operatingSystem,int storageCapacity,int cameraResolution) {
        super(productName, stockQuantity, price, productID, taxation,powerConsumption, warranty);
        this.operatingSystem = operatingSystem;
        this.storageCapacity = storageCapacity;
        this.cameraResolution = cameraResolution;
    }
    @Override
    public String getCategory() {
        return "Electronics  - SmartPhone";
    }
    @Override
    public String toString() {
        return "ProductID :" + getProductID() +"\nProduct name:" + getProductName()+ "\nProduct Price :"+ getPrice()
                + "\n Taxation :" + getTaxation() + "\nOperting System:'" +operatingSystem  +
                " \nStorage Capacity :" + storageCapacity + "cameraResolution =" + cameraResolution;

    }
}

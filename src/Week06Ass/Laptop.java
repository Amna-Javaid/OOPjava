package Week06Ass;

public class Laptop extends Electronics{
    private String processorType;
    private int ramSize;
    private String screenDimensions;

    public Laptop(String productName, int stockQuantity, double price, String productID, String taxation
                 , double powerConsumption,String warranty, String processorType, int ramSize, String screenDimensions) {
        super(productName, stockQuantity, price, productID, taxation,powerConsumption, warranty);
        this.processorType = processorType;
        this.ramSize = ramSize;
        this.screenDimensions = screenDimensions;
    }
    @Override
    public String getCategory() {
        return "Electronics - Laptop";
    }

    @Override
    public String toString() {
        return  super.toString() + "\nProcessor type :" + processorType + "\nRam Size :" + ramSize
                + "\nScreenDimension:" + screenDimensions;
    }
}

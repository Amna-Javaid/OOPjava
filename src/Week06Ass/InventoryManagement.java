package Week06Ass;


public class InventoryManagement {
    private Product[] products;
    public int productCount;

    public InventoryManagement() {
        products = new Product[100];
        productCount =0;
    }

    public void addProduct(Product product)
    {
        if (productCount < products.length) {
            products[productCount] = product;
            productCount++;
            System.out.println("product added successfully");
        } else {
            System.out.println("Customer list is full.");
        }
    }

    public void removeProduct(String id)
    {
        int foundIndex = -1;
        for (int i = 0; i < productCount; i++) {
            if (products[i].getProductID().equalsIgnoreCase(id)) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            for (int i = foundIndex; i < productCount - 1; i++) {
                products[i] = products[i + 1];
            }
            products[productCount - 1] = null;
            productCount--;
            System.out.println("product removed successfully");
        } else {
            System.out.println("Product with ID " + id + " not found.");
        }
    }
    public void allItems(){
        for (Product product :products){
            if (product !=null) {
                System.out.println(product);
                System.out.println();
            }
        }
    }

    public Product searchProductByID(String productID) {
        for (Product product : products) {
            if (product.getProductID().equalsIgnoreCase(productID)) {

                return product;
            }

        }
        return null;

    }
    public Product searchProductByName(String productName) {
        for (Product product : products) {
            if (product.getProductName().equalsIgnoreCase(productName)) {
                return product;
            }

        }
        return null;

    }
    public Product searchProductByCategory(String productCategory) {
        for (Product product : products) {
            if (product.getCategory().equalsIgnoreCase(productCategory)) {
                return product;
            }

        }
        return null;

    }
    public void updateProductPrice(String productId, double newPrice) {
        Product product = searchProductByID(productId);
        if (product != null) {
            double oldPrice = product.getPrice();
            product.updatePrice(newPrice);
            System.out.println("Price for product with ID " + productId + " updated from " + oldPrice + " to " + newPrice);
        } else {
            System.out.println("Product with ID " + productId + " not found.");
        }
    }


    public void updateProductStock(String productId, int newStock) {
        Product product = searchProductByID(productId);
        if (product != null) {
            product.updateStock(newStock);

        } else {
            System.out.println("Product with ID " + productId + " not found.");
        }
    }







}

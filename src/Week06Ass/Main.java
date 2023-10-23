package Week06Ass;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       InventoryManagement manage= new InventoryManagement();

       Product chair = new Furniture("Chair",23,1500,"Ch101","20%",
               "wood","12 X 10");

        Product smartphone = new Electronics("Smartphone", 12443, 19000, "SP17", "2%", 128, "12 days");
        Product sofa = new Furniture("Sofa", 23, 25000, "SP19", "7%", "Leather","20 X 12");
        Product cereal = new Grocery("cereal", 24, 400, "Cer12", "1%",  "12-5-2023","Calories: 120 per serving");
        Product laptop = new Laptop("Laptop", 31,48000, "LAP465", "3%", 90,"5 days","mac os",8,"15 inches");
       Product seating = new Seating("Seating Set",12,40.0000,"SEA12","23%",
               "Wool","23 X 45",5);

        manage.addProduct(smartphone);
        manage.addProduct(chair);
        manage.addProduct(cereal);
        manage.addProduct(sofa);
        manage.addProduct(laptop);
        manage.addProduct(seating);
//        manage.allItems();

//        System.out.println(manage.searchProductByName("Chair"));
//         manage.allItems();
//         manage.removeProduct(sofa);
//         manage.allItems();
//

        Scanner sc = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("\n1. Add Product");
                System.out.println("2. Find Product");
                System.out.println("3. Remove Product");
                System.out.println("4. Print Inventory");
                System.out.println("5. Update product");

                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");

                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Enter product details to add");
                        System.out.print("Enter Product ID: ");
                        String id = sc.nextLine();
                        sc.nextLine(); // Consume newline
                        System.out.print("Enter Product Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Product Price: ");
                        double price = sc.nextDouble();
                        System.out.print("Enter Stock Quantity: ");
                        int stockQuantity = sc.nextInt();
                        System.out.print("Enter Taxation: ");
                        String tax = sc.nextLine();


                        System.out.println("Enter product category");
                        String category = sc.nextLine();

                        System.out.println("Enter subcategory of Product");

                        String subcategory = sc.nextLine();
                        sc.nextLine(); // Consume newline

                        if (category.equalsIgnoreCase("Furniture")) {
                            System.out.println("Enter material of product");
                            String material = sc.nextLine();
                            System.out.println("Enter Dimension of product");
                            String dimension = sc.nextLine();

                            if (subcategory.equalsIgnoreCase("seating")) {
                                System.out.println("enter the load capacity of the seating sofa ");
                                int load = sc.nextInt();
                                manage.addProduct(new Seating(name, stockQuantity, price, id, tax, material, dimension, load));
                            } else if (subcategory.equalsIgnoreCase("Table")) {
                                System.out.println("enter the Shape of the Table");
                                String shape = sc.nextLine();
                                manage.addProduct(new Table(name, stockQuantity, price, id, tax, material, dimension, shape));
                            } else {
                                manage.addProduct(new Furniture(name, stockQuantity, price, id, tax, material, dimension));
                            }


                        } else if (category.equalsIgnoreCase("Electronics")) {
                            System.out.println("Enter Power consumption of product");
                            Double power = sc.nextDouble();
                            System.out.println("Enter Warranty of product");
                            String warranty = sc.nextLine();


                            if (subcategory.equalsIgnoreCase("laptop")) {
                                System.out.println("Enter ram size of laptop");
                                int ram = sc.nextInt();
                                sc.nextLine(); // Consume newline
                                System.out.println("Enter Processor type of laptop");
                                String processor = sc.nextLine();
                                sc.nextLine(); // Consume newline
                                System.out.println("Enter Screen dimension of laptop");
                                String screen = sc.nextLine();
                                sc.nextLine(); // Consume newline
                                manage.addProduct(new Laptop(name, stockQuantity, price, id, tax, power, warranty, processor
                                        , ram, screen));
                            } else if (subcategory.equalsIgnoreCase("smartphone")) {
                                System.out.println("Enter camera resolution of phone");
                                int camera = sc.nextInt();
                                sc.nextLine(); // Consume newline
                                System.out.println("Enter storage  of phone");
                                int storage = sc.nextInt();
                                sc.nextLine(); // Consume newline
                                System.out.println("Enter Operating system of phone");
                                String os = sc.nextLine();
                                sc.nextLine(); // Consume newline
                                manage.addProduct(new Smartphone(name, stockQuantity, price, id, tax, power, warranty, os, storage, camera));

                            } else {
                                manage.addProduct(new Electronics(name, stockQuantity, price, id, tax, power, warranty));
                            }

                        } else if (category.equalsIgnoreCase("Grocery")) {
                            System.out.println("Enter Expiry date of grocery");
                            String expiry = sc.nextLine();
                            sc.nextLine(); // Consume newline
                            System.out.println("Enter nutritional value  of grocery");
                            String nutrition = sc.nextLine();
                            sc.nextLine(); // Consume newline
                            manage.addProduct(new Grocery(name, stockQuantity, price, id, tax, expiry, nutrition));
                        }
                       break;

                    case 2:

                        System.out.println("Enter the product ID you want to search ");
                        String byID = sc.nextLine();
                        Product findProduct = manage.searchProductByID(byID);
                        if (findProduct != null) {
                            System.out.println("\nProduct Found: " + findProduct);
                        } else {
                            System.out.println("\nProduct not found this " + byID +" id");
                        }

                    break;
                    case 3:

                        System.out.println("Enter the product ID to remove from the list");
                        String remID = sc.nextLine();
                        manage.removeProduct(remID);
                    break;
                    case 4:
                        System.out.println("The whole inventory list is ");
                        manage.allItems();
                        break;
                    case 5:
                        System.out.println( "YOU want to update product on what bases \n 1: Update stock Quantity \n 2:" +
                                "Update price ");
                        int update = sc.nextInt();
                        sc.nextLine();
                        System.out.println("enter the product id to update ");
                        String updateID =sc.nextLine();

                        switch (update){
                            case 1:
                                System.out.println("enter the stock quantity to change");
                                int stock =sc.nextInt();

                                manage.updateProductStock(updateID,stock);
                                break;
                            case 2 :
                                System.out.println("enter the price to change");
                                double updatePrice =sc.nextDouble();

                                manage.updateProductPrice(updateID,updatePrice);
                                break;
                            default:
                                System.out.println("wrong option entered");
                        }
                        break;
                    case 6 :
                        System.exit(0);
                          break;
                    default:
                        System.out.println("Invalid choice. Please select a valid option.");

                }
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } catch (NoSuchElementException e) {
            System.out.println("Input not found.");
        }
        catch(Exception e){
            System.out.println("errors detected");
        }




    }
}

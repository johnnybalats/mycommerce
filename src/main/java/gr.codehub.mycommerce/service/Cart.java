package gr.codehub.mycommerce.service;

import gr.codehub.mycommerce.model.Category;
import gr.codehub.mycommerce.model.Product;
import gr.codehub.mycommerce.model.Supplier;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Cart implements ICart {

    private ArrayList<Product> products;

    public  Cart() {
        products = new ArrayList<>();
    }


    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public void removeProduct(int productId) {
        products.remove(productId);
    }

    @Override
    public double calculateTotalPrice() {
        double totalPrice = 0;
        for(Product product: products)
            totalPrice += product.getPrice() * product.getQuantity();

        return totalPrice;
    }

    @Override
    public void persistData() throws FileNotFoundException {
        File file = new File("cart.txt");
        PrintWriter pw = new PrintWriter(file);

        for (Product product: products) {
            pw.println(product.getName() + "," +
                       product.getPrice() + "," +
                       product.getQuantity() + "," +
                       product.getCategory());
        }

        pw.close();
    }

    @Override
    public void load() throws FileNotFoundException {
        File file = new File("cart.txt");

        Scanner sc = new Scanner(file);
        products.clear();

        while(sc.hasNext()) {
            String line = sc.nextLine();

            String words[] = line.split(",");

            String productName = words[0];
            double productPrice = Double.parseDouble(words[1]);
            int productQuantity = Integer.parseInt(words[2]);

            Supplier supplier = new Supplier();

            Product product = new Product(productName, productPrice, productQuantity, Category.SNACKS, supplier);

            products.add(product);
        }
    }
}

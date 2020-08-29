package gr.codehub.mycommerce.service;

import gr.codehub.mycommerce.model.Category;
import gr.codehub.mycommerce.model.Product;
import gr.codehub.mycommerce.model.Supplier;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ui {

    public void manageCart() {
        ICartService cart = new CartService();

//        do {
//            Product product = getProduct();
//
//            cart.addProduct(product);
//
//        } while(wantContinue());

        try {
            cart.load();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Total Price: " + cart.calculateTotalPrice());

        try {
            cart.persistData();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private boolean wantContinue() {
        System.out.println("Do you want to continue (y=yes): ");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();
        if (response.equals("y"))
            return true;
        else
            return false;
    }

    private Product getProduct() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give product name: ");
        String productName = scanner.nextLine();
        System.out.println("Give product price: ");
        double productPrice = Double.parseDouble(scanner.nextLine());
        System.out.println("Give quantity: ");
        int productQuantity = Integer.parseInt(scanner.nextLine());

        Supplier supplier = new Supplier();

        Product product = new Product(productName, productPrice, productQuantity, Category.SNACKS, supplier);

        return product;
    }
}

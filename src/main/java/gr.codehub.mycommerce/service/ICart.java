package gr.codehub.mycommerce.service;

import gr.codehub.mycommerce.model.Product;

import java.io.FileNotFoundException;

public interface ICart {

    void addProduct(Product product);
    void removeProduct(int productId);
    double calculateTotalPrice();
    void persistData() throws FileNotFoundException;
    void load() throws FileNotFoundException;
}

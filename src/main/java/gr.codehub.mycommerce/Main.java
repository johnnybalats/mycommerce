package gr.codehub.mycommerce;

import gr.codehub.mycommerce.model.Category;
import gr.codehub.mycommerce.model.Product;
import gr.codehub.mycommerce.model.Supplier;
import gr.codehub.mycommerce.service.Cart;
import gr.codehub.mycommerce.service.Ui;

public class Main {

    public static void main(String[] args) {

        Ui ui = new Ui();
        ui.manageCart();
    }
}

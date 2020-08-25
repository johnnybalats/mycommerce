package gr.codehub.mycommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private String name;
    private double price;
    private int quantity;
    private Category category;
    private Supplier supplier;
}

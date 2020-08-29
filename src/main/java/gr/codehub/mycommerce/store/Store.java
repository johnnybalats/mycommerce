package gr.codehub.mycommerce.store;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Store {

    private String title;
    private String address;

    public void doWork() {

    }

    public static void main(String[] args) {
        Store a1 = new Store("A", "Athinas 32");
        Store a2 = new Store("A", "Athinas 32");

        if (a1.hashCode() == a2.hashCode()) System.out.println("The stores have same hashcode");
        else System.out.println("The stores have not same hashcode");

        if (a1 == a2) System.out.println("The stores are equal");
        else System.out.println("The stores are not equal");

        if (a1.equals(a2)) System.out.println("The stores are equivalent");
        else System.out.println("The stores are not equivalent");
    }
}

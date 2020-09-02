package gr.codehub.mycommerce.store;

import java.util.ArrayList;

public class ManageStores {

    public static void main(String[] args) {

        ArrayList<Store> chainStore = new ArrayList<>();
        chainStore.add(new Store());
        chainStore.add(new BigStore("Dimitris"));
        chainStore.add(new SmallShop("Giannis"));

        for (Store store: chainStore)
            System.out.println(store);
    }
}

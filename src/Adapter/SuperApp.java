package Adapter;

import java.util.ArrayList;
import java.util.List;

public class SuperApp  {

    List<String> list = new ArrayList<>();

    public SuperApp(List<String> list) {
        this.list = list;
    }

    public void presentStock() {
        System.out.println("Present stock: " + list.size());
    }

    public void check4Fruits() {
        boolean hasFruits = list.contains("Fruits");
        System.out.println("Does it contain Fruits : " + hasFruits );
    }

    public void clearStock() {
        list.clear();
        System.out.println("All items cleared");
    }

}

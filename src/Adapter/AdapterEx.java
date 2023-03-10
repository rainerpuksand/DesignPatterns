package Adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdapterEx {
    public static void main(String[] args) {

        String[] arr = {"Milk", "Eggs", "Bread", "Sugar", "Tea", "Fruits", "Rice"};
        App simpleApp = new App(arr);
        simpleApp.StockCount();
        simpleApp.hasFruits();
        simpleApp.removeItems();
        System.out.println();


        List<String> list1 = new ArrayList<>();
        list1.add("Milk"); list1.add("Eggs"); list1.add("Bread"); list1.add("Sugar"); list1.add("Tea"); list1.add("Fruits"); list1.add("Rice");
        SuperApp superApp = new SuperApp(list1);
        superApp.presentStock();
        superApp.check4Fruits();
        superApp.clearStock();
        System.out.println();


        String[] arr2 = {"Milk", "Eggs", "Bread", "Sugar", "Tea", "Fruits", "Rice"};
        List<String> list2 = new ArrayList<>();
        //Arrays.asList(arr2);
        list2.add("Milk"); list2.add("Eggs"); list2.add("Bread"); list2.add("Sugar"); list2.add("Tea"); list2.add("Fruits"); list2.add("Rice");

        SuperApp superApp2 = new SuperApp(list2);
        SuperAppAdapter adaptedApp = new SuperAppAdapter(superApp2);//Now the ADAPTER will take control
        adaptedApp.StockCount();
        adaptedApp.hasFruits();
        adaptedApp.removeItems();

    }

}

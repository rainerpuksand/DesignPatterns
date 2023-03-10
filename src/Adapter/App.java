package Adapter;

public class App implements StockTracker {
    String[] arr;

    public App(String[] arr) {
        this.arr = arr;
    }

    @Override
    public void StockCount() {

        System.out.println("Present stock: " + arr.length);
    }

    @Override
    public void hasFruits() {
        String hasFruits="NO";
        for(String str: arr){
            if(str.equals("Fruits")){
                hasFruits="Yes";
            }
        }
        System.out.println("Does it contain Fruits : " + hasFruits );
    }

    @Override
    public void removeItems() {
        for(String str: arr){
            str=null;
        }
        System.out.println("All items have been removed");
    }
}

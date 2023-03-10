package ObserverPattern;

public class Ex {
    public static void main(String[] args) {
        Product appleObj = new Product("Iphone",5000);
        Product androidObj = new Product("Pixel",1000);

        Customers c1 = new Customers("iBoy");
        Customers c2 = new Customers("iGirl");
        Customers c3 = new Customers("Andy");
        Customers c4 = new Customers("Andro");
        Customers c5 = new Customers("Mr.Both");


        appleObj.registerObserver(c1);
        appleObj.registerObserver(c2);
        appleObj.registerObserver(c5);


        androidObj.registerObserver(c3);
        androidObj.registerObserver(c4);
        androidObj.registerObserver(c5);



        appleObj.setNewPrice(4000);
        System.out.println("-------------------");
        androidObj.setNewPrice(1100);

        System.out.println("==================");

        appleObj.unregisterObserver(c5);
        androidObj.unregisterObserver(c5);

        appleObj.setNewPrice(3000);
        androidObj.setNewPrice(1500);

        System.out.println("==================");

        appleObj.unregisterObserver(c1);
        appleObj.setNewPrice(6000);

    }
}

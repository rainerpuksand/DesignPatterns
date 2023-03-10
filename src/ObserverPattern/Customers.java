package ObserverPattern;

public class Customers implements Observer {

    String Cust_name;

    public Customers(String Cust_name) {
        this.Cust_name = Cust_name;
    }

    @Override
    public void update(Product product) {
        System.out.println("Hello, " + Cust_name + "...." + product.name + " has a new price: " + product.price);
    }
}

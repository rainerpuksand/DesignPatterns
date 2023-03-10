package Adapter;

public class SuperAppAdapter implements StockTracker {
    SuperApp obj;

    public SuperAppAdapter(SuperApp obj) {
        this.obj = obj;
    }

    @Override
    public void StockCount() {
        obj.presentStock();
    }

    @Override
    public void hasFruits() {
        obj.check4Fruits();
    }

    @Override
    public void removeItems() {
        obj.clearStock();
    }
}

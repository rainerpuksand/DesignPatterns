package ObserverPattern;

import java.util.ArrayList;
import java.util.List;


public class Product implements ObservableSubject {
    List<Observer> observerList;
    String name;
    int price; //pvt with getters&setters

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
        observerList=new ArrayList<>();
    }

    public void setNewPrice(int price) {
        this.price = price;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer ob) {
        observerList.add(ob);
    }

    @Override
    public void unregisterObserver(Observer ob) {
        observerList.remove(ob);
    }

    @Override
    public void notifyObservers() {
        for(Observer ob: observerList){
            ob.update(this);
        }
    }




}

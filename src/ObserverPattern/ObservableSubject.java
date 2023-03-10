package ObserverPattern;



public interface ObservableSubject {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();

}

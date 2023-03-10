package Singleton;

public class SyncPaymentMethod {

    private static SyncPaymentMethod obj;

    private SyncPaymentMethod(){}

    public static synchronized SyncPaymentMethod getInstance() {
        if(obj == null) {
            obj = new SyncPaymentMethod();
        }
        return obj;
    }
    
    
}

package Singleton;

public class EagerStyle { //use "Singleton" in class name

    private static EagerStyle obj = new EagerStyle();

    private EagerStyle(){}

    public static EagerStyle getInstance() {
        return obj;
    }

}

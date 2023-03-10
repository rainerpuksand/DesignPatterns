package StatePattern;
//https://developer.android.com/reference/android/telephony/TelephonyManager#CALL_STATE_OFFHOOK

public class StatePatternEx {
    public static void main(String[] args) {

        Car carObj = new Car();

        /*DriveStates cityModeObj = new CityCar();//not recommended way
        carObj.setCurrentState(cityModeObj);*/

        carObj.setCurrentState(new CityCar());//Recommended way
        carObj.acceleration();
        carObj.stopping();
        carObj.consumeFuel();


        System.out.println("====================");

        carObj.setCurrentState(new RaceCar());
        carObj.acceleration();
        carObj.stopping();
        carObj.consumeFuel();


    }
}

//https://stackoverflow.com/questions/1658192/what-is-the-difference-between-strategy-design-pattern-and-state-design-pattern
// 1st answer ... and ... answer by Murali Mohan
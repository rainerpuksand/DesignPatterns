package StatePattern;

public class RaceCar implements DriveStates {

    @Override
    public void acceleration() {
        System.out.println("in RaceCar Mode....");
        System.out.println("Accelerating 10.. 20.. 30.. 40.. 50.. 60km/h");
    }

    @Override
    public void stopping() {
        System.out.println("Applying ABS Braking...");
        System.out.println("Decelerating  25.. 8.. 0km/h");
    }

    @Override
    public void useFuel() {
        System.out.println("Drinking fuel....");
    }


}

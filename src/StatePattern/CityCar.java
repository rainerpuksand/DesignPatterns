package StatePattern;

public class CityCar implements DriveStates {
    @Override
    public void acceleration() {
        System.out.println("in CityCar Mode....");
        System.out.println("Driving 3.. 6.. 10.. 15.. 20.. 25km/h");
    }

    @Override
    public void stopping() {
        System.out.println("Regular Braking...");
        System.out.println("Slowing down 25.. 18.. 12.. 5.. 0km/h");
    }

    @Override
    public void useFuel() {
        System.out.println("Efficient consumption.....");
    }


}

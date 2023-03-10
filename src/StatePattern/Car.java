package StatePattern;

public class Car {
    //Declare the object that will keep the state wanted
    DriveStates currentStateOBJ;

    //set the wanted state
    public void setCurrentState(DriveStates newStatePassed){
        this.currentStateOBJ = newStatePassed;
    }

    //instruct the newly set object to call the behavior that was defined in its class
    public void acceleration(){
        currentStateOBJ.acceleration();
    }

    public void stopping(){
        currentStateOBJ.stopping();
    }

    public void consumeFuel(){
        currentStateOBJ.useFuel();
    }


}

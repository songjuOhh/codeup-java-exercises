package abstractLecture;

abstract public class Vehicle {

    protected int speedMPH;
    protected int distanceInMeters;
    protected String direction;
    protected int numbOfPassenger;

    protected void changeSpeed(int mph){
        speedMPH = mph;
    }

    protected void turnOn(){
         System.out.println("Turn the key and crank the engine...");
     };

    protected void turnOff(){
        System.out.println("Engine shuts down...");

    };

    abstract protected void demolish();

    protected void getCurrentLatLng(){
        System.out.println("Here is the current Lat and Lang");
    };

    protected void moveForward(int distanceInMeters){
        System.out.printf("Moving forward by %sm.",distanceInMeters);
    };

    public Vehicle(int speedMPH, int distanceInMeters, String direction, int numbOfPassenger) {
        this.speedMPH = speedMPH;
        this.distanceInMeters = distanceInMeters;
        this.direction = direction;
        this.numbOfPassenger = numbOfPassenger;
    }
    public Vehicle(){

    }

    /*
    * ================================= ABSTRACT CLASS MINI-EXERCISE

         -- PART 2
    Car
        on()
        off()
        moveForward(int distanceInMeters)
        getCurrentLatLng()
        demolish()
    Plane
        on()
        off()
        getCurrentLatLng()
        demolish()
    Bicycle
        getCurrentLatLng()
        demolish()
    What methods make the most sense to include in a PowerControllable interface?
    What methods make the most sense to include in an abstract Vehicle class?
    What class(s) should implement the PowerControllable interface?
    What methods in the abstract class should be abstract? What methods are general to all sub-types?
            */



}

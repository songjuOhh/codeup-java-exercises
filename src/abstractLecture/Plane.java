package abstractLecture;

public class Plane extends Vehicle {

    public Plane(int speedMPH, int distanceInMeters, String direction, int numbOfPassenger) {
        super(speedMPH, distanceInMeters, direction, numbOfPassenger);
    }

    public Plane() {
        super();
    }

    @Override
    protected void turnOn() {
        System.out.println("Turn the key and crank the plane engine...");
    }

    @Override
    protected void turnOff() {
        System.out.println("Plane engine shuts down...");
    }

    @Override
    protected void demolish(){
        System.out.println("Plane demolished.");
    }

    @Override
    protected void getCurrentLatLng(){
        System.out.println("Here is the current Lat and Lang");
    }
}

package abstractLecture;

public  class Car extends Vehicle{

    public Car(int speedMPH, int distanceInMeters, String direction, int numbOfPassenger) {
        super(speedMPH, distanceInMeters, direction, numbOfPassenger);
    }

    public Car(){
        super();
    }

    @Override
    protected void turnOn() {
        System.out.println("Turn the key and crank the car engine...");
    }

    @Override
    protected void turnOff() {
        System.out.println("Car engine shuts down...");
    }

    @Override
    protected void demolish(){
        System.out.println("Car demolished.");
    }

    @Override
    protected void getCurrentLatLng(){
        System.out.println("Here is the current Lat and Lang");
    }

    protected void moveForward(int distanceInMeters){
        System.out.printf("Car moving forward by %sm.",distanceInMeters);
        System.out.println();
    }


}

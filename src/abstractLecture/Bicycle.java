package abstractLecture;

public  class Bicycle extends Vehicle {


    public Bicycle(int speedMPH, int distanceInMeters, String direction, int numbOfPassenger) {
        super(speedMPH, distanceInMeters, direction, numbOfPassenger);
    }

    public Bicycle() {

    }


    @Override
    protected void demolish(){
        System.out.println("Bicycle demolished.");
    }

    @Override
    protected void getCurrentLatLng(){
        System.out.println("Here is the current Lat and Lang");
    }
}

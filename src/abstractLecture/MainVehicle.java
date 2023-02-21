package abstractLecture;

public class MainVehicle {

    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();

        plane.turnOn();
        car.turnOff();
        car.moveForward(50);
        bicycle.demolish();





    }
}

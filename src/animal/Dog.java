package animal;



public class Dog extends Animal{

//    int numberOfLegs;
//    String preferredClimate;
    String color;

    public Dog(int numberOfLegs, String preferredClimate,  String color ){
        super(numberOfLegs, preferredClimate);
        this.color = color;
    }

    public String getAnimalInfo(){
        return "[Dog]\nNumber of legs are: "+numberOfLegs+"\nPreferredClimate is: "+preferredClimate+ "\nThe color is: "+ color;
    }
}

package animal;

public class Cat extends Animal{
//    int numberOfLegs;
//    String preferredClimate;

    public Cat(int numberOfLegs,String preferredClimate ){
        super(numberOfLegs, preferredClimate);
    }

    public String getAnimalInfo(){
        return "[Cat]\nNumber of legs are: "+numberOfLegs+"\nPreferred weather is: "+ preferredClimate;
    }
}

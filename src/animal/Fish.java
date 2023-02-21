package animal;

public class Fish extends Animal{

    int numberOfFins;
//    String preferredClimate;
    String fishType;

    public Fish(String preferredClimate,int numberOfFins ,String fishType){
        super(preferredClimate);
        this.numberOfFins = numberOfFins;
        this.fishType = fishType;
    }


    public String getAnimalInfo(){
        return "[Fish]\nNumber of fins are: "+numberOfFins+"\nPreferred Climate is: "+ preferredClimate+"\nType of fish is:"+ fishType;
    }
}

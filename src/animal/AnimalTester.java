package animal;

public class AnimalTester {

    public static void displayAnimalDetails (Animal a){
        System.out.println(a.getAnimalInfo());
    }


    public static void main(String[] args) {
        Animal dog = new Dog(4,"sunny","brown");
        displayAnimalDetails(dog);

        Animal fish = new Fish("rainy", 5,"tuna");
        displayAnimalDetails(fish);

        Animal cat = new Cat(4,"sunny");
        displayAnimalDetails(cat);
    }
}

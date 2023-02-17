package lecturePackage;

public class Dish {

    /*
        * -- SHORT ASSIGNMENT #1 --

        * Create a class called Dish. This class will represent various restaurant dishes.
            Include an integer property called “costInCents”
            Include a string property called “nameOfDish”
            Include a boolean property called “wouldRecommend”

            * Include a method called “printSummary” with a void return type

                * this method will use a single printf method to print out the values of each of the instance properties in the following format:
                  Cost: COST_IN_CENTS_HERE
                  Name: NAME_OF_DISH_HERE
                  Recommended: BOOLEAN_VALUE_OF_WOULD_RECOMMEND_HERE

            * Create another class called DishTest

            * Add a main method and inside the method...
                1) instantiate a Dish object and assign to a variable called dish1
                2) assign creative values for each of the properties
                3) test the printSummary() method by invoking it and checking if all instance values are correctly printed
        */

    private double costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

    public double getCostInCents() {
        return costInCents;
    }

    public void setCostInCents(double costInCents) {
        this.costInCents = costInCents;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public boolean isWouldRecommend() {
        return wouldRecommend;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }

    public Dish (String nameOfDish, double costInCents, boolean wouldRecommend){
        this.nameOfDish = nameOfDish;
        this.costInCents = costInCents;
        this.wouldRecommend = wouldRecommend;
    }

    public void printSummary(){
        System.out.printf("\n=====================\nCost: $%s\nName: %s\nRecommended: %s\n=====================\n", costInCents, nameOfDish, wouldRecommend);
    }


    @Override
    public String toString() {
        return "Dish{" +
                "costInCents=" + costInCents +
                ", nameOfDish='" + nameOfDish + '\'' +
                ", wouldRecommend=" + wouldRecommend +
                '}';
    }



    public static void main(String[] args) {


//        Dish dish1 = new Dish();
//        dish1.costInCents = 5000.00;
//        dish1.nameOfDish = "Golden Dragon";
//        dish1.wouldRecommend = true;
//
//        Dish dish2 = new Dish();
//        dish2.costInCents = 1000.75;
//        dish2.nameOfDish = "Meow Meow fish";
//        dish2.wouldRecommend = true;
//
//        Dish dish3 = new Dish();
//        dish3.costInCents = 300.25;
//        dish3.nameOfDish = "GoldFish";
//        dish3.wouldRecommend = true;

        Dish dish1 = new Dish("Golden Dragon", 5000.00,true);
        Dish dish2 = new Dish("Meow Meow fish", 1000.75, true);
        Dish dish3 = new Dish("GoldFish", 300.25,true);

//        System.out.println(dish1);

        dish1.printSummary();
        dish2.printSummary();
        dish3.printSummary();


        System.out.println(DishTools.shoutDishName(dish1));
        System.out.println(DishTools.analyzeDishCost(dish1));
        System.out.println(DishTools.flipRecommendation(dish3));
        dish3.printSummary();

        DishTools.hasHigherPrice(dish1, dish2);

    }
    /*
        * -- SHORT ASSIGNMENT #2 --

        * Create a class of static members (variables and methods) called DishTools
          - AVERAGE_COST_OF_DISH_IN_CENTS - an integer constant set to 1300
          - shoutDishName() - that takes in a Dish object and prints out the name in all caps
          - analyzeDishCost() - that takes in a Dish object and will print out either “More expensive than average” or “Less expensive than average”, depending on the value of the dish costInCents compared to AVERAGE_COST_OF_DISH_IN_CENTS
          - flipRecommendation() - that takes in a Dish object and reverses the wouldRecommend boolean value

        * Try out the DishTools methods with Dish objects in the DishTest main method
        * BONUS - add some static methods to the Dish class that compares two dishes in some way
        */


    /*
        * -- SHORT ASSIGNMENT #3 --

        * Refactor your Dish and DishTest classes...
            1) Change all properties in the Dish class to private visibility (printSummary should remain public)
            2) Add getters and setters for these properties (write them manually then erase them and use IntelliJ to write them quickly)
            3) Refactor code as needed in DishTest to access and modify dish object property values
            4) Add a constructor method to Dish that will assign all properties
            5) Refactor DishTest again to use the constructor to set all property values rather than setter methods
     */





}

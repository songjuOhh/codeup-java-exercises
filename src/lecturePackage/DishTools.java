package lecturePackage;

public class DishTools {

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

    public static final int AVERAGE_COST_OF_DISH_IN_CENTS = 1300;


    public static String shoutDishName(Dish dishObj){
        return dishObj.getNameOfDish().toUpperCase();
    }

    public static String analyzeDishCost(Dish dishObj){
        if(dishObj.getCostInCents() > AVERAGE_COST_OF_DISH_IN_CENTS){
            return dishObj +"is more expensive than average.";
        }else{
            return dishObj+"is less expensive than average.";
        }
    }

    public static boolean flipRecommendation(Dish dishObj){
        return !dishObj.isWouldRecommend();
    }

    public static void hasHigherPrice (Dish dishObj1, Dish dishObj2){
        double priceDiff;
        if(dishObj1.getCostInCents() > dishObj2.getCostInCents()){
            priceDiff = dishObj1.getCostInCents() - dishObj2.getCostInCents();
            System.out.printf("'%s' is more expansive than '%s' by %s", dishObj1.getNameOfDish(), dishObj2.getNameOfDish(), priceDiff );
        }else{
            priceDiff = dishObj2.getCostInCents() - dishObj1.getCostInCents();
            System.out.printf("'%s' is more expansive than '%s' by %s", dishObj2.getNameOfDish(), dishObj1.getNameOfDish(), priceDiff );
        }
    }








}

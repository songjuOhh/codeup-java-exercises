package lecturePackage;

public class DishTest {

    public static void main(String[] args) {


//        Dish dish1 = new Dish();
//        dish1.setCostInCents(30.50);
//        dish1.setNameOfDish("Golden Dragon");
//        dish1.setWouldRecommend(true);
//
//        System.out.println(dish1);
//
//        dish1.printSummary();

        Dish dish1 = new Dish("Golden Dragon", 5000.00,true);

        System.out.println( dish1.getNameOfDish());
        dish1.setNameOfDish("Silver Fish");
        System.out.println(dish1.getNameOfDish());


    }
}

package shapes;

public class ShapesTest {


    public static void main(String[] args) {

        Measurable myShape;

        myShape = new Rectangle(4,5);
        System.out.println( myShape.getArea());
        System.out.println( myShape.getPerimeter());

        myShape = new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

//        System.out.println(myShape.set);

//        Rectangle r = (Rectangle) myShape;


        /*
         * 9. Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?
          - because it violates the construction of rectangle.
         * 10. What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?
          - it will not work since get methods are already defined by the constructors
         */



//        Rectangle box1 = new Rectangle(4,5);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getParameter());
//
//
//        Rectangle box2 = new Square(5); // overwritten
//        System.out.println(box2.getArea());
//        System.out.println(box2.getParameter());
    }
}

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

package shapes;

public class Square extends Quadrilateral {

    public Square(double length) {
        super(length, length);
    }

    @Override
    public double getArea() {
        return length*length;
    }

    @Override
    public double getPerimeter() {
        return 4 * length;

    }

    public void setLength(int input) {
        length = input;
        setWidth(input);
    }

    public void setWidth(int input) {
       width = input;
       setLength(input);
    }


//    public Square(double side){
//        super(side, side);
//    }
//
//    public double getArea(){ // overwritten method
//        double area = length*length;
//        return area;
//    }
//
//    public double getParameter(){  // overwritten method
//        double parameter = 4 * length;
//        return parameter;
//    }
//
//    public static void main(String[] args) {
//
//    }
}

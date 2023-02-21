package shapes;

public class Square extends Quadrilateral {

    public Square(double length) {
        super(length, length);
    }

    @Override
    public double getArea() {
        double area = length*length;
        return area;
    }

    @Override
    public double getPerimeter() {
        double parameter = 4 * length;
        return parameter;
    }

    void setLength(int input) {
        length = input;
    }

    void setWidth(int input) {
       width = input;
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

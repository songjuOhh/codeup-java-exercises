package shapes;

import java.util.Scanner;

public class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle (int length, int width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        double area = length*width;
        return area;
    }

    @Override
    public double getPerimeter() {
        double parameter = 2*(length+width);
        return parameter;
    }

    void setLength(int input) {
        length = input;
    }

    void setWidth(int input) {
        width = input;
    }

//    double userInput;
//    protected double length;
//    protected double width;
//    String stringInput;
//
//    private Scanner sc;
//
//
//
//    public Rectangle(double width, double length) {
//        this.width = width;
//        this.length = length;
//
//    }
//
//
//
//    public double getArea(){
//
////        Scanner sc= new Scanner(System.in);
////
////        System.out.println("What is the length?");
////        length = Double.parseDouble(sc.nextLine());
////
////        System.out.println("What is the Width?");
////        width = Double.parseDouble(sc.nextLine());
//
//        double area = length * width;
//        return area;
//    }
//
//    public double getParameter (){
////        System.out.println("What is the length?");
////        length = Double.parseDouble(sc.nextLine());
////
////        System.out.println("What is the Width?");
////        width = Double.parseDouble(sc.nextLine());
//
//        double parameter = (2* length) + (2 * width);
//        return parameter;
//
//    }






}

package shapes;

abstract public class Quadrilateral extends Shape implements Measurable{

    protected double length;
    protected double width;


    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Quadrilateral(){
        super();
    }

    public double getArea(){ // overwritten method
        double area = length*length;
        return area;
    }

    public double getParameter(){  // overwritten method
        double parameter = 4 * length;
        return parameter;
    }

     public double getLength(){
        return length;
     };

    public double getWidth(){
        return width;
    };

    abstract void setLength(int input);
    abstract void setWidth(int input);

}

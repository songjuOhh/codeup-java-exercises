package shapes;

import java.util.Scanner;


public class Circle {

    double userInput;

    String stringInput;

    boolean booleanInput;

    private Scanner sc;

    public Circle() {
        sc= new Scanner(System.in);
    }


//    public Circle(double radius){
//        System.out.println("What is the radius?");
//        userInput = Double.parseDouble(sc.nextLine());
//
//        return userInput;
//
//    }


    public double getArea(){
        System.out.println("What is the radius?");
        userInput = Double.parseDouble(sc.nextLine());

        int r = (int) Math.round(userInput);

        System.out.println(r);

        for (int i = -r; i <= r; i++) { //*** by using '-', projected symmetrical shape using +/-
            for (int j = -2*r; j <= r*2; j++) {
                if (i*4/3 * i*4/3 + j/2 * j/2 <= r * r) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        double area = userInput * userInput * Math.PI;

        System.out.printf("The radius of your circle is: %.2f.\nThe area of your circle is: %.2f\n\n",userInput,area);
        return area;

    }


    public double getCircumference(){
        System.out.println("What is the radius?");
        userInput = Double.parseDouble(sc.nextLine());

        int r = (int) Math.round(userInput);


        System.out.println(r);



        for (int i = -r; i <= r; i++) { //*** by using '-', projected symmetrical shape using +/-
            for (int j = -2*r; j <= r*2; j++) {
                if (i*4/3 * i*4/3 + j/2 * j/2 <= r * r) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        double circumference = 2* userInput * Math.PI;
        System.out.printf("The radius of your circle is: %.2f.\nThe circumstances of your circle is: %.2f\n\n",userInput,circumference);

        return circumference;
    }

    public void yesNo(){
        boolean wantMore = true;
        int countCircle = 2;

        do {
            System.out.println("Do you want to continue? y / n");
            stringInput = sc.nextLine();
            if(stringInput.equalsIgnoreCase("y")){
                getArea();
                countCircle++;
                getCircumference();
                countCircle++;

            }else{
                System.out.printf("You have created %d circles today!", countCircle);
                System.out.println("Thank you. Have a good day!");
                break;
            }

        }while (wantMore);
    }

    public static void main(String[] args) {

        System.out.println(Math.PI);
        Circle circle = new Circle();
        circle.getArea();
        circle.getCircumference();
        circle.yesNo();

    }
}

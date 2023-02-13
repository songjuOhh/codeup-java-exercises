import java.util.Scanner;



public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

//        int x = 3;
//        int y = 2;
//        int times = x*y;


        int id;
        id = 123;
        System.out.println(id);
        double dbl = 170000000;
        float floatVal = 12f;
        System.out.println("[double] "+dbl+ " "+" [Float] "+floatVal);

        String hello= "Hello";
        boolean tr = true;
//        System.out.println(times);

        for (int i = 0; i<3;i++ ){
            System.out.println("hello");
            System.out.println(hello);
        }

        System.out.println();



// #1
        int myFavoriteNumber = 7;
        System.out.println(myFavoriteNumber);

// #2
        String myString = "Ossong";
        System.out.println(myString);
// #3
        myString = "Songggg";
        System.out.println(myString);
//        String myString = 3.14;


// #4
//        Long myNumber;
//        System.out.println(myNumber);  // will not work


// #5
//        Long myNumber;
//        myNumber = 3.14F;
//        System.out.println(myNumber);
//        // Will not work because Long does not take decimal, and you need to use Float.

// #6
        float myNumber;
        myNumber = 3.14F;
        System.out.println(myNumber);
        //Because Long does not take decimal, and you need to use Float.

// #7
//        myNumber = 123L;
//        System.out.println(myNumber);


// #8
//        myNumber = 123;
//        System.out.println(myNumber);
//        // works the same


//        int x = 5;
//        System.out.println("[x++] "+ x++);
//        System.out.println("[x] "+ x);

//        int y = 5;
//        System.out.println("[y] "+ ++y);
//        System.out.println("[y] "+ y);

        // ++will affect the following element. So ++x will stay the same, but it will affect it after

        String theNumberThree = "three";
        Object o = theNumberThree;
        System.out.println(o);
//        int three = (int) o;
//        int three = (int) "three";

        // this won't work since it has string data and trying to declare it as int

//        int x = 4;
//        x = x + 5;
//        System.out.println(x);  // returns 9

//        int x = 3;
//        int y = 4;
//        y = y * x;
//        System.out.println(y);  // returns 12


        int x = 10;
        int y = 2;
        x = x / y;  // returns 5;
        System.out.println(x);
        y = y - x;  // returns -3
        System.out.println(y);


        //What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold?
        // What happens if you increment a numeric variable past the type's capacity?

        System.out.println(Integer.MAX_VALUE);
        long longNum;
        longNum = 2147483648L;
        int overMax = (int) longNum;
        System.out.println(overMax);

        //It will start from the smallest number of the data: -2147483648
        // max of Int = 2147483647 && min of Int = -2147483648


























    }

}

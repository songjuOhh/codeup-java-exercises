package lecturePackage;

public class MethodLecture {

    static int count=0;


    static void p(){
        count++;
        if(count<=5){
            System.out.println("hello "+count);
            p();
        }
    }

    static int factorial(int n){
        if (n == 1)
            return 1;
        else
            return(n * factorial(n-1));
    }


    static int n1=0,n2=1,n3=0;
    static void printFibo(int count){
        if(count>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            printFibo(count-1);
        }
    }

    public static void main(String[] args) {
        sayHello("Songju");
        printZenith();
        addValue(1,2);
        repeatStr("Hello",5);
        sayHello(3);
        sayHi("Songju");


        p();


        System.out.println("Factorial of 5 is: "+factorial(5));

        int count=15;
        System.out.print(n1+" "+n2);//printing 0 and 1
        printFibo(count-2);//n-2 because 2 numbers are already printed

    }

    public static void printZenith(){
        System.out.println("from Zenith");
    }

    public static String sayHello(String name) {
        System.out.println(String.format("Hello, %s!", name));
        return String.format("Hello, %s!", name);

    }

    public static int addValue (int intOne, int intTwo){
        int added = intOne+intTwo;
        System.out.printf("added number of %s and %s is %s!", intOne,intTwo,added);
        return added;
    }

    public static String repeatStr (String str, int times){
        String repeated ="";
        for(int i =0; i<times; i++){
            System.out.print(str);
            repeated += str;
        }
        return repeated;
    }

    public static void sayHello (){
        System.out.println("Hello, World!");
    }

    public static void sayHello (int num){
        for(int i=0; i<num; i++){
            sayHello();
        }
    }


// TODO: create a method, sayName, that can take in a single name String input or two name String inputs and will return
//  a greeting message to the user by either their first or first and last name.

// example: sayName("Justin") - "Hi Justin"
// example: sayName("Justin", "Reich") - "Hi Justin Reich"

    public static void sayHi(String name){
        System.out.printf("Hi, %s",name);
    }

    public static void sayHi(String first, String last){
        System.out.printf("Hi, %s %s",first,last );
    }


// TODO: overload the math exercises from the curriculum exercise to work with both integers and doubles

    public static int add(int num1, int num2) {
        System.out.println(num1 + num2);
        return num1 + num2;

    }

    public static double add(double num1, double num2) {
        System.out.println(num1 + num2);
        return num1 + num2;
    }












    }
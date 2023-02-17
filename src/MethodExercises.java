import java.util.Scanner;


public class MethodExercises {

    Scanner sc = new Scanner(System.in);



    static int multiply(int x, int y){

        if(y ==0){
            return 0;
        }else if(y==1){
            return x;
        }else{
            return x+multiply(x,y-1);
        }
    }



    /* Java factorial program with recursion. */
    // factorial #1
    public static long factorialProgram(long n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorialProgram(n - 1);
        }
    }

    // factorial #2
    static int fact(int n)
    {
        if (n == 1)
            // base condition
            return 1;
        else
            return n*fact(n-1);
    }



    static int showNum (int n){
        return n;
    }




    public static void main(String[] args) {

        Addition(1,3);
        Subtraction(2,1);
        Multiplication(3,2);
        Division(4,2);
        modulus(24,19);
        multipleWithoutTimes(2,4);

        // multiplication w recursion
        System.out.println("[Recursion multiply] "+multiply(3,2));
//        validInput();

//        System.out.println( getInteger(1));


//        long nFactoriral = factorialProgram(10);
//        System.out.println("[Recursion factorial v1] "+ nFactoriral);
//
//        int result = fact(10);
//        System.out.println("[Recursion factorial v2] = " + result);

        System.out.println(getFactorial(getInteger(1,10)));





    }

    public static int Addition(int x, int y){
        int added = x+y;
        System.out.println(added);
        return added;
    }

    public static int Subtraction(int x, int y){
        int subtracted = x-y;
        System.out.println(subtracted);
        return subtracted;
    }

    public static int Multiplication(int x, int y){
        int multiplied = x*y;
        System.out.println(multiplied);
        return multiplied;
    }

    public static int Division(int x, int y){
        int divided = x/y;
        System.out.println(divided);
        return divided;
    }

    public static int modulus(int x, int y){
        int mod = x%y;
        System.out.println(mod);
        return mod;
    }

    public static int multipleWithoutTimes(int x, int y){
        int added = 0;
        for(int i =0; i<y; i++){
            added +=x;
        }
        System.out.println(added);
        return added;
    }

    public static int recursion(int x, int y){
        int added = 0;
        for(int i =0; i<y; i++){
            added +=x;
        }
        System.out.println(added);
        return added;
    }





    public static int validInput(){
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your minimum?");
        int minimum = sc.nextInt();

        System.out.println("What is your maximum?");
        int maximum = sc.nextInt();

        System.out.printf("Enter a number between %s and %s: ", minimum, maximum);
        int input = sc.nextInt();
        boolean isValid = true;
        do {
            if(input>=minimum && input<=maximum){
                System.out.println(input);
                break;
            }else{
                System.out.println("Your number is not valid.");
            }
        }while (isValid);
        return input;
    }


    // #2
    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        System.out.print("[Recursion getInteger] Enter a number between 1 and 10: ");
        int userInput = sc.nextInt();

        if(userInput > max || userInput < min){
            return getInteger(min, max);
        }
        return  userInput;
    }



    // #3
    public static long getFactorial (long userInput){

        if(userInput ==0){
            return 1;
        }else{
            return  userInput * getFactorial(userInput-1);
        }
    }










    // #4
    static double rollDice (int dice){
        double firstAttempt = Math.floor( Math.random()*dice)+1;
        System.out.println(firstAttempt);
        return firstAttempt;
    }
    public static void askDice (){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter number of side for your dice.");
        int diceSide = Integer.parseInt(sc.nextLine());

        boolean rollAgain = true;
        do {
            int firstAttempt = (int) rollDice(diceSide);
            System.out.println("Your 1st result is: " +firstAttempt);
            System.out.println("Do you want to roll again? y / n");
            String answer = sc.nextLine();
            if(answer.equalsIgnoreCase("y")){
                rollAgain = true;
            }else{
                break;
            }
        }while(rollAgain);
        do {
            int secondAttempt = (int) rollDice(diceSide);
            System.out.println("Your 2nd result is: " +secondAttempt);
            System.out.println("Do you want to roll again? y / n");
            String answer2 = sc.nextLine();
            if(answer2.equalsIgnoreCase("y")){
                rollAgain = true;
            }else{
                break;
            }
        }while (rollAgain);

    }











}

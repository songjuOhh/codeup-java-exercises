package util;
import java.util.Scanner;


public class Input {

    public String stringInput;

    public boolean booleanInput;

    public int integerInput;
    public double doubleInput;



    private Scanner scanner;
//    public Input(){
//        scanner = new Scanner(System.in);
//    }


    public String getString(){
        System.out.println("Please enter something.");

        stringInput = scanner.nextLine();
        return stringInput;
    }

//    public boolean isNumber (){
//        if (sc.hasNextInt()){
//            return true;
//        }else{
//            return false;
//        }
//    }


    public boolean yesNo(){
        System.out.println("Please enter yes or no / y or n");

        stringInput = scanner.nextLine();
//        getString();
        if(stringInput.equalsIgnoreCase("y") || stringInput.equalsIgnoreCase("yes")){
            return booleanInput = true;
        }else{
            return booleanInput = false;
        }
    }

//    public Input(int min, int max){
//        this.min = min;
//        this.max = max;
//    }

    public int getInt(int min,int max){
//        boolean validInput = true;

//        System.out.println("Please enter a minimum number");
//        int userMinimum = Integer.parseInt( scanner.nextLine());
//        System.out.println("Please enter a maximum number");
//        int userMaximum = Integer.parseInt( scanner.nextLine());
//
//        System.out.printf("Your minimum is %s, and maximum is %s", userMaximum, userMinimum);

        System.out.printf("Enter a number between %d and %d \n", min, max);


        integerInput = Integer.parseInt( scanner.nextLine());


        if (min > integerInput || max< integerInput){
            return getInt(min, max);
        }else{
            return integerInput;
        }
    }


    public int getInt(){
        integerInput = Integer.parseInt( scanner.nextLine());
        return integerInput;
    }


    public double getDouble(double min,double max){

        System.out.printf("Enter a number between %d and %d\n", min, max);

        doubleInput = Integer.parseInt( scanner.nextLine());

        if (min > doubleInput || max< doubleInput){
            getDouble(min, max);
        }
        return doubleInput;
    }

    public double getDouble(){
        doubleInput = Double.parseDouble( scanner.nextLine());
        return integerInput;
    }


    public static void main(String[] args) {

    }
}

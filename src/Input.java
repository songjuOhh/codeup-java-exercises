import java.util.Scanner;


public class Input {


    public int getInt(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPlease enter integer value:");
        String userInput = sc.nextLine();
        int userInputInt = 0;

        try {
            userInputInt = Integer.valueOf(userInput);
            System.out.printf("You have entered: %s, and it looks like an integer.\n", userInputInt);

        }catch (NumberFormatException ne){
            userInputInt = -1;
            System.out.println("Uh oh, " + ne.getMessage() + " is not an integer...");

        }catch (Exception e){
            userInputInt = -1;
            System.out.println("Hmm... "+e.getMessage());
        }
        System.out.println("Here is your final output: "+userInputInt);
        return userInputInt;
    }

    public double getDouble(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPlease enter double value:");
        String userInput = sc.nextLine();
        Double userInputDbl;
        try {
            userInputDbl = Double.valueOf(userInput);
            System.out.printf("You have entered: %s, and it looks like a double.\n", userInputDbl);

        }catch (NumberFormatException ne){
            userInputDbl = -1.;
            System.out.println("Uh oh, " + ne.getMessage() + " is not a double...");

        }catch (Exception e){
            userInputDbl = -1.;
            System.out.println("Hmm... "+e.getMessage());
        }
        System.out.println("Here is your final output: "+userInputDbl);
        return userInputDbl;

    }


    public int getBinary(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPlease enter a binary number:");
        String userInput = sc.nextLine();
        int userInputInt = 0;

        try {
            userInputInt = Integer.valueOf(userInput,1);
            System.out.printf("You have entered: %s, and it looks like an integer.\n", userInputInt);

        }catch (NumberFormatException ne){
            userInputInt = -1;
            System.out.println("Uh oh, " + ne.getMessage() + " is not an integer...");

        }catch (Exception e){
            userInputInt = -1;
            System.out.println("Hmm... "+e.getMessage());
        }
        System.out.println("Here is your final output: "+userInputInt);
        return userInputInt;
    }



    public static void main(String[] args) {
        Input input = new Input();
        input.getInt();
        input.getDouble();
    }
}

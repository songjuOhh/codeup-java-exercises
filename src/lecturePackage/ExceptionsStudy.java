package lecturePackage;

import java.util.Scanner;

public class ExceptionsStudy {

    String mightBeAnInt = "10000";
    String sayHello = "Hello my name is Songju";

    public void askForAnInteger(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        String userInput = sc.nextLine();
        try{
            int userInputInteger = Integer.parseInt(userInput);
            System.out.printf("Your input number is: %s\n",userInputInteger);
        }catch (NumberFormatException e){
            System.out.println("Uh oh, " + e.getMessage() + " is not an integer...");
//        }catch (IndexOutOfBoundsException) {
//            System.out.println("hmm.. well it is just wrong...");
        }catch (Exception e){
            System.out.println("hmm.. well it is just wrong...");
        }finally {

        }
    }

    /*
    * Mini-exercise:
    * Investigate the substring method for String objects in the Java API.
    * Find out what kind of exception it throws. Create a test class with a main method.
    * Set up a try-catch block that defines a string and finds its length.
    * Once you have the length of your string, modify your program so it creates a substring from your original string,
    * but give it an index that doesn't exist so you get the error message.

    */

}

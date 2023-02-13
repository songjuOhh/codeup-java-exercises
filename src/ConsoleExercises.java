import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {



//        String name = "codeup";
//        System.out.printf("Hello there, %s. Nice to see you.%n", name);


//        String greeting = "Salutations";
//        String name = "codeup";
//        System.out.printf("%s, %s!", greeting, name);

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter something: ");
//        String userInput = scanner.next();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

//        int currencyPennis =1000;
//        System.out.printf("I'll sell you seamp land for $%d an acre!", currencyPennis / 100);


//        // #1
        double pi = 3.14159;
        String msg = String.valueOf( System.out.format("The value of pi is approximately %.2f.", pi));
        System.out.println(msg);
//        System.out.printf( "The value of pi is approximately %s.", pi);
//        System.out.format("The value of pi is approximately %.2f.", pi);


//
//
//        // #1
        Scanner sc = new Scanner(System.in);
//        sc.nextLine();
//
//        System.out.println("Please enter a number: ");
//        int userNum = sc.nextInt();
//        System.out.println("You have entered: "+userNum); //runs an error if the input is not a numb
//
//
//        sc.nextLine();
//
//        System.out.println("Enter Age: ");
//        String ageString = sc.nextLine();
//        System.out.println("You are "+Integer.parseInt(ageString)+" years old");
//
//        // #2
//        sc.nextLine();
//
        System.out.println("1. Enter three words: ");
        String userInput1 = sc.next();

        String userInput2 = sc.next();

        String userInput3 = sc.next()+".";

        String combined = userInput1 + " " + userInput2 + " " + userInput3;
//        System.out.println(combined);
        System.out.printf("You entered: %s\n %s\n %s.", userInput1,userInput2,userInput3);
        // #3
        // If you enter less than 3 words: It will wait until the third one
        // If you enter more than 3 words: It will cause error

//        sc.nextLine();
//
//
//
//        // #3
//        sc.nextLine();
//        System.out.println("Please enter a sentence :");
////        String userSentence = sc.next(); // return only the first letter
//
//
//        String userSentence = sc.nextLine(); // return the entire input
//        System.out.println("Did you just say '" + userSentence +"'?" );
//
//        sc.nextLine();
        // #1


//        System.out.println("What is the 'length' of your classroom?");
//        String lengthInput = sc.nextLine();
//        int length = Integer.parseInt(lengthInput);
//
//        System.out.println("What is the 'width' of your classroom?");
//        String widthInput = sc.nextLine();
//        int width = Integer.parseInt(widthInput);
//
//        System.out.println("What is the 'height' of your classroom?");
//        String heightInput = sc.nextLine();
//        int height = Integer.parseInt(heightInput);

        sc.useDelimiter("\n");  // Decides how is it going to take the inputs


//        System.out.println("What is the 'length' of your classroom?");
//        float length = sc.nextFloat();
//
//        System.out.println("What is the 'width' of your classroom?");
//        float width = sc.nextFloat();
//
//        System.out.println("What is the 'height' of your classroom?");
//        float height = sc.nextFloat();


        System.out.println("What is the 'length' of your classroom?");
        double length = Double.parseDouble(sc.next());

        System.out.println("What is the 'width' of your classroom?");
        double width = Double.parseDouble(sc.next());

        System.out.println("What is the 'height' of your classroom?");
        double height = Double.parseDouble(sc.next());

        double area = length * width;
        // #2
        double parameter = (length+width)*2;
        // # Bonus
        double volume = area * height;
        System.out.printf("Your classroom's %n 'length' is: %sm,%n 'width' is %sm, and %n 'height' os %sm. %nYour room's %n[area] is %.2f%n[parameter] is: %.2f, and %n[volume] is %.2f", length , width, height, area, parameter, volume);



        /*
        * Try to utilize nextLine as much as you can! -> You can avoid most skipping problem
        */






    }
}
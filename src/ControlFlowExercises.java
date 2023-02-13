import java.util.Scanner;


public class ControlFlowExercises {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // #1 a.
//        int i = 5;
//        while(i<=15){
//
//            System.out.print(i + " ");
//            i++;
//        }


        // #1 b.
//        long y = 100;
//        do {
//            System.out.println(y);
//            y -=5;
//        }while (y>=-10);


//        long y = 2;
//        do {
//            System.out.println(y);
//
//            y *= y;
//        }while (y<100000);


//        long y = 2;
//        do {
//            System.out.println(y);
//            y = (long) Math.pow(y,2);  // (int) will still work
//        }while (y<1e6);
//
        // #1 c.
//
//        int i;
//        for (i=5; i<=15; i++){
//
//            System.out.print(i +" ");
//
//        }

//        int x;
//        for ( long x=2; x<=10000000;x *=x ){
//            System.out.println(x);
//        }


//        // #2
//        int i;
//        for(i=1; i<=100; i++){
//
//            if(i%3 == 0 && i%5 ==0){
//                System.out.println("FizzBuzz");
//            }else if(i%5 ==0){
//                System.out.println("Buzz");
//            }else if(i%3 == 0 ){
//                System.out.println("Fizz");
//            }else{
//                System.out.println(i);
//            }
//        }




//        // #3
//        boolean willContinue = false;
//        do {
//            System.out.println("What number would you like to go up to?");
//            int userNum = sc.nextInt();
//
//            int i;
//            System.out.println("Here is your Table!");
//
//            System.out.println("number | squared | cubed");
//            System.out.println("------   -------   ------");
////        System.out.println("1        1        1      ");
//
//
//            for (i=1; i<userNum; i++){
//                int incre =i;
//                int squared = (int)Math.pow(i,2);
//                int cubed = (int)Math.pow(i,3);
//
//                System.out.printf("%-6d | %-7d | %-5d",incre,squared,cubed);
//                System.out.println("");
//            }
//
//            System.out.println("Do you want to continue? (y/n)");
//            String userAnswer = sc.next();
//            if(userAnswer.equalsIgnoreCase("y")){
//                willContinue= true;
//            }else{
//                willContinue= false;
//            }
//        }while (willContinue);

//
//
//
//        // #4
//        boolean anotherGrade = false;
//        do {
//            System.out.println("Please enter your grade (between 0 - 100)");
//            int gradeInput= sc.nextInt();
//
//            if(gradeInput > 100 || gradeInput<0){
//                System.out.println("Invalid Input");
//            } else if(gradeInput<60){
//                System.out.println("Your grade is: F");
//            } else if(gradeInput<67){
//                System.out.println("Your grade is: D");
//            } else if(gradeInput<78){
//                System.out.println("Your grade is: C");
//            } else if(gradeInput<80){
//                System.out.println("Your grade is: C+");
//            } else if(gradeInput<88){
//                System.out.println("Your grade is: B");
//            } else if(gradeInput<90){
//                System.out.println("Your grade is: B+");
//            } else if(gradeInput<99){
//                System.out.println("Your grade is: A");
//            }else{
//                System.out.println("Your grade is: A+");
//            }
//
//            System.out.println("Do you wish to see other grade? y/n");
//            String answer = sc.next();
//            if (answer.equalsIgnoreCase("y")){
//                anotherGrade = true;
//            }else{
//                anotherGrade = false;
//            }
//        }while (anotherGrade);





/* * # Console IO Exercises

* 1. Prompt the user to enter a favorite quote
    - output the quote
    - ask them to enter how many words are in the quote
    - output the number they entered
    - output if the number they entered indeed matched the number of words
*/

        // #1
//        System.out.println("What is your favorite quote?");
//        String quoteInput = sc.nextLine();
//        System.out.println(quoteInput);
//        String[] splitString = quoteInput.split(" ");
//
//        System.out.println("How many words are in the quote?");
//
//        int quoteCount = sc.nextInt();
//        System.out.println(quoteCount);
//
//        int countLength = splitString.length;
//        System.out.println(countLength);
//
//        if(quoteCount == countLength){
//            System.out.println("You are correct!");
//        }else{
//            System.out.println("Not quite sure if that is correct.");
//        }


        /*
* 2. Prompt the user to enter a list of top three favorite foods separated by only spaces

    - Use the printf() to output the three top foods with the format:
        1. FirstFood
        2. SecondFood
        3. ThirdFood
*/
//        sc.useDelimiter(" ");

//        System.out.println("What is your top3 fruits?");
//
//        String fruit1 = sc.next();
//        String fruit2 = sc.next();
//        String fruit3 = sc.next();
//
//
//        System.out.printf("%s%n %s%n %s%n", fruit1, fruit2, fruit3);

        /*
* 3. Prompt the user to enter a grocery list of three items
    - each item should only be separated by a comma (no spaces)
    - you will need to use the .useDelimiter() method on your scanner object
    - output the result as a comma-separated list using printf()
*/

//        sc.useDelimiter(",");
//
//        System.out.println("Please enter a grocery list of three items");
//        String groceries1 = sc.next();
//        String groceries2 = sc.next();
//        String groceries3 = sc.next();
//
//        System.out.printf("Your groceries items are: %s, %s, %s.", groceries1, groceries2, groceries3);



/*
* # Java Control Structures and Loops Bonuses

### Simple Chat Bot

Be creative in communicating with your
 user different options and for given scenerios. Create at three phases of the chat, for example...

			                 "How are you?" (AI says)
			           |                              |
			         good                        bad (user types)

	   "Awesome! Are you super happy?" 	    "Will cake make you better?"

	          yes          no                     yes             no

Keep the chat options relatively simple and plan it out clearly before coding it.
*/
        boolean wantContinue = false;
//        do {
//            System.out.println("How are you? (good / bad)");
//            String answer1 = sc.next();
//            System.out.println(answer1);
//            if (answer1.equalsIgnoreCase("good")) {
//                System.out.println("Awesome! Are you super happy? (yes / no)");
//                String answer2 = sc.next();
//
//                if (answer2.equalsIgnoreCase("yes")) {
//                    System.out.println("Greattt!!!");
//                } else {
//                    System.out.println("Yeees you areee~");
//                }
//
//            } else if (answer1.equalsIgnoreCase("no")) {
//                System.out.println("Will cake make you better? (yes / no)");
//                String answer2 = sc.next();
//                if (answer2.equalsIgnoreCase("yes")) {
//                    System.out.println("What do you want to do??");
//                } else {
//                    System.out.println("There should be a way thooo!");
//                }
//            }
//
//            System.out.println("Anything else? yes / no");
//            String answer0 = sc.next();
//            if(answer0.equalsIgnoreCase("yes")){
//                wantContinue = true;
//            }else{
//                wantContinue = false;
//            }
//
//        }while (wantContinue);



/*
### Word Guessing Game

- prompt a player to enter a word
- use a loop to print out several empty lines to hide the answer
- allow the user to guess the letters in the word
- track the number of letter guesses
- display to the user the partially completed word for each correctly guessed character
- before prompting the user to guess a letter, give them the option to solve the word
- limit the number of guesses based on the length of the word for an extra challenge!
*/

        do {
            String temp= "";

            System.out.println("Please enter a word!");
            String answer = sc.next();

            String[] letterCount = answer.split("");
            System.out.println(letterCount);

            boolean guessingLoop = true;
            do{
                System.out.println("Please guess!");
                String userGuess = sc.next();
                String[] userGuessArray = userGuess.split("");
                String correctLetter = "";
                byte correctCount = 0;
                for(int i =0; i<userGuessArray.length; i++){
//                    System.out.println(userGuessArray[i]);
//                    System.out.println(answer.charAt(i));


                    if (answer.contains(userGuessArray[i])) {
//                        System.out.println(userGuessArray[i]);
//                        correctLetter++;
                        correctLetter += userGuessArray[i];
                        correctCount ++;

                    }else{
                        System.out.println("Your answer did not match! Try other guess");
                    }
                }
                System.out.println("You guessed "+correctCount+" right. " +"Correct letters are: "+ correctLetter);


                if (userGuess.equalsIgnoreCase(answer)){
                    System.out.println("You are correct!");
                    break;
                }
            }while(guessingLoop);



            System.out.println("Do you want to continue? yes / no");
            String answer0 = sc.next();
            if(answer0.equalsIgnoreCase("yes")){
                wantContinue = true;
            }else{
                wantContinue = false;
            }
        }while (wantContinue);



    }
}

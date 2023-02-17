import java.util.Scanner;


public class HighLow {

    static double generateRandom (){
        double randomNum = Math.floor( Math.random()*100)+1;
//        System.out.println(randomNum);
        return randomNum;
    }

    public static void main(String[] args) {
        highLow();
    }


    public static void highLow(){
        Scanner sc = new Scanner(System.in);


        System.out.println("\n[[ Lets start High-Low Game! ]]\n");
        int randomNum =(int) generateRandom();
        int guessCount = 10;
        System.out.println("You have 10 chances.");



        boolean guessAgain= true;
        do {
            System.out.println("Please guess the number!");
            int userGuess = Integer.parseInt(sc.nextLine());
//            System.out.println("Your guessed number is: "+userGuess);

            if(guessCount == 0){
                System.out.println("You have used all of your chance...");
                System.out.println("Do you wanna play again? y /n");
                String playAgain = sc.nextLine();
                if (playAgain.equalsIgnoreCase("y")){
                    highLow();
                }else {
                    break;
                }
            }else if(userGuess > randomNum){
                System.out.println("\"Lower\"");
                guessAgain = true;
                guessCount--;
                System.out.printf("You have %s chances left \n", guessCount);
            }else if(userGuess< randomNum){
                System.out.println("\"Higher\"");
                guessAgain =true;
                guessCount--;
                System.out.printf("You have %s chances left", guessCount);

            } else{
                System.out.println("You got it right!!! Good Guess");
                System.out.printf("You have guessed %s times. \n", 10-guessCount+1);
                System.out.println("Do you wanna play again? y /n");
                String playAgain = sc.nextLine();
                if (playAgain.equalsIgnoreCase("y")){
                    highLow();
                }else{
                    break;
                }
            }
        }while (guessAgain);

    }



}
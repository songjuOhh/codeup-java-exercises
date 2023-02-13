import java.util.Scanner;


public class Bob {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Say something to our friend, Bob");
        boolean wantContinue = true;
        do {
            String userQuestion = sc.nextLine();
            if (userQuestion.endsWith("?")){
                System.out.println("Bob said: \"Sure.\"");
            }else if(userQuestion.endsWith("!")){
                System.out.println("Bob said: \"Whoa, chill out!\"");
            }else if(userQuestion.isEmpty()== true){
                System.out.println("Bob said: \"Fine. Be that way!\"");
            }else if(userQuestion.equalsIgnoreCase("bye")){
                break;
            }else{
                System.out.println("Bob said: \"Whatever.\"");
            }

        }while (wantContinue);



    }
}

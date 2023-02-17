package movies;

import util.Input;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Movie {

    private String name;
    private String category;

    private Scanner sc;

    public Movie[] newArray;

    Input input = new Input();

    MoviesApplication movieApp = new MoviesApplication();






//    public Movie(){
//        sc = new Scanner(System.in);
//    }


    public Movie (){

    }



    @Override
    public String toString() {
        return "\n\n--------[Movie]--------\n" +
                "[name] " + name +
                "\n[category] " + category + "\n";
    }

    public Movie(String name, String category){
        this.name= name;
        this.category=category;
    }

    public String getName(){
        return name;
    }

    public String getCategory(){
        return category;
    }

    public void getMovieData (Movie[] array){
        Movie [] movieArray = Arrays.copyOf(array, array.length);


            System.out.println(movieArray);
        }


//    public void getMoviesByCategories (Movie[] array){
//        Movie [] movieArray = new Movie[0];
//
//        System.out.println("Please enter categories that you want.");
//        Scanner sc = new Scanner(System.in);
//        String userInput = sc.nextLine();
//
//        for(int i=0; i<array.length; i++) {
//            if (array[i].category.equalsIgnoreCase(userInput.toLowerCase())) {
//                movieArray = Arrays.copyOf(movieArray, movieArray.length +1 );
////                movieArray = new Movie[movieArray.length + 1];
//                movieArray[movieArray.length - 1] = array[i];
////                System.out.println("*** above is from 'getMoviesByCategories'***");
////                System.out.println(movieArray[movieArray.length - 1].getName());
//            }
//        }
//        System.out.println(Arrays.toString( movieArray));
//    }

    public void wishContinue(){
        boolean wantMore = true;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Do you want to continue? y / n");

            String userAnswer = sc.nextLine();

            if (userAnswer.equalsIgnoreCase("y")) {
                break;
            }else{
            }

        }while (wantMore);
    }

    public void getMoviesByCategories (Movie[] array){
        Movie [] movieArray = new Movie[0];
        Scanner sc = new Scanner(System.in);

        boolean wantContinue = true;
        do {
            System.out.println(
                    "What would you like to do?\n" +
                            "\n" +
                            "0 - exit\n" +
                            "1 - view all movies\n" +
                            "2 - view movies in the animated category\n" +
                            "3 - view movies in the drama category\n" +
                            "4 - view movies in the horror category\n" +
                            "5 - view movies in the scifi category\n\n" +
                            "Enter your choice:");

            int userAnswer = Integer.parseInt(sc.nextLine());
            String inputToCategories = "";
            if (userAnswer == 0) {
                wantContinue = false;
            }else if(userAnswer ==1){
                for (int i = 0; i < array.length; i++) {
                        movieArray = Arrays.copyOf(movieArray, movieArray.length + 1);
                        movieArray[movieArray.length - 1] = array[i];
                }
                System.out.println(Arrays.toString(movieArray));

                System.out.println("\nDo you want to continue? y / n");
                String userInput = sc.nextLine();
                if (userInput.equalsIgnoreCase("y")) {
                    break;
                }else{
                    wantContinue = true;
                }

            } else if (userAnswer == 2) {
                inputToCategories = "animated";
            } else if (userAnswer == 3) {
                inputToCategories = "drama";
            } else if (userAnswer == 4) {
                inputToCategories = "horror";
            } else if (userAnswer == 5) {
                inputToCategories = "scifi";
            }


            for (int i = 0; i < array.length; i++) {
                if (array[i].category.equalsIgnoreCase(inputToCategories)) {
                    movieArray = Arrays.copyOf(movieArray, movieArray.length + 1);
//                movieArray = new Movie[movieArray.length + 1];
                    movieArray[movieArray.length - 1] = array[i];
//                System.out.println("*** above is from 'getMoviesByCategories'***");
//                System.out.println(movieArray[movieArray.length - 1].getName());
                }
            }
            System.out.println(Arrays.toString(movieArray));


            System.out.println("\nDo you want to continue? y / n");
            String userInput = sc.nextLine();
            if (userInput.equalsIgnoreCase("y")) {
                wantContinue = true;
                ;
            }else{
                wantContinue = false;
            }
        }while (wantContinue);
    }
}

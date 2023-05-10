package lecturePackage;

public class ExceptionsStudyTest {

    public static void main(String[] args) {
        /*
         * Mini-exercise: Investigate the substring method for String objects in the Java API.

         * Find out what kind of exception it throws. Create a test class with a main method.
         * Set up a try-catch block that defines a string and finds its length.
         * Once you have the length of your string, modify your program so it creates a substring from your original string,
         * but give it an index that doesn't exist so you get the error message.

         * Optional: play with the .getMessage and .printStackTrace methods.

         * Optional: what are some other ways you can get the same exception? Try to set up your program so as to produce and catch these exceptions.
        */

//        try {
//            ExceptionsStudy study = new ExceptionsStudy();
//            System.out.println(Integer.parseInt(study.notAnInt));
//
//
//        } catch (NumberFormatException nfx){
//            System.out.println("Got an exception: "+nfx.getMessage());
//            nfx.printStackTrace();
//        }
//        System.out.println("Check me out!");

        ExceptionsStudy study = new ExceptionsStudy();

        try {
//            System.out.println(Integer.parseInt(study.notAnInt));
            System.out.println(study.sayHello.length());
            System.out.print("The extracted substring is : ");
            System.out.println(study.sayHello.substring(40));

        } catch (Exception e){
            System.out.println("\nGot an exception: "+e.getMessage());
//            e.printStackTrace();   //This will still print red error message
        }
        System.out.println("Check me out!");


        study.askForAnInteger();


    }
}

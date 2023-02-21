package abstractLecture;

abstract public class Media {

    protected String bookTitle;
    protected int recordCount;
    protected boolean signed;

    public Media(String bookTitle, int recordCount, boolean signed){
        this.bookTitle = bookTitle;
        this.recordCount = recordCount;
        this.signed = signed;
    }

    public Media() {
    }

    abstract public void findBooks();
    abstract public void deleteRecord();
    abstract public void signature();

    public void sleep() {
        System.out.println("Zzz");
    }



    /*
    * ================================= ABSTRACT CLASS MINI-EXERCISE

        * -- PART 1
        Consider a library. In the library, there are various forms of media accessible to the public. A patron of a library can access
        newspapers, books, microfiche, magazines, records, cds, etc.

        * Create a Media abstract class
          - Identify at least one process that can be done the same way for each form of media. Add a public
          void instance method named after this thing and give it a message to print simply print out generally describing this process.

          - Identify at least one process that be done for each form of media but requires a unique approach / implementation for each specific
          sub-type of media. Create an abstract method that defines method signiture for this process but does not include the method body.

        * Extend from Media with one of the above listed sub-types of media
          Include an implementation (method body) of the abstract method created in the Media class

        * BONUS: identify and add another abstract method to the Media class and extend the Media class in additional sub-types

     */













     /*


    * ================================= ABSTRACT CLASS MINI-EXERCISE

         -- PART 2
        Car
          on()
          off()
          moveForward(int distanceInMeters)
          getCurrentLatLng()
          demolish()
        Plane
          on()
          off()
          getCurrentLatLng()
          demolish()
        Bicycle
          getCurrentLatLng()
          demolish()
        What methods make the most sense to include in a PowerControllable interface?
        What methods make the most sense to include in an abstract Vehicle class?
        What class(s) should implement the PowerControllable interface?
        What methods in the abstract class should be abstract? What methods are general to all sub-types?
             */


}

package lecturePackage;

public class OOPLecture {

    /*
    * ================================= THINKING OOP
    Consider the following steps to create a peanut butter and jelly sandwich...
    1. Get peanut butter jar and jelly jar and bread bag from the pantry and set them on the table
    2. Get plate and two knifes and from kitchen cabinets and set them on the table
    3. Open the peanut butter and jelly jars and the bread bag
    4. Put two slices of bread next to one another on the plate
    5. Use one knife to extract peanut butter and spread evenly on one slice of bread
    6. Use other knife to extract and spread jelly evenly to other slice of bread
    7. Join two slices of bread to each other with with spread sides of bread touching
    8. Close the peanut butter and jelly jars and bread bag
    9. Put knifes in kitchen sink
    10. Put away peanut butter and jelly jars and bread bag in the pantry
    11. Eat the sandwich
    -- List all unique nouns (things) involved in these steps
    * peanut butter (jar, lid, content), jelly (jar, lid, content), bread bag, bread slices, plate, knives, kitchen sink, table, pantry, mouth

    -- List the categories of nouns / groups of things from these steps
    * food / utensil / location / body
    -- Consider the Peanut Butter Jar:
      - list all characteristics / types of relevant data concerning the peanut butter jar
      * peanut / organic / additives / container-material /// chunky / smooth / powder / almond /


    * If you try to assign a String value to a variable of type int, which of the following is true?

    The program will not compile. - Answer

    The variable changes type to become a String.

    The String is parsed to see if it represents an int. If it does, this value is used. Otherwise an error is thrown.


    * What happens if you add an int to a String?

    The program will not compile.

    The string representation of the int will be concatenated to the string. - Answer

    The string will be parsed to see if it represents an int. If so, the sum will be returned. Otherwise, an error will be thrown.
        */





    /* *
    * ================================= OOP PRE-LECTURE RESEARCH QUESTIONS

        * What is the difference between static and instance methods/variables?

        * Instance :
                declared in a class, but outside a method, constructor or any block. Holds value that must be referenced by more than one method
                shared by all instances of the class, meaning that static fields should not be anything that is supposed to be unique to instances of the class.
                Instead, they should contain information that all instances will use, or methods and fields that are meant to be accessed only statically.

        * Static :
                belongs to a class as a whole.
                accessible through the class itself === they are accessible WITHOUT creating an instance of the class
                declared with static keyword in a class. There is one copy of each variable per class.

                *** Static fields can be referenced by instance methods. But instance fields cannot be referenced in a static context.


        * What is an instance and what is instantiation?
        -

        * What is an object in Java?

        * What is a class in Java?

        * What is the difference between a class and an object?

        * What is a constructor?

        * What are some uses of the ‘final’ keyword?

        * What are some uses of the ‘this’ keyword?

        * What are visibility modifiers?

        * Why use private visibility?

    * */


    /* *
    *================================= OOP INTRO

    -- UP TO NOW --

     - using functions/methods to group together steps for a program to work


    -- DEFINITION --

      * OOP - Object-Oriented Programming

      - A programming paradigm where state (data/properties) and behavior (functionality/methods)
        are grouped together (often into objects)
      - Objects in Java are created from classes (a blueprint for an object/instance)


    -- ADVANTAGES OF OOP --

      * Programming in an Object-oriented way can be used to develop code with a clearer and more modular organization in the following ways:


      * - implementation details can be abstracted away making code more readable (Abstraction)
      * - restriction of access to various levels of abstraction preventing data inconsistencies (Encapsulation)
      * - duplication is minimized through inheritance hierarchies (Inheritance)
      * - flexible code where multiple implementations may be swapped out behind a common interface (Polymorphism)


    -- THE FOUR PILLARS OF OOP --

      * 1. Abstraction - keep it clean
      * 2. Encapsulation - keep it contained
      * 3. Inheritance - keep it DRY (Don't Repeat Yourself)
      * 4. Polymorphism - keep it versatile

    *
      https://medium.com/@hamzzza.ahmed95/four-pillars-of-object-oriented-programming-oop-e8d7822aa219

      Today we will focus on Abstraction and Encapsulation.


    -- CONCEPTS COVERED --

      - how to create custom classes and objects from these classes
      - defining and using instance and static fields
      - how to control class constructors
      - using the "this" keyword
      - controlling encapsulation with visibility modifiers
         * */


    int myVariable;
    static int data = 30;

    public static void main(String[] args) {

        OOPLecture obj = new OOPLecture();

        System.out.println("Value of instance variable: "+obj.myVariable);
        System.out.println("Value of static variable: "+OOPLecture.data);

        class Person{ // Person class - Type
            public String firstName;
            public String lastName;
        }

        Person rick = new Person(); // Person object - Instance of a class
        rick.firstName = "Rick";
        rick.lastName = "Sanchez";


        /*
        *** Check out 'Post.java' in 'oop' package ***
        */

        /*
        * -- OOP SHORT ASSIGNMENT #1 --

        * Create a class called Dish. This class will represent various restaurant dishes.
            Include an integer property called “costInCents”
            Include a string property called “nameOfDish”
            Include a boolean property called “wouldRecommend”
            Include a method called “printSummary” with a void return type

                * this method will use a single printf method to print out the values of each of the instance properties in the following format:
                  Cost: COST_IN_CENTS_HERE
                  Name: NAME_OF_DISH_HERE
                  Recommended: BOOLEAN_VALUE_OF_WOULD_RECOMMEND_HERE

            * Create another class called DishTest

            * Add a main method and inside the method...
                1) instantiate a Dish object and assign to a variable called dish1
                2) assign creative values for each of the properties
                3) test the printSummary() method by invoking it and checking if all instance values are correctly printed
        */

        System.out.println(Arithmetic.pi);  //Came from Class Arithmetic.java
        System.out.println(Arithmetic.add(1,1));
        System.out.println(Arithmetic.multiply(5,3));




        /*
        * ================================= OOP REVIEW
            -- QUESTIONS --

            * What are packages in Java?
                - Package is works as a binder where other JS file can share public components
                - Like a directory for storing java files

            * What is the difference between a class and an object?

                Class
                * - used to define custom type in Java
                * - template, or a blueprint, for objects that will be created based on it

                Object
                * - instance of a class
                * - have fields and methods, and are instantiated, i.e. created, with the new keyword



            * What is instantiation and what syntax is needed to do it?
                - call the constructor of a class that creates an instance or object of the type of that class
                    (creating an object of the class)
                    (ex) Book bk = new Book(); / new SomeClass ();

            * How are instance variables with public visibility accessed and changed?
                usually called by:
                    Post post = new Post();
                    sout(post.title);
                    post.title = new value;
                    ClassName.Variables  = "New Value";

            * What are instance variables?
                characteristic / value / state / variable for an Object
                variables that are assigned in a class where you can share


            * What is displayed when printing out an object?
                object ID will until you create string data of the object using toString() method.



            * What are instance methods?
                - created an object - a method for object to use

                (ex) public String sayHello(){ function.. }

                *** Static fields can be referenced by instance methods. But instance fields cannot be referenced in a static context.


            * What is the difference between static and instance methods/variables?
                instance method - would be used to access / change object variables of specific instant
                Static method - gather data / multiple instances

            * What is an instance and what is instantiation?
                instance :
                instantiation : creating instance = creating object  (ex) Book bk = new Book();

            * What is an object in Java?
                - Instance of a class

            * What is a class in Java?
                - blueprint to create object
                - or used to manipulate data (tool bag) - collection of static methods


            * What is the difference between a class and an object?
                - Object can have many unique instances ( class is layout / blueprint of what the shape of the object will be)

            * What is a constructor?
                - A method that has same name as a class run when the object is initiated
                - very helpful for setting initial values of an object
                - often overloaded to account for different use cases for objects
                *


            *
         * */















    }
}

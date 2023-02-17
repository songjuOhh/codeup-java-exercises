import java.util.Arrays;

public class ArrayExercises {

    String name;
    int age;


    public ArrayExercises(String name, int age){
        this.name = name;
        this.age = age;
    }


    public  static void printNames(Person[] array){
        for(Person name: array){  //*** Enhanced
            System.out.println(name.getName());
//            System.out.println("^above is from 'printNames'");
        }
//        for(int i=0; i< array.length; i++){ // Traditional
//            System.out.println(array[i]);
//        }
    }

    public static void main(String[] args) {


        //*** Array Basics

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);  // It will show
        System.out.println(Arrays.toString(numbers));  // Arrays.toString is necessary for us to see String format of the array


//        String[] peopleName = {"Songju", "Shah","Chu"};

        Person[] people = new Person[3];
        people[0] = new Person("Songju",27);
        people[1] = new Person("Shah",27);
        people[2] = new Person("Chu",27);

        for(Person person : people){
            System.out.println(person.getName());
        }


        ArrayExercises.printNames(people); // Print all the names

        System.out.println(people.length); // Original




         people = Person.addPerson(people,new Person("Pan",37));
        System.out.println(people.length);


//        people = Person.addPerson(people,"Pan");
        ArrayExercises.printNames(people);

    }
}

import java.util.Arrays;

public class Person {

    private String name;
    private int age;


    public static Person[] addPerson(Person[] array, Person name){  //Taking Object of Person and will reference the data type inside

        Person[]newArray = Arrays.copyOf(array, array.length+1);
//        newArray[newArray.length-1] = name;  //or
        newArray[array.length] = name;


        System.out.println(newArray[newArray.length-1]);
        return newArray;
    }


    public static Person[] addPersonAtFront(Person[] people, Person person) {
        Person[] newPeopleArray = Arrays.copyOf(people, people.length + 1);
        for (int i = newPeopleArray.length - 1; i > 0; i -= 1) {
            Person personToMove = newPeopleArray[i - 1];
            newPeopleArray[i] = personToMove;
        }
        newPeopleArray[0] = person;
        return newPeopleArray;
    }


    public static void makePeopleOlder (Person[] people){
        for (Person person : people){
            person.setAge(person.getAge()+1);
        }
    }

    public static void progressOneYear(Person[] people) {
        for (Person person : people) {
            person.setAge(person.getAge() + 1);
        }
    }

    public static void printOutAgesOfPeople(Person[] people) {
        for (Person person : people) {
            System.out.println(person.getAge());
        }
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

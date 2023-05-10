package grades;

import abstractLecture.Interface;

import java.util.*;

public class GradesApplication {


    public static void main(String[] args) {


        Map<String, Student> students = new HashMap<>();


        Student alex = new Student("Alex");
        alex.addGrade(90);
        alex.addGrade(80);
        alex.addGrade(70);
        System.out.printf("%s's average grade is: %s\n", alex.getName(), alex.getGradeAverage());

        Student angela = new Student("Angela");
        angela.addGrade(80);
        angela.addGrade(85);
        angela.addGrade(70);
        System.out.println(angela);
        System.out.printf("%s's average grade is: %s\n", angela.getName(), angela.getGradeAverage());

        Student jack = new Student("Jack");
        jack.addGrade(75);
        jack.addGrade(88);
        jack.addGrade(80);
        System.out.printf("%s's average grade is: %s\n", jack.getName(), jack.getGradeAverage());

        Student song = new Student("Songju");
        song.addGrade(85);
        song.addGrade(98);
        song.addGrade(83);
        System.out.printf("%s's average grade is: %s\n", song.getName(), song.getGradeAverage());

//        Student alex = new Student("Alex", new ArrayList<>(Arrays.asList(90, 85, 70)));
//        Student angela = new Student("Angela", new ArrayList<>(Arrays.asList(90, 85, 70)));
//        Student jack = new Student("Jack", new ArrayList<>(Arrays.asList(80, 70, 85)));
//        Student song = new Student("Songju", new ArrayList<>(Arrays.asList(98, 85, 80)));



        students.put("alexander01", alex );
        students.put("angelino777", angela );
        students.put("jackolantern", jack );
        students.put("ossong", song );

        System.out.println(students.keySet());
//        System.out.println(students);

//        System.out.println(students);

        Scanner sc = new Scanner(System.in);


        boolean goOn = true;
        do {
            System.out.println("\nWelcome!\nHere are the GitHub usernames of our students:");
            students.forEach((username, name)->{
                System.out.printf(" |%s| ",username);
            });
            System.out.println("\nWhat student would you like to see more information on?\n");

            String userAnswer = sc.nextLine();

            for(String key : students.keySet()){
//            Student student = new Student();
                if(key.equalsIgnoreCase(userAnswer)){
                    System.out.printf("Name: %s - GitHub Username: %s\nCurrent Average: %s\n" , students.get(key).getName(), key, students.get(key).getGradeAverage() );
                    System.out.println("Do you want more detail? y / n");
                    String seeDetail = sc.nextLine();
                    if(seeDetail.equalsIgnoreCase("y")){
                        System.out.printf("Name: %s - GitHub Username: %s\nCurrent Average: %s\n" , students.get(key).getName(), key, students.get(key).getGradeAverage() );
//                        System.out.printf("Current Average: %s\n" , students.get(key).getGrades() );
                        System.out.printf("Current Average: %s\n" , students.get(key).getGradeAverage() );
                    }
                }
            }

            System.out.println("Would you like to see another student? y / n\n");
            String anotherUser = sc.nextLine();
            if(anotherUser.equalsIgnoreCase("y")){
                goOn = true;
            }else{
                System.out.println("Goodbye, and have a wonderful day!");
                goOn = false;
                break;
            }

        }while (goOn = true);


//        if(students.containsValue(userAnswer)){
//            System.out.println("user found");
//            System.out.println("Would you like to see another student? y / n");
//            String another = sc.nextLine();
//            if(another.equalsIgnoreCase("y")){
//
//            }else{
//
//            }
//        }else{
//            System.out.println();
//
//        }







//        students.put("Angela", 80);
//        students.put("Micky", 70);
//        students.put("Elon", 110);



    }
}

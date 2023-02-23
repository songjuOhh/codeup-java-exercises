package grades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Student implements CLI{
    private String name;
//    private int grades;

    private List<Integer> grades;

//    public Student(String name ,List<Integer> grades ){
//        this.name =name;
//        this.grades = grades;
//    }

    public Student(String name, List<Integer> grades){
        this.name =name;
        this.grades = grades;
    }

    public Student(String name ){
        this.name =name;
        grades = new ArrayList<>();
    }



    // returns the student's name
    public String getName(){
        return name;
    };


    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    };

    public void getGrades(){
      for(int grade : grades) {
          System.out.println(grade);
      }
    };


    // returns the average of the students grades
    public double getGradeAverage(){
        int gradesTot = 0;
        for (int num : grades){
            gradesTot += num;
        }
        int gradeAvg = gradesTot/grades.size();
        return gradeAvg;
    };




    public static void main(String[] args) {
        Student student = new Student("Alex");
        student.addGrade(100);
        student.addGrade(70);
        student.addGrade(80);
        student.addGrade(90);
        System.out.printf("%s's average grade is: %s", student.name, student.getGradeAverage());
    }

    @Override
    public void askUser() {
        System.out.println("Welcome!\nHere are the GitHub usernames of our students:");
    }
}

package lecturePackage;

public class StudentTest {

    public static void main(String[] args) {
        Student s = new Student("Max", "Hello",0);
        System.out.println(s);
        System.out.println(s.getName());
        s.setName("Maximus");
        System.out.println(s);
    }
}

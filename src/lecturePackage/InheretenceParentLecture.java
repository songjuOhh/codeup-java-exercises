package lecturePackage;

public class InheretenceParentLecture {
    private String name;
    private int age;


    public InheretenceParentLecture(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void eating(){
        System.out.println(name +" is eating");
    }

    public  void livingLife(){
        System.out.println(name + " is living Life");
    }
}

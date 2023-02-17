package lecturePackage;

    public class InheretChildLecture extends InheretenceParentLecture {

        public InheretChildLecture(String name, int age){
            super(name, age);
        }


        public static void main(String[] args) {
            InheretChildLecture d = new InheretChildLecture("Songju", 23);
            System.out.println(d.getName());
            System.out.println(d.getAge());

            d.eating();
            d.livingLife();

        }
}

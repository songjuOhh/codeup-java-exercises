package lecturePackage;

import java.util.Date;

//public class Post {
//
//    public int id;
//    public String title;
//    public String content;
//    public String author;
//    public Date created_at;
//
//
//
//
//
////    @Override
////    public String toString() { //control + return  || right click -> Generate -> toString() -> ok
////        return "Post{" +
////                "id=" + id +
////                ", title='" + title + '\'' +
////                ", content='" + content + '\'' +
////                ", author='" + author + '\'' +
////                ", created_at=" + created_at +
////                '}';
////    }
//
////     Building a constructor - Not static, but it relates and create instance
//    public Post( int id, String title, String content, String author, Date created_at){
//        this.id = id;
//        this.title= title;
//        this.content= content;
//        this.author=author;
//        this.created_at = created_at;
//    }
//    /*
//     *  */
//
//
//
//    public String returnAuthorDateMessage(){
//        return String.format( "This is the movie author: %s, and date is: %s", author,created_at);
//    }
//
//    public String getLongerBlogTitle(Post p1,Post p2){
//        if(p1.title.length() >= p2.title.length()){
//            return "Title, "+ p1.title +" is longer";
//
//        }else{
//            return "Title, "+ p2.title +" is longer";
//        }
//    }
//
//    public static void main(String[] args) {
//        Post post3 = new Post(1, "Day in the Life", "It happens everyday", "Me", new Date());
//        System.out.println(post3.title);
//
////        Post post = new Post(); // creating new object
////
////        post.id = 1;
////        post.title = "Day in the Life";
////        post.content = "It happens everyday";
////        post.author = "Me";
////        post.created_at = new Date();
////
////
////        Post post2 = new Post(); // creating new object
////
////        post2.id = 1;
////        post2.title = "Bad day in the Life";
////        post2.content = "happens sometimes";
////        post2.author = "Life";
////        post2.created_at = new Date();
//
////
//////        System.out.println(post.title);
//////
//////        post.title = "Whatever we want";
//////
//////        System.out.println(post.title);
////
////        System.out.println(post.created_at);
////
////        System.out.println(post);  // returns oop.Post@2f92e0f4 -> reference ID // Once you create string data (line 14), it will show list of Data
////
////        Post p1 = post;
////        Post p2 = post2;
//////        System.out.println(p);
//////        System.out.println(post.title);
//////        p.title = "LoL";
////        System.out.println(p1.title);
////        System.out.println(p2.title);
////
//////        System.out.println(post2);
////
////
////        System.out.println(post.returnAuthorDateMessage());
////        System.out.println(post2.returnAuthorDateMessage());
////
////        System.out.println(p1.getLongerBlogTitle(p1,p2));
//
//    }
//
//
//}

class Student {
    public String name;
    public String cohort;

    public double grade;
    /*
     ** private **
        * - Only accessible within the class that defines it.
        * - Other than that, it cannot be modified.
     */
/*
* You can create String Data, Constructor, Getter, Setter by...
* right click / command + N  =>
 */


    public Student(String name, String cohort, double grade) {
        this.name = name;
        this.cohort = cohort;
        this.grade = grade;
    }
    public Student(String name) {
        this(name, "No cohort yet",0);
    }

    public double shareGrade() {
        return grade;
    }

    public String getName(){  // Getter
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }


    public String sayHello() {
        return "Hello from " + this.name + "!";
    }

    public void changeStudentName (String nameOfStudent){
        if(nameOfStudent.isEmpty()){
            this.name="";
            this.cohort= "";
        }else{
            this.name = nameOfStudent;
        }
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", cohort='" + cohort + '\'' +
                ", grade=" + grade +
                '}';
    }

    public static void main(String[] args) {
        Student song = new Student("Songju");
        System.out.println(song);
        song.cohort = "Zenith";
        System.out.println(song);
    }
}

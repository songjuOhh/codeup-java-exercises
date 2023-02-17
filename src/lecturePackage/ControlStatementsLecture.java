package lecturePackage;

import java.util.Scanner;

public class ControlStatementsLecture {

    public static void main(String[] args) {
        // ==================== Slide 3

        // no >== ,or <==, or === because only value comparisons are available
        // truthy and falsy values don't exist in Java

//         int x = 6;
//         int y = 3;
//         if (x < y) {
//             System.out.println("x is less than y");
//         }else{
//             System.out.println("x is bigger then y");
//         }




        // ==================== Slide 5

        // && will only check second value if first is true
        // & will check both
        // this can be used to check what would otherwise result in a syntax error
        // same comparison process for || and |

        // x will only increment in second condition if first condition is true using &&
//                int x = 2;
//                int y = 3;
//
//                if (true || ++x == y) {
//                    System.out.println("Equal");
//                } else {
//                    System.out.println("Not equal");
//                }
//                System.out.println(x);


        // ==================== Slide 7

        // DO NOT COMPARE STRINGS WITH == !!!!

         System.out.println("hello" == "world");

         Scanner sc = new Scanner(System.in);
         String cat1 = sc.nextLine();
         String cat2 = "cat";
         System.out.println(cat1);
         System.out.println(cat2);
         System.out.println(cat1.equalsIgnoreCase(cat2));

        // do use equals(),

    boolean stringValuesAreEqual = "Test".equals("Test");
    System.out.printf("The result is: %b", stringValuesAreEqual);


        // or use equalsIgnoreCase()

//String hello = "hello";
//System.out.println(hello.equalsIgnoreCase("HeLlO"));

        // does not equal

// String tech = "tech";
// System.out.println(!tech.equalsIgnoreCase("tool"));


        // ==================== Slides 8 - 16

        // basically the same as JS :)


//            String caseSwitch = "Fred";
//            switch (caseSwitch) {
//                case "bob":
//                    System.out.println("Case 1");
//                    break;
//                case "fred":
//                    System.out.println("Case 2");
//                    break;
//                default :
//                    System.out.println("Default case");
//                    break;
//            }


    }

}
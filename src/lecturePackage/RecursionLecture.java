package lecturePackage;

public class RecursionLecture {

    // Recursion is when a function can call itself.

//        public static void countDown(int num) {
//            System.out.println(num);
//            countDown(num - 1);
//        }

    // Recursion will always create a Stack Overflow Error if a "base case" is not defined.

//        public static void main(String[] args) {
//            countDown(10);
//        }

    // A "base case" is condition in which the function eventually does NOT call itself (recur) again.

//        public static void countDown(int num) {
//            if (num == 0) return; // <-- base case
//            System.out.println(num);
//            countDown(num - 1);
//        }
//
//        public static void main(String[] args) {
//            countDown(10);
//        }


    // Recursion is a powerful way to express algorithmic solutions but use it with caution.

    // Recursion should ONLY be used in cases when it makes the code much more readable.

    // Any algorithm that uses recursion can be solved with looping (iteration) instead.

//        public static void countDown(int num) {
//            while(num > 0) {
//                System.out.println(num);
//                num--;
//            }
//        }
//
//        public static void main(String[] args) {
//            countDown(10);
//        }


    // Iterative (looping) algorithms are often more efficient than recursive algorithms.

    // Some problems CANNOT be solved with recursion, particularly when the repetitions exceed 10k times.

        public static void countDownRecur(int num) {
            System.out.println(num);
            countDownRecur(num - 1);
        }

        public static void countDown(int num) {
            while(num > 0) {
                System.out.println(num);
                num--;
            }
        }

        public static void main(String[] args) {
            countDown(1000);  // Does the job, but slower than recursion
//            countDownRecur(1000);  // Does the job faster, but runs into error before it finishes the job
        }


    // Recursion is most commonly used by programmers to solve problems that require a divide and conquer approach
    // or involve data structures like trees and graphs where the complexity grows as you continue to traverse it.

    /*

            Recursion for backtracking to find a way through a maze
                ___________________________________
            | _____ |   | ___ | ___ ___ | |   | |
            | |   | |_| |__ | |_| __|____ | | | |
            | | | |_________|__ |______ |___|_| |
            | |_|   | _______ |______ |   | ____|
            | ___ | |____ | |______ | |_| |____ |
            |___|_|____ | |   ___ | |________ | |
            |   ________| | |__ | |______ | | | |
            | | | ________| | __|____ | | | __| |
            |_| |__ |   | __|__ | ____| | |_| __|
            |   ____| | |____ | |__ |   |__ |__ |
            | |_______|_______|___|___|___|_____|

     */

    /*
        Recursion to move through a binary tree...

                         1
                        / \
                       /   \
                      2     \
                     / \     3
                    4   5   / \
                           9   \
                                8
                               / \
                              6   7
     */


    // Another important concept to understand is the "call stack". The "call stack" is the area of memory in Java program
    // where each method call is stacked when methods call other methods. Once the final method call is evaluated, it is
    // removed from the top of the call stack and the remaining methods are removed as well.

    // Consider the following pseudocode:

    /*
        methodA() {
            methodB();
        }

        methodB() {
            methodC();
        }

        methodC() {
            sout("Hello");
        }

        methodA(); // when everything gets kicked off

     */

    // The call stack for the above pseudocode would look something like this:

    /*

        methodC  <-- stack frame
        methodB  <-- stack frame
        methodA  <-- stack frame

     */

    // Think of it like a stack of plates, where each nested method call is a plate (stack frame) that is added to the stack.

    // When methodC prints "hello" and finishes, it is removed (popped) from the top of the stack and so is methodB and finally methodA.

    // In recursion, depending on how many method calls it takes to reach the base case, the stack may look like this:

    /*

        ...
        someMethod
        someMethod
        someMethod
        someMethod

     */

    // If no base case is reached, the computer will run out of memory and the program will crash with a Stack Overflow Error.


    /**
     * The following code defines an algorithm that will flip the index positions of two characters within a string if both are numbers.
     */
    public class FlipNumsRecursionExample {

        public static boolean charsAreDigits(char first, char second) {
            return Character.isDigit(first) && Character.isDigit(second);
        }


        /**
         * Recursive Solution
         * @param str
         * @return
         */
//    public static String flipNums(String str) {
//        if (str.length() == 1 || str.isEmpty()) return str;
//        char first = str.charAt(0);
//        char last = str.charAt(str.length() - 1);
//        if (str.length() == 2) {
//            return (charsAreDigits(first, last)) ?
//                "" + last + first:
//                "" + first + last;
//        } else {
//            String smallerSlice = str.substring(1, str.length() - 1);
//            return (charsAreDigits(first, last)) ?
//                last + flipNums(smallerSlice) + first:
//                first + flipNums(smallerSlice) + last;
//        }
//    }


        /**
         * Iterative Solution
         * @param str
         * @return
         */
    public static String flipNums(String str) {
        if (str.length() == 0 || str.length() == 1) return str;
        if (str.length() == 2) {
            if (charsAreDigits(str.charAt(0), str.charAt(1))) {
                return "" + str.charAt(1) + str.charAt(0);
            } else {
                return str;
            }
        }
        for (int i = 0, j = str.length() - 1; i < j; i += 1, j -= 1) {
            if (charsAreDigits(str.charAt(i), str.charAt(j))) {
                if (i == 0) {
                    str = str.charAt(j) + str.substring(i + 1, j) + str.charAt(i);
                } else {
                    str = str.substring(0, i) + str.charAt(j) + str.substring(i + 1, j) + str.charAt(i) + str.substring(j + 1);
                }
            }
        }
        return str;
    }




        // Test Cases
        public static void main(String[] args) {

            //  input: "a1b2c3d"
            // output: "a3b2c1d"
            System.out.println(flipNums("a1b2c3d"));


            //  input: "12345"
            // output: "54321"
            System.out.println(flipNums("12345"));

            //  input: "123a45"
            // output: "543a21"
            System.out.println(flipNums("123a45"));

            //  input: "ab12cd"
            // output: "ab21cd"
            System.out.println(flipNums("ab12cd"));

        }

    }




    /**
     * RECURSION MINI-EXERCISES
     */

    // TODO: use recursion to print out a given number up through 100

    // TODO: use recursion to print letters of a string starting with the first and ending with the last (each call will work on a smaller substring)

    // TODO: use recursion to add all numbers up from 1 to a given number

    // BONUS TODO: use recursion to write a factorial method (very similar to the third todo)

    // BONUS TODO: use recursion to reverse the characters in a string







}
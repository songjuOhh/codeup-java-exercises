import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.LinkedList;

public class loop {
    static int[][] map;
    static LinkedList<int[]> list;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        for(int i = 2; i < 10; i++) {
//            for(int j = 1; j < 10; j++) {
//                System.out.println(i + " x " + j + " = " + (i * j));
//            }
//        }
//        for(int a = 0; a<=5; a++){
//            for(int b = 0; b<=a; b++) {
//                for(int c = 0; c<=b; c++)
//                    System.out.print( a + "+"+ b + "=" + (a+b)+ "  ");
//            }
//            System.out.println(""); // 줄바꿈
//        }
//        for(int a = 5; a<=5; a++){
//                for(int b = 0; b<=a; b++) {
//                    for(int c = 0; c<=b; c++)
//                System.out.print( a + "+"+ b + "=" + (a+b)+ "  ");
//            }
//            System.out.println(""); // 줄바꿈
//        }
//        for(int a=0; a<3; a++){
//            for(int b=0; b<3; b++) {
//                for (int c = 0; c < 3; c++) {
//                    System.out.print(a + "+" + b + "+" + c + "  ");
//                }System.out.println(""); //c가 끝날시 줄바꿈
//            }System.out.println(""); //b가 끝날시 줄바꿈
//        }

//        for(int a=0; a<=5; a++){
//            for(int b=0; b<=a; b++) {
//                System.out.print(a + " " + b +  "   ");
//            }System.out.println(""); //b가 끝날시 줄바꿈
//        }
//
//        //별 오른쪽 위
//        for(int a=0; a<=20; a=a+1){
//            for(int b=0; b<=a-1; b++) {
//                System.out.print("*");
//            }System.out.println(""); //b가 끝날시 줄바꿈
//        }
//        //별 오른쪽 위
//        for(int a=20; a>=1; a=a-1){
//            for(int b=0; b<=a-1; b++) {
//                System.out.print("*");
//            }System.out.println(""); //b가 끝날시 줄바꿈
//        }
//        //별 오른쪽 위
//        for(int i=0; i<=5; i++){
//            for(int j=0; j<i; j++) {
//                System.out.print(i+""+j+"  ");
//            }System.out.println(""); //b가 끝날시 줄바꿈
//        }

//        for(int i=0; i<6; i++){
//            for(int j=0; j<5-i; j++) {
//                System.out.print("'");
//            }
//            for(int j=0; j<((i+1)*2-1); j++)  {
//                System.out.print("*");
//            }
//
//            System.out.println(""); //j가 끝날시 줄바꿈
//        }
//        for(int i=0; i<6; i++){
//            for(int j=0; j<i+1; j++) {
//                System.out.print("'");
//            }
//            for(int j=0; j<11-(i+1)*2; j++)  {
//                System.out.print("*");
//            }
//            System.out.println(""); //j가 끝날시 줄바꿈
//        }
        //^ 위는 마름모 모양을 구현할 수 하지만 크기 변환이 힘듬 ^

//마름모 만들기 1
        System.out.println("마름모1 크기?");

        int size = sc.nextInt();
        for (int i = 0; i <= size; i++) {
            for (int j = i; j <= size; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= size; j++) {
                System.out.print("*");
            }
            for (int j = i; j <= size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


//마름모 만들기 2
        System.out.println("마름모2 크기?");

        int sqrow = sc.nextInt(); //마름모 크기 변수
        for (int i = 0; i < sqrow; i++) {
            for (int j = i; j < sqrow - 1; j++) {
                System.out.print("'");
            }
            for (int j = 0; j < ((i + 1) * 2 - 1); j++) {
                System.out.print("*");
            }
            System.out.println(""); //j가 끝날시 줄바꿈
        }
        for (int i = 0; i < sqrow; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("'");
            }
            for (int j = 0; j < sqrow * 2 - ((i + 1) * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println(""); //j가 끝날시 줄바꿈
        }
        //int row 변수를 넣음으로 숫자 편집가능

        //마름모모 만들기2


//원 만들기 1
        System.out.println("원1 크기?");

        int cir = sc.nextInt();
        for (int i = -cir; i <= cir; i++) { //-를 넣음으로 +/-값으로 위아래 대칭구현
            for (int j = -cir; j <= cir; j++) { //-를 넣음으로 +/-값으로 좌우 대칭구현
                if (i * i + j * j <= cir * cir) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


//원 만들기 2
        System.out.println("원2 크기?");

        int r = sc.nextInt();
        for (int i = -r; i <= r; i++) { //-를 넣음으로 +/-값으로 위아래 대칭구현
            for (int j = -2*r; j <= r*2; j++) { //-를 넣음으로 +/-값으로 좌우 대칭구현
                if (i*4/3 * i*4/3 + j/2 * j/2 <= r * r) {
                    System.out.print("*");
                } else {
                    System.out.print("'");
                }
            }
            System.out.println();
        }






//별 만들기
        System.out.println("별 크기? (7 이상)");

        int star = sc.nextInt(); // 마름모 크기 변수 (7이상)

        //별 윗부분
        for (int i = 0; i < star; i++) {
            for (int j = 0; j < (star * 10 / 7) - i; j++) { //별모양을 갖출수있는 공간을 줌
                System.out.print("'");
            }
            for (int j = 0; j < ((i + 1) * 2 - 1); j++) {
                System.out.print("*");
            }
            if (i == star * 2 / 5) {
                break; //별모양을 갖출수있는 공간이 확보됬을때 멈춤, 다음 모양 시작
            }
            System.out.println(""); //j가 끝날시 줄바꿈
        }
        System.out.println("");

        //별 중앙부분
        for (int i = 0; i < star; i++) {
            for (int j = 0; j < (star + 3 * i) - star; j++) { //별모양을 갖출수있는 공간을 줌
                System.out.print("'");
            }
            for (int j = 0; j < (star * 3) - 6 * i; j++) {
                System.out.print("*");
            }
            if (i == star / 4) {
                break; //별모양을 갖출수있는 공간이 확보됬을때 멈춤, 다음 모양 시작
            }
            System.out.println(""); //j가 끝날시 줄바꿈
        }
        System.out.println("");

        //별 아랫부분


        for (int i = 0; i < star; i++) {
            for (int j = 0; j < (star * 3 / 4) - i; j++) { //별모양을 갖출수있는 공간을 줌
                System.out.print("'");
            }
            for (int j = 0; j < ((star * 3 / 4) - 2 * i); j++) { //왼쪽 다리
                System.out.print("*");
            }
            for (int j = 0; j < (i + 5 * i); j++) { //다리 사이 공백
                System.out.print("'");
            }
            for (int j = 0; j < ((star * 3 / 4) - 2 * i); j++) { // 오른쪽 다리
                System.out.print("*");
            }
            if (i == star * 2 / 5) {
                break; //별모양을 갖출수있는 공간이 확보됬을때 멈춤, 다음 모양 시작
            }
            System.out.println(""); //j가 끝날시 줄바꿈
        }

        System.out.println("");

//        Random random = new Random();
//        int[]numArray = new int[6];
//        int temp;
//        for (int i = 0; i<6; i++) {
//            numArray[i] = random.nextInt(45) + 1;
//            for (int j = 0; j < i; j++) {
//                if (numArray[i] == numArray[j]) {
//                    i--;
//                    break;
//                }
//                System.out.print(j);
//            }
//            System.out.println(i);
//        }


//        int[][] arr = new int[3][3];
//
//        int k = 1;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = k; // 인덱스를 이용한 초기화
//                k += 9;
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

//        int sudo = 3;
//        int a[] = new int[10];
//        Random ran = new Random();
//
//        for (int i = 1; i <= sudo; i++) {
//            a[i] = ran.nextInt(10) + 1;
//            for (int j = 1; j < i; j++) {
//                if (a[i] == a[j]) {
//                    i--;
//                }
//            }
//        }
//        for (int b = 0; b < 10; b++) {
//            System.out.println(a[b]);
//        }

        System.out.println("수도쿠 미완성");

        int sudonum = sc.nextInt();


//        int[][] sudo = new int[3][3];
//        for (int i = 0; i < 3; i++) {
//
//            for (int j = 0; j < 3; j++) {
//                sudo[i][j] = 0;
//            }
//        }
//        int a;
//        int b;
//        int row;
//        int col;
//        boolean isSame = true;
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                row = j; // >
//                col = i; // v
//
//            }
//        }
//        for(int i = 0; i<9; i++){
//            if (i == col) continue;
//            if (map[r][i]
//            }
//
//        }
//        int[][] sudoku = new int [3][3];
//
//        for (int i = 0; i < sudoku.length; i++) {
//            for (int j=0; j < sudoku.length; j++) {
//                j= (int)(Math.random() * 9 );
//
//
//                System.out.print(j);
//            }
//            System.out.println(i);
//        }



    }
}





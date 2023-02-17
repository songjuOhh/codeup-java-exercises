package game;
import java.util.Scanner;

public class 성기사 extends 빛 {
    Scanner scan = new Scanner(System.in);
    String next;



    public void 빛의수호() {
        this.방어력 += 100;
    }


    public void attack(){
        super.스태미나 -= 1;
        super.신성게이지 +=2;
        System.out.println("[빛나는 검으로 공격했다.]");

        Thread attacksound = new Thread(new attackSound());     //스킬 효과음 쓰레드

        attacksound.start();

        try {
            attacksound.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }    //쓰레드 끝
        System.out.println("[ 스태미나 ] -1");
        System.out.println("[신성게이지] +2");

    }
    public void defence(){
        DefenceS   DefenceS   = new DefenceS  ();
        DefenceS  .start();
        super.스태미나 -=1;
        super.방어력 += 방어력/10;
        super.신성게이지 +=3;
        System.out.println("(방패를 들어 막는다.)");
        System.out.print("[방어력이 +");
        System.out.print(방어력/10);
        System.out.println(" 올라갔습니다.]");
        System.out.println("[ 스태미나 ] +1");
        System.out.println("[신성게이지] +3");
    }

    public void 보호막(){
        int i =3;
        while (i<4) {
            i++;
            if (super.신성게이지 >= 2) {
                Shield Shield = new Shield();
                Shield.start();
                System.out.println("(( 내가 지킨다! ))");
                System.out.println("[상대방의 공격을 방어하는 보호막을 생성한다]");
                System.out.println("[  방어력 ] +300");
                System.out.println("[신성게이지] -2");
                방어력 += 100;
                신성게이지 -= 2;
            } else {
                System.out.println("[신성게이지가 부족합니다.]");
                break;
            }
        }
    }


    public void 빛의검() {
//        if (super.신성게이지 >= 5){
//            System.out.println("오직 빛이 너를 심판하리라");
//            System.out.println("[거대한 빛의 검이 하늘에서 내려와 찍힌다.]");
//            System.out.println("(대상을 전투불능으로 만든다.)");
//            신성게이지 -=5;
//        } else {
//            System.out.println("[신성게이지가 부족합니다.]");
//        }
//    }
        int i =4;
        while (i<5) {
            i++;
            if  (super.신성게이지 >= 5) {

                System.out.println("(( 오직 빛이 너를 심판하리라! ))");
                System.out.println(" ");
                System.out.println("[거대한 빛의 검이 하늘에서 내려와 찍힌다.]");
                next = scan.nextLine();


                Thread knUEF = new Thread(new knightUltEffect());   //스킬 이펙트 쓰레드
                Thread knightUlt = new Thread(new knightUlt());     //스킬 효과음 쓰레드

                knUEF.start();
                knightUlt.start();

                try {
                    knUEF.join();
                    knightUlt.join();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }    //쓰레드 끝

                System.out.println("(대상을 전투불능으로 만든다.)");
                System.out.println("[신성게이지] -5");
                신성게이지 -=5;


            } else if( super.신성게이지 <=4) {
                System.out.println("[신성게이지가 부족합니다.]");
                break;
            }
        }

    }
    public void action(){
        System.out.println("무엇을할까?");
        System.out.println("1.공격한다  2.방어한다  3.보호막(cost:2)   4.빛의검(cost:5)   5.도망간다");
        int choice = scan.nextInt();
        if (choice ==1){
            this.attack();
        }else if(choice==2) {
            this.defence();
        }else if(choice==3) {
            if( 신성게이지 <=1) {
                this.보호막();
                this.action();
            }else{
                this.보호막();
            }
        }else if (choice==4){
            if( super.신성게이지 <=4) {
                this.빛의검();
                this.action();
            }else{
                this.빛의검();
            }
        }else if (choice ==5) {
            System.out.println("[당신은 용사로서 자격을 잃었습니다.]");
            System.out.println(" ");
            super.GameOver();
        } else {
            System.out.println("[다시 입력해주세요.]");
            this.action();
        }
    }

    public void 스탯() {
        if (HP < 1){
            HP = 0;
        }
        if( 신성게이지 < 1){
            신성게이지 = 0;
        }
        System.out.println("------------현재스탯-------------");
        System.out.println("[HP]=" + this.HP +"  [공격력]=" + this.공격력 + "  [방어력]=" + this.방어력);
        System.out.println("[스태미나]=" + this.스태미나 +"  [포만감]=" + this.포만감 + "  [신성게이지]=" + this.신성게이지);
        System.out.println("--------------------------------");
    }

    public void armorSet(){
        HP += 300;
        공격력 += 100;
        방어력 += 50;
    }
    public void sleep(){
        HP += 1100-HP;
        스태미나 += 10-스태미나;
        포만감 += 10-포만감;
    }
}

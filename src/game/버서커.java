package game;

public class 버서커 extends 어둠 {


    public void 광기어린힘() {
        this.공격력 += 100;
    }
    public void 광기의육체() {
        this.HP += 300;
    }

    public void attack(){
        super.스태미나 -= 1;
        super.어둠게이지 +=3;
        System.out.println("[육중한 도끼로 공격했다.]");
        Thread axeATK = new Thread(new axeATK());     //스킬 효과음 쓰레드

        axeATK.start();

        try {
            axeATK.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }    //쓰레드 끝
        System.out.println("[ 스태미나 ] -1");
        System.out.println("[암흑게이지] +3");

    }
    public void defence(){
        DefenceS   DefenceS   = new DefenceS  ();
        DefenceS  .start();
        super.스태미나 -=1;
        super.방어력 +=5;
        super.어둠게이지 +=2;
        System.out.println("(방패를 들어 막는다.)");
        System.out.print("[방어력이 +");
        System.out.print(방어력/10);
        System.out.println(" 올라갔습니다.]");
        System.out.println("[ 스태미나 ] +1");
        System.out.println("[암흑게이지] +2");
    }

    public void 윈드밀(){
        int i =3;
        while (i<4) {
            i++;
            if (super.어둠게이지 >= 2) {
                System.out.println("그 누구도 내 앞을 막지못하리라!");
                dbleSwing dbleSwing = new dbleSwing();
                dbleSwing.start();
                System.out.println("[전방 다수의 적들에게 범위공격을 2회 입힙니다.]");
                어둠게이지 -= 2;
                System.out.println("[어둠게이지] -2");
            } else if (super.어둠게이지 <= 2) {
                System.out.println("[암흑게이지가 부족합니다.]");
                break;
            }
        }
    }

    public void 피의심판(){
        int i =4;
        while (i<5) {
            i++;
            if (super.어둠게이지 >= 5) {
                System.out.println("즉결 처형!");
                System.out.println("[상대의 머리를 내리쳐 '처형'합니다.]");
                next = scan.nextLine();

                Thread bsUEF = new Thread(new berserkUltEffect());   //스킬 이펙트 쓰레드
                Thread bsUlt = new Thread(new berserkUlt());     //스킬 효과음 쓰레드

                bsUEF.start();
                bsUlt.start();

                try {
                    bsUEF.join();
                    bsUlt.join();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }    //쓰레드 끝

                System.out.println("(대상을 전투불능으로 만든다.)");
                어둠게이지 -= 5;
                System.out.println("[어둠게이지] -5]");
            } else if (super.어둠게이지 <= 5) {
                System.out.println("[암흑게이지가 부족합니다.]");
                break;
            }
        }
    }



    public void action(){
        System.out.println("무엇을할까?");
        System.out.println("1.공격한다  2.방어한다  3.윈드밀(cost:2)   4.피의심판(cost:5)   5.도망간다");
        int choice = scan.nextInt();
        if (choice ==1){
            this.attack();
        }else if(choice==2) {
            this.defence();
        }else if(choice==3) {
            if( this.어둠게이지 <=1) {
                this.윈드밀();
                this.action();
            }else{
                this.윈드밀();
            }
        }else if (choice==4){
            if( super.어둠게이지 <=4) {
                this.피의심판();
                this.action();
            }else{
                this.피의심판();
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
        System.out.println("-------------현재스탯-------------");
        System.out.println("[HP]=" + this.HP +"  [공격력]=" + this.공격력 + "  [방어력]=" + this.방어력);
        System.out.println("[스태미나]=" + this.스태미나 +"  [포만감]=" + this.포만감 + "  [어둠게이지]=" + this.어둠게이지);
        System.out.println("---------------------------------");
    }
    public void armorSet(){
        HP += 300;
        공격력 += 100;
        방어력 += 50;
    }
    public void sleep(){
        스태미나 += 10-스태미나;
        포만감 += 10-포만감;
    }
}

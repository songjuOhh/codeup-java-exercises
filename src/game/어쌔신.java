package game;

public class 어쌔신 extends 어둠 {


    public void 살인본능() {
        this.공격력 += 200;
    }

    public void attack(){
        super.스태미나 -= 1;
        super.어둠게이지 +=3;
        System.out.println("[어둠의 단검으로 공격했다.]");

        Thread assATK = new Thread(new assATK());     //스킬 효과음 쓰레드
        assATK.start();
        try {
            assATK.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }    //쓰레드 끝

        System.out.println("[ 스태미나 ] -1");
        System.out.println("[어둠게이지] +3");
    }
    public void defence(){
        DefenceS   DefenceS   = new DefenceS  ();
        DefenceS  .start();
        super.스태미나 -=1;
        super.방어력 += 20;
        super.어둠게이지 +=3;
        System.out.println("(방어 자세를 취한다.)");
        System.out.print("[방어력이 +");
        System.out.print(방어력/10);
        System.out.println(" 올라갔습니다.]");
        System.out.println("[ 스태미나 ] +1");
        System.out.println("[어둠게이지] +2");
    }

    public void 은신(){
        int i =3;
        while (i<4) {
            i++;
            if (super.어둠게이지 >= 2) {

                System.out.println("(( 더 빠르고 은밀하게! ))");
                Shadow Shadow = new Shadow();
                Shadow.start();
                System.out.println("[적에게서 모습을 감추며 공격력이 상승합니다.]");
                System.out.println("[  공격력 ] +100");
                System.out.println("[어둠게이지] -2");
                공격력 += 100;
                어둠게이지 -= 2;

            } else {
                System.out.println("[암흑게이지가 부족합니다.]");
                break;
            }
        }
    }

    public void 숙청(){
        int i =4;
        while (i<5) {
            i++;
            if (super.어둠게이지 >= 5) {
                System.out.println("(( 죽음으로 속죄해라. ))");
                System.out.println(" ");
                System.out.println("[일격에 급소를 가격해 적을 '처형'합니다.]");
                next = scan.nextLine();

                Thread assUEF = new Thread(new assassinUltEffect());   //스킬 이펙트 쓰레드
                Thread assUlt = new Thread(new assassinUlt());     //스킬 효과음 쓰레드

                assUEF.start();
                assUlt.start();

                try {
                    assUEF.join();
                    assUlt.join();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }    //쓰레드 끝

                System.out.println("(대상을 전투불능으로 만든다.)");
                어둠게이지 -= 5;

            } else if (super.어둠게이지 <= 4) {
                System.out.println("[암흑게이지가 부족합니다.]");
                break;
            }
        }
    }


    public void action(){
        System.out.println("무엇을할까?");
        System.out.println("1.공격한다  2.방어한다  3.은신(cost:2)  4.숙청(cost:5)   5.도망간다");
        int choice = scan.nextInt();
        if (choice ==1){
            this.attack();
        }else if(choice==2) {
            this.defence();
        }else if(choice==3) {
            if( 어둠게이지 <=1) {
                this.은신();
                this.action();
            }else{
                this.은신();
            }
        }else if (choice==4){
            if( super.어둠게이지 <=4) {
                this.숙청();
                this.action();
            }else{
                this.숙청();
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
        if( 어둠게이지 < 1){
            어둠게이지 = 0;
        }
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

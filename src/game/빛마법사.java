package game;

public class 빛마법사 extends 빛 {
    int 빛의마력 = super.스태미나*10;
    String next;


    public void 빛의선구자() {
        this.공격력 += 100;
    }

    public void attack(){
        WizardAtk WizardAtk = new WizardAtk();
        WizardAtk.start();
        super.신성게이지 +=3;
        this.빛의마력 -=2;
        System.out.println("[신성한 빛으로 공격했다.]");
        System.out.println("[신성게이지] +2");
        System.out.println("[빛의 마력] -2");

    }

    public void defence(){
        DefenceS   DefenceS   = new DefenceS  ();
        DefenceS  .start();
        super.방어력 +=5;
        super.신성게이지 +=3;
        this.빛의마력 +=2;
        System.out.println("[방어 자세를 취한다]");
        System.out.println("[ 스태미나 ] -1");
        System.out.println("[신성게이지] +2");
        System.out.println("[빛의 마력] +2");
    }

    public void 힐() {
        int i =3;
        while (i<4) {
            i++;
            if  (빛의마력 >= 4) {
                System.out.println("(( 몸과 마음의 안정을..! ))");
                System.out.println("[잃은 체력을 일부 회복한다.]");
                super.신성게이지 +=2;
                빛의마력 -= 4;
                HP += HP / 3;
                System.out.print("[HP]+");
                System.out.println(HP/3);
                System.out.println("[신성게이지] +2");
                this.스탯();
            }else if(빛의마력 <=3){
                System.out.println("[빛의 마력이 부족합니다.]");
                break;
            }
        }
    }

    public void 빛의심판() {
        int i =4;
        while (i<5) {
            i++;
            if  (super.신성게이지 >= 5) {
                System.out.println("(( 빛이 너희를 인도하리라! ))");
                System.out.println(" ");
                System.out.println("[하늘에서 강렬한 빛이 내려와 대상을 가격한다.]");
                next = scan.nextLine();

                Thread majUEF = new Thread(new magicUltEffect());   //스킬 이펙트 쓰레드
                Thread majUSO = new Thread(new magiUlt());     //스킬 효과음 쓰레드

                majUEF.start();
                majUSO.start();

                try {
                    majUEF.join();
                    majUSO.join();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }    //쓰레드 끝
                
                System.out.println("(대상을 전투불능으로 만든다.)");
                신성게이지 -= 5;

            }else if( super.신성게이지 <=4) {
                System.out.println("[신성게이지가 부족합니다.]");
                break;
            }
        }
    }

    public void action(){
        System.out.println("무엇을할까?");
        System.out.println("1.공격한다(빛의마력:2)  2.방어한다  3.치유(빛의마력:2)   4.빛의심판(신성게이지:5)   5.도망간다");
        int choice = scan.nextInt();
        if (choice ==1){
            this.attack();
        }else if(choice==2) {
            this.defence();
        }else if(choice==3) {
            if( this.빛의마력 <=3) {
                this.힐();
                this.action();
            }else{
                this.힐();
            }
        }else if (choice==4){
            if( super.신성게이지 <=4) {
                this.빛의심판();
                this.action();
            }else{
                this.빛의심판();
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
        if (빛의마력 <1){
            빛의마력 = 0;
        }
        if( 신성게이지 < 1){
            신성게이지 = 0;
        }
        System.out.println("-------------현재스탯-------------");
        System.out.println("[HP]=" + this.HP +"  [공격력]=" + this.공격력 + "  [방어력]=" + this.방어력);
        System.out.println("[빛의마력]=" + this.빛의마력 + "  [신성게이지]=" + this.신성게이지);
        System.out.println("--------------------------------");
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

package game;
import java.util.Scanner;

public class 캐릭터 {
    Scanner scan = new Scanner(System.in);
    String next;


    
    


    int HP = 100;
    int 공격력 = 20;
    int 방어력 = 0;
    int 스태미나= 10;
    int 자비심 = 5;
    int 포만감 = 0;


    public void space(){
        for (int i=0;i<50 ;i++ ){
            System.out.println(" ");
        }
    }


    public void 소개(String 주인공이름) {
        System.out.println("내 이름은 " + 주인공이름 + "...");
    }
    public void 스탯() {
        System.out.println("-------------현재스탯-------------");
        System.out.println("[HP]=" + this.HP +"  [공격력]=" + this.공격력 + "  [방어력]=" + this.방어력);
        System.out.println("[스태미나]=" + this.스태미나 +"  [포만감]=" + this.포만감 + "  [자비심]=" + this.자비심);
        System.out.println("---------------------------------");
    }
    public void rest(){
    }

    public void attack(){
        Thread punch = new Thread(new punch());     //스킬 효과음 쓰레드

        punch.start();

        try {
            punch.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }    //쓰레드 끝
        스태미나 -= 1;

    }
    public void defence(){
        DefenceS   DefenceS   = new DefenceS  ();
        DefenceS  .start();
        스태미나 -=1;
        방어력 +=5;
    }
    public void eating(){
        HP += HP/5;
        스태미나 +=3;
    }
    public void sleep(){
        HP += 100-HP;
        스태미나 += 10-스태미나;
        포만감 += 10-포만감;
    }
    public interface UpgradeLight {

    }
    public void armorSet(){
        HP += 300;
        공격력 += 100;
        방어력 += 50;
    }

    public void action(){
        System.out.println("무엇을할까?");
        System.out.println("1.공격한다  2.방어한다  3.도망간다");
        int choice = scan.nextInt();
        if (choice ==1){
            this.attack();
        }else if(choice==2){
            this.defence();
        }else{
            System.out.println("[당신은 용사로서 자격을 잃었습니다.]");
            System.out.println(" ");
            this.GameOver();
        }
    }
    public void attacked(int sum){
        if(방어력 >= sum){ // 방어력이 공격력보다 큰 경우
            HP = HP-0;
            System.out.println("");
        }else{
            HP = HP + 방어력 - sum;
        }
    }

    public void GameOver(){
        Thread GameOverE = new Thread(new GameOverE());   //스킬 이펙트 쓰레드
        Thread GameOverS = new Thread(new GameoverS());     //스킬 효과음 쓰레드

        GameOverE.start();
        GameOverS.start();

        try {
            GameOverE.join();
            GameOverS.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }    //쓰레드 끝

    }
}

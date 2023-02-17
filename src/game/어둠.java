package game;

public class 어둠 extends 캐릭터{
    int 어둠게이지 = 2;



    public void 어둠의힘() {
        this.공격력 += 150;
    }
    public void 어둠의육체() {
        this.HP += 500;
    }

    public void attack(){
        스태미나 -= 1;
        어둠게이지 +=3;

    }
    public void defence(){
        스태미나 -=1;
        방어력 +=5;
        어둠게이지 +=2;

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


}

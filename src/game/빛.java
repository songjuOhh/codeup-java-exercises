package game;

public class 빛 extends 캐릭터 {
    int 신성게이지 = 2;


    public void 빛의힘() {
        this.공격력 += 100;
    }
    public void 빛의육체() {
        this.HP += 800;
    }


    public void attack(){
        스태미나 -= 1;
        신성게이지 +=3;

    }
    public void defence(){
        스태미나 -=1;
        방어력 +=5;
        신성게이지 +=4;
    }

    public void 스탯() {
        System.out.println("-------------현재스탯-------------");
        System.out.println("[HP]=" + this.HP +"  [공격력]=" + this.공격력 + "  [방어력]=" + this.방어력);
        System.out.println("[스태미나]=" + this.스태미나 +"  [포만감]=" + this.포만감 + "  [신성게이지]=" + this.신성게이지);
        System.out.println("---------------------------------");
    }

    public void armorSet(){
        this.HP += 300;
        this.공격력 += 100;
        this.방어력 += 50;
    }




}

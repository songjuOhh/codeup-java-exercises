package game;

import java.time.LocalTime;

public class enemy extends 캐릭터 {
    String name = "강도";
    int HP = 10;
    int 공격력 = 5;
    int 방어력 = 0;

    LocalTime now = LocalTime.now();
    int hour = now.getHour();

    public void nightpower() {
        if (hour <= 24 && hour >= 21 ) {
            공격력 += 공격력 * 2 / 10;
            HP += HP * 1/10;
            System.out.println("[어두운 밤의 기운을 받아 몬스터 공격력과 체력이 상승합니다.]");
            System.out.println("(공격력 " + 공격력 * 2 / 10 + "증가)");
            System.out.println("(체력 " + HP * 1 / 10 + "증가)");
        }else if(hour <=20 && hour >=17){
            공격력 += 공격력 * 1 / 10;
            HP += HP * 1/10;
            System.out.println("[붉은 노을의 기운을 받아 몬스터 공격력과 체력이 소량 상승합니다.]");
            System.out.println("(공격력 " + 공격력 * 1 / 10 + "증가)");
            System.out.println("(체력 " + HP * 1 / 10 + "증가)");

        } else if(hour <= 6 && hour >=0){
            공격력 += 공격력 * 1 / 10;
            System.out.println("[새벽 안개의 기운을 받아 몬스터 소량 공격력이 상승합니다.]");
            System.out.println("[공격력 " + 공격력*1/10 + "증가]");

        }else{
            System.out.println(" ");
        }
    }





    public void attack() {
        System.out.println(    //강도1
                        "░░░░░░░░░░░░░░░░█▀ ░░░░░░░░░░░░░░░░░░░\n" +
                        "░░░░░░░░░░░░░░█▀ ░░░░░░░░░░░░░░░░░░░░░\n" +
                        "░░░░░░░░░░░░░█  ░░░░░░░░░░░░░░░░░░░░░░\n" +
                        "░░░░░░░░░░░░▐  ░░░░░░░░░░░░░░░░░░░░░░░\n" +
                        "░░░░░░░░░░░░▐   ░░░░░░░░░░░░░░░░░░░░░░\n" +
                        "░░░░░░░░░░░░▐ ▄  ▓▓    ▓▓█▀▀▀█▄       \n" +
                        "░░░░░░░░░░░░░▌▀▀▄▓▓▓  ▓▓▀   ▄▄▄█   ▄  \n" +
                        "░░░░░░░░░░░░░▌▄   █▓▓ ▓▄▄ ▀█████  ▄█  \n" +
                        "░░░░░░░░░░░░░░▌█ ▀█▓▓▓▓██▄▄█████▄████▄\n" +
                        "░░░░░░░░░░░░░░▌█▓▓▓▓▓▓▓▓▓▓▓▓██████████\n" +
                        "░░░░░░░░░░░░░░▌   ░░░░░░░░░░░░░▀▀▀▀███\n" +
                        "░░░░░░░░░░░░░░█  ░░░░░░░░░░░░░░░░░░░░▐\n" +
                        "░░░░░░░░░░░░░░█  ░░░░░░░░░░░░░░░░░░░░█\n" +
                        "░░░░░░░░░░░░░░░█  ░░░░░░░░░░░░░░░░░░█ \n" +
                        "░░░░░░░░░░░░░░░░█  ░░░░░░░░░░░░░░░░█ ░\n" +
                        "░░░░░░░░░░░░░░░███  ░░░░░░░░░░░░░██  ░\n" +
                        "░░░░░░░░░░░░░███▀▀█  ░░░░░░░░░░▄█▀  ░░\n" +
                        "░░░░░░░░░░░▄██░░░░░█▄ ░░░░░░░██▀   ░░░\n" +
                        "░░░░░░░░░▄██░░░░░░░░ █▄ ░░░█▀     ░░░░\n" +
                        "░░░░░░░░██░░░░░░░░░░░░ ▀██▀      ░░░░░\n" +
                        "░░░░░░░█░░░░░░░░░░░░░░░         ░░░░░░\n");
        Thread punch = new Thread(new punch());     //스킬 효과음 쓰레드

        punch.start();

        try {
            punch.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }    //쓰레드 끝

        System.out.println("["+name + "가 당신을 공격했습니다.]");
    }
    public void img() {
        System.out.println(    //강도1
                "░░░░░░░░░░░░░░░░█▀ ░░░░░░░░░░░░░░░░░░░\n" +
                        "░░░░░░░░░░░░░░█▀ ░░░░░░░░░░░░░░░░░░░░░\n" +
                        "░░░░░░░░░░░░░█  ░░░░░░░░░░░░░░░░░░░░░░\n" +
                        "░░░░░░░░░░░░▐  ░░░░░░░░░░░░░░░░░░░░░░░\n" +
                        "░░░░░░░░░░░░▐   ░░░░░░░░░░░░░░░░░░░░░░\n" +
                        "░░░░░░░░░░░░▐ ▄  ▓▓    ▓▓█▀▀▀█▄       \n" +
                        "░░░░░░░░░░░░░▌▀▀▄▓▓▓  ▓▓▀   ▄▄▄█   ▄  \n" +
                        "░░░░░░░░░░░░░▌▄   █▓▓ ▓▄▄ ▀█████  ▄█  \n" +
                        "░░░░░░░░░░░░░░▌█ ▀█▓▓▓▓██▄▄█████▄████▄\n" +
                        "░░░░░░░░░░░░░░▌█▓▓▓▓▓▓▓▓▓▓▓▓██████████\n" +
                        "░░░░░░░░░░░░░░▌   ░░░░░░░░░░░░░▀▀▀▀███\n" +
                        "░░░░░░░░░░░░░░█  ░░░░░░░░░░░░░░░░░░░░▐\n" +
                        "░░░░░░░░░░░░░░█  ░░░░░░░░░░░░░░░░░░░░█\n" +
                        "░░░░░░░░░░░░░░░█  ░░░░░░░░░░░░░░░░░░█ \n" +
                        "░░░░░░░░░░░░░░░░█  ░░░░░░░░░░░░░░░░█ ░\n" +
                        "░░░░░░░░░░░░░░░███  ░░░░░░░░░░░░░██  ░\n" +
                        "░░░░░░░░░░░░░███▀▀█  ░░░░░░░░░░▄█▀  ░░\n" +
                        "░░░░░░░░░░░▄██░░░░░█▄ ░░░░░░░██▀   ░░░\n" +
                        "░░░░░░░░░▄██░░░░░░░░ █▄ ░░░█▀     ░░░░\n" +
                        "░░░░░░░░██░░░░░░░░░░░░ ▀██▀      ░░░░░\n" +
                        "░░░░░░░█░░░░░░░░░░░░░░░         ░░░░░░\n");
    }

    public void 스탯() {
        if (HP < 1){
            HP = 0;
        }
        System.out.println(    //강도1
                    "░░░░░░░░░░░░░░░░█▀ ░░░░░░░░░░░░░░░░░░░\n" +
                    "░░░░░░░░░░░░░░█▀ ░░░░░░░░░░░░░░░░░░░░░\n" +
                    "░░░░░░░░░░░░░█  ░░░░░░░░░░░░░░░░░░░░░░\n" +
                    "░░░░░░░░░░░░▐  ░░░░░░░░░░░░░░░░░░░░░░░\n" +
                    "░░░░░░░░░░░░▐   ░░░░░░░░░░░░░░░░░░░░░░\n" +
                    "░░░░░░░░░░░░▐ ▄  ▓▓    ▓▓█▀▀▀█▄       \n" +
                    "░░░░░░░░░░░░░▌▀▀▄▓▓▓  ▓▓▀   ▄▄▄█   ▄  \n" +
                    "░░░░░░░░░░░░░▌▄   █▓▓ ▓▄▄ ▀█████  ▄█  \n" +
                    "░░░░░░░░░░░░░░▌█ ▀█▓▓▓▓██▄▄█████▄████▄\n" +
                    "░░░░░░░░░░░░░░▌█▓▓▓▓▓▓▓▓▓▓▓▓██████████\n" +
                    "░░░░░░░░░░░░░░▌   ░░░░░░░░░░░░░▀▀▀▀███\n" +
                    "░░░░░░░░░░░░░░█  ░░░░░░░░░░░░░░░░░░░░▐\n" +
                    "░░░░░░░░░░░░░░█  ░░░░░░░░░░░░░░░░░░░░█\n" +
                    "░░░░░░░░░░░░░░░█  ░░░░░░░░░░░░░░░░░░█ \n" +
                    "░░░░░░░░░░░░░░░░█  ░░░░░░░░░░░░░░░░█ ░\n" +
                    "░░░░░░░░░░░░░░░███  ░░░░░░░░░░░░░██  ░\n" +
                    "░░░░░░░░░░░░░███▀▀█  ░░░░░░░░░░▄█▀  ░░\n" +
                    "░░░░░░░░░░░▄██░░░░░█▄ ░░░░░░░██▀   ░░░\n" +
                    "░░░░░░░░░▄██░░░░░░░░ █▄ ░░░█▀     ░░░░\n" +
                    "░░░░░░░░██░░░░░░░░░░░░ ▀██▀      ░░░░░\n" +
                    "░░░░░░░█░░░░░░░░░░░░░░░         ░░░░░░\n");

        System.out.println("------------- 강도 -------------");
        System.out.println("[HP]=" + this.HP +"  [공격력]=" + this.공격력 + "  [방어력]=" + this.방어력);
    }
}
//class NightPower extends Thread {
//    LocalTime now = LocalTime.now();
//    int hour = now.getHour();
//    int 공격력;
//
//    @Override
//    public void run() {
//        try{
//            while(true) {
//                if (hour <= 24 && hour >= 21 ) {
//                    공격력 +=10;
//                    System.out.println("(몬스터의 공격력이 상승합니다.)");
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}

class tfBoss extends enemy {
    String name = "강도보스";
    int HP = 100;
    int 방어력 = 10;
    int 공격력 = 50;

    public void nightpower() {
        if (hour <= 24 && hour >= 21 ) {
            공격력 += 공격력 * 2 / 10;
            HP += HP * 1/10;
            System.out.println("[어두운 밤의 기운을 받아 몬스터 공격력과 체력이 상승합니다.]");
            System.out.println("(공격력 " + 공격력 * 2 / 10 + "증가)");
            System.out.println("(체력 " + HP * 1 / 10 + "증가)");
        }else if(hour <=20 && hour >=17){
            공격력 += 공격력 * 1 / 10;
            HP += HP * 1/10;
            System.out.println("[붉은 노을의 기운을 받아 몬스터 공격력과 체력이 소량 상승합니다.]");
            System.out.println("(공격력 " + 공격력 * 1 / 10 + "증가)");
            System.out.println("(체력 " + HP * 1 / 10 + "증가)");

        } else if(hour <= 6 && hour >=0){
            공격력 += 공격력 * 1 / 10;
            System.out.println("[새벽 안개의 기운을 받아 몬스터 소량 공격력이 상승합니다.]");
            System.out.println("[공격력 " + 공격력*1/10 + "증가]");

        }else{
            System.out.println(" ");
        }
    }

    public void img() {
        System.out.println(    //강도보스
                        "░░░░░░░░░░▄▄█ ░█▀▀░░░░░░░░░░░░░░░░░░░░\n" +
                        "░░░░░░░░░█▀ ░█▀░░░░░░░░░░░░░░░░█░░░░░░\n" +
                        "░░░░░░░░█ ░░█░░░░░░░░░░░░░░░░░░░░█░░░░\n" +
                        "░░░░░░░░█ ░░░░░▄▀▀░░░░░░░░░▄ ░░░░░░░░░\n" +
                        "░░░░░░░░█▄ ░▄░░█ ░░▐░░░░░░░░▀█ ░░░▄░░░\n" +
                        "░░░░░░░░▌▌  █ ░░█ ░░░░░▄▄ ░░░░█ ░░░█▄░\n" +
                        "░░░░░░░▐ ▌ ░▐ ░░█ ░░▓▄▐▓ ▀▓▄ ░░█▄ ░░░░\n" +
                        "░░░░░░░▐ █ ░▐ ░▀▓▌░░▓▓▓▓▓ ▀▀▀█ ░██ ░░░\n" +
                        "░░░░░░░▐ ▐ ░  ▐█ ▀▌░▓▓▀   ██  █▄▐█▌░░░\n" +
                        "░░░░░░░░█ ▐▌ █▄▄▓▓▓▌▓▓▓█▄▄▄  █████▌░░░\n" +
                        "░░░░░░░░░█ █ ▐▓▓▀ ░░░░▀▓▓▓██ █████▌░░▐\n" +
                        "░░░░░░░░░░█▐▌▐   ░░░░░░░░░░░░░░░░░▌░▐░\n" +
                        "░░░░░░░░░░░▀░█  ░░░░░░░░░░░░░░░░░▌░▐░░\n" +
                        "░░░░░░░░░░░░░█  ░░░░░░░░░░░░░░░░░▌▀░░█\n" +
                        "░░░░░░░░░░ ▄ ░▌  ░░░░░░░░░░░░░░░░▀░░░█\n" +
                        "░░░░░░░░░░ ▌░█ ▌  ░░░░░░░░░░░░░░░░░██ \n" +
                        "░░░░░░ ▄░░ ▌ ░█ ▌  ░░░░░░░░░░░░░░██▀  \n" +
                        "░░░░░░▐ █▄▐███▀▀█▐  ░░░░░░░░░░░▄█▀   ░\n" +
                        "░░░░░ ▌░▄██░░░░░░░█▄ ░░░░░░░██▀     ░░\n" +
                        "░░░░░ ▌█░░░░░░░░░░░░█▄ ░░░█▀       ░░░\n" +
                        "░░░ ▄█░░░░░░░░░░░░░░░ ▀▀▀▀        ░░░░\n" +
                        "░░░ █░░░░░░░░░░░░░░░░░          ░░░░░░\n");
    }

    public void 스탯() {
        if (HP < 1){
            HP = 0;
        }
        System.out.println(    //강도보스
                    "░░░░░░░░░░▄▄█ ░█▀▀░░░░░░░░░░░░░░░░░░░░\n" +
                    "░░░░░░░░░█▀ ░█▀░░░░░░░░░░░░░░░░█░░░░░░\n" +
                    "░░░░░░░░█ ░░█░░░░░░░░░░░░░░░░░░░░█░░░░\n" +
                    "░░░░░░░░█ ░░░░░▄▀▀░░░░░░░░░▄ ░░░░░░░░░\n" +
                    "░░░░░░░░█▄ ░▄░░█ ░░▐░░░░░░░░▀█ ░░░▄░░░\n" +
                    "░░░░░░░░▌▌  █ ░░█ ░░░░░▄▄ ░░░░█ ░░░█▄░\n" +
                    "░░░░░░░▐ ▌ ░▐ ░░█ ░░▓▄▐▓ ▀▓▄ ░░█▄ ░░░░\n" +
                    "░░░░░░░▐ █ ░▐ ░▀▓▌░░▓▓▓▓▓ ▀▀▀█ ░██ ░░░\n" +
                    "░░░░░░░▐ ▐ ░  ▐█ ▀▌░▓▓▀   ██  █▄▐█▌░░░\n" +
                    "░░░░░░░░█ ▐▌ █▄▄▓▓▓▌▓▓▓█▄▄▄  █████▌░░░\n" +
                    "░░░░░░░░░█ █ ▐▓▓▀ ░░░░▀▓▓▓██ █████▌░░▐\n" +
                    "░░░░░░░░░░█▐▌▐   ░░░░░░░░░░░░░░░░░▌░▐░\n" +
                    "░░░░░░░░░░░▀░█  ░░░░░░░░░░░░░░░░░▌░▐░░\n" +
                    "░░░░░░░░░░░░░█  ░░░░░░░░░░░░░░░░░▌▀░░█\n" +
                    "░░░░░░░░░░ ▄ ░▌  ░░░░░░░░░░░░░░░░▀░░░█\n" +
                    "░░░░░░░░░░ ▌░█ ▌  ░░░░░░░░░░░░░░░░░██ \n" +
                    "░░░░░░ ▄░░ ▌ ░█ ▌  ░░░░░░░░░░░░░░██▀  \n" +
                    "░░░░░░▐ █▄▐███▀▀█▐  ░░░░░░░░░░░▄█▀   ░\n" +
                    "░░░░░ ▌░▄██░░░░░░░█▄ ░░░░░░░██▀     ░░\n" +
                    "░░░░░ ▌█░░░░░░░░░░░░█▄ ░░░█▀       ░░░\n" +
                    "░░░ ▄█░░░░░░░░░░░░░░░ ▀▀▀▀        ░░░░\n" +
                    "░░░ █░░░░░░░░░░░░░░░░░          ░░░░░░\n");
        System.out.println("-------------강도보스-------------");
        System.out.println("[HP]=" + this.HP +"  [공격력]=" + this.공격력 + "  [방어력]=" + this.방어력);
    }

    public void attack() {
        System.out.println(    //강도보스
                        "░░░░░░░░░░▄▄█ ░█▀▀░░░░░░░░░░░░░░░░░░░░\n" +
                        "░░░░░░░░░█▀ ░█▀░░░░░░░░░░░░░░░░█░░░░░░\n" +
                        "░░░░░░░░█ ░░█░░░░░░░░░░░░░░░░░░░░█░░░░\n" +
                        "░░░░░░░░█ ░░░░░▄▀▀░░░░░░░░░▄ ░░░░░░░░░\n" +
                        "░░░░░░░░█▄ ░▄░░█ ░░▐░░░░░░░░▀█ ░░░▄░░░\n" +
                        "░░░░░░░░▌▌  █ ░░█ ░░░░░▄▄ ░░░░█ ░░░█▄░\n" +
                        "░░░░░░░▐ ▌ ░▐ ░░█ ░░▓▄▐▓ ▀▓▄ ░░█▄ ░░░░\n" +
                        "░░░░░░░▐ █ ░▐ ░▀▓▌░░▓▓▓▓▓ ▀▀▀█ ░██ ░░░\n" +
                        "░░░░░░░▐ ▐ ░  ▐█ ▀▌░▓▓▀   ██  █▄▐█▌░░░\n" +
                        "░░░░░░░░█ ▐▌ █▄▄▓▓▓▌▓▓▓█▄▄▄  █████▌░░░\n" +
                        "░░░░░░░░░█ █ ▐▓▓▀ ░░░░▀▓▓▓██ █████▌░░▐\n" +
                        "░░░░░░░░░░█▐▌▐   ░░░░░░░░░░░░░░░░░▌░▐░\n" +
                        "░░░░░░░░░░░▀░█  ░░░░░░░░░░░░░░░░░▌░▐░░\n" +
                        "░░░░░░░░░░░░░█  ░░░░░░░░░░░░░░░░░▌▀░░█\n" +
                        "░░░░░░░░░░ ▄ ░▌  ░░░░░░░░░░░░░░░░▀░░░█\n" +
                        "░░░░░░░░░░ ▌░█ ▌  ░░░░░░░░░░░░░░░░░██ \n" +
                        "░░░░░░ ▄░░ ▌ ░█ ▌  ░░░░░░░░░░░░░░██▀  \n" +
                        "░░░░░░▐ █▄▐███▀▀█▐  ░░░░░░░░░░░▄█▀   ░\n" +
                        "░░░░░ ▌░▄██░░░░░░░█▄ ░░░░░░░██▀     ░░\n" +
                        "░░░░░ ▌█░░░░░░░░░░░░█▄ ░░░█▀       ░░░\n" +
                        "░░░ ▄█░░░░░░░░░░░░░░░ ▀▀▀▀        ░░░░\n" +
                        "░░░ █░░░░░░░░░░░░░░░░░          ░░░░░░\n");
        Thread attacksound = new Thread(new attackSound());     //스킬 효과음 쓰레드

        attacksound.start();

        try {
            attacksound.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }    //쓰레드 끝

        System.out.println("["+name + "가 당신을 공격했습니다.]");
    }
}
class devilB extends enemy {
    String name = "악마";
    int HP = 600;
    int 방어력 = 50;
    int 공격력 = 200;

    public void nightpower() {
        if (hour <= 24 && hour >= 21 ) {
            공격력 += 공격력 * 2 / 10;
            HP += HP * 1/10;
            System.out.println("[어두운 밤의 기운을 받아 몬스터 공격력과 체력이 상승합니다.]");
            System.out.println("(공격력 " + 공격력 * 2 / 10 + "증가)");
            System.out.println("(체력 " + HP * 1 / 10 + "증가)");
        }else if(hour <=20 && hour >=17){
            공격력 += 공격력 * 1 / 10;
            HP += HP * 1/10;
            System.out.println("[붉은 노을의 기운을 받아 몬스터 공격력과 체력이 소량 상승합니다.]");
            System.out.println("(공격력 " + 공격력 * 1 / 10 + "증가)");
            System.out.println("(체력 " + HP * 1 / 10 + "증가)");

        } else if(hour <= 6 && hour >=0){
            공격력 += 공격력 * 1 / 10;
            System.out.println("[새벽 안개의 기운을 받아 몬스터 소량 공격력이 상승합니다.]");
            System.out.println("[공격력 " + 공격력*1/10 + "증가]");

        }else{
            System.out.println(" ");
        }
    }

    public void 스탯() {
        if (HP < 1){
            HP = 0;
        }
        System.out.println(
                    "░░░░░░░░░░░░░░ ▄▄█▀░█▀▀░░░░▌▐░░░░█░░░░░░░░\n" +
                    "░░░░░█░░░░░░░ █▀ ░█▀░░░░░░█ ░█░░░░██░░░░░░\n" +
                    "░░░░░▌█░░░░░ █ ░░█░░░░░░░░█ ░░██░░░███░░░░\n" +
                    "░░░░▐ ░█░░░░ █ ░░░░░▄░░░░░█  ░░██░░░██░░░░\n" +
                    "░░░░▐ ░▀██▄░ █▄ ░▄ ░█░░░░░█▄ ░░░███░░██░░░\n" +
                    "░░░░▐▌ ░░░████  █▄ ░█ ░░░░░█▄  ░░░█░░██░░░\n" +
                    "░░░░░▀▄  ░░░░█▌░ ▐ ▐░▓▄ ░░▄▐▓░▀  ▄▌░░██░░░\n" +
                    "░░░░░░░▀▄  ░░░█░ ▐  ▀▓▓▄ ░▓▓▓█▀   █▌░░██░░\n" +
                    "░░░░░░░░░▀█▄▄     ▌ ▀ ▀▓▌░▓▀   ▀   ▌░░██░░\n" +
                    "░░░░░░░░░░░░ █ ▐░ ▐  ▄▓▓ ▌███▄▄▄  █▌░░██░░\n" +
                    "░░░░░░░░░░░░░ █ ░ ▐ ▓▓▓ ▐████████ █▌░░█░░░\n" +
                    "░░░░░░░░░░░░░░ █ ░ ▌█▓▓ ▀▀▀▀█████▌█▌░░█░░░\n" +
                    "░░░░░░░░░░░░░░ █ ░▐ █▓▓▓▄▄▄█████▀██▌░░█░░░\n" +
                    "░░░░░░░░░░░░░░ █ ░▐ ▐▓▓▄ ▐▀▀▀▀█▀ ▐█▌░░█░░░\n" +
                    "░░░░░░░░░░░░░░ █ ░░  ▐▓▓▄        ██▌░░█░░░\n" +
                    "░░░░░░░░░░░░░░ █ ░░▐   ▀██▄▄▄▄▄████▌░░█░░░\n" +
                    "░░░░░░░░░░ ▄▄▄██ ░░░▓   ▀██▓▓▓▓███▀ ░░░░░░\n" +
                    "░░░░░░░ ▄██▓▓▓▓▓ ░ ░░▓     ▀███▀▀    ░░░░░\n" +
                    "░░░░░ ▄███▓▓▓▓▓▓ ░▓ ░▓▓▄            ▄▌░▌░░\n" +
                    "░░░ ▄███▓▓▓▓▓▓▓▓ ▓▓▓ ░█▓▓▓▄        ▄▓▓ ░▌░\n" +
                    "░░ ▄████▓▓▓▓▓▓▓▓▓▓▓▓ ░███▓▓▓▓█▄▄▄▄▄█▓▓▓ ▓░\n" +
                    "░ █████▓▓▓▓▓▓▓▓▓▓▓▓▓ █████▓▓▓▓████▓▓▓▓▓▓▓▓\n");
        System.out.println("-------------- 악마 --------------");
        System.out.println("[HP]=" + this.HP +"  [공격력]=" + this.공격력 + "  [방어력]=" + this.방어력);
        System.out.println("---------------------------------");
    }

    public void img() {
        System.out.println(
                "░░░░░░░░░░░░░░ ▄▄█▀░█▀▀░░░░▌▐░░░░█░░░░░░░░\n" +
                        "░░░░░█░░░░░░░ █▀ ░█▀░░░░░░█ ░█░░░░██░░░░░░\n" +
                        "░░░░░▌█░░░░░ █ ░░█░░░░░░░░█ ░░██░░░███░░░░\n" +
                        "░░░░▐ ░█░░░░ █ ░░░░░▄░░░░░█  ░░██░░░██░░░░\n" +
                        "░░░░▐ ░▀██▄░ █▄ ░▄ ░█░░░░░█▄ ░░░███░░██░░░\n" +
                        "░░░░▐▌ ░░░████  █▄ ░█ ░░░░░█▄  ░░░█░░██░░░\n" +
                        "░░░░░▀▄  ░░░░█▌░ ▐ ▐░▓▄ ░░▄▐▓░▀  ▄▌░░██░░░\n" +
                        "░░░░░░░▀▄  ░░░█░ ▐  ▀▓▓▄ ░▓▓▓█▀   █▌░░██░░\n" +
                        "░░░░░░░░░▀█▄▄     ▌ ▀ ▀▓▌░▓▀   ▀   ▌░░██░░\n" +
                        "░░░░░░░░░░░░ █ ▐░ ▐  ▄▓▓ ▌███▄▄▄  █▌░░██░░\n" +
                        "░░░░░░░░░░░░░ █ ░ ▐ ▓▓▓ ▐████████ █▌░░█░░░\n" +
                        "░░░░░░░░░░░░░░ █ ░ ▌█▓▓ ▀▀▀▀█████▌█▌░░█░░░\n" +
                        "░░░░░░░░░░░░░░ █ ░▐ █▓▓▓▄▄▄█████▀██▌░░█░░░\n" +
                        "░░░░░░░░░░░░░░ █ ░▐ ▐▓▓▄ ▐▀▀▀▀█▀ ▐█▌░░█░░░\n" +
                        "░░░░░░░░░░░░░░ █ ░░  ▐▓▓▄        ██▌░░█░░░\n" +
                        "░░░░░░░░░░░░░░ █ ░░▐   ▀██▄▄▄▄▄████▌░░█░░░\n" +
                        "░░░░░░░░░░ ▄▄▄██ ░░░▓   ▀██▓▓▓▓███▀ ░░░░░░\n" +
                        "░░░░░░░ ▄██▓▓▓▓▓ ░ ░░▓     ▀███▀▀    ░░░░░\n" +
                        "░░░░░ ▄███▓▓▓▓▓▓ ░▓ ░▓▓▄            ▄▌░▌░░\n" +
                        "░░░ ▄███▓▓▓▓▓▓▓▓ ▓▓▓ ░█▓▓▓▄        ▄▓▓ ░▌░\n" +
                        "░░ ▄████▓▓▓▓▓▓▓▓▓▓▓▓ ░███▓▓▓▓█▄▄▄▄▄█▓▓▓ ▓░\n" +
                        "░ █████▓▓▓▓▓▓▓▓▓▓▓▓▓ █████▓▓▓▓████▓▓▓▓▓▓▓▓\n");
    }

    public void imgS(){
        System.out.println(
                "░░░░░░░░░░░░░░ ▄▄█▀░█▀▀░░░░▌▐░░░░█░░░░░░░░\n" +
                        "░░░░░█░░░░░░░ █▀ ░█▀░░░░░░█ ░█░░░░██░░░░░░\n" +
                        "░░░░░▌█░░░░░ █ ░░█░░░░░░░░█ ░░██░░░███░░░░\n" +
                        "░░░░▐ ░█░░░░ █ ░░░░░▄░░░░░█  ░░██░░░██░░░░\n" +
                        "░░░░▐ ░▀██▄░ █▄ ░▄ ░█░░░░░█▄ ░░░███░░██░░░\n" +
                        "░░░░▐▌ ░░░████  █▄ ░█ ░░░░░█▄  ░░░█░░██░░░\n" +
                        "░░░░░▀▄  ░░░░█▌░ ▐▌█░▓▄ ░░▄▐▓░▀  ▄▌░░██░░░\n" +
                        "░░░░░░░▀▄  ░░░█░ ▐ ██▓▓▄ ░▓▓▓███▌ █▌░░██░░\n" +
                        "░░░░░░░░░▀█▄▄     ▌▀▀▀ ▓▌░▓▀ ▀▀▀  ▀▌░░██░░\n" +
                        "░░░░░░░░░░░░ █ ▐░ ▐  ▄▓▓ ▌███▄▄▄  █▌░░██░░\n" +
                        "░░░░░░░░░░░░░ █ ░ ▐ ▓▓▓ ▐████████ █▌░░█░░░\n" +
                        "░░░░░░░░░░░░░░ █ ░ ▌█▓▓ ▀▀▀▀█████▌█▌░░█░░░\n" +
                        "░░░░░░░░░░░░░░ █ ░▐ █▓▓▓▄▄▄████████▌░░█░░░\n" +
                        "░░░░░░░░░░░░░░ █ ░▐ ▐▓▓█▀▀▀▀▀▀▀▀▀██▌░░█░░░\n" +
                        "░░░░░░░░░░░░░░ █ ░░   ▀█▄▄██████▄▄█▌░░█░░░\n" +
                        "░░░░░░░░░░░░░░ █ ░░▐    ▀██▓▓▓▓███▀ ░░█░░░\n" +
                        "░░░░░░░░░░ ▄▄▄██ ░░░▓     ▀█████▀   ░░░░░░\n" +
                        "░░░░░░░ ▄██▓▓▓▓▓ ░ ░░▓               ░░░░░\n" +
                        "░░░░░ ▄███▓▓▓▓▓▓ ░▓ ░▓▓▄            ▄▌░▌░░\n" +
                        "░░░ ▄███▓▓▓▓▓▓▓▓ ▓▓▓ ░█▓▓▓▄        ▄▓▓ ░▌░\n" +
                        "░░ ▄████▓▓▓▓▓▓▓▓▓▓▓▓ ░███▓▓▓▓█▄▄▄▄▄█▓▓▓ ▓░\n" +
                        "░ █████▓▓▓▓▓▓▓▓▓▓▓▓▓ █████▓▓▓▓████▓▓▓▓▓▓▓▓\n");

    }
    public void imgT(){
        System.out.println(
                "░░░░░░░░░░░░░░ ▄▄█▀░█▀▀░░░░▌▐░░░░█░░░░░░░░\n" +
                        "░░░░░█░░░░░░░ █▀ ░█▀░░░░░░█ ░█░░░░██░░░░░░\n" +
                        "░░░░░▌█░░░░░ █ ░░█░░░░░░░░█ ░░██░░░███░░░░\n" +
                        "░░░░▐ ░█░░░░ █ ░░░░░▄░░░░░█  ░░██░░░██░░░░\n" +
                        "░░░░▐ ░▀██▄░ █▄ ░▄ ░█░░░░░█▄ ░░░███░░██░░░\n" +
                        "░░░░▐▌ ░░░████  █▄ ░█ ░░░░░█▄  ░░░█░░██░░░\n" +
                        "░░░░░▀▄  ░░░░█▌░ ▐▌█░▓▄ ░░▄▐▓░▀  ▄▌░░██░░░\n" +
                        "░░░░░░░▀▄  ░░░█░ ▐ ██▓▓▄ ░▓▓▓███▌ █▌░░██░░\n" +
                        "░░░░░░░░░▀█▄▄     ▌▀▀▀ ▓▌░▓▀ ▀▀▀  ▀▌░░██░░\n" +
                        "░░░░░░░░░░░░ █ ▐░ ▐▐▀▄▓▓ ▌███▄▄ ▀▌█▌░░██░░\n" +
                        "░░░░░░░░░░░░░ █ ░ ▐ ▓▓▓ ▐██████▐█ █▌░░█░░░\n" +
                        "░░░░░░░░░░░░░░ █ ░ ▌█▓▓ ▀▀▀▀███▌█▌█▌░░█░░░\n" +
                        "░░░░░░░░░░░░░░ █ ░▐ █▓▓▓▄▄▄████▌▀██▌░░█░░░\n" +
                        "░░░░░░░░░░░░░░ █ ░▐ ▐▓▓█▀▀▀▀▀▀▀▀▀██▌░░█░░░\n" +
                        "░░░░░░░░░░░░░░ █ ░░   ▀█▄▄██████▄▄█▌░░█░░░\n" +
                        "░░░░░░░░░░░░░░ █ ░░▐    ▀██▓▓▓▓███▀ ░░█░░░\n" +
                        "░░░░░░░░░░ ▄▄▄██ ░░░▓     ▀█████▀   ░░░░░░\n" +
                        "░░░░░░░ ▄██▓▓▓▓▓ ░ ░░▓     ▄         ░░░░░\n" +
                        "░░░░░ ▄███▓▓▓▓▓▓ ░▓ ░▓▓▄     ▀      ▄▌░▌░░\n" +
                        "░░░ ▄███▓▓▓▓▓▓▓▓ ▓▓▓ ░█▓▓▓▄        ▄▓▓ ░▌░\n" +
                        "░░ ▄████▓▓▓▓▓▓▓▓▓▓▓▓ ░███▓▓▓▓█▄▄▄▄▄█▓▓▓ ▓░\n" +
                        "░ █████▓▓▓▓▓▓▓▓▓▓▓▓▓ █████▓▓▓▓████▓▓▓▓▓▓▓▓\n");

    }

    public void attack() {
        System.out.println(
                        "░░░░░░░░░░░░░░ ▄▄█▀░█▀▀░░░░▌▐░░░░█░░░░░░░░\n" +
                        "░░░░░█░░░░░░░ █▀ ░█▀░░░░░░█ ░█░░░░██░░░░░░\n" +
                        "░░░░░▌█░░░░░ █ ░░█░░░░░░░░█ ░░██░░░███░░░░\n" +
                        "░░░░▐ ░█░░░░ █ ░░░░░▄░░░░░█  ░░██░░░██░░░░\n" +
                        "░░░░▐ ░▀██▄░ █▄ ░▄ ░█░░░░░█▄ ░░░███░░██░░░\n" +
                        "░░░░▐▌ ░░░████  █▄ ░█ ░░░░░█▄  ░░░█░░██░░░\n" +
                        "░░░░░▀▄  ░░░░█▌░ ▐ ▐░▓▄ ░░▄▐▓░▀  ▄▌░░██░░░\n" +
                        "░░░░░░░▀▄  ░░░█░ ▐  ▀▓▓▄ ░▓▓▓█▀   █▌░░██░░\n" +
                        "░░░░░░░░░▀█▄▄     ▌ ▀ ▀▓▌░▓▀   ▀   ▌░░██░░\n" +
                        "░░░░░░░░░░░░ █ ▐░ ▐  ▄▓▓ ▌███▄▄▄  █▌░░██░░\n" +
                        "░░░░░░░░░░░░░ █ ░ ▐ ▓▓▓ ▐████████ █▌░░█░░░\n" +
                        "░░░░░░░░░░░░░░ █ ░ ▌█▓▓ ▀▀▀▀█████▌█▌░░█░░░\n" +
                        "░░░░░░░░░░░░░░ █ ░▐ █▓▓▓▄▄▄█████▀██▌░░█░░░\n" +
                        "░░░░░░░░░░░░░░ █ ░▐ ▐▓▓▄ ▐▀▀▀▀█▀ ▐█▌░░█░░░\n" +
                        "░░░░░░░░░░░░░░ █ ░░  ▐▓▓▄        ██▌░░█░░░\n" +
                        "░░░░░░░░░░░░░░ █ ░░▐   ▀██▄▄▄▄▄████▌░░█░░░\n" +
                        "░░░░░░░░░░ ▄▄▄██ ░░░▓   ▀██▓▓▓▓███▀ ░░░░░░\n" +
                        "░░░░░░░ ▄██▓▓▓▓▓ ░ ░░▓     ▀███▀▀    ░░░░░\n" +
                        "░░░░░ ▄███▓▓▓▓▓▓ ░▓ ░▓▓▄            ▄▌░▌░░\n" +
                        "░░░ ▄███▓▓▓▓▓▓▓▓ ▓▓▓ ░█▓▓▓▄        ▄▓▓ ░▌░\n" +
                        "░░ ▄████▓▓▓▓▓▓▓▓▓▓▓▓ ░███▓▓▓▓█▄▄▄▄▄█▓▓▓ ▓░\n" +
                        "░ █████▓▓▓▓▓▓▓▓▓▓▓▓▓ █████▓▓▓▓████▓▓▓▓▓▓▓▓\n");
        Thread devilAttack = new Thread(new devilAttack());     //스킬 효과음 쓰레드

        devilAttack.start();

        try {
            devilAttack.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }    //쓰레드 끝

        System.out.println("["+name + "가 당신을 공격했습니다.]");
    }


    public void 악마스킬() {
        System.out.println("["+name + "가 악한 기운으로 몸을 강화합니다.]");

        Thread dvEF = new Thread(new devilSkillEffect());   //스킬 이펙트 쓰레드
        Thread dvAR = new Thread(new devilAura());     //스킬 효과음 쓰레드

        dvEF.start();
        dvAR.start();

        try {
            dvEF.join();
            dvAR.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }    //쓰레드 끝

        HP += 500;
        공격력 += 200;
        방어력 += 50;
    }

}





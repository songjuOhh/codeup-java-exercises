
package game;

import java.io.*;
import java.util.Hashtable;
import java.util.Scanner;


public class GamePrac extends Thread{
    public static void main(String args[]){

        Hashtable <String, String> Ending = new Hashtable<String, String>(); // Hashtable 실험


//        Runnable Ropening1 = new Runnable() {   // 자체는 쓰레드는 아니지만 정리해주는 쓰게될 쓰레드를 개념 // 별도의 공강
//            @Override   // 아래 코드를 무조건 추가해야됨을 강조
//            public void run() {
//                Thread opening = new Thread(new introThread());
//                try {
//                    opening.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//            }
//        };
        Scanner sc = new Scanner(System.in);
        캐릭터 user= new 캐릭터();
        user.space();

        Thread opening = new Thread(new introThread());   //인트로 쓰레드
        Thread openingBGM = new Thread(new introBGM());

        opening.start();
        openingBGM.start();

        try {
            opening.join();
            openingBGM.join();

        } catch (InterruptedException e) {
        e.printStackTrace();
        }

        long start = System.currentTimeMillis();


        String next;

        System.out.println(" ");
        System.out.println("[계속 하려면 아무 키나 누르세요.]");
        next = sc.nextLine();
user.space();
        System.out.println(" ");
        System.out.println("(당신은 낯선곳에서 눈을 뜹니다.)");
        next = sc.nextLine();
user.space();
        System.out.println("??: 여긴 어디지..?");
        next = sc.nextLine();
user.space();
        System.out.println("[당신의 이름은 무엇입니까?]");
        String name = sc.next();
        user.소개(name); // ctrl + H로 상속보기
user.space();
        next = sc.nextLine();
user.space();
        System.out.println( "[환영합니다, "+name+"님. 당신은 이 세계를 구할 용사입니다.]");
        next = sc.nextLine();
        user.space();

        CountTime CountTime = new CountTime();
        CountTime.setDaemon(true);
        CountTime.start();


        System.out.println(name+": 용사...?");
        next = sc.nextLine();
user.space();

        System.out.println("(꼬르륵)");

        Hungry Hungry = new Hungry();
        Hungry.setDaemon(true);
        Hungry.start();


        next = sc.nextLine();
user.space();


        System.out.println(name+": 배고파...");
        next = sc.nextLine();
user.space();
        user.스탯();

        System.out.println("인벤토리를 열어 보세요.");
        System.out.println("1.인벤토리를 열어본다.  2.무시한다.");
        int 인벤 = sc.nextInt();

        if (인벤 == 1){

            Open Open = new Open();
            Open.start();

            user.space();
            System.out.println("아이템: 먹음직한 빵");
            System.out.println("1.빵을 먹는다  2.안먹는다");
            int 빵 = sc.nextInt();
            if (빵 ==1 ){
                user.space();
                System.out.println("[빵을 맛있게 먹는다.]");

                Eating Eating = new Eating();
                Eating.setDaemon(true);
                Eating.start();
                next = sc.nextLine();

                System.out.println("[빵을 먹는중 무슨 소리가 들린다.]");
                next = sc.nextLine();
                System.out.println("[끼잉 끼잉]");
                DogC DogC = new DogC();
                DogC.setDaemon(true);
                DogC.start();

                System.out.println("(빵을 먹는중 배고파 보이는 개가 조심스럽게 다가와 당신을 바라본다.)");

                System.out.println(name+": 웅?");
                System.out.println("1.빵을 나눠준다   2.자신에게 투자한다");
                int 먹이기 = sc.nextInt();

                if (먹이기==1){
                    next = sc.nextLine();
                    user.space();
                    System.out.println(name+": 남은게 별로 없지만 이거라도...");
                    System.out.println("[빵을 건넨다.]");
                    System.out.println(" ");
                    System.out.println("개가 맛있게 빵을 먹는다");
                    next = sc.nextLine();
                    user.space();
                    user.포만감= user.포만감+3;
                    user.자비심= user.자비심+1;
                    System.out.println("포만감= "+user.포만감+" (+3)");
                    System.out.println("자비심= "+user.자비심+" (+1)");

                    UP UP0 = new UP();
                    UP0.start();
              
                    System.out.println("(여기서 '자비심'은 앞으로의 전직과 엔딩에 영향을 미칩니다.)");
                    next = sc.nextLine();
                    user.space();

                    System.out.println("(길을 걷다가 비명을 듣는다.)");
                    System.out.println("??: 꺄아아아악!");

                    next = sc.nextLine();
                    user.space();
                    System.out.println("(강도가 한 쓰러진 여인을 덮치는 모습을 발견한다.)");
                    System.out.println("강도: 가만히 있어!");
                    System.out.println("여인: 도와주세요!");

                    next = sc.nextLine();
                    user.space();
                    enemy 강도1 = new enemy();
                    System.out.println(name+": 멈춰!");
                    System.out.println("강도: 넌 뭐야!");
                    강도1.nightpower(); 강도1.스탯();

                    Battle Battle = new Battle();
                    Battle.setDaemon(true);
                    Battle.start();

                    next = sc.nextLine();
                    user.space();
                    System.out.println(" ");
                    System.out.println("강도: 건방진 녀석. 갈 길이나 갈것이지!");
                    강도1.attack();
                    user.HP = user.HP-강도1.공격력;
                    System.out.println("남은 HP= "+user.HP);
                    user.스탯();
                    System.out.println("1.공격한다  2.방어한다  3.도망간다");
                    int atkTf = sc.nextInt();
                    if (atkTf == 1) {
                        user.attack();
                        강도1.HP = 강도1.HP - user.공격력;
                        System.out.print("데미지=");
                        System.out.println(user.공격력 - 강도1.방어력);
                        System.out.println(" ");
                        강도1.nightpower(); 강도1.스탯();
                        System.out.println("강도 HP= "+ 강도1.HP);

                        Drop 강도Drop = new Drop();
                        강도Drop.start();
                        System.out.println(    //강도1
                                        "░░░░░░░░░░░░░░░░█▀ ░░░░░░░░░░░░░░░░░░░\n" +
                                        "░░░░░░░░░░░░░░█▀ ░░░░░░░░░░░░░░░░░░░░░\n" +
                                        "░░░░░░░░░░░░░█  ░░░░░░░░░░░░░░░░░░░░░░\n" +
                                        "░░░░░░░░░░░░▐  ░░░░░░░░░░░░░░░░░░░░░░░\n" +
                                        "░░░░░░░░░░░░▐   ░░░░░░░░░░░░░░░░░░░░░░\n" +
                                        "░░░░░░░░░░░░▐ ▄  ▓▓    ▓▓█████▄       \n" +
                                        "░░░░░░░░░░░░░▌▀▀▄▓▓▓  ▓▓▀▀▀▀▀▀██   ▄  \n" +
                                        "░░░░░░░░░░░░░▌▄   █▓▓ ▓▄▄▄███▄▄█  ▄█  \n" +
                                        "░░░░░░░░░░░░░░▌▀▀▀█▓▓▓▓▄▀▀▀▀▀███▄████▄\n" +
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
                                        "░░░░░░░█░░░░░░░░░░░░░░░         ░░░░░░\n" );
                        System.out.println("[강도가 쓰러졌습니다.]");


                        System.out.println(" ");
                        Battle.stop();
                    } else if(atkTf == 2){
                        user.defence();
                        System.out.println("[방어력이 1턴간 증가합니다.]");
                        user.스탯();
                        강도1.attack();
                        System.out.println("이거나 먹어라!");
                        user.HP = user.HP-강도1.공격력;
                        System.out.println("남은 HP= "+user.HP);
                        System.out.println("1.반격한다  2.도망간다");
                        int atkTf2 = sc.nextInt();
                        if (atkTf2==1){
                            user.attack();
                            강도1.HP = 강도1.HP - user.공격력;
                            System.out.print("데미지=");
                            System.out.println(user.공격력 - 강도1.방어력);
                            System.out.println(" ");
                            System.out.println("강도 HP= "+ 강도1.HP);

                            Drop 강도Drop = new Drop();
                            강도Drop.start();
                            System.out.println(    //강도1
                                "░░░░░░░░░░░░░░░░█▀ ░░░░░░░░░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░░░░█▀ ░░░░░░░░░░░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░░░█  ░░░░░░░░░░░░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░░▐  ░░░░░░░░░░░░░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░░▐   ░░░░░░░░░░░░░░░░░░░░░░\n" +
                                "░░░░░░░░░░░░▐ ▄  ▓▓    ▓▓█████▄       \n" +
                                "░░░░░░░░░░░░░▌▀▀▄▓▓▓  ▓▓▀▀▀▀▀▀██   ▄  \n" +
                                "░░░░░░░░░░░░░▌▄   █▓▓ ▓▄▄▄███▄▄█  ▄█  \n" +
                                "░░░░░░░░░░░░░░▌▀▀▀█▓▓▓▓▄▀▀▀▀▀███▄████▄\n" +
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
                                "░░░░░░░█░░░░░░░░░░░░░░░         ░░░░░░\n" );
                            System.out.println("[강도가 쓰러졌습니다.]");
                            System.out.println(" ");
                            Battle.stop();
                        }else{
                            System.out.println("[당신은 용사로서 자격을 잃었습니다.]");
                            System.out.println(" ");

                            user.GameOver();
                            System.out.println("1. 다시 시작");
                            System.out.println("2. 게임 종료");
                            System.out.println(" ");
                            int End = sc.nextInt();
                            if(End ==1){
                                System.out.println("[게임을 다시 시작합니다.]");
                                next = sc.nextLine();
                                main(args);

                            }else{
                                System.out.println("[게임을 종료합니다.]");
                                System.exit(2);
                            }


                        }
                    }else{
                        System.out.println("[당신은 용사로서 자격을 잃었습니다.]");
                        user.GameOver();
                        System.out.println("1. 다시 시작");
                        System.out.println("2. 게임 종료");
                        System.out.println(" ");
                        int End = sc.nextInt();
                        if(End ==1){
                            System.out.println("[게임을 다시 시작합니다.]");
                            next = sc.nextLine();
                            main(args);

                        }else{
                            System.out.println("[게임을 종료합니다.]");
                            System.exit(2);
                        }
                    }
                    System.out.println("강도: 크윽... 두고보자..!");
                    System.out.println("(강도가 도망치려고 한다.)");
                    System.out.println("1.강도를 제압해 기절시킨다");
                    System.out.println("2.강도를 불구로 만든다");
                    System.out.println("3.강도를 그냥 보내준다");
                    int extf = sc.nextInt();
                    if (extf == 1) {
                        user.space();
                        System.out.println(name + ": 일단은 도망못가게 제압해야겠다.");
                        System.out.println("[강도를 뒤에서 잡아 숨을 막는다.]");
                        System.out.println("강도: 읍읍");
                        next = sc.nextLine();
                        user.space();
                        System.out.println("[강도가 몸부림치다 손을깨문다]");
                        System.out.println(name + ": 윽!");
                        next = sc.nextLine();
                        user.space();
                        System.out.println("[강도가 힘이 풀린 틈을 타 도망친다.]");
                        System.out.println(name + ": 이 자식..");
                        next = sc.nextLine();
                        user.space();
                        System.out.println(name + ": 괜찮으세요?");
                        System.out.println("[쓰러진 여인을 부축한다]");
                        System.out.println("여인: 감사합니다, 덕분에 살았어요.");
                        System.out.println(name+": 천만에요. 당연한 일을 했을 뿐인걸요.");
                        System.out.println(" ");
                        user.자비심 = user.자비심+3;
                        System.out.println("자비심= "+user.자비심+" (+3)");

                        UP UP = new UP();
                        UP.start();


                        next = sc.nextLine();
                        user.스탯();
                    }else if(extf == 2) {
                        user.space();
                        System.out.println(name+": 다신 범죄를 짓지 못하게 만들어야겠어..");
                        System.out.println("강도: 으아아아아ㅏ악");
                        System.out.println("[강도의 비명이 울려퍼진다]");
                        next = sc.nextLine();
                        user.space();

                        System.out.println("강도: 끄윽 제발.. 살려주세요! 잘못했어요..!");
                        System.out.println("우드득");
                        System.out.println("[강도의 비명이 다시한번 울려퍼진다]");
                        next = sc.nextLine();
                        user.space();
                        System.out.println("여인: 꺄악 그만하세요!");
                        System.out.println(name+": 그치만 이런 녀석은...");
                        next = sc.nextLine();
                        user.space();
                        System.out.println("여인: 전 괜찮으니까, 거기까지만 하세요. 이러다 사람 죽이겠어요.");
                        System.out.println("[겁에 질린 여인의 모습을 보고 강도를 놓아주자 강도는 절뚝 거리면서 도망가기 시작한다.]");
                        next = sc.nextLine();
                        user.space();
                        System.out.println("여인: 그래도 감사드려요. 덕분에 위험을 면했어요.");
                        System.out.println(name+":(도망가는 강도를 바라보며) 아닙니다.");
                        System.out.println(" ");
                        user.자비심 = user.자비심-3;
                        System.out.println("자비심= "+user.자비심+" (-3)");


                        UP UP = new UP();
                        UP.start();



                    }else{

                        user.space();
                        System.out.println(name+": 또 걸리면 그땐 가만두지 않겠다.");
                        System.out.println("강도: 칫!");
                        System.out.println("[강도가 도망갔다.]");
                        next = sc.nextLine();
                        next = sc.nextLine();
                        user.space();
                        System.out.println(name + ": 괜찮으세요?");
                        System.out.println("[쓰러진 여인을 부축한다]");
                        next = sc.nextLine();
                        user.space();
                        System.out.println("여인: 감사합니다, 덕분에 살았어요.");
                        System.out.println(name+": 천만에요. 당연한 일을 했을 뿐인걸요.");
                        System.out.println(" ");
                        user.자비심 = user.자비심+3;
                        System.out.println("자비심= "+user.자비심+" (+3)");

                        UP UP = new UP();
                        UP.start();

                    }


                }else {

                    user.space();
                    System.out.println(name+": 이 세계를 구하려면 에너지를 보충해야해...");
                    System.out.println("[개는 쓸쓸히 돌아간다.]");
                    System.out.println("빵을 마무리한다.");

                    user.포만감 = user.포만감+5;
                    user.자비심 = user.자비심-1;


                    System.out.println("포만감= "+user.포만감+" (+5)");
                    System.out.println("자비심= "+user.자비심+" (-1)");

                    UP UP0 = new UP();
                    UP0.start();

                    System.out.println("(여기서 '자비심'은 앞으로의 전직과 엔딩에 영향을 미칩니다.)");
                    next = sc.nextLine();
                    next = sc.nextLine();
                    user.space();
                    System.out.println("(길을 걷다가 비명을 듣는다.)");
                    System.out.println("??: 꺄아아아악!");

                    next = sc.nextLine();
                    user.space();
                    System.out.println("(강도가 한 쓰러진 여인을 덮치는 모습을 발견한다.)");
                    System.out.println("강도: 가만히 있어!");
                    System.out.println("여인: 도와주세요!");

                    next = sc.nextLine();
                    user.space();
                    enemy 강도1 = new enemy();
                    System.out.println(name+": 멈춰!");
                    System.out.println("강도: 넌 뭐야!");

                    Battle Battle = new Battle();
                    Battle.setDaemon(true);
                    Battle.start();

                    강도1.nightpower(); 강도1.스탯();
                    next = sc.nextLine();
                    user.space();
                    System.out.println(" ");
                    System.out.println("강도: 건방진 녀석. 갈 길이나 갈것이지!");
                    
                    강도1.nightpower(); 강도1.스탯();
                    next = sc.nextLine();
                    user.space();
                    강도1.attack();
                    user.HP = user.HP-강도1.공격력;
                    System.out.print("데미지= ");
                    System.out.println(강도1.공격력-user.방어력);
                    System.out.println("남은 HP= "+user.HP);
                    user.스탯();
                    user.action();
                    int atkTf = sc.nextInt();
                    if (atkTf == 1) {
                        user.attack();
                        강도1.HP = 강도1.HP - user.공격력;
                        System.out.print("데미지= ");
                        System.out.println(user.공격력-강도1.방어력);
                        System.out.println("강도 HP= "+ 강도1.HP);
                        강도1.nightpower(); 강도1.스탯();

                        Drop 강도Drop = new Drop();
                        강도Drop.start();

                        System.out.println(    //강도1
                                        "░░░░░░░░░░░░░░░░█▀ ░░░░░░░░░░░░░░░░░░░\n" +
                                        "░░░░░░░░░░░░░░█▀ ░░░░░░░░░░░░░░░░░░░░░\n" +
                                        "░░░░░░░░░░░░░█  ░░░░░░░░░░░░░░░░░░░░░░\n" +
                                        "░░░░░░░░░░░░▐  ░░░░░░░░░░░░░░░░░░░░░░░\n" +
                                        "░░░░░░░░░░░░▐   ░░░░░░░░░░░░░░░░░░░░░░\n" +
                                        "░░░░░░░░░░░░▐ ▄  ▓▓    ▓▓█████▄       \n" +
                                        "░░░░░░░░░░░░░▌▀▀▄▓▓▓  ▓▓▀▀▀▀▀▀██   ▄  \n" +
                                        "░░░░░░░░░░░░░▌▄   █▓▓ ▓▄▄▄███▄▄█  ▄█  \n" +
                                        "░░░░░░░░░░░░░░▌▀▀▀█▓▓▓▓▄▀▀▀▀▀███▄████▄\n" +
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
                                        "░░░░░░░█░░░░░░░░░░░░░░░         ░░░░░░\n" );

                        System.out.println("[강도가 쓰러졌습니다.]");
                        System.out.println(" ");
                        Battle.stop();
                    } else if(atkTf == 2){
                        user.defence();
                        System.out.println("[방어력이 1턴간 증가합니다.]");
                        user.스탯();
                        next = sc.nextLine();
                        user.space();
                        강도1.attack();
                        System.out.println("이거나 먹어라!");
                        user.HP = user.HP-강도1.공격력;
                        System.out.print("데미지= ");
                        System.out.println(강도1.공격력-user.방어력);
                        System.out.println("남은 HP= "+user.HP);
                        System.out.println("1.반격한다  2.도망간다");
                        int atkTf2 = sc.nextInt();
                        if (atkTf2==1){
                            user.attack();
                            강도1.HP = 강도1.HP - user.공격력;
                            System.out.print("데미지= ");
                            System.out.println(user.공격력-강도1.방어력);
                            System.out.println("강도 HP= "+ 강도1.HP);

                            Drop 강도Drop = new Drop();
                            강도Drop.start();

                            System.out.println(    //강도1
                                            "░░░░░░░░░░░░░░░░█▀ ░░░░░░░░░░░░░░░░░░░\n" +
                                            "░░░░░░░░░░░░░░█▀ ░░░░░░░░░░░░░░░░░░░░░\n" +
                                            "░░░░░░░░░░░░░█  ░░░░░░░░░░░░░░░░░░░░░░\n" +
                                            "░░░░░░░░░░░░▐  ░░░░░░░░░░░░░░░░░░░░░░░\n" +
                                            "░░░░░░░░░░░░▐   ░░░░░░░░░░░░░░░░░░░░░░\n" +
                                            "░░░░░░░░░░░░▐ ▄  ▓▓    ▓▓█████▄       \n" +
                                            "░░░░░░░░░░░░░▌▀▀▄▓▓▓  ▓▓▀▀▀▀▀▀██   ▄  \n" +
                                            "░░░░░░░░░░░░░▌▄   █▓▓ ▓▄▄▄███▄▄█  ▄█  \n" +
                                            "░░░░░░░░░░░░░░▌▀▀▀█▓▓▓▓▄▀▀▀▀▀███▄████▄\n" +
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
                                            "░░░░░░░█░░░░░░░░░░░░░░░         ░░░░░░\n" );
                            System.out.println("[강도가 쓰러졌습니다.]");
                            System.out.println(" ");
                            Battle.stop();
                        }else{
                            System.out.println("[당신은 용사로서 자격을 잃었습니다.]");
                            System.out.println(" ");

                            user.GameOver();
                            System.out.println("1. 다시 시작");
                            System.out.println("2. 게임 종료");
                            System.out.println(" ");
                            int End = sc.nextInt();
                            if(End ==1){
                                System.out.println("[게임을 다시 시작합니다.]");
                                next = sc.nextLine();
                                main(args);

                            }else{
                                System.out.println("[게임을 종료합니다.]");
                                System.exit(2);
                            }


                        }
                    }else{
                        System.out.println("[당신은 용사로서 자격을 잃었습니다.]");
                        System.out.println(" ");
                        user.GameOver();
                        System.out.println("1. 다시 시작");
                        System.out.println("2. 게임 종료");
                        System.out.println(" ");
                        int End = sc.nextInt();
                        if(End ==1){
                            System.out.println("[게임을 다시 시작합니다.]");
                            next = sc.nextLine();
                            main(args);

                        }else{
                            System.out.println("[게임을 종료합니다.]");
                            System.exit(2);
                        }
                    }
                    System.out.println("강도: 크윽... 두고보자..!");
                    System.out.println("(강도가 도망치려고 한다.)");
                    System.out.println("1.강도를 제압해 기절시킨다");
                    System.out.println("2.강도를 불구로 만든다");
                    System.out.println("3.강도를 그냥 보내준다");
                    int extf = sc.nextInt();
                    if (extf == 1) {
                        user.space();
                        System.out.println(name + ": 일단은 도망못가게 제압해야겠다.");
                        System.out.println("[강도를 뒤에서 잡아 숨을 막는다.]");
                        System.out.println("강도: 읍읍");
                        next = sc.nextLine();
                        user.space();
                        System.out.println("[강도가 몸부림치다 손을깨문다]");
                        System.out.println(name + ": 윽!");
                        next = sc.nextLine();
                        user.space();
                        System.out.println("[강도가 힘이 풀린 틈을 타 도망친다.]");
                        System.out.println(name + ": 이 자식..");
                        next = sc.nextLine();
                        user.space();
                        System.out.println(name + ": 괜찮으세요?");
                        System.out.println("[쓰러진 여인을 부축한다]");
                        System.out.println("여인: 감사합니다, 덕분에 살았어요.");
                        System.out.println(name+": 천만에요. 당연한 일을 했을 뿐인걸요.");
                        System.out.println(" ");
                        user.자비심 = user.자비심+3;
                        System.out.println("자비심= "+user.자비심+" (+3)");

                         //UP 효과음

                        UP UP = new UP();
                        UP.start();

                        next = sc.nextLine();
                        user.스탯();
                    }else if(extf == 2) {
                        user.space();
                        System.out.println(name+": 다신 범죄를 짓지 못하게 만들어야겠어..");
                        System.out.println("강도: 으아아아아ㅏ악");
                        System.out.println("[강도의 비명이 울려퍼진다]");
                        next = sc.nextLine();
                        user.space();
                        next = sc.nextLine();
                        user.space();
                        System.out.println("강도: 끄윽 제발.. 살려주세요! 잘못했어요..!");
                        System.out.println("우드득");
                        System.out.println("[강도의 비명이 다시한번 울려퍼진다]");
                        next = sc.nextLine();
                        user.space();
                        System.out.println("여인: 꺄악 그만하세요!");
                        System.out.println(name+": 그치만 이런 녀석은...");
                        next = sc.nextLine();
                        user.space();
                        System.out.println("여인: 전 괜찮으니까, 거기까지만 하세요. 이러다 사람 죽이겠어요.");
                        System.out.println("[겁에 질린 여인의 모습을 보고 강도를 놓아주자 강도는 절뚝 거리면서 도망가기 시작한다.]");
                        next = sc.nextLine();
                        user.space();
                        System.out.println("여인: 그래도 감사드려요. 덕분에 위험을 면했어요.");
                        System.out.println(name+":(도망가는 강도를 바라보며) 아닙니다.");
                        System.out.println(" ");
                        user.자비심 = user.자비심-3;
                        System.out.println("자비심= "+user.자비심+" (-3)");

                         //UP 효과음
                        UP UP = new UP();
                        UP.start();

                        next = sc.nextLine();
                        user.스탯();
                    }else{
                        user.space();
                        System.out.println(name+": 또 걸리면 그땐 가만두지 않겠다.");
                        System.out.println("강도: 칫");
                        System.out.println("[강도가 도망갔다.]");
                        next = sc.nextLine();
                        user.space();
                        System.out.println(name + ": 괜찮으세요?");
                        System.out.println("[쓰러진 여인을 부축한다]");
                        next = sc.nextLine();
                        user.space();
                        System.out.println("여인: 감사합니다, 덕분에 살았어요.");
                        System.out.println(name+": 천만에요. 당연한 일을 했을 뿐인걸요.");
                        System.out.println(" ");
                        user.자비심 = user.자비심+3;
                        System.out.println("자비심= "+user.자비심+" (+3)");

                         //UP 효과음
                        UP UP = new UP();
                        UP.start();

                        next = sc.nextLine();
                        user.스탯();
                    }
                }
            }else {
                System.out.println(name+": 힘이 나질 않아...");
                System.out.println("[당신은 배고파 쓰러졌습니다.]");
                Drop Drop = new Drop();
                Drop.start();
                System.out.println(" ");
                user.GameOver();
                System.out.println("1. 다시 시작");
                System.out.println("2. 게임 종료");
                System.out.println(" ");
                int End = sc.nextInt();
                if(End ==1){
                    System.out.println("[게임을 다시 시작합니다.]");
                    next = sc.nextLine();
                    main(args);

                }else{
                    System.out.println("[게임을 종료합니다.]");
                    System.exit(2);
                }
            }

        }else {
            System.out.println(name+": 힘이 나질 않아...");
            System.out.println("[당신은 배고파 쓰러졌습니다.]");
            Drop Drop = new Drop();
            Drop.start();
            System.out.println(" ");
            user.GameOver();
            System.out.println("1. 다시 시작");
            System.out.println("2. 게임 종료");
            System.out.println(" ");
            int End = sc.nextInt();
            if(End ==1){
                System.out.println("[게임을 다시 시작합니다.]");
                next = sc.nextLine();
                main(args);

            }else{
                System.out.println("[게임을 종료합니다.]");
                System.exit(2);
            }
        }
        CountTime.stop();

        System.out.println(" ");
        next = sc.nextLine();
        user.space();
        System.out.println("여인: 피곤하실텐데 쉬다가세요");
        System.out.println(name+": 그래도 괜찮을까요..?");
        next = sc.nextLine();
        user.space();
        System.out.println("여인: 그럼요 이래뵈도 제 생명의 은인이신데, 제가 또 한 요리 하거든요!");
        System.out.println(name+": 앗.. 감사합니다, 그럼 신세좀 지겠습니다.");
        next = sc.nextLine();
        user.space();
        System.out.println("["+name+"는(은) 여인이 해준 맛있는 음식을 먹고 편안한 시간을 보냈다.]");
        System.out.println("[모든 스탯이 회복되었습니다.]");

        Thread Recover = new Thread(new Recover()); //UP 효과음
        Recover.start();
        try{
            Recover.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        user.sleep();
        user.스탯();
        next = sc.nextLine();
        user.space();
        System.out.println("[다음날 아침]");
        System.out.println(name+": 정말 감사드립니다! 덕분에 잘 쉬었다 갑니다!");
        next = sc.nextLine();
        user.space();
        System.out.println("여인: 천만에요! 마을에서 앞으로의 여행에 도움이 될 물품들을 얻으실수 있을거에요!");
        System.out.println(name+": 신세 많이 졌습니다. 마을 갔다와서 꼭 보답하겠습니다!");
        next = sc.nextLine();
        user.space();
        if(user.HP >=0) {
            Village Village = new Village();
            Village.setDaemon(true);
            Village.start();

            System.out.println("[마을에 도착했다.]");
            System.out.println(name + ": 실례합니다, 길 좀 물어봐도 될까요?");
            System.out.println("마을장로: 네 그럼요... 어엇 당신은!!!");
            next = sc.nextLine();
            user.space();
            System.out.println("마을장로: 당신이 악마로 부터 저흴 구원하실 용사님이군요!");
            System.out.println("마을사람들: 용사..?!");
            System.out.println("마을사람들: (웅성웅성)");
            next = sc.nextLine();
            user.space();
            System.out.println(name + ": 하핫 그게...");
            System.out.println("마을장로: 오래 기다렸습니다. 이리로 오시죠!");
            next = sc.nextLine();
            user.space();
            System.out.println("[" + name + "는(은) 마을장로를 따라간다.]");
            next = sc.nextLine();
            user.space();
            System.out.println("[마을장로가 숨겨진 공간에서 장비들을 꺼낸다.]");
            System.out.println("마을장로: 이 장비들로 말할것 같으면 용사님들이 나타나실때 드리려고 준비해둔 최고급 장비들 입니다.");
            next = sc.nextLine();
            System.out.println("마을장로: 이 장비 꾸러미를 드릴테니 필요에 따라 마음껏 쓰시길 바랍니다.");
            next = sc.nextLine();
            System.out.println("마을장로: 신의 축복이 당신과 함께 하기를...");
            next = sc.nextLine();
            user.space();
            System.out.println(name + ": 이런 귀한것들을 다 제가 가져도 괜찮은가요..?");
            System.out.println("마을장로: 그럼요! 이건 저희 마을에서 다함께 용사님을 위해 정성껏 준비한 선물이니까 편한 마음으로 받아주세요.");
            next = sc.nextLine();
            user.space();
            System.out.println(name + ": 감사합니다! 악마를 물리쳐 이 마을과 여러분에게 꼭 보답하겠습니다!");
            System.out.println("마을장로: 신의 축복이 당신과 함께 하기를...");
            next = sc.nextLine();
            user.space();
            System.out.println("[" + name + "는(은) 여러가지 최고급 장비 꾸러미를 얻었다.]");
            user.armorSet();

            System.out.println("[  HP ]+300");
            System.out.println("[공격력]+100");
            System.out.println("[방어력]+50");
            System.out.println(" ");
            Village.stop(); //브금 종료


            UP UP0 = new UP();
            UP0.start();

            next = sc.nextLine();
            user.space();
            user.스탯();
            Village.stop();
        }


        System.out.println("["+name+"는(은) 여정을 떠나기 전, 신세진 여인에게 보답하는 마음으로 선물을 사서 여인의 집으로 돌아간다.]");
        System.out.println(name+": 마음에 들어하실지 모르겠지만 드리고 가야 마음이 편할거같아.");
        next = sc.nextLine();
        user.space();

        Thread burnHEF = new Thread(new burningHouse());   //스킬 이펙트 쓰레드
        Thread burnSD = new Thread(new burning());     //스킬 효과음 쓰레드

        burnHEF.start();
        burnSD.start();

        try {
            burnHEF.join();
            burnSD.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }    //쓰레드 끝

        CountTime CountTime0 = new CountTime();
        CountTime0.setDaemon(true);
        CountTime0.start();

            System.out.println("[검은 연기가 자욱하게 하늘을 덮고있다.]");
            System.out.println("[불타고 있는 여인의 집이 보인다.]");
            TheChoice TheChoice = new TheChoice();
            TheChoice.setDaemon(true);
            TheChoice.start();

            System.out.println(name + ": 어...?!");
            System.out.println("(선물을 땅에 떨어뜨린다.)");
            next = sc.nextLine();
            user.space();


            tfBoss 강도보스 = new tfBoss();
            enemy 강도1 = new enemy();

            강도보스.img();
            System.out.println("??: 낄낄낄... 그 녀석은 무서워서 그새 도망쳤나보군.");
            next = sc.nextLine();
            user.space();
            강도1.img();
            System.out.println("강도: 그 빌어먹을 녀석을 형님이 직접 짓밟는 모습을 꼭 보고싶었는데 스읍..");
            next = sc.nextLine();
            user.space();
            강도보스.img();
            System.out.println("??: 그 녀석을 못봐서 아쉽지만, 그래도 심심풀이로 나쁘지 않았어...");
            next = sc.nextLine();
            user.space();
            System.out.println("[무리 사이로 상처투성이의 여인이 보인다]");
            System.out.println(name + ": 안돼!!!");
            System.out.println("[" + name + "는(은) 여인을 향해 돌진한다.]");
            next = sc.nextLine();
            user.space();
            System.out.println("[" + name + "는(은) 순식간에 무리를 제치고 여인을 끌어안고 맥박을 확인한다.]");
            System.out.println(name + ": 괜찮으세요?!!");
            next = sc.nextLine();
            user.space();
            System.out.println("여인: ...");
            System.out.println("(맥박이 들리지만 상태가 좋아보이지 않는다.)");
            next = sc.nextLine();
            user.space();
            강도1.img();
            System.out.println("강도: 형님 이 녀석 입니다.");
            next = sc.nextLine();
            user.space();
            강도보스.img();
            System.out.println("??: 호오... 호랑이도 제말하면 온다더니...");
            System.out.println("??: 너만 있었어도 저 여자한테 화풀이 안해도 됬을텐데, 이게 다 네 책임이라구~");
            System.out.println(" ");
            next = sc.nextLine();
            user.space();
            System.out.println(name + ": ...네 녀석들.. 잘도...");
            user.스탯();
            next = sc.nextLine();
            user.space();
            강도보스.nightpower();
            강도보스.스탯();
            System.out.println("강도보스: 뜸들이기는! 이거나 먹어라!");
            next = sc.nextLine();
            user.space();
            강도보스.attack();
            next = sc.nextLine();
            user.space();
            user.HP = user.HP - (user.방어력 - 강도보스.공격력);
            System.out.print("데미지= ");
            System.out.println(user.방어력 - 강도보스.공격력);
            System.out.println(name + ": ...");
            next = sc.nextLine();
            user.space();
            강도보스.img();
            System.out.println("강도보스: 하핫 어때?! 선빵필승이라고!");
            next = sc.nextLine();
            user.space();
            강도1.img();
            System.out.println("강도: 여지껏 형님의 일격을 맞고 일어선 녀석은...");
            next = sc.nextLine();
            user.space();
            System.out.println(name + ": ...");
            user.스탯();
            next = sc.nextLine();
            user.space();
            System.out.println(name + ": ..끝났나?");
            System.out.println("[" + name + "는(은) 조용히 일어난다.]");
            next = sc.nextLine();
            user.space();
            강도1.img();
            System.out.println("강도: 이런 말도 안되는..!");
            System.out.println("강도보스: 뭐.. 뭐야 이녀석..!");
            next = sc.nextLine();
            user.space();
            System.out.println("[" + name + "는(은) 강도보스를 공격했다.]");
            user.attack();
            강도보스.HP = 강도보스.HP + (강도보스.방어력 - user.공격력);
            System.out.print("데미지= ");
            System.out.println(user.공격력 - 강도보스.방어력);

            System.out.println(" ");
            if (강도보스.HP<0){
                System.out.println("강도보스 HP= 0");
            } else{
                System.out.println(user.공격력 - 강도보스.방어력);
                System.out.println("강도보스 HP= " + 강도보스.HP);
            }
            강도보스.스탯();
            next = sc.nextLine();
            user.space();

            Drop Drop = new Drop();
            Drop.start();

            CountTime0.stop();
            Drop 강도보스Drop = new Drop();
            강도보스Drop.start();

            System.out.println(    //강도보스
                    "░░░░░░░░░░▄▄█ ░█▀▀░░░░░░░░░░░░░░░░░░░░\n" +
                            "░░░░░░░░░█▀ ░█▀░░░░░░░░░░░░░░░░█░░░░░░\n" +
                            "░░░░░░░░█ ░░█░░░░░░░░░░░░░░░░░░░░█░░░░\n" +
                            "░░░░░░░░█ ░░░░░▄▀▀░░░░░░░░░▄ ░░░░░░░░░\n" +
                            "░░░░░░░░█▄ ░▄░░█ ░░▐░░░░░░░░▀█ ░░░▄░░░\n" +
                            "░░░░░░░░▌▌  █ ░░█ ░░░░░▄▄ ░░░░█ ░░░█▄░\n" +
                            "░░░░░░░▐ ▌ ░▐ ░░█ ░░▓▄▐▓ ▀▓▄ ░░█▄ ░░░░\n" +
                            "░░░░░░░▐ █ ░▐ ░█▓▌░░▓▓▓▓▓ ████ ░██ ░░░\n" +
                            "░░░░░░░▐ ▐ ░ ▀▀▀▀█▌░▓▓█▀▀ ▀▀▀▀█▄▐█▌░░░\n" +
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
            System.out.println("[강도보스가 쓰러졌습니다.]");

            next = sc.nextLine();
            user.space();
            System.out.println("강도: 이...일격에...");
            System.out.println("강도보스: ...");
            next = sc.nextLine();
            user.space();
            System.out.println(name + ": ...");
            System.out.println(name + ": 왜 아무런 죄없는 사람을...");
            System.out.println("강도: 사...살려주세요..");
            System.out.println(" ");
            next = sc.nextLine();
            user.space();
            System.out.println("[다음 중 하나를 선택하세요.]");
            System.out.println("1. 녀석들은 분명 큰 죄를 지었지만 내가 감정에 휘둘려 심판자가 되면 안돼...");
            System.out.println("   (무리를 제압하고 법의 심판을 받게해 죄값을 치르게 한다)");
            System.out.println(" ");
            System.out.println("2. 사람의 본성은 바뀌지 않아... 여기서 살려 보내면 또 다른 무고한 사람이 희생될꺼야...");
            System.out.println("   (무리를 직접 처형해서 무고한 사람들을 보복의 두려움으로부터 해방시킨다.)");
            int decision = sc.nextInt();
            if (decision == 1) {
                user.space();
                System.out.println("[모두를 제압한다.]");
                System.out.println(name + ": 너희 모두는 정당하게 너희의 죗값을 치루게 만들겠다. 도망갈 생각 하지마라.");
                user.자비심 = user.자비심 + 10;
                System.out.println(" ");
            } else if (decision == 2) {
                user.space();
                System.out.println("[모두를 이 자리에서 처형한다.]");
                System.out.println(name + ": 네 녀석들을 살려두면 또 무고한 자들이 피해를 볼꺼야. 아무도 이 자리를 떠나지 못한다.");
                user.자비심 = user.자비심 - 10;
                System.out.println(" ");
            } else {
                user.space();
                System.out.println("다시 선택해 주세요.");
                return;
            }




        if (user.자비심 >= 10) {

            빛 빛자비심 = new 빛();
            빛자비심.armorSet();
            빛자비심.sleep();
            빛자비심.빛의힘();
            빛자비심.빛의육체();
            System.out.println("[당신의 모습이 하얗게 빛납니다.]");
            System.out.println(" ");
            System.out.println("[당신은 빛의 가호를 받았습니다.]");
            System.out.println( "New [신성게이지]= "+ 빛자비심.신성게이지);
            System.out.println( "New [신성의힘]= "+ 빛자비심.공격력+"(공격력+100)");
            System.out.println( "New [신성의육체]= "+ 빛자비심.HP+"(HP+1000)");
            UP UP1 = new UP();
            UP1.start();

            next = sc.nextLine();
user.space();
            빛자비심.스탯();

            System.out.println("["+name+"는(은) 도적들의 무리를 제압했다.]");
            System.out.println(" ");
            System.out.println(name+": 너희 모두 평생을 뉘우치는 마음으로 죗값을 받아라.");
            System.out.println("도적들: ㅈ..정말 다신 안그러겠습니다. 죄송합니다.");
            System.out.println("(퍽)");
            Drop Drop0 = new Drop();
            Drop0.start();

            Thread punch = new Thread(new punch());     //스킬 효과음 쓰레드
            punch.start();


            System.out.println("[도적들을 기절시켜 묶어놓고 헌병대를 불렀다.]");


            next = sc.nextLine();
            next = sc.nextLine();
user.space();
            System.out.println("["+name+"는(은) 쓰러진 여인을 병원으로 옮겼다.]");
            System.out.println(name+": 이제 가야만해...");
            System.out.println("["+name+"는(은) 여인이 누운 곳 옆에 선물을 두고 떠난다.]");
            next = sc.nextLine();
            next = sc.nextLine();
            TheChoice.stop();

user.space();
            System.out.println("[마을에서 얻은 보따리가 밝은 빛으로 공명한다.]");
            next = sc.nextLine();
            System.out.println(" ");
            System.out.println(name+": 응? 뭐지?");

            Holy Holy = new Holy();
            Holy.setDaemon(true);
            Holy.start();

            System.out.println("[보따리를 열자 방패와 마법스태프가 밝게 빛나고 있다.]");
            System.out.println(" ");
            System.out.println("방패와 마법스태프중 하나를 고르세요.");
            System.out.println(" ");
            System.out.println("1.방패를 고른다   2.마법스태프를 고른다");
            int lightClass = sc.nextInt();
            TheChoice.stop();
            if (lightClass ==1) {

                성기사 빛의기사 = new 성기사();
                빛의기사.sleep();
                빛의기사.armorSet();
                빛의기사.빛의수호();
                빛의기사.빛의육체();
                빛의기사.빛의힘();

                user.space();
                System.out.println("[당신은 빛의 기사로 전직했습니다.]");

                UP UP2 = new UP();
                UP2.start();

                System.out.println("New [빛의 수호자] 방어력= "+빛의기사.방어력+"(+100)");

                빛의기사.스탯();
                next = sc.nextLine();
                next = sc.nextLine();
user.space();
                System.out.println("["+name+"는(은) 악마의 성에 도착했다.]"); //악마의 성 도착

                Dark Dark = new Dark();
                Dark.setDaemon(true);
                Dark.start();

                System.out.println("??: 내가 준 선물은 잘 받았나?");
                devilB 악마 = new devilB();
                System.out.println(name+": 누구냐? 모습을 보여라.");
                next = sc.nextLine();
                user.space();
                System.out.println("??: 질문은 내가 먼저했거늘...끌끌..");
                System.out.println("[악마가 모습을 드러냈다.]");
                악마.img();
                next = sc.nextLine();
                user.space();
                System.out.println(name+": 네 놈이 악마냐?");
                next = sc.nextLine();
                user.space();
                악마.img();
                System.out.println("악마: 그래서 내 선물은 마음에 들었나 물었다.");
                System.out.println(name+": 도통 무슨말을 하는지 모르겠군.");
                next = sc.nextLine();
                user.space();
                악마.img();
                System.out.println("악마: 끌끌끌.. 지금 그 다친 여자를 병원에 데려다주고 오는길이 아닌가?");
                System.out.println(name+": ...?!");
                next = sc.nextLine();
                user.space();
                악마.img();
                System.out.println("악마: 이제 얘기가 통하는군.");
                System.out.println("악마: 그 도적이 그리도 악한 마음을 품은게 의아한적 없나?");
                System.out.println(name+": ...");
                next = sc.nextLine();
                user.space();
                악마.img();
                System.out.println("악마: 이제 좀 감이 오는건가? 그들의 마음을 누가 악하게 만들었을까.. 큭큭큭");
                System.out.println(name+": ...네 녀석 짓이었냐...");
                next = sc.nextLine();
                user.space();
                악마.img();
                System.out.println("악마: 반응을 보아하니 내 선물이 마음에 들었나보군.");
                System.out.println(name+": 네 이 녀석! 가만두지 않겠어!");
                System.out.println("악마: 끌끌끌");
                next = sc.nextLine();
                user.space();
                System.out.println("[악마와의 전투가 시작됬다.]");

                CountTime CountTime1 = new CountTime();
                CountTime1.setDaemon(true);
                CountTime1.start();

                Dark.stop();

                Battle Battle = new Battle();
                Battle.setDaemon(true);
                Battle.start();

                악마.nightpower(); 악마.스탯();

                while (악마.HP > 0) {  //전투
                    빛의기사.action();
                    int choice = sc.nextInt();
                    if (choice == 1) {
                        System.out.print("데미지=");
                        System.out.println(빛의기사.공격력 - 악마.방어력);
                        System.out.println(" ");
                        악마.HP = 악마.HP - (빛의기사.공격력 - 악마.방어력);
                        악마.nightpower(); 악마.스탯();
                        if (악마.HP <= 300) {
                            System.out.println("악마: 이녀석 내가 순순히 쓰러질까보냐!");
                            악마.악마스킬();
                            System.out.println("악마: 제대로 상대해 주지");
                            악마.nightpower(); 악마.스탯();
                        } else {
                            System.out.println("악마: 천천히 즐기자고");
                        }
                    } else if (choice == 2) {
                        System.out.println("악마: 두려운겐가...");
                    } else if (choice == 3) {
                        System.out.println("악마: 호오 마법인가...");
                    } else if (choice ==4) {
                        악마.HP = 0;
                        if (악마.HP <= 0) {
                            악마.nightpower(); 악마.스탯();
                            System.out.println("악마: 크아아아악!");
                            break;
                        }
                    }
                    System.out.println(" ");
                    next = sc.nextLine();
                    next = sc.nextLine();
user.space();
                    if (악마.HP <= 0) {
                        break;
                    }else {
                        System.out.println("[악마의 턴입니다.]");

                        next = sc.nextLine();
user.space();
                        System.out.println("악마: 이제 내 차례다!");
                        악마.attack();

                        빛의기사.HP = 빛의기사.HP - (악마.공격력 - 빛의기사.방어력);
                        System.out.print("데미지=");
                        if ((악마.공격력 - 빛의기사.방어력) >= 0) {
                            System.out.println(악마.공격력 - 빛의기사.방어력);
                        } else if ((악마.공격력 - 빛의기사.방어력) < 0) {
                            System.out.println("0");
                        }
                        빛의기사.스탯();
                        if (빛의기사.HP <= 0) {           //용사가 체력에 따라 게임 종료 여부
                            System.out.println("[당신은 쓰러졌습니다.]");
                            System.out.println(" ");


                            user.GameOver();
                            System.out.println("1. 다시 시작");
                            System.out.println("2. 게임 종료");
                            System.out.println(" ");
                            int End = sc.nextInt();
                            if(End ==1){
                                System.out.println("[게임을 다시 시작합니다.]");
                                next = sc.nextLine();
                                main(args);

                            }else{
                                System.out.println("[게임을 종료합니다.]");
                                System.exit(2);
                            }


                        } else {
                            System.out.println(name + ": 어림도 없지!");
                        }
                        System.out.println(" ");

                        빛의기사.action();
                        int choice2 = sc.nextInt();
                        if (choice2 == 1) {
                            user.space();
                            System.out.print("데미지=");
                            System.out.println(빛의기사.공격력 - 악마.방어력);
                            System.out.println(" ");
                            악마.HP = 악마.HP - (빛의기사.공격력 - 악마.방어력);
                            악마.nightpower(); 악마.스탯();
                            next = sc.nextLine();
                            next = sc.nextLine();
user.space();
                            if (악마.HP <= 300) {

                                System.out.println("악마: 이녀석 내가 순순히 쓰러질까보냐!");
                                System.out.println(" ");
                                악마.악마스킬();
                                System.out.println("악마: 제대로 상대해 주지");
                                악마.nightpower(); 악마.스탯();
                            } else if (악마.HP <= 0) {

                                악마.nightpower(); 악마.스탯();
                                System.out.println("악마: 크아아아악!");
                                break;
                            } else {

                                System.out.println("악마: 천천히 즐기자고");
                            }
                        } else if (choice2 == 2) {
                            user.space();
                            System.out.println("악마: 겁이 많군 자네...");
                        } else if (choice2 == 3) {
                            user.space();
                            System.out.println("악마: 방어막이라...");
                        } else if (choice2 == 4) {
                            Battle.stop();
                            user.space();
                            악마.HP = 0;
                            if (악마.HP <= 0) {
                                악마.nightpower(); 악마.스탯();
                                System.out.println("악마: 크아아아악!");
                                break;
                            }
                        }
                        System.out.println(" ");
                        next = sc.nextLine();
                        next = sc.nextLine();
user.space();
                    }
                    if (악마.HP <= 0) {
                        break;
                    }else {
                        System.out.println("[악마의 턴입니다.]");
                        next = sc.nextLine();
user.space();
                        System.out.println("악마: 이제 내 차례다!");
                        악마.attack();

                        빛의기사.HP = 빛의기사.HP - (악마.공격력 - 빛의기사.방어력);
                        System.out.print("데미지=");
                        if ((악마.공격력 - 빛의기사.방어력) >= 0) {
                            System.out.println(악마.공격력 - 빛의기사.방어력);
                        } else if ((악마.공격력 - 빛의기사.방어력) < 0) {
                            System.out.println("0");
                        }
                        System.out.println(" ");
                        빛의기사.스탯();
                        if (빛의기사.HP <= 0) {           //용사가 체력에 따라 게임 종료 여부
                            System.out.println("[당신은 쓰러졌습니다.]");
                            System.out.println(" ");

                            user.GameOver();
                            System.out.println("1. 다시 시작");
                            System.out.println("2. 게임 종료");
                            System.out.println(" ");
                            int End = sc.nextInt();
                            if(End ==1){
                                System.out.println("[게임을 다시 시작합니다.]");
                                next = sc.nextLine();
                                main(args);

                            }else{
                                System.out.println("[게임을 종료합니다.]");
                                System.exit(2);
                            }


                        } else {
                            System.out.println(name + ": 어림도 없지!");
                        }

                        System.out.println(" ");

                        빛의기사.action();
                        int choice4 = sc.nextInt();
                        if (choice4 == 1) {
                            System.out.print("데미지=");
                            System.out.println(빛의기사.공격력 - 악마.방어력);
                            System.out.println(" ");
                            악마.HP = 악마.HP - (빛의기사.공격력 - 악마.방어력);
                            악마.nightpower(); 악마.스탯();
                            next = sc.nextLine();
user.space();
                            if (악마.HP <= 300) {
                                System.out.println("악마: 이녀석 내가 순순히 쓰러질까보냐!");
                                악마.악마스킬();
                                System.out.println("악마: 제대로 상대해 주지");
                                악마.nightpower(); 악마.스탯();
                            } else if (악마.HP <= 0) {
                                악마.nightpower(); 악마.스탯();
                                System.out.println("악마: 크아아아악!");
                                break;
                            } else {
                                System.out.println("악마: 천천히 즐기자고");
                            }
                        } else if (choice4 == 2) {
                            user.space();
                            System.out.println("악마: 흥미롭군...");
                        } else if (choice4 == 3) {
                            user.space();
                            System.out.println("악마: 흥미롭군...");
                        } else if (choice4 == 4) {
                            user.space();
                            악마.HP = 0;
                            if (악마.HP <= 0) {
                                악마.nightpower(); 악마.스탯();
                                System.out.println("악마: 크아아아악!");
                                break;
                            }
                        }
                        System.out.println(" ");
                        next = sc.nextLine();
                        next = sc.nextLine();
user.space();
                    }
                    if (악마.HP < 0) {
                        break;
                    } else {
                        System.out.println("[악마의 턴입니다.]");
                        next = sc.nextLine();
user.space();
                        System.out.println("악마: 이제 내 차례다!");
                        악마.attack();

                        빛의기사.HP = 빛의기사.HP - (악마.공격력 - 빛의기사.방어력);
                        System.out.print("데미지=");
                        if ((악마.공격력 - 빛의기사.방어력) >= 0) {
                            System.out.println(악마.공격력 - 빛의기사.방어력);
                        } else if ((악마.공격력 - 빛의기사.방어력) < 0) {
                            System.out.println("0");
                        }
                        System.out.println(" ");
                        빛의기사.스탯();
                        if (빛의기사.HP <= 0) {           //용사가 체력에 따라 게임 종료 여부
                            System.out.println("[당신은 쓰러졌습니다.]");
                            System.out.println(" ");

                            user.GameOver();
                            System.out.println("1. 다시 시작");
                            System.out.println("2. 게임 종료");
                            System.out.println(" ");
                            int End = sc.nextInt();
                            if(End ==1){
                                System.out.println("[게임을 다시 시작합니다.]");
                                next = sc.nextLine();
                                main(args);

                            }else{
                                System.out.println("[게임을 종료합니다.]");
                                System.exit(2);
                            }


                        } else {
                            System.out.println(name + ": 어림도 없지!");
                        }

                        System.out.println(" ");

                        빛의기사.action();
                        int choice3 = sc.nextInt();
                        if (choice3 == 1) {
                            System.out.print("데미지=");
                            System.out.println(빛의기사.공격력 - 악마.방어력);
                            System.out.println(" ");
                            악마.HP = 악마.HP - (빛의기사.공격력 - 악마.방어력);
                            악마.nightpower(); 악마.스탯();
                            next = sc.nextLine();
user.space();
                            if (악마.HP <= 300) {
                                System.out.println("악마: 이녀석 내가 순순히 쓰러질까보냐!");
                                악마.악마스킬();
                                System.out.println("악마: 제대로 상대해 주지");
                                악마.nightpower(); 악마.스탯();
                            } else if (악마.HP <= 0) {
                                악마.nightpower(); 악마.스탯();
                                System.out.println("악마: 크아아아악!");
                                break;

                            } else {
                                System.out.println("악마: 천천히 즐기자고");
                            }
                        } else if (choice3 == 2) {
                            user.space();
                            System.out.println("악마: 흥미롭군...");
                        } else if (choice3 == 3) {
                            user.space();
                            System.out.println("악마: 흥미롭군...");
                        } else if (choice3 == 4) {
                            Battle.stop();
                            user.space();
                            악마.HP = 0;
                            if (악마.HP <= 0) {
                                악마.nightpower(); 악마.스탯();
                                System.out.println("악마: 크아아아악!");
                                break;
                            }

                        }
                        System.out.println(" ");

                    }
                }
                next = sc.nextLine();
                next = sc.nextLine();
                user.space();

                Drop Drop1 = new Drop();
                Drop1.start();

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
                System.out.println("[악마가 쓰러졌다.]");
                Battle.stop();
                CountTime1.stop();
                next = sc.nextLine();
                next = sc.nextLine();

user.space();
                Sad Sad = new Sad(); // 슬픈 브금
                Sad.setDaemon(true);
                Sad.start();

                악마.imgS();
                System.out.println("악마: 크으으윽..");
                next = sc.nextLine();
user.space();
                악마.imgS();
                System.out.println("악마: ...");
                System.out.println("악마: 어서 날 죽여라...");
                next = sc.nextLine();
user.space();
                System.out.println("["+name+": 는(은) 악마를 조용히 바라본다.]");
                System.out.println(name+ ": ...");
                next = sc.nextLine();
user.space();
                악마.imgS();
                System.out.println("악마: 이런 나약한 녀석에게 지다니.. 악마의 수치다..");
                System.out.println("악마: 어서 날 죽여!");
                System.out.println(name+ ": ...");
                next = sc.nextLine();
user.space();
                System.out.println(name+ ": 분명 너의 행동은 잘못되었지만,");
                System.out.println(name+ ": 무언가가 너의 마음을 벼랑끝까지 몰고갔구나..");
                System.out.println(name+ ": 넌 마음 속에 두려움과 상처가 많아보여");
                next = sc.nextLine();
user.space();
                악마.imgS();
                System.out.println("악마: ..뭐..?");
                next = sc.nextLine();
user.space();
                System.out.println(name+ ": ..네 안에 있는 상처와 아픔을 내가 다 알순 없지만");
                System.out.println(name+ ": 그 상처가 조금이라도 회복될수 있도록 기도해줘도 될까?");
                next = sc.nextLine();
user.space();
                악마.imgS();
                System.out.println("악마: ...마음대로 지껄이지마!");
                next = sc.nextLine();
user.space();
                System.out.println("["+name+": 는(은) 악마 옆에 앉아 조용히 기도한다.]");
                System.out.println("악마: 그... 그만둬..!");
                next = sc.nextLine();
user.space();
                System.out.println("[악마의 몸에서 조금씩 빛이 나기 시작한다.]");
                next = sc.nextLine();
user.space();
                System.out.println("[악마의 머릿속으로 고통스럽고 슬픈 기억들, 그를 악마로 만든 아픈 인간이었을때의 과거가 회상된다.]");
                next = sc.nextLine();
user.space();
                System.out.println("[그 순간 악마가 그 토록 그리워하던 어린아이때 엄마의 품에 안기는 기억을 떠올린다.]");
                next = sc.nextLine();
user.space();
                악마.imgT();
                System.out.println("악마: 어.. 엄마...");
                System.out.println("[악마의 눈에서 눈물이 흐르며, 품에 안긴 아기같은 따뜻한 미소를 짓는다.]");
                next = sc.nextLine();
user.space();
                악마.imgT();
                System.out.println("[악마의 몸이 밝게 빛이나며 서서히 따뜻한 빛이 되어 하늘로 사라져간다.]");
                System.out.println("악마: 엄마 보고싶었어요.. 미안해요...");
                next = sc.nextLine();
user.space();
                악마.imgT();
                System.out.println("악마: ..고마워");
                System.out.println("[악마의 몸이 완전히 사라진다.]");
                next = sc.nextLine();
user.space();
                System.out.println(name+ ": ..그 곳에서 만큼은 행복하길..");
                System.out.println("["+name+": 는(은) 조용히 자리에서 일어나 마을로 향한다.]");
                next = sc.nextLine();
user.space();
                System.out.println("[마을 병원에 도착한 용사는 자신의 선물을 보며 기뻐하는 그 여인을 보며 미소를 짓는다]");
                System.out.println(" ");

                Thread GameOverE = new Thread(new GameOverE());   //스킬 이펙트 쓰레드
                GameOverE.start();
                try {
                    GameOverE.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }    //쓰레드 끝


                System.out.println(" ");
                System.out.println("[ Thank You For Playing. ]");
                System.out.println(" ");
                next = sc.nextLine();


                next = sc.nextLine();

                Ending.put("Ending 1","성기사 엔딩");  //Hashtable 실험, 성기사 엔딩
                System.out.println(" ");

                try{
                    String ending = "{ Ending 1 of 4 - 성기사 엔딩 }";
                    byte[] binary = ending.getBytes();
                    File file = new File("C:\\Users\\osj41\\IdeaProjects\\HelloJava\\src\\game\\prac\\ending.txt");
                    OutputStream stream = new FileOutputStream(file);
                    stream.write(binary);
                    stream.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    File file = new File("C:\\Users\\osj41\\IdeaProjects\\HelloJava\\src\\game\\prac\\ending.txt");
                    byte[] binary = new byte[(int)file.length()];
                    InputStream stream = new FileInputStream(file);
                    stream.read(binary);
                    stream.close();
                    System.out.println(new String(binary));
                    System.out.println(" ");
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                System.out.println("1. 다시 시작");
                System.out.println("2. 게임 종료");
                System.out.println(" ");
                int End = sc.nextInt();
                Sad.stop();
                if(End ==1){
                    System.out.println("게임을 다시 시작합니다.");
                    next = sc.nextLine();
                    main(args);

                }else{
                    System.out.println("게임을 종료합니다.");
                    System.exit(2);
                }


            }else {
                빛마법사 백색법사 = new 빛마법사();
                백색법사.armorSet();
                백색법사.sleep();
                백색법사.빛의선구자();
                백색법사.빛의힘();
                백색법사.빛의육체();
                System.out.println("[당신은 빛의 마법사로 전직했습니다.]");
                UP UP2 = new UP();
                UP2.start();
                System.out.println("New [빛의 마력] "+백색법사.빛의마력);
                System.out.println("New [빛의 선구자] 공격력= "+백색법사.공격력+"(+200)");
                System.out.println("New [새로운 스킬] 치유 / 빛의 심판");
                백색법사.스탯();

                next = sc.nextLine();
user.space();
                System.out.println(" ");

                Dark Dark = new Dark();
                Dark.setDaemon(true);
                Dark.start();

                System.out.println("["+name+"는(은) 악마의 성에 도착했다.]"); //악마의 성 도착
                System.out.println("??: 내가 준 선물은 잘 받았나?");
                devilB 악마 = new devilB();
                System.out.println(name+": 누구냐? 모습을 보여라.");
                next = sc.nextLine();
                user.space();
                System.out.println("??: 질문은 내가 먼저했거늘...끌끌..");
                System.out.println("[악마가 모습을 드러냈다.]");
                악마.img();
                next = sc.nextLine();
                user.space();
                System.out.println(name+": 네 놈이 악마냐?");
                next = sc.nextLine();
                user.space();
                악마.img();
                System.out.println("악마: 그래서 내 선물은 마음에 들었나 물었다.");
                System.out.println(name+": 도통 무슨말을 하는지 모르겠군.");
                next = sc.nextLine();
                user.space();
                악마.img();
                System.out.println("악마: 끌끌끌.. 지금 그 다친 여자를 병원에 데려다주고 오는길이 아닌가?");
                System.out.println(name+": ...?!");
                next = sc.nextLine();
                user.space();
                악마.img();
                System.out.println("악마: 이제 얘기가 통하는군.");
                System.out.println("악마: 그 도적이 그리도 악한 마음을 품은게 의아한적 없나?");
                System.out.println(name+": ...");
                next = sc.nextLine();
                user.space();
                악마.img();
                System.out.println("악마: 이제 좀 감이 오는건가? 그들의 마음을 누가 악하게 만들었을까.. 큭큭큭");
                System.out.println(name+": ...네 녀석 짓이었냐...");
                next = sc.nextLine();
                user.space();
                악마.img();
                System.out.println("악마: 반응을 보아하니 내 선물이 마음에 들었나보군.");
                System.out.println(name+": 네 이 녀석! 가만두지 않겠어!");
                System.out.println("악마: 끌끌끌");
                next = sc.nextLine();
                user.space();
                System.out.println("[악마와의 전투가 시작됬다.]");

                CountTime CountTime1 = new CountTime();
                CountTime1.setDaemon(true);
                CountTime1.start();

                Dark.stop();

                Battle Battle = new Battle();
                Battle.setDaemon(true);
                Battle.start();

                악마.nightpower(); 악마.스탯();
                next = sc.nextLine();

                next = sc.nextLine();
user.space();
                while (악마.HP > 0) {  //전투
                    백색법사.action();
                    int choice = sc.nextInt();
                    if (choice == 1) {
                        user.space();
                        System.out.print("데미지=");
                        System.out.println(백색법사.공격력 - 악마.방어력);
                        System.out.println(" ");
                        악마.HP = 악마.HP - (백색법사.공격력 - 악마.방어력);
                        악마.nightpower(); 악마.스탯();
                        if (악마.HP <= 300) {
                            user.space();
                            System.out.println("악마: 이녀석 내가 순순히 쓰러질까보냐!");
                            악마.악마스킬();
                            System.out.println("악마: 제대로 상대해 주지");
                            악마.nightpower(); 악마.스탯();
                        } else {
                            user.space();
                            System.out.println("악마: 천천히 즐기자고");
                        }
                    } else if (choice == 2) {
                        user.space();
                        System.out.println("악마: 흥미롭군...");
                    } else if (choice == 3) {
                        user.space();
                        System.out.println("악마: 호오 마법인가...");
                    } else if (choice ==4) {
                        user.space();
                        악마.HP = 0;
                        if (악마.HP <= 0) {
                            악마.nightpower(); 악마.스탯();
                            System.out.println("악마: 크아아아악!");
                            break;
                        }
                    }
                    System.out.println(" ");
                    next = sc.nextLine();
                    next = sc.nextLine();
user.space();
                    if (악마.HP <= 0) {
                        break;
                    }else {
                        System.out.println("[악마의 턴입니다.]");

                        next = sc.nextLine();
user.space();
                        System.out.println("악마: 이제 내 차례다!");
                        악마.attack();

                        백색법사.HP = 백색법사.HP - (악마.공격력 - 백색법사.방어력);
                        System.out.print("데미지=");
                        if ((악마.공격력 - 백색법사.방어력) >= 0) {
                            System.out.println(악마.공격력 - 백색법사.방어력);
                        } else if ((악마.공격력 - 백색법사.방어력) < 0) {
                            System.out.println("0");
                        }
                        백색법사.스탯();
                        if (백색법사.HP <= 0) {           //용사가 체력에 따라 게임 종료 여부
                            System.out.println("[당신은 쓰러졌습니다.]");
                            System.out.println(" ");

                    user.GameOver();
                            System.out.println("1. 다시 시작");
                            System.out.println("2. 게임 종료");
                            System.out.println(" ");
                            int End = sc.nextInt();
                            if(End ==1){
                                System.out.println("[게임을 다시 시작합니다.]");
                                next = sc.nextLine();
                                main(args);

                            }else{
                                System.out.println("[게임을 종료합니다.]");
                                System.exit(2);
                            }


                        } else {
                            System.out.println(name + ": 어림도 없지!");
                        }
                        System.out.println(" ");

                        백색법사.action();
                        int choice2 = sc.nextInt();
                        if (choice2 == 1) {

                            System.out.print("데미지=");
                            System.out.println(백색법사.공격력 - 악마.방어력);
                            System.out.println(" ");
                            악마.HP = 악마.HP - (백색법사.공격력 - 악마.방어력);
                            악마.nightpower(); 악마.스탯();

                            if (악마.HP <= 300) {

                                System.out.println("악마: 이녀석 내가 순순히 쓰러질까보냐!");
                                System.out.println(" ");
                                악마.악마스킬();
                                System.out.println("악마: 제대로 상대해 주지");
                                악마.nightpower(); 악마.스탯();
                            } else if (악마.HP <= 0) {

                                악마.nightpower(); 악마.스탯();
                                System.out.println("악마: 크아아아악!");
                                break;
                            } else {

                                System.out.println("악마: 천천히 즐기자고");
                            }
                        } else if (choice2 == 2) {
                            user.space();
                            System.out.println("악마: 겁이 많군 자네...");
                        } else if (choice2 == 3) {
                            user.space();
                            System.out.println("악마: 회복이라...");
                        } else if (choice2 == 4) {
                            Battle.stop();
                            user.space();
                            악마.HP = 0;
                            if (악마.HP <= 0) {
                                악마.nightpower(); 악마.스탯();
                                System.out.println("악마: 크아아아악!");
                                break;
                            }
                        }
                        System.out.println(" ");
                        next = sc.nextLine();
                        next = sc.nextLine();
user.space();
                    }
                    if (악마.HP <= 0) {
                        break;
                    }else {
                        System.out.println("[악마의 턴입니다.]");
                        next = sc.nextLine();
user.space();
                        System.out.println("악마: 이제 내 차례다!");
                        악마.attack();

                        백색법사.HP = 백색법사.HP - (악마.공격력 - 백색법사.방어력);
                        System.out.print("데미지=");
                        if ((악마.공격력 - 백색법사.방어력) >= 0) {
                            System.out.println(악마.공격력 - 백색법사.방어력);
                        } else if ((악마.공격력 - 백색법사.방어력) < 0) {
                            System.out.println("0");
                        }
                        System.out.println(" ");
                        백색법사.스탯();
                        if (백색법사.HP <= 0) {           //용사가 체력에 따라 게임 종료 여부
                            user.space();
                            System.out.println("[당신은 쓰러졌습니다.]");
                            System.out.println(" ");

                    user.GameOver();
                            System.out.println("1. 다시 시작");
                            System.out.println("2. 게임 종료");
                            System.out.println(" ");
                            int End = sc.nextInt();
                            if(End ==1){
                                System.out.println("[게임을 다시 시작합니다.]");
                                next = sc.nextLine();
                                main(args);

                            }else{
                                System.out.println("[게임을 종료합니다.]");
                                System.exit(2);
                            }


                        } else {
                            System.out.println(name + ": 어림도 없지!");
                        }

                        System.out.println(" ");

                        백색법사.action();
                        int choice4 = sc.nextInt();
                        if (choice4 == 1) {
                            user.space();
                            System.out.print("데미지=");
                            System.out.println(백색법사.공격력 - 악마.방어력);
                            System.out.println(" ");
                            악마.HP = 악마.HP - (백색법사.공격력 - 악마.방어력);
                            악마.nightpower(); 악마.스탯();
                            next = sc.nextLine();
user.space();
                            if (악마.HP <= 300) {

                                System.out.println("악마: 제법이군!");
                                악마.nightpower(); 악마.스탯();
                            } else if (악마.HP <= 0) {

                                악마.nightpower(); 악마.스탯();
                                System.out.println("악마: 크아아아악!");
                                break;
                            } else {

                                System.out.println("악마: 천천히 즐기자고");
                            }
                        } else if (choice4 == 2) {
                            user.space();
                            System.out.println("악마: ..겁먹었나?");
                        } else if (choice4 == 3) {
                            user.space();
                            System.out.println("악마: 끈질기군...");
                        } else if (choice4 == 4) {
                            Battle.stop();
                            user.space();
                            악마.HP = 0;
                            if (악마.HP <= 0) {
                                악마.nightpower(); 악마.스탯();
                                System.out.println("악마: 크아아아악!");
                                break;
                            }
                        }
                        System.out.println(" ");
                        next = sc.nextLine();
                        next = sc.nextLine();
user.space();
                    }
                    if (악마.HP < 0) {
                        break;
                    } else {
                        System.out.println("[악마의 턴입니다.]");
                        next = sc.nextLine();
user.space();
                        System.out.println("악마: 이제 내 차례다!");
                        악마.attack();

                        백색법사.HP = 백색법사.HP - (악마.공격력 - 백색법사.방어력);
                        System.out.print("데미지=");
                        if ((악마.공격력 - 백색법사.방어력) >= 0) {
                            System.out.println(악마.공격력 - 백색법사.방어력);
                        } else if ((악마.공격력 - 백색법사.방어력) < 0) {
                            System.out.println("0");
                        }
                        System.out.println(" ");
                        백색법사.스탯();
                        if (백색법사.HP <= 0) {           //용사가 체력에 따라 게임 종료 여부
                            System.out.println("[당신은 쓰러졌습니다.]");
                            System.out.println(" ");

                    user.GameOver();
                            System.out.println("1. 다시 시작");
                            System.out.println("2. 게임 종료");
                            System.out.println(" ");
                            int End = sc.nextInt();
                            if(End ==1){
                                System.out.println("[게임을 다시 시작합니다.]");
                                next = sc.nextLine();
                                main(args);

                            }else{
                                System.out.println("[게임을 종료합니다.]");
                                System.exit(2);
                            }


                        } else {
                            System.out.println(name + ": 어림도 없지!");
                        }

                        System.out.println(" ");

                        백색법사.action();
                        int choice3 = sc.nextInt();
                        if (choice3 == 1) {
                            user.space();
                            System.out.print("데미지=");
                            System.out.println(백색법사.공격력 - 악마.방어력);
                            System.out.println(" ");
                            악마.HP = 악마.HP - (백색법사.공격력 - 악마.방어력);
                            악마.nightpower(); 악마.스탯();

                            if (악마.HP <= 300) {

                                System.out.println("악마: 제법이군!");

                                악마.nightpower(); 악마.스탯();
                            } else if (악마.HP <= 0) {

                                악마.nightpower(); 악마.스탯();
                                System.out.println("악마: 크아아아악!");
                                break;

                            } else {
                                System.out.println("악마: 천천히 즐기자고");
                            }
                        } else if (choice3 == 2) {
                            user.space();
                            System.out.println("악마: 두렵나...");
                        } else if (choice3 == 3) {
                            user.space();
                            System.out.println("악마: 끈질기군...");
                        } else if (choice3 == 4) {
                            Battle.stop();
                            user.space();
                            악마.HP = 0;
                            if (악마.HP <= 0) {
                                악마.nightpower(); 악마.스탯();
                                System.out.println("악마: 크아아아악!");
                                break;
                            }

                        }
                        System.out.println(" ");

                    }
                }
                next = sc.nextLine();
                next = sc.nextLine();
                user.space();

                Drop Drop1 = new Drop();
                Drop1.start();

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
                System.out.println("[악마가 쓰러졌다.]");
                Battle.stop();
                CountTime1.stop();
                next = sc.nextLine();
user.space();
                Sad Sad = new Sad(); // 슬픈 브금
                Sad.setDaemon(true);
                Sad.start();

                악마.imgS();
                System.out.println("악마: 크으으윽..");
                next = sc.nextLine();
user.space();
                악마.imgS();
                System.out.println("악마: ...");
                System.out.println("악마: 어서 날 죽여라...");
                next = sc.nextLine();
user.space();
                System.out.println("["+name+": 는(은) 악마를 조용히 바라본다.]");
                System.out.println(name+ ": ...");
                next = sc.nextLine();
user.space();
                악마.imgS();
                System.out.println("악마: 이런 나약한 녀석에게 지다니.. 악마의 수치다..");
                System.out.println("악마: 어서 날 죽여!");
                System.out.println(name+ ": ...");
                next = sc.nextLine();
user.space();
                System.out.println(name+ ": 분명 너의 행동은 잘못되었지만,");
                System.out.println(name+ ": 무언가가 너의 마음을 벼랑끝까지 몰고갔구나..");
                System.out.println(name+ ": 넌 마음 속에 두려움과 상처가 많아보여");
                System.out.println("악마: ..뭐..?");
                next = sc.nextLine();
user.space();
                System.out.println(name+ ": ..네 안에 있는 상처와 아픔을 내가 다 알순 없지만");
                System.out.println(name+ ": 그 상처가 조금이라도 회복될수 있도록 기도해줘도 될까?");
                next = sc.nextLine();
user.space();
                악마.imgS();
                System.out.println("악마: ...마음대로 지껄이지마!");
                next = sc.nextLine();
user.space();
                System.out.println("["+name+": 는(은) 악마 옆에 앉아 조용히 기도한다.]");
                next = sc.nextLine();
user.space();
                악마.imgS();
                System.out.println("악마: 그... 그만둬..!");
                next = sc.nextLine();
user.space();
                System.out.println("[악마의 몸에서 조금씩 빛이 나기 시작한다.]");
                next = sc.nextLine();
user.space();
                System.out.println("[악마의 머릿속으로 고통스럽고 슬픈 기억들, 그를 악마로 만든 아픈 인간이었을때의 과거가 회상된다.]");
                next = sc.nextLine();
user.space();
                System.out.println("[그 순간 악마가 그 토록 그리워하던 어린아이때 엄마의 품에 안기는 기억을 떠올린다.]");
                next = sc.nextLine();
user.space();
                악마.imgT();
                System.out.println("악마: 어.. 엄마...");
                System.out.println("[악마의 눈에서 눈물이 흐르며, 품에 안긴 아기같은 따뜻한 미소를 짓는다.]");
                next = sc.nextLine();
user.space();
                악마.imgT();
                System.out.println("[악마의 몸이 밝게 빛이나며 서서히 따뜻한 빛이 되어 하늘로 사라져간다.]");
                System.out.println("악마: 엄마 보고싶었어요.. 미안해요...");
                next = sc.nextLine();
user.space();
                악마.imgT();
                System.out.println("악마: ..고마워");
                System.out.println("[악마의 몸이 완전히 사라진다.]");
                next = sc.nextLine();
user.space();
                System.out.println(name+ ": ..그 곳에서 만큼은 행복하길..");
                System.out.println("["+name+": 는(은) 조용히 자리에서 일어나 마을로 향한다.]");
                next = sc.nextLine();
user.space();
                System.out.println("[마을 병원에 도착한 용사는 자신의 선물을 보며 기뻐하는 그 여인을 보며 미소를 짓는다]");

                Thread GameOverE = new Thread(new GameOverE());   //스킬 이펙트 쓰레드
                GameOverE.start();
                try {
                    GameOverE.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }    //쓰레드 끝
                System.out.println(" ");
                System.out.println("[ Thank You For Playing. ]");
                System.out.println(" ");

                next = sc.nextLine();
                next = sc.nextLine();

                Ending.put("Ending 2","빛마법사 엔딩");  //Hashtable 실험, 빛마법사 엔딩

                try{          //입력
                    String ending = "{ Ending 2 of 4 - 빛마법사 엔딩 }";
                    byte[] binary = ending.getBytes();
                    File file = new File("C:\\Users\\osj41\\IdeaProjects\\HelloJava\\src\\game\\prac\\ending.txt");
                    OutputStream stream = new FileOutputStream(file);
                    stream.write(binary);
                    stream.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                try {          //출력
                    File file = new File("C:\\Users\\osj41\\IdeaProjects\\HelloJava\\src\\game\\prac\\ending.txt");
                    byte[] binary = new byte[(int)file.length()];
                    InputStream stream = new FileInputStream(file);
                    stream.read(binary);
                    stream.close();
                    System.out.println(new String(binary));
                    System.out.println(" ");
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                System.out.println(" ");

                System.out.println("1. 다시 시작");
                System.out.println("2. 게임 종료");
                int End = sc.nextInt();
                Sad.stop();
                if(End ==1){
                    System.out.println("게임을 다시 시작합니다.");
                    next = sc.nextLine();
                    main(args);

                }else{
                    System.out.println("게임을 종료합니다.");
                    System.exit(2);
                }

            }

        }else if(user.자비심 <= 0) {

            어둠 어둠자비심 = new 어둠();
            어둠자비심.armorSet();
            어둠자비심.sleep();
            어둠자비심.어둠의육체();
            어둠자비심.어둠의힘();
            UP UP1 = new UP();
            UP1.start();
            System.out.println("[당신은 어둠의 가호를 받았습니다]");
            System.out.println( "New 어둠게이지 ="+ 어둠자비심.어둠게이지);
            System.out.println( "New 어둠의힘 ="+ 어둠자비심.공격력+"(공격력+150)");
            System.out.println( "New 어둠의육체 ="+ 어둠자비심.HP+"(HP+500)");
            어둠자비심.스탯();
            next = sc.nextLine();
user.space();
            System.out.println(" ");
            System.out.println("["+name+"는(은) 도적들의 무리를 모조리 학살한다.]");
            System.out.println(" ");
            next = sc.nextLine();
user.space();
            System.out.println("도적: ㅈ..제발! ㅅ..살려주세요!!! 잘못했어요!");
            System.out.println(name+": 너희의 죗값은 죽음으로 받아라.");
            next = sc.nextLine();
user.space();
            System.out.println("도적: 으아아아ㅏ악!");

            Thread assATK = new Thread(new assATK());     //스킬 효과음 쓰레드
            assATK.start();
            try {
                assATK.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }    //쓰레드 끝

            System.out.println("[도적들을 남김없이 모두 죽였다.]");
            next = sc.nextLine();
user.space();
            System.out.println("["+name+"는(은) 쓰러진 여인을 병원으로 옮겼다.]");
            System.out.println(name+": 이제 가야만해...");
            System.out.println("["+name+"는(은) 여인이 누운 곳 옆에 선물을 두고 떠난다.]");
            next = sc.nextLine();

            next = sc.nextLine();
            user.space();

            TheChoice.stop();
            System.out.println("[마을에서 얻은 보따리가 공명한다.]");
            System.out.println(" ");
            System.out.println(name+": 응? 뭐지?");

            Ghost Ghost1 = new Ghost();
            Ghost1.setDaemon(true);
            Ghost1.start();

            System.out.println("[보따리를 열자 단검과 도끼가 칠흑같이 어두운 빛을 뿜어내고 있다.]");
           System.out.println(" ");
            System.out.println("단검과 중 도끼를 고르세요.");
            System.out.println(" ");


            System.out.println("1.단검을 고른다   2.도끼를 고른다");
            int DarkClass = sc.nextInt();
            TheChoice.stop();
            if (DarkClass ==1) {
                user.space();

                어쌔신 암살자 = new 어쌔신();
                암살자.armorSet();
                암살자.어둠의육체();
                암살자.어둠의힘();
                암살자.살인본능();
                System.out.println("[당신은 암흑의 암살자로 전직했습니다]");
                System.out.println("[살인본능] 공격력= "+암살자.공격력+"(+200)");
                UP UP2 = new UP();
                UP2.start();

                암살자.스탯();
                next = sc.nextLine();

                next = sc.nextLine();
user.space();
                System.out.println(" ");

                Dark Dark = new Dark();
                Dark.setDaemon(true);
                Dark.start();

                System.out.println("["+name+"는(은) 악마의 성에 도착했다.]"); //악마의 성 도착
                System.out.println("??: 내가 준 선물은 잘 받았나?");
                devilB 악마 = new devilB();
                System.out.println(name+": 누구냐? 모습을 보여라.");
                next = sc.nextLine();
                user.space();
                System.out.println("??: 질문은 내가 먼저했거늘...끌끌..");
                System.out.println("[악마가 모습을 드러냈다.]");
                악마.img();
                next = sc.nextLine();
                user.space();
                System.out.println(name+": 네 놈이 악마냐?");
                next = sc.nextLine();
                user.space();
                악마.img();
                System.out.println("악마: 그래서 내 선물은 마음에 들었나 물었다.");
                System.out.println(name+": 도통 무슨말을 하는지 모르겠군.");
                next = sc.nextLine();
                user.space();
                악마.img();
                System.out.println("악마: 끌끌끌.. 지금 그 다친 여자를 병원에 데려다주고 오는길이 아닌가?");
                System.out.println(name+": ...?!");
                next = sc.nextLine();
                user.space();
                악마.img();
                System.out.println("악마: 이제 얘기가 통하는군.");
                System.out.println("악마: 그 도적이 그리도 악한 마음을 품은게 의아한적 없나?");
                System.out.println(name+": ...");
                next = sc.nextLine();
                user.space();
                악마.img();
                System.out.println("악마: 이제 좀 감이 오는건가? 그들의 마음을 누가 악하게 만들었을까.. 큭큭큭");
                System.out.println(name+": ...네 녀석 짓이었냐...");
                next = sc.nextLine();
                user.space();
                악마.img();
                System.out.println("악마: 반응을 보아하니 내 선물이 마음에 들었나보군.");
                System.out.println(name+": 네 놈은 내 손으로 죽인다.");
                System.out.println("악마: 끌끌끌");
                System.out.println("[악마와의 전투가 시작됬다.]");

                CountTime CountTime1 = new CountTime();
                CountTime1.setDaemon(true);
                CountTime1.start();

                Dark.stop();

                Battle Battle = new Battle();
                Battle.setDaemon(true);
                Battle.start();

                악마.nightpower(); 악마.스탯();

                while (악마.HP > 0) {  //전투 //플레이어 턴
                    암살자.action();
                    int choice = sc.nextInt();
                    if (choice == 1) {

                        user.space();
                        System.out.print("데미지=");
                        System.out.println(암살자.공격력 - 악마.방어력);
                        System.out.println(" ");
                        악마.HP = 악마.HP - (암살자.공격력 - 악마.방어력);
                        악마.nightpower(); 악마.스탯();
                        if (악마.HP <= 0) {
                            악마.nightpower(); 악마.스탯();
                            System.out.println("악마: 크아아아악!");
                            break;

                        }else if(악마.HP <= 300) {
                            System.out.println("악마: 이녀석 내가 순순히 쓰러질까보냐!");
                            악마.악마스킬();
                            System.out.println("악마: 제대로 상대해 주지!");
                            악마.nightpower(); 악마.스탯();

                        } else if (악마.HP <= 0) {
                            악마.nightpower(); 악마.스탯();
                            System.out.println("악마: 크아아아악!");
                            break;

                        } else {
                            System.out.println("악마: 천천히 즐기자고");
                        }
                    } else if (choice == 2) {
                        user.space();
                        System.out.println("악마: 겁먹은 건가.");
                    } else if (choice == 3) {
                        user.space();
                        System.out.println("악마: 잔재구를 부리는군.");
                    } else if (choice == 4) {
                        user.space();
                        악마.HP = 0;
                        if (악마.HP <= 0) {
                            악마.nightpower(); 악마.스탯();
                            System.out.println("악마: 크아아아악!");
                            break;
                        }
                    }
                    System.out.println(" ");
                    next = sc.nextLine();
                    next = sc.nextLine();
user.space();
                    if (악마.HP <= 0) {   //악마턴
                        break;
                    } else {
                        System.out.println("[악마의 턴입니다.]");

                        next = sc.nextLine();
user.space();
                        System.out.println("악마: 이제 내 차례다!");
                        if (choice == 3) {
                            next = sc.nextLine();
                            user.space();
                            System.out.println("악마: 어디에 숨어있는거냐!");
                        } else {
                            악마.attack();
                            암살자.HP = 암살자.HP - (악마.공격력 - 암살자.방어력);
                            System.out.print("데미지=");
                            if ((악마.공격력 - 암살자.방어력) >= 0) {
                                System.out.println(악마.공격력 - 암살자.방어력);
                            } else if ((악마.공격력 - 암살자.방어력) < 0) {
                                System.out.println("0");
                            }
                            암살자.스탯();
                            if (암살자.HP <= 0) {           //용사가 체력에 따라 게임 종료 여부
                                System.out.println("[당신은 쓰러졌습니다.]");
                                System.out.println(" ");
                                System.out.println("[GAME OVER]");
                                System.exit(2);
                            } else {
                                System.out.println(name + ": 똑같이 갚아주마.");
                            }
                            System.out.println(" ");
                        }

                        암살자.action();
                        int choice2 = sc.nextInt();
                        if (choice2 == 1) {
                            System.out.print("데미지=");
                            System.out.println(암살자.공격력 - 악마.방어력);
                            System.out.println(" ");
                            악마.HP = 악마.HP - (암살자.공격력 - 악마.방어력);
                            악마.nightpower(); 악마.스탯();
                            if (악마.HP <= 0) {
                                악마.nightpower(); 악마.스탯();
                                System.out.println("악마: 크아아아악!");
                                break;

                            }else if(악마.HP <= 300) {
                                System.out.println("악마: 이녀석 내가 순순히 쓰러질까보냐!");
                                악마.악마스킬();
                                System.out.println("악마: 제대로 상대해 주지!");
                                악마.nightpower(); 악마.스탯();

                            } else {
                                System.out.println("악마: 천천히 즐기자고");
                            }
                        } else if (choice2 == 2) {
                            user.space();
                            System.out.println("악마: 겁먹었나?");
                        } else if (choice2 == 3) {
                            user.space();
                            System.out.println("악마: 사라졌어?!");
                        } else if (choice2 == 4) {
                            Battle.stop();
                            user.space();
                            악마.HP = 0;
                            if (악마.HP <= 0) {
                                악마.nightpower(); 악마.스탯();
                                System.out.println("악마: 크아아아악!");
                                break;
                            }
                        }
                        System.out.println(" ");
                        next = sc.nextLine();
                        next = sc.nextLine();
user.space();
                        if (악마.HP <= 0) {
                            break;
                        } else {
                            System.out.println("[악마의 턴입니다.]");

                            next = sc.nextLine();
user.space();
                            System.out.println("악마: 이제 내 차례다!");
                            if (choice2 == 3) {
                                System.out.println("악마: 어디에 숨어있는거냐!");
                            } else {
                                악마.attack();
                                암살자.HP = 암살자.HP - (악마.공격력 - 암살자.방어력);
                                System.out.print("데미지=");
                                if ((악마.공격력 - 암살자.방어력) >= 0) {
                                    System.out.println(악마.공격력 - 암살자.방어력);
                                } else if ((악마.공격력 - 암살자.방어력) < 0) {
                                    System.out.println("0");
                                }
                                암살자.스탯();
                                if (암살자.HP <= 0) {           //용사가 체력에 따라 게임 종료 여부
                                    System.out.println("[당신은 쓰러졌습니다.]");
                                    System.out.println(" ");
                                    System.out.println("[GAME OVER]");
                                    System.exit(2);
                                } else {
                                    System.out.println(name + ": 똑같이 갚아주마.");
                                }
                                System.out.println(" ");
                            }
                        }
                    }
                    암살자.action();
                    int choice3 = sc.nextInt();
                    if (choice3 == 1) {
                        user.space();
                        System.out.print("데미지=");
                        System.out.println(암살자.공격력 - 악마.방어력);
                        System.out.println(" ");
                        악마.HP = 악마.HP - (암살자.공격력 - 악마.방어력);
                        악마.nightpower(); 악마.스탯();
                        if (악마.HP <= 0) {
                            악마.nightpower(); 악마.스탯();
                            System.out.println("악마: 크아아아악!");
                            break;

                        }else if(악마.HP <= 300) {
                            System.out.println("악마: 크윽.. 이녀석");

                        } else {
                            System.out.println("악마: 천천히 즐기자고");
                        }
                    } else if (choice3 == 2) {
                        user.space();
                        System.out.println("악마: 생각보다 소심하군.");
                    } else if (choice3 == 3) {
                        user.space();
                        System.out.println("악마: 잔재주를 부리는군.");
                    } else if (choice3 == 4) {
                        Battle.stop();
                        user.space();
                        악마.HP = 0;
                        if (악마.HP <= 0) {
                            악마.nightpower(); 악마.스탯();
                            System.out.println("악마: 크아아아악!");
                            break;
                        }
                    }
                    if (악마.HP <= 0) {
                        break;
                    } else {
                        System.out.println("[악마의 턴입니다.]");
                        next = sc.nextLine();
user.space();
                        System.out.println("악마: 이제 내 차례다!");
                        if (choice3 == 3) {
                            next = sc.nextLine();
                            user.space();
                            System.out.println("악마: 어디에 숨어있는거냐!");
                        } else {
                            악마.attack();

                            암살자.HP = 암살자.HP - (악마.공격력 - 암살자.방어력);
                            System.out.print("데미지=");
                            if ((악마.공격력 - 암살자.방어력) >= 0) {
                                System.out.println(악마.공격력 - 암살자.방어력);
                            } else if ((악마.공격력 - 암살자.방어력) < 0) {
                                System.out.println("0");
                            }
                            System.out.println(" ");
                            암살자.스탯();
                            if (암살자.HP <= 0) {           //용사가 체력에 따라 게임 종료 여부
                                System.out.println("[당신은 쓰러졌습니다.]");
                                System.out.println(" ");
                                System.out.println("[GAME OVER]");
                                System.exit(2);
                            } else {
                                System.out.println(name + ": 죽여주마!");
                            }

                            System.out.println(" ");
                        }
                    }
                    암살자.action();
                    int choice4 = sc.nextInt();
                    if (choice4 == 1) {
                        user.space();
                        System.out.print("데미지=");
                        System.out.println(암살자.공격력 - 악마.방어력);
                        System.out.println(" ");
                        악마.HP = 악마.HP - (암살자.공격력 - 악마.방어력);
                        악마.nightpower(); 악마.스탯();
                        if (악마.HP <= 300) {
                            System.out.println("악마: 이녀석 내가 순순히 쓰러질까보냐!");


                        } else if (악마.HP <= 0) {
                            악마.nightpower(); 악마.스탯();
                            System.out.println("악마: 크아아아악!");
                            break;

                        } else {
                            System.out.println("악마: 천천히 즐기자고");
                        }
                    } else if (choice4 == 2) {

                        user.space();
                        System.out.println("악마: 겁쟁이 녀석.");
                    } else if (choice4 == 3) {
                        user.space();
                        System.out.println("악마: 잔재구를 부리는군");
                    } else if (choice4 == 4) {
                        Battle.stop();
                        user.space();
                        악마.HP = 0;
                        if (악마.HP <= 0) {
                            악마.nightpower(); 악마.스탯();
                            System.out.println("악마: 크아아아악!");
                            break;
                        }
                    }
                }
                next = sc.nextLine();
                next = sc.nextLine();
                user.space();

                Drop Drop1 = new Drop();
                Drop1.start();

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
                System.out.println("[악마가 쓰러졌다.]");
                CountTime1.stop();
                Battle.stop();

                // 슬픈 브금
                DarkEnd DarkEnd = new DarkEnd();
                DarkEnd.setDaemon(true);
                DarkEnd.start();

                next = sc.nextLine();
                next = sc.nextLine();
user.space();


                악마.imgS();
                System.out.println("악마: 크으으윽..");
                System.out.println("악마: 네 녀석 강력하군.");
                next = sc.nextLine();
user.space();
                악마.img();
                System.out.println("악마: 큭큭큭..");
                System.out.println(name+ ": 미친건가?");
                next = sc.nextLine();
user.space();
                악마.img();
                System.out.println("악마: 네 녀석과 난 닮았어...");
                next = sc.nextLine();
user.space();
                System.out.println(name+ ": 무슨 개소리지?");
                next = sc.nextLine();
user.space();
                악마.img();
                System.out.println("악마: 나랑 싸우기전 그 도적놈들..");
                System.out.println("악마: 아주 신명나게 학살하더군.");
                System.out.println("악마: 내겐 네 폭력을 정당화 하기위해 발버둥 치는것으로 밖에 보이지 않아..");
                next = sc.nextLine();
user.space();
                악마.img();
                System.out.println("악마: 아니면 단순한 화풀이 대상이 필요했던건가.. 큭큭");
                next = sc.nextLine();
user.space();
                System.out.println(name+ ": 더는 못들어 주겠군.");
                System.out.println(name+ ": 더 지껄이지 못하게 죽여주마.");
                next = sc.nextLine();
user.space();
                악마.img();
                System.out.println("악마: 여기서 내가 쓰러진다 해도");
                System.out.println("악마: 너같은 녀석처럼 악의에 물든 마음이 있는한");
                System.out.println("악마: 나는 다시 돌아온다.");
                next = sc.nextLine();
user.space();
                악마.img();
                System.out.println("악마: 아니면 내가 나를 이어 악의 화신이 될지도.. 큭큭큭");
                System.out.println("악마: 네 놈은 나랑 다르지 않아! 푸하하하");
                System.out.println("[성 안이 악마의 웃음소리로 가득찬다.]");
                next = sc.nextLine();
user.space();
                System.out.println(name+ ": ...");
                System.out.println(name+ ": 개소리를...이제 죽어라.");
                next = sc.nextLine();
user.space();
                악마.imgS();
                System.out.println("악마: 크큭.. 크헉!");
                System.out.println("["+name+"는(은) 악마의 숨통을 끊는다.]");
                Thread assATK1 = new Thread(new assATK());     //스킬 효과음 쓰레드
                assATK1.start();

                next = sc.nextLine();
user.space();
                System.out.println("[악마가 죽고 성 안에는 침묵만이 흐른다.]");
                System.out.println(name+ ": ...");
                next = sc.nextLine();
user.space();
                System.out.println(name+ ": 아니야... 난 네녀석이랑 달라...");
                System.out.println(name+ ": 내.. 행동은 잘못되지 않았어...");
                next = sc.nextLine();
user.space();
                System.out.println("["+name+"는(은) 자리에서 일어난다.]");
                System.out.println(name+ ": ...누군가는 해야해...");
                System.out.println(name+ ": ..그렇다면 내가.. 내가 하는 수 밖에..");
                next = sc.nextLine();
user.space();
                System.out.println(name+ ": ...악마가 부활하지 못하도록,");
                System.out.println(name+ ": 악한자들을 모조리 없앤다.");

                Ghost Ghost0 = new Ghost();
                Ghost0.setDaemon(true);
                Ghost0.start();

                System.out.println("["+name+"의 단검이 더 기분나쁜 기운을 내뿜는다.]");
                next = sc.nextLine();
user.space();
                System.out.println("["+name+"는(은) 악마의 성을 나와 천천히 발걸음을 옮긴다.]");
                System.out.println(" ");

                Thread GameOverE = new Thread(new GameOverE());   //스킬 이펙트 쓰레드
                GameOverE.start();
                try {
                    GameOverE.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }    //쓰레드 끝
                System.out.println(" ");
                System.out.println("[ Thank You For Playing. ]");
                System.out.println(" ");

                next = sc.nextLine();
                next = sc.nextLine();


                Ending.put("Ending 3","암살자 엔딩");  //Hashtable 실험, 암살자 엔딩

                try{          //입력
                    String ending = "{ Ending 3 of 4 - 암살자 엔딩 }";
                    byte[] binary = ending.getBytes();
                    File file = new File("C:\\Users\\osj41\\IdeaProjects\\HelloJava\\src\\game\\prac\\ending.txt");
                    OutputStream stream = new FileOutputStream(file);
                    stream.write(binary);
                    stream.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                try {          //출력
                    File file = new File("C:\\Users\\osj41\\IdeaProjects\\HelloJava\\src\\game\\prac\\ending.txt");
                    byte[] binary = new byte[(int)file.length()];
                    InputStream stream = new FileInputStream(file);
                    stream.read(binary);
                    stream.close();
                    System.out.println(new String(binary));
                    System.out.println(" ");
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                System.out.println(" ");

                System.out.println("1. 다시 시작");
                System.out.println("2. 게임 종료");
                int End = sc.nextInt();
                Dark.stop();
                if(End ==1){
                    System.out.println("게임을 다시 시작합니다.");
                    next = sc.nextLine();
                    main(args);

                }else{
                    System.out.println("게임을 종료합니다.");
                    System.exit(2);
                }


            }else if( DarkClass==2 ) {

                user.space();
                버서커 버서커 = new 버서커();
                버서커.sleep();
                버서커.armorSet();
                버서커.어둠의힘();
                버서커.어둠의육체();
                버서커.광기어린힘();
                버서커.광기의육체();
                System.out.println("[당신은 어둠의 전사로 전직했습니다]");
                UP UP2 = new UP();
                UP2.start();
                System.out.println("New 어둠의힘 =" + 버서커.공격력 + "(공격력+100)");
                System.out.println("New 어둠의육체 =" + 버서커.HP + "(HP+300)");
                버서커.스탯();
                next = sc.nextLine();
                next = sc.nextLine();
                user.space();
                System.out.println(" ");

                Dark Dark = new Dark();
                Dark.setDaemon(true);
                Dark.start();

                System.out.println("["+name+"는(은) 악마의 성에 도착했다.]"); //악마의 성 도착
                System.out.println("??: 내가 준 선물은 잘 받았나?");
                devilB 악마 = new devilB();
                System.out.println(name+": 누구냐? 모습을 보여라.");
                next = sc.nextLine();
                user.space();
                System.out.println("??: 질문은 내가 먼저했거늘...끌끌..");
                System.out.println("[악마가 모습을 드러냈다.]");
                악마.img();
                next = sc.nextLine();
                user.space();
                System.out.println(name+": 네 놈이 악마냐?");
                next = sc.nextLine();
                user.space();
                악마.img();
                System.out.println("악마: 그래서 내 선물은 마음에 들었나 물었다.");
                System.out.println(name+": 도통 무슨말을 하는지 모르겠군.");
                next = sc.nextLine();
                user.space();
                악마.img();
                System.out.println("악마: 끌끌끌.. 지금 그 다친 여자를 병원에 데려다주고 오는길이 아닌가?");
                System.out.println(name+": ...?!");
                next = sc.nextLine();
                user.space();
                악마.img();
                System.out.println("악마: 이제 얘기가 통하는군.");
                System.out.println("악마: 그 도적이 그리도 악한 마음을 품은게 의아한적 없나?");
                System.out.println(name+": ...");
                next = sc.nextLine();
                user.space();
                악마.img();
                System.out.println("악마: 이제 좀 감이 오는건가? 그들의 마음을 누가 악하게 만들었을까.. 큭큭큭");
                System.out.println(name+": ...네 녀석 짓이었냐...");
                next = sc.nextLine();
                user.space();
                악마.img();
                System.out.println("악마: 반응을 보아하니 내 선물이 마음에 들었나보군.");
                System.out.println(name+": 네 놈은 내 손으로 죽인다.");
                System.out.println("악마: 끌끌끌");
                next = sc.nextLine();
                user.space();
                System.out.println("[악마와의 전투가 시작됬다.]");

                CountTime CountTime1 = new CountTime();
                CountTime1.setDaemon(true);
                CountTime1.start();

                Dark.stop();

                Battle Battle = new Battle();
                Battle.setDaemon(true);
                Battle.start();

                악마.nightpower(); 악마.스탯();

                while (악마.HP > 0) {  //전투
                    버서커.action();    //플레이어 턴
                    int choice = sc.nextInt();
                    if (choice == 1) {
                        user.space();
                        System.out.print("데미지=");
                        System.out.println(버서커.공격력 - 악마.방어력);
                        System.out.println(" ");
                        악마.HP = 악마.HP - (버서커.공격력 - 악마.방어력);
                        악마.nightpower(); 악마.스탯();
                        if (악마.HP <= 0) {
                            악마.nightpower(); 악마.스탯();
                            System.out.println("악마: 크아아아악!");
                            break;

                        } else if (악마.HP <= 300) {
                            System.out.println("악마: 이녀석 내가 순순히 쓰러질까보냐!");
                            악마.악마스킬();
                            System.out.println("악마: 제대로 상대해 주지!");
                            악마.nightpower(); 악마.스탯();

                        } else if (악마.HP <= 0) {
                            악마.nightpower(); 악마.스탯();
                            System.out.println("악마: 크아아아악!");
                            break;

                        } else {
                            System.out.println("악마: 천천히 즐기자고");
                        }
                    } else if (choice == 2) {
                        user.space();
                        System.out.println("악마: 보기보다 겁쟁이군.");
                    } else if (choice == 3) {
                        user.space();
                        System.out.print("데미지=");
                        System.out.println(버서커.공격력*4/5 - 악마.방어력);
                        System.out.println(" ");
                        System.out.print("데미지=");
                        System.out.println(버서커.공격력*4/5 - 악마.방어력);
                        System.out.println(" ");
                        악마.HP = 악마.HP - (버서커.공격력*4/5 - 악마.방어력);
                        악마.HP = 악마.HP - (버서커.공격력*4/5 - 악마.방어력);
                        악마.nightpower(); 악마.스탯();
                        if (악마.HP <= 0) {
                            악마.nightpower(); 악마.스탯();
                            System.out.println("악마: 크아아아악!");
                            break;

                        } else if (악마.HP <= 300) {

                            System.out.println("악마: 이녀석 내가 순순히 쓰러질까보냐!");
                            next = sc.nextLine();
                            user.space();

                            악마.악마스킬();
                            System.out.println("악마: 제대로 상대해 주지!");
                            악마.nightpower(); 악마.스탯();

                        } else if (악마.HP <= 0) {
                            악마.nightpower(); 악마.스탯();
                            System.out.println("악마: 크아아아악!");
                            break;

                        } else {
                            System.out.println("악마: 제법이군!");
                        }
                    } else if (choice == 4) {
                        악마.HP = 0;
                        if (악마.HP <= 0) {
                            악마.nightpower(); 악마.스탯();
                            System.out.println("악마: 크아아아악!");
                            break;
                        }
                    }
                    System.out.println(" ");
                    next = sc.nextLine();
                    next = sc.nextLine();
user.space();
                    if (악마.HP <= 0) {   //악마턴
                        break;
                    } else {
                        System.out.println("[악마의 턴입니다.]");

                        next = sc.nextLine();
user.space();
                        System.out.println("악마: 이제 내 차례다!");

                        악마.attack();
                        버서커.HP = 버서커.HP - (악마.공격력 - 버서커.방어력);
                        System.out.print("데미지=");
                        if ((악마.공격력 - 버서커.방어력) >= 0) {
                                System.out.println(악마.공격력 - 버서커.방어력);
                        } else if ((악마.공격력 - 버서커.방어력) < 0) {
                            System.out.println("0");
                        }
                        버서커.스탯();
                        if (버서커.HP <= 0) {           //용사가 체력에 따라 게임 종료 여부
                            System.out.println("[당신은 쓰러졌습니다.]");
                            System.out.println(" ");

                    user.GameOver();
                            System.out.println("1. 다시 시작");
                            System.out.println("2. 게임 종료");
                            System.out.println(" ");
                            int End = sc.nextInt();
                            if(End ==1){
                                System.out.println("[게임을 다시 시작합니다.]");
                                next = sc.nextLine();
                                main(args);

                            }else{
                                System.out.println("[게임을 종료합니다.]");
                                System.exit(2);
                            }


                        } else {
                            System.out.println(name + ": 똑같이 갚아주마.");
                        }
                        System.out.println(" ");
                    }
                    버서커.action();      //플레이어턴
                    int choice1 = sc.nextInt();
                    if (choice1 == 1) {
                        user.space();
                        System.out.print("데미지=");
                        System.out.println(버서커.공격력 - 악마.방어력);
                        System.out.println(" ");
                        악마.HP = 악마.HP - (버서커.공격력 - 악마.방어력);
                        악마.nightpower(); 악마.스탯();
                        if (악마.HP <= 0) {
                            악마.nightpower(); 악마.스탯();
                            System.out.println("악마: 크아아아악!");
                            break;

                        }else if(악마.HP <= 300) {
                            System.out.println("악마: 크윽.. 이녀석");

                        } else {
                            System.out.println("악마: 천천히 즐기자고");
                        }
                    } else if (choice1 == 2) {
                        user.space();
                        System.out.println("악마: 보기보다 겁쟁이군.");
                    } else if (choice1 == 3) {
                        user.space();
                        System.out.print("데미지=");
                        System.out.println(버서커.공격력*2/3 - 악마.방어력);
                        System.out.println(" ");
                        System.out.print("데미지=");
                        System.out.println(버서커.공격력*2/3 - 악마.방어력);
                        System.out.println(" ");
                        악마.HP = 악마.HP - (버서커.공격력*2/3 - 악마.방어력);
                        악마.HP = 악마.HP - (버서커.공격력*2/3 - 악마.방어력);
                        악마.nightpower(); 악마.스탯();
                        if (악마.HP <= 0) {
                            악마.nightpower(); 악마.스탯();
                            System.out.println("악마: 크아아아악!");
                            break;

                        }else if(악마.HP <= 300) {
                            System.out.println("악마: 크윽.. 이녀석");

                        } else {
                            System.out.println("악마: 천천히 즐기자고");
                        }
                    } else if (choice1 == 4) {
                        Battle.stop();
                        user.space();
                        악마.HP = 0;
                        if (악마.HP <= 0) {
                            악마.nightpower(); 악마.스탯();
                            System.out.println("악마: 크아아아악!");
                            break;
                        }
                    }
                    System.out.println(" ");
                    next = sc.nextLine();
user.space();
                    if (악마.HP <= 0) {   //악마턴
                        break;
                    } else {
                        System.out.println("[악마의 턴입니다.]");

                        next = sc.nextLine();
user.space();
                        System.out.println("악마: 이제 내 차례다!");

                        악마.attack();
                        버서커.HP = 버서커.HP - (악마.공격력 - 버서커.방어력);
                        System.out.print("데미지=");
                        if ((악마.공격력 - 버서커.방어력) >= 0) {
                            System.out.println(악마.공격력 - 버서커.방어력);
                        } else if ((악마.공격력 - 버서커.방어력) < 0) {
                            System.out.println("0");
                        }
                        버서커.스탯();
                        if (버서커.HP <= 0) {           //용사가 체력에 따라 게임 종료 여부
                            System.out.println("[당신은 쓰러졌습니다.]");
                            System.out.println(" ");

                    user.GameOver();
                            System.out.println("1. 다시 시작");
                            System.out.println("2. 게임 종료");
                            System.out.println(" ");
                            int End = sc.nextInt();
                            if(End ==1){
                                System.out.println("[게임을 다시 시작합니다.]");
                                next = sc.nextLine();
                                main(args);

                            }else{
                                System.out.println("[게임을 종료합니다.]");
                                System.exit(2);
                            }


                        } else {
                            System.out.println(name + ": 똑같이 갚아주마.");
                        }
                        System.out.println(" ");
                    }
                    버서커.action();      //플레이어턴
                    int choice2 = sc.nextInt();
                    if (choice2 == 1) {
                        user.space();
                        System.out.print("데미지=");
                        System.out.println(버서커.공격력 - 악마.방어력);
                        System.out.println(" ");
                        악마.HP = 악마.HP - (버서커.공격력 - 악마.방어력);
                        악마.nightpower(); 악마.스탯();
                        if (악마.HP <= 0) {
                            악마.nightpower(); 악마.스탯();
                            System.out.println("악마: 크아아아악!");
                            break;

                        }else if(악마.HP <= 300) {
                            System.out.println("악마: 크윽.. 이녀석");

                        } else {
                            System.out.println("악마: 천천히 즐기자고");
                        }
                    } else if (choice2 == 2) {
                        user.space();
                        System.out.println("악마: 보기보다 겁쟁이군.");
                    } else if (choice2 == 3) {
                        user.space();
                        System.out.print("데미지=");
                        System.out.println(버서커.공격력*2/3 - 악마.방어력);
                        System.out.println(" ");
                        System.out.print("데미지=");
                        System.out.println(버서커.공격력*2/3 - 악마.방어력);
                        System.out.println(" ");
                        악마.HP = 악마.HP - (버서커.공격력*2/3 - 악마.방어력);
                        악마.HP = 악마.HP - (버서커.공격력*2/3 - 악마.방어력);
                        악마.nightpower(); 악마.스탯();
                        if (악마.HP <= 0) {
                            악마.nightpower(); 악마.스탯();
                            System.out.println("악마: 크아아아악!");
                            break;

                        }else if(악마.HP <= 300) {
                            System.out.println("악마: 크윽.. 이녀석");

                        } else {
                            System.out.println("악마: 천천히 즐기자고");
                        }
                    } else if (choice2 == 4) {
                        Battle.stop();
                        user.space();
                        악마.HP = 0;
                        if (악마.HP <= 0) {
                            악마.nightpower(); 악마.스탯();
                            System.out.println("악마: 크아아아악!");
                            break;
                        }
                    }
                    System.out.println(" ");
                    next = sc.nextLine();
user.space();
                    if (악마.HP <= 0) {   //악마턴
                        break;
                    } else {
                        System.out.println("[악마의 턴입니다.]");

                        next = sc.nextLine();
user.space();
                        System.out.println("악마: 이제 내 차례다!");

                        악마.attack();
                        버서커.HP = 버서커.HP - (악마.공격력 - 버서커.방어력);
                        System.out.print("데미지=");
                        if ((악마.공격력 - 버서커.방어력) >= 0) {
                            System.out.println(악마.공격력 - 버서커.방어력);
                        } else if ((악마.공격력 - 버서커.방어력) < 0) {
                            System.out.println("0");
                        }
                        버서커.스탯();
                        if (버서커.HP <= 0) {           //용사가 체력에 따라 게임 종료 여부
                            System.out.println("[당신은 쓰러졌습니다.]");
                            System.out.println(" ");

                    user.GameOver();
                            System.out.println("1. 다시 시작");
                            System.out.println("2. 게임 종료");
                            System.out.println(" ");
                            int End = sc.nextInt();
                            if(End ==1){
                                System.out.println("[게임을 다시 시작합니다.]");
                                next = sc.nextLine();
                                main(args);

                            }else{
                                System.out.println("[게임을 종료합니다.]");
                                System.exit(2);
                            }


                        } else {
                            System.out.println(name + ": 똑같이 갚아주마.");
                        }
                        System.out.println(" ");
                    }
                }
                next = sc.nextLine();
                next = sc.nextLine();
                user.space();

                Drop Drop1 = new Drop();
                Drop1.start();

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
                System.out.println("[악마가 쓰러졌다.]");

                CountTime1.stop();
                Battle.stop();

                DarkEnd DarkEnd = new DarkEnd();
                DarkEnd.setDaemon(true);
                DarkEnd.start();

                next = sc.nextLine();
user.space();
                 // 슬픈 브금


                System.out.println("악마: 크으으윽..");
                System.out.println("악마: 네 녀석 강력하군.");
                next = sc.nextLine();
user.space();
                악마.img();
                System.out.println("악마: 큭큭큭..");
                System.out.println(name+ ": 미친건가?");
                next = sc.nextLine();
user.space();
                악마.img();
                System.out.println("악마: 네 녀석과 난 닮았어...");
                next = sc.nextLine();
user.space();
                System.out.println(name+ ": 무슨 개소리지?");
                next = sc.nextLine();
user.space();
                악마.img();
                System.out.println("악마: 나랑 싸우기전 그 도적놈들..");
                System.out.println("악마: 아주 신명나게 학살하더군.");
                System.out.println("악마: 내겐 네 폭력을 정당화 하기위해 발버둥 치는것으로 밖에 보이지 않아..");
                next = sc.nextLine();
user.space();
                악마.img();
                System.out.println("악마: 아니면 단순한 화풀이 대상이 필요했던건가.. 큭큭");
                next = sc.nextLine();
user.space();
                System.out.println(name+ ": 더는 못들어 주겠군.");
                System.out.println(name+ ": 더 지껄이지 못하게 죽여주마.");
                next = sc.nextLine();
user.space();
                악마.img();
                System.out.println("악마: 여기서 내가 쓰러진다 해도");
                System.out.println("악마: 너같은 녀석처럼 악의에 물든 마음이 있는한");
                System.out.println("악마: 나는 다시 돌아온다.");
                next = sc.nextLine();
user.space();
                악마.img();
                System.out.println("악마: 아니면 내가 나를 이어 악의 화신이 될지도.. 큭큭큭");
                System.out.println("악마: 네 놈은 나랑 다르지 않아! 푸하하하");
                System.out.println("[성 안이 악마의 웃음소리로 가득찬다.]");
                next = sc.nextLine();
user.space();
                System.out.println(name+ ": ...");
                System.out.println(name+ ": 개소리를...이제 죽어라.");
                next = sc.nextLine();
user.space();
                악마.imgS();
                System.out.println("악마: 크큭.. 크헉!");
                System.out.println("["+name+"는(은) 악마의 숨통을 끊는다.]");
                Thread assATK1 = new Thread(new assATK());     //스킬 효과음 쓰레드
                assATK1.start();
                next = sc.nextLine();
user.space();
                System.out.println("[악마가 죽고 성 안에는 침묵만이 흐른다.]");
                System.out.println(name+ ": ...");
                next = sc.nextLine();
user.space();
                System.out.println(name+ ": 아니야... 난 네녀석이랑 달라...");
                System.out.println(name+ ": 내.. 행동은 잘못되지 않았어...");
                next = sc.nextLine();
user.space();
                System.out.println("["+name+"는(은) 자리에서 일어난다.]");
                System.out.println(name+ ": ...누군가는 해야해...");
                System.out.println(name+ ": ..그렇다면 내가.. 내가 하는 수 밖에..");
                next = sc.nextLine();
user.space();
                System.out.println(name+ ": ...악마가 부활하지 못하도록,");
                System.out.println(name+ ": 악한자들을 모조리 없앤다.");

                Ghost Ghost = new Ghost();
                Ghost.setDaemon(true);
                Ghost.start();

                System.out.println("["+name+"의 도끼가 더 기분나쁜 기운을 내뿜는다.]");
                next = sc.nextLine();
user.space();
                System.out.println("["+name+"는(은) 악마의 성을 나와 천천히 발걸음을 옮긴다.]");
                System.out.println(" ");

                Thread GameOverE = new Thread(new GameOverE());   //스킬 이펙트 쓰레드
                GameOverE.start();
                try {
                    GameOverE.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }    //쓰레드 끝
                System.out.println(" ");
                System.out.println("[ Thank You For Playing. ]");
                System.out.println(" ");

                next = sc.nextLine();
                next = sc.nextLine();

                Ending.put("Ending 4","버서커 엔딩");  //Hashtable 실험, 버서커 엔딩

                try{          //입력
                    String ending = "{ Ending 4 of 4 - 버서커 엔딩 }";
                    byte[] binary = ending.getBytes();
                    File file = new File("C:\\Users\\osj41\\IdeaProjects\\HelloJava\\src\\game\\prac\\ending.txt");
                    OutputStream stream = new FileOutputStream(file);
                    stream.write(binary);
                    stream.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                try {          //출력
                    File file = new File("C:\\Users\\osj41\\IdeaProjects\\HelloJava\\src\\game\\prac\\ending.txt");
                    byte[] binary = new byte[(int)file.length()];
                    InputStream stream = new FileInputStream(file);
                    stream.read(binary);
                    stream.close();
                    System.out.println(new String(binary));
                    System.out.println(" ");
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                System.out.println(" ");

                System.out.println("1. 다시 시작");
                System.out.println("2. 게임 종료");
                int End = sc.nextInt();
                Dark.stop();
                if(End ==1){
                    System.out.println("게임을 다시 시작합니다.");
                    next = sc.nextLine();
                    main(args);

                }else{
                    System.out.println("게임을 종료합니다.");
                    System.exit(2);
                }



            }
        }

        long end = System.currentTimeMillis();
        System.out.println("수행시간: " + (end - start) + " ms");

    }
}

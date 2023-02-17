package game;

import java.time.LocalTime;

public class Timepractice implements Runnable {

    static boolean autoSave = false;

    public static void main(String[] args){
        Thread t = new Thread(new Timepractice());	// Thread(Runnable r)
        t.setDaemon(true);	// 이 부분이 없으면 종료되지 않는다.
        t.start();

        for(int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {}
            System.out.println(i);
            if(i == 5) autoSave = true;
        }
        System.out.println("프로그램을 종료합니다.");
    }
    public void run() {
        while(true) {
            try {
                Thread.sleep(3 * 1000);	// 3초마다
            } catch(InterruptedException e) {}

            // autoSave의 값이 true이면 autoSave()를 호출한다.
            if(autoSave) autoSave();
        }
    }
    public void autoSave() {
        System.out.println("작업파일이 자동저장 되었습니다.");
    }



//        HashMap map = new HashMap();
//        map.put("김자바", new Integer(90));
//        map.put("김자바", new Integer(100));
//        map.put("박자바", new Integer(100));
//        map.put("최자바", new Integer(80));
//        map.put("이자바", new Integer(90));
//
//        Set set = map.entrySet();
//        Iterator it = set.iterator();
//
//        while(it.hasNext()) {
//            // Map 인터페이스, Entry 인터페이스(Map의 내부 인터페이스)
//            Map.Entry e = (Map.Entry)it.next();
//            System.out.println("이름: "+ e.getKey() +", "
//                    +"점수: "+ e.getValue());
//        }
//
//        set = map.keySet();
//        System.out.println("참가자 명단: " + set);
//
//        Collection values = map.values();
//        it = values.iterator();
//
//        int total = 0;
//
//        while(it.hasNext()) {
//            int i = (int)it.next();
//            total += i;
//        }
//        System.out.println("총점 : " + total);
//        System.out.println("평균 : " + (float)total/set.size());
//        System.out.println("최고점수 : " + Collections.max(values));
//        System.out.println("최저점수 : " + Collections.min(values));


}

class CountTime extends Thread {
    LocalTime now = LocalTime.now();
    int hour = now.getHour();
    int minute = now.getMinute();
    int second = now.getSecond();

    @Override

    public void run() {

        // TODO Auto-generated method stub


        try {

            int i=0;

            while (i<=2) {
                i++;

                Thread.sleep(80*1000);

                if (hour <= 24 && hour >= 21 ){
                    System.out.println("[현재는 밤입니다.]");
                    System.out.println("(몬스터의 공격력과 체력이 상승합니다.)");
                } else if (hour <=20 && hour >=17) {
                    System.out.println("[현재는 저녁입니다.]");
                    System.out.println("(몬스터의 공격력과 체력이 소량 상승합니다.)");
                } else if (hour <=16 && hour >=12) {
                    System.out.println("[현재는 오후입니다.]");
                }else if (hour <= 11 && hour >=6){
                    System.out.println("[현재는 아침입니다.]");
                } else {
                    System.out.println("[현재는 새벽입니다.]");
                    System.out.println("(몬스터의 공격력이 소량 상승합니다.)");
                }
            }
        } catch (InterruptedException e) {

            // TODO Auto-generated catch block

            e.printStackTrace();

        }

    }

}
class CurrentDateTime {
    public static void main(String[] args) {
// 현재 시간
        LocalTime now = LocalTime.now();
// 현재시간 출력
        System.out.println(now); // 06:25:59.985969400
// 시, 분, 초 구하기
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
// 시, 분, 초 출력
        System.out.println(hour); // 6
        System.out.println(minute); // 25
        System.out.println(second); // 59
    }
}











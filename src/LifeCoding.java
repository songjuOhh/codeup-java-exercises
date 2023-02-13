import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class LifeCoding {
    public static void main(String[] args) {
        // 직장인 헬창의 삶을 다룬 코딩
        Scanner sc = new Scanner(System.in);
        System.out.println("[알람이 요란하게 울린다.]");
        System.out.println("빠빠빠 빠 빠빠빠바 굿모닝~");
        System.out.println("1.알람을 끈다  2.그냥 무시한다");
        //String alarm;
//        alarm.equals("2")
        int alarm = sc.nextInt();

        if (alarm == 1) {
            System.out.println("[알람을 끈다]");
            System.out.println("거참 시끄럽네");
            System.out.println("[눈을 비비며 일어난다]");

        } else {
            System.out.println("조금만 더어..");
            System.out.println("[ 30초 뒤 ]");
            System.out.println("빠빠빠 빠 빠빠빠바 굿모닝~");
            System.out.println("1.알람을 끈다  2.무시한다");

            int alarm2 = sc.nextInt();

            if (alarm2 == 1) {
                System.out.println("[알람을 끈다]");
                System.out.println("어우 시끄러워!");
                System.out.println("[눈을 비비며 일어난다]");
            } else {
                System.out.println("어우 좀.. 1분만...");
                System.out.println("[ 30초 뒤 ]");
                System.out.println("...");
                System.out.println("빠빠빠 빠 빠빠빠바 굿모닝~");
                System.out.println("1.알람을 끈다 2. 알람을 던진다");

                int alarm3 = sc.nextInt();

                if (alarm3 == 1) {
                    System.out.println("[알람을 끈다]");
                    System.out.println("알겠어 알겠다구! 일어난다!");
                    System.out.println("[눈을 비비며 일어난다]");
                } else {
                    System.out.println("에잇!");
                    System.out.println("[알람이 날아가 벽에 부딪힌다.]");
                    System.out.println("[놀라며 일어나 시계를 확인한다.]");
                    System.out.println("엇 너무 세게 던졌나;; 새로 사야겠네..");
                }
            }
        }
        System.out.println("...");
        System.out.println("잠깐! 근데 오늘은 무슨요일이지?");
        System.out.println("1.평일  2.주말");
        int day = sc.nextInt();

        if(day == 1) {
            System.out.println("[평일]");
            System.out.println("으어엇 일하는 날이네?! 뭐부터 하지?");
            System.out.println("1.씻으러 간다  2.밥부터 먹는다");
            int awake = sc.nextInt();

            if(awake == 1) {
                System.out.println("일단 먼저 씻어야겠다");
                System.out.println("[화장실문 앞에 푸쉬업 바가 보인다]");
                System.out.println("1.푸쉬업을 한다  2.무시하고 화장실로 들어간다");
                int mpush = sc.nextInt();

                if (mpush == 1){
                    System.out.println("역시 화장실 들어가기전 푸쉬업은 국룰이지!");
                    System.out.println("[푸쉬업 한세트를 한다]");
                    System.out.println("후 자 이제 씻어볼까");
                    System.out.println("1.찬물로 씻는다  2.따뜻한 물로 씻는다");
                    int shower = sc.nextInt();

                    if (shower ==1){
                        System.out.println("[호스에서 찬물이 나온다]");
                        System.out.println("운동후엔 찬물이 최고지!");
                    }else{
                        System.out.println("역시 좀 아침은 좀 뜨뜻하게에...");
                        System.out.println("[호스에서 찬물이 나온다]");
                        System.out.println("앗 차거?! 아.. 하아.. 보일러...");
                    }
                }else {
                    System.out.println("푸쉬업은 다음에.. 허허 일단 먼저 씻어야겠다");
                    System.out.println("1.찬물로 씻는다  2.뜨거운 물로 씻는다");
                    int shower = sc.nextInt();
                    if (shower == 1) {
                        System.out.println("[호스에서 찬물이 나온다]");
                        System.out.println("아침에 정신 차릴려면 찬물이 최고지!");
                    } else {
                        System.out.println("역시 좀 아침은 좀 뜨뜻하게에...");
                        System.out.println("[호스에서 찬물이 나온다]");
                        System.out.println("앗 차거?! 아.. 하아.. 보일러...");
                    }
                }
                System.out.println("[샤워를 마쳤다]");
                System.out.println("시간이 얼마 없네; 간단하게 챙겨먹어야지.");
                System.out.println("1.바나나  2.통밀빵  3.영양 프로틴쉐이크");
                int qbreakfast = sc.nextInt();
                if (qbreakfast == 1){
                    System.out.println("[바나나를 챙긴다]");
                    System.out.println("바나나는 칼륨과 비타민C가 풍부해서 매우 웰빙쵸이스라고 할수 있지.");
                }else if(qbreakfast ==2){
                    System.out.println("[빵을 챙긴다]");
                    System.out.println("통밀은 정제되지 않아 풍부한 식이섬유를 포함하고 있어서 아침식사로 웰빙하다고 할수 있지.");
                }else{
                    System.out.println("[프로틴 쉐이크를 챙긴다]");
                    System.out.println("프로틴 쉐이크는 포만감을 유지시켜 주고 근합성에 있어서 엄청난 도움을 줄수있지 노 근손실 쵸이스.");
                }
            }else {
                System.out.println("일단 밥부터 먹어야지");
                System.out.println("[냉장고를 연다]");
                System.out.println("어디보자..계란이랑,햄이 있네.. 뭘먹을까?");
                System.out.println("1.간장계란밥  2.달걀 햄 샌드위치  3.햄 스크램블에그");
                int breakfast = sc.nextInt();
                if (breakfast == 1){
                    System.out.println("[간장계란밥이 완성되었다]");
                    System.out.println("크으 계란 후라이가 간장과 참기름과 만나 고소함이 입안을 가득 매우네.. 햄볽");
                }else if(breakfast == 2) {
                    System.out.println("[달걀 햄 샌드위치가 완성되었다]");
                    System.out.println("달달한 쨈이 발린 빵사이에 고소한 계란과 짭조름한 햄의 조합은 틀릴수가 없지..!");
                }else {
                    System.out.println("[햄 스크램블에그가 완성되었다]");
                    System.out.println("뭔가 미국 브런치 레스토랑에서 나올거같은 이 조합. 케첩과 함께 맛나게 먹어주지!");
                }
                System.out.println("[맛있는 식사 후]");
                System.out.println("자 얼른 마저 준비하고 나가볼까!");
            }
            System.out.println("[모든 준비가 끝나 집을 나선다]");
            System.out.println("뭘타고 출근할까?");
            System.out.println("1.버스  2.택시  3.람보르기니 가야르도.2WD");
            int ride = sc.nextInt();
            if(ride == 1){
                System.out.println("버스 정류장까지 얼른 가야겠다, 정류장까지 빨리 가려면 내 애마를 꺼내야겠군");
                System.out.println("가자! 나의 애마 람보르기니 가야르도 2WD 에디션!");
                System.out.println("[내가 가장 좋아하는 노란색 자전저를 꺼냈다]");
                System.out.println("자 출바알!");
            }else if(ride == 2){
                System.out.println("[지갑을 들여다본다]");
                System.out.println("아 음 아직 지각은 아니니까 택시까지는 흠흠");
                System.out.println("택시보다 갓성비인 내 애마를 꺼내야겠군! 람보르기니 가야르도 2WD 에디션!");
                System.out.println("[내가 가장 좋아하는 노란색 자전저를 꺼냈다]");
                System.out.println("가즈아아!");
            }else{
                System.out.println("내 애마를 결국 꺼내야 하는건가..");
                System.out.println("내 애마로 말할것 같으면 지치지 않는 나의 심장을 탑재한 최고 갓성비의 람보르기니 가야르도 2WD 에디션!");
                System.out.println("[내가 가장 좋아하는 노란색 자전저를 꺼냈다]");
                System.out.println("가볼까아아!");
            }
            System.out.println("--------------------------------------------");
            System.out.println("[출근 후 오전 업무를 무사히 마무리 했다]");
            System.out.println("[점심시간]");
            System.out.println("점심시간이네 뭐먹지?");
            System.out.println("1.한식  2.중식  3.일식");
            int food = sc.nextInt(); // 먹고싶은 음식 종류

            if (food == 1) {
                System.out.println("[한식]");
                System.out.println("한식이 땡기네. 배달시킬까?");
                System.out.println("1.배달을 시킨다  2.식당으로 간다");
                int delivery = sc.nextInt(); // 배달 여부 Y/N
                if (delivery == 1) {
                    System.out.println("배달하면 배달의 민족이지!");
                    System.out.println("뭘 먹어볼까아?");
                    System.out.println("1.돼지국밥  2.불고기 덮밥  3.돼지불백");
                    int korean = sc.nextInt();
                    if (korean == 1){
                        System.out.println("[돼지국밥을 주문한다]");
                        System.out.println("역시 점심으론 마음까지 든든해지는 돼지국밥이 최고지..(군침)");
                    }else if(korean ==2){
                        System.out.println("[불고기 덮밥을 주문한다]");
                        System.out.println("맛있는 불고기 양념에 밥비며먹으면 크으...(군침)");
                    }else{
                        System.out.println("[돼지불백을 주문한다]");
                        System.out.println("매콤한 돼지불백 양념에 밥을 싸악 비벼다가...(군침)");
                    }
                    System.out.println("--------------------------------------------");
                    System.out.println("[식사를 마쳤다]");
                    System.out.println("아 배부르다. 역시 한국음식은 언제나 옳지...");
                } else {
                    System.out.println("맛있는 한식집은 El Camino Real 코리아타운으로!");
                    System.out.println("--------------------------------------------");
                    System.out.println("[식당에 도착했다]");
                    System.out.println("뭘 먹어볼까아?");
                    System.out.println("1.돼지국밥  2.불고기 덮밥  3.돼지불백");
                    int korean = sc.nextInt();
                    if (korean == 1){
                        System.out.println("[돼지국밥을 주문한다]");
                        System.out.println("역시 점심으론 마음까지 든든해지는 돼지국밥이 최고지..(군침)");
                    }else if(korean ==2){
                        System.out.println("[불고기 덮밥을 주문한다]");
                        System.out.println("맛있는 불고기 양념에 밥비며먹으면 크으...(군침)");
                    }else{
                        System.out.println("[돼지불백을 주문한다]");
                        System.out.println("매콤한 돼지불백 양념에 밥을 싸악 비벼다가...(군침)");
                    }
                    System.out.println("--------------------------------------------");
                    System.out.println("[식사를 마쳤다]");
                    System.out.println("아 배부르다. 역시 한국음식은 언제나 옳지...");

                }
            } else if (food == 2) {
                System.out.println("[중식]");
                System.out.println("중식이 땡기네. 배달시킬까?");
                System.out.println("1.배달을 시킨다  2.식당으로 간다");
                int delivery = sc.nextInt(); // 배달 여부 Y/N
                if (delivery == 1) {
                    System.out.println("배달하면 배달의 민족이지!");
                    System.out.println("뭘 먹어볼까아?");
                    System.out.println("1.짜장면  2.짬뽕  3.짬짜면");
                    int chinese = sc.nextInt();
                    if (chinese == 1){
                        System.out.println("[짜장면을 주문한다]");
                        System.out.println("역시 중국집하면 윤기 좌르륵 흐르는 짜장면은 언제나 옳지..(군침)");
                    }else if(chinese ==2){
                        System.out.println("[짬뽕을 주문한다]");
                        System.out.println("칼칼한 국물에 면과 건더기를 함께 호로록 먹는 그 맛은 못참지...(군침)");
                    }else{
                        System.out.println("[짬짜면을 주문한다]");
                        System.out.println("후욱 그 어느 하나도 포기할수 없다...! 이런 메뉴는 누가 만든걸까..(군침)");
                    }
                    System.out.println("--------------------------------------------");
                    System.out.println("[식사를 마쳤다]");
                    System.out.println("아 배부르다. 역시 중국음식은 언제 먹어도 맛있어...");
                } else {
                    System.out.println("맛있는 중식집은 서니베일에 China Palace!");
                    System.out.println("--------------------------------------------");
                    System.out.println("[식당에 도착했다]");
                    System.out.println("뭘 먹어볼까아?");
                    System.out.println("1.짜장면  2.짬뽕  3.짬짜면");
                    int chinese = sc.nextInt();
                    if (chinese == 1){
                        System.out.println("[짜장면을 주문한다]");
                        System.out.println("역시 중국집하면 윤기 좌르륵 흐르는 짜장면은 언제나 옳지..(군침)");
                    }else if(chinese ==2){
                        System.out.println("[짬뽕을 주문한다]");
                        System.out.println("칼칼한 국물에 면과 건더기를 함께 호로록 먹는 그 맛은 못참지...(군침)");
                    }else{
                        System.out.println("[짬짜면을 주문한다]");
                        System.out.println("후욱 그 어느 하나도 포기할수 없다...! 이런 메뉴는 누가 만든걸까..(군침)");
                    }
                    System.out.println("--------------------------------------------");
                    System.out.println("[식사를 마쳤다]");
                    System.out.println("아 배부르다. 역시 중국음식은 언제 먹어도 맛있어...");
                }
            } else if (food == 3) {
                System.out.println("[일식]");
                System.out.println("일식이 땡기네. 배달시킬까?");
                System.out.println("1.배달을 시킨다  2.식당으로 간다");
                int delivery = sc.nextInt(); // 배달 여부 Y/N
                if (delivery == 1) {
                    System.out.println("배달하면 배달의 민족이지!");
                    System.out.println("뭘 먹어볼까아?");
                    System.out.println("1.초밥  2.회덮밥  3.튀김우동");
                    int japanese = sc.nextInt();

                    if (japanese == 1){
                        System.out.println("[초밥을 주문한다]");
                        System.out.println("양보단 질로 승부한다. 초밥 한점 들어서 간장에 와사비 살짝 뭍혀서 음미하면..(군침)");
                    }else if(japanese ==2){
                        System.out.println("[회덮밥을 주문한다]");
                        System.out.println("회도 먹고싶고 밥도 땡길때 고르는 욕심쟁이 메뉴! 고소한 밥에 양념장과 회가 어우러져...(군침)");
                    }else{
                        System.out.println("[튀김우동을 주문한다]");
                        System.out.println("김이 모락모락 나는 우동국물 위에 올려진 바삭한 튀김을 먹으면서 통통한 면을 흡입하면..(군침)");
                    }
                    System.out.println("--------------------------------------------");
                    System.out.println("[식사를 마쳤다]");
                    System.out.println("아 배부르다. 역시 일본음식은 언제 먹어도 맛있어...하지만 매일 못먹는 맛ㅜ");
                } else {
                    System.out.println("맛있는 일식집은 역시 Yokohama 레스토랑!");
                    System.out.println("--------------------------------------------");
                    System.out.println("[식당에 도착했다]");
                    System.out.println("뭘 먹어볼까아?");
                    System.out.println("1.초밥  2.회덮밥  3.튀김우동");
                   int japanese = sc.nextInt();
                    if (japanese == 1){
                        System.out.println("[초밥을 주문한다]");
                        System.out.println("양보단 질로 승부한다. 초밥 한점 들어서 간장에 와사비 살짝 뭍혀서 음미하면..(군침)");
                    }else if(japanese ==2){
                        System.out.println("[회덮밥을 주문한다]");
                        System.out.println("회도 먹고싶고 밥도 땡길때 고르는 욕심쟁이 메뉴! 고소한 밥에 양념장과 회가 어우러져...(군침)");
                    }else{
                        System.out.println("[튀김우동을 주문한다]");
                        System.out.println("김이 모락모락 나는 우동국물 위에 올려진 바삭한 튀김을 먹으면서 통통한 면을 흡입하면..(군침)");
                    }
                    System.out.println("--------------------------------------------");
                    System.out.println("[식사를 마쳤다]");
                    System.out.println("아 배부르다. 역시 일본음식은 언제 먹어도 맛있어...하지만 매일 못먹는 맛ㅜ");
                }
            } else {
                System.out.println("[음식]");
                System.out.println("그럼 배달시킬까?");
                System.out.println("1.배달을 시킨다  2.식당으로 간다");
                int delivery = sc.nextInt(); // 배달 여부 Y/N
                if (delivery == 1) {
                    System.out.println("배달하면 배달의 민족이지!");
                } else {
                    System.out.println("얼른 Yelp 앱으로 찾아보자!");
                }
            }
            System.out.println("--------------------------------------------");
            System.out.println("[일를 무사히 마쳤다]");
            System.out.println("[저녁시간]");
            System.out.println("저녁도 먹었고 퇴근도 했겠다..ㅎㅎ 이제 뭘하지?");
            System.out.println("1.헬스장을 간다  2.집으로 간다  3.친구를 부른다");

            int afterwork = sc.nextInt();// 퇴근 및 식사후 남는시간에 뭘할까?

            if (afterwork == 1) {
                System.out.println("오우 시간이 좀 남는데 헬스장이나 가볼까?!");
            } else if (afterwork == 2) {
                System.out.println("오늘은 피곤하니까 집으로 가야지.");
                System.out.println("3분뒤...");
                System.out.println("안되겠어, 다시 돌아간다 실시!");
            } else {
                System.out.println("심심한데 친구나 부를까?");
                System.out.println("[전화중]");
                System.out.println("어이 뭐하고있어? 쉬고 있다고?");
                System.out.println("간만에 얼굴 좀 보자! 지금 나와.");
                System.out.println("어디서 만날거냐고? ㅇㅇ헬스장으로 와");
                System.out.println("[전화가 끊어진다]");
                System.out.println("허허 녀석 참..");
            }
            System.out.println("--------------------------------------------");
            System.out.println("[헬스장에 도착했다]");
            System.out.println("오늘은 가슴이랑 삼두 조지는 날~");
            System.out.println("--------------------------------------------");
            System.out.println("[두시간뒤..]");
            System.out.println("후욱후욱 맛있는 운동이었다...");
            System.out.println("이제 집에가서 쉬어야지");
            System.out.println("--------------------------------------------");
            System.out.println("[집에 도착했다]");
            System.out.println("홈 스윗 호옴~ 뭘하지?");
            System.out.println("1.씻는다  2.프로틴 쉐이크를 마신다");
            int afterhome = sc.nextInt();
            if (afterhome == 1){
                System.out.println("개운하게 씻어볼까요오옹~");
                System.out.println("[샤워를 마쳤다]");
                System.out.println("--------------------------------------------");
                System.out.println("자 이제 프로틴 쉐이크 한잔?");
                System.out.println("1.마신다  2.마신다");
                int shake = sc.nextInt();
                if (shake == 1) {
                    System.out.println("운동 후 프로틴 쉐이크는 못참아 후욱후욱");
                }else{
                    System.out.println("운동 후 프로틴 쉐이크는 못참아 후욱후욱");
                }
            }else{
                System.out.println("운동 후 프로틴 쉐이크를 마셔야 근손실이 안오니까");
                System.out.println("[프로틴 쉐이크를 마셨다]");
                System.out.println("자 이제 씻어볼깡?");
                System.out.println("1.샤워한다  2.안한다");
                int shower  = sc.nextInt();
                if (shower == 1) {
                    System.out.println("개운하게 씻어봅시다앙");
                    System.out.println("[샤워를 마쳤다]");
                }else{
                    System.out.println("으으 안돼 그냥 잤다간 땀냄ㅅ..");
                    System.out.println("[샤워를 하러 돌아선다]");
                }
            }
            System.out.println("--------------------------------------------");
            System.out.println("[잘준비를 하고 침대에 누웠다]");
            System.out.println("오늘도 수고했어 이제 잘까 아니면...");
            System.out.println("1.잔다  2.유툽하나만..?");
            int sleep  = sc.nextInt();
            if (sleep == 1) {
                System.out.println("그래 얼른 자자");
                System.out.println("[꿀잠을 잔다]");
            } else {
                System.out.println("음 자기전에 영상 하나만 볼까..?");
                System.out.println("--------------------------------------------");
                System.out.println("[2시간 후]");
                System.out.println("으어어ㅓ 망했드아ㅏ 얼른 자야해! 근손실 온다구!");
                System.out.println("[꿀잠을 잔다]");
            }
        }else if(day == 2){
            System.out.println("[주말]");
            System.out.println("아 오늘 쉬는날이네? ㅎㅎ 개이득!");
            System.out.println("하암 여유있구만 잠도 깼겠다 뭐부터 하지?");
            System.out.println("1.씻으러 간다  2.밥부터 먹는다");
            int awake = sc.nextInt();

            if(awake == 1) {
                System.out.println("일단 먼저 씻어야겠다");
                System.out.println("[화장실문 앞에 풀업 바가 보인다]");
                System.out.println("1.풀업을 한다  2.무시하고 화장실로 들어간다");
                int mpush = sc.nextInt();

                if (mpush == 1){
                    System.out.println("역시 화장실 들어가기전 푸쉬업은 국룰이지!");
                    System.out.println("[풀업 한세트를 한다]");
                    System.out.println("후 자 이제 씻어볼까");
                    System.out.println("1.찬물로 씻는다  2.따뜻한 물로 씻는다");
                    int shower = sc.nextInt();

                    if (shower ==1){
                        System.out.println("[호스에서 찬물이 나온다]");
                        System.out.println("운동후엔 찬물이 최고지!");
                    }else{
                        System.out.println("역시 좀 아침은 좀 뜨뜻하게에...");
                        System.out.println("[호스에서 찬물이 나온다]");
                        System.out.println("앗 차거?! 아.. 하아.. 보일러...");
                    }
                }else {
                    System.out.println("푸쉬업은 다음에.. 허허 일단 먼저 씻어야겠다");
                    System.out.println("1.찬물로 씻는다  2.뜨거운 물로 씻는다");
                    int shower = sc.nextInt();
                    if (shower == 1) {
                        System.out.println("[호스에서 찬물이 나온다]");
                        System.out.println("아침에 정신 차릴려면 찬물이 최고지!");
                    } else {
                        System.out.println("역시 좀 아침은 좀 뜨뜻하게에...");
                        System.out.println("[호스에서 찬물이 나온다]");
                        System.out.println("앗 차거?! 아.. 하아.. 보일러...");
                    }
                }
                System.out.println("[샤워를 마쳤다]");
                System.out.println("아침은 간단하게 먹고 점심을 야무지게 먹어야지.");
                System.out.println("1.바나나  2.통밀빵  3.영양 프로틴쉐이크");
                int qbreakfast = sc.nextInt();
                if (qbreakfast == 1){
                    System.out.println("[바나나를 먹는다]");
                    System.out.println("바나나는 칼륨과 비타민C가 풍부해서 매우 웰빙쵸이스라고 할수 있지.");
                }else if(qbreakfast ==2){
                    System.out.println("[빵을 먹는다]");
                    System.out.println("통밀은 정제되지 않아 풍부한 식이섬유를 포함하고 있어서 아침식사로 웰빙하다고 할수 있지.");
                }else{
                    System.out.println("[프로틴 쉐이크를 먹는다]");
                    System.out.println("프로틴 쉐이크는 포만감을 유지시켜 주고 근합성에 있어서 엄청난 도움을 줄수있지 노 근손실 쵸이스.");
                }
            }else {
                System.out.println("일단 밥부터 먹어야지");
                System.out.println("[냉장고를 연다]");
                System.out.println("어디보자..계란이랑,햄이 있네.. 뭘먹을까?");
                System.out.println("1.간장계란밥  2.달걀 햄 샌드위치  3.햄 스크램블에그");
                int breakfast = sc.nextInt();
                if (breakfast == 1) {
                    System.out.println("[간장계란밥이 완성되었다]");
                    System.out.println("크으 계란 후라이가 간장과 참기름과 만나 고소함이 입안을 가득 매우네.. 햄볽");
                } else if (breakfast == 2) {
                    System.out.println("[달걀 햄 샌드위치가 완성되었다]");
                    System.out.println("달달한 쨈이 발린 빵사이에 고소한 계란과 짭조름한 햄의 조합은 틀릴수가 없지..!");
                } else {
                    System.out.println("[햄 스크램블에그가 완성되었다]");
                    System.out.println("뭔가 미국 브런치 레스토랑에서 나올거같은 이 조합. 케첩과 함께 맛나게 먹어주지!");
                }
                System.out.println("[맛있는 식사 후]");
                System.out.println("자 나중에 먹을거 장이나 볼까나?");


            System.out.println("--------------------------------------------");
            System.out.println("[장보러 가서 소고기를 샀다]");
            System.out.println("[점심시간]");
            System.out.println("점심시간이네 뭐먹지?");
            System.out.println("1.한식  2.중식  3.일식  4.소고기");
            int food = sc.nextInt(); // 먹고싶은 음식 종류

            if (food == 1) {
                System.out.println("[한식]");
                System.out.println("흠.. 소고기는 나중에 먹을까? 한식이 땡기네. 배달시킬까?");
                System.out.println("1.배달을 시킨다  2.식당으로 간다");
                int delivery = sc.nextInt(); // 배달 여부 Y/N
                if (delivery == 1) {
                    System.out.println("배달하면 배달의 민족이지!");
                    System.out.println("뭘 먹어볼까아?");
                    System.out.println("1.돼지국밥  2.불고기 덮밥  3.돼지불백");
                    int korean = sc.nextInt();
                    if (korean == 1){
                        System.out.println("[돼지국밥을 주문한다]");
                        System.out.println("역시 점심으론 마음까지 든든해지는 돼지국밥이 최고지..(군침)");
                    }else if(korean ==2){
                        System.out.println("[불고기 덮밥을 주문한다]");
                        System.out.println("맛있는 불고기 양념에 밥비며먹으면 크으...(군침)");
                    }else{
                        System.out.println("[돼지불백을 주문한다]");
                        System.out.println("매콤한 돼지불백 양념에 밥을 싸악 비벼다가...(군침)");
                    }
                    System.out.println("--------------------------------------------");
                    System.out.println("[식사를 마쳤다]");
                    System.out.println("아 배부르다. 역시 한국음식은 언제나 옳지...");
                } else {
                    System.out.println("맛있는 한식집은 El Camino Real 코리아타운으로!");
                    System.out.println("--------------------------------------------");
                    System.out.println("[식당에 도착했다]");
                    System.out.println("뭘 먹어볼까아?");
                    System.out.println("1.돼지국밥  2.불고기 덮밥  3.돼지불백");
                    int korean = sc.nextInt();
                    if (korean == 1){
                        System.out.println("[돼지국밥을 주문한다]");
                        System.out.println("역시 점심으론 마음까지 든든해지는 돼지국밥이 최고지..(군침)");
                    }else if(korean ==2){
                        System.out.println("[불고기 덮밥을 주문한다]");
                        System.out.println("맛있는 불고기 양념에 밥비며먹으면 크으...(군침)");
                    }else{
                        System.out.println("[돼지불백을 주문한다]");
                        System.out.println("매콤한 돼지불백 양념에 밥을 싸악 비벼다가...(군침)");
                    }
                    System.out.println("--------------------------------------------");
                    System.out.println("[식사를 마쳤다]");
                    System.out.println("아 배부르다. 역시 한국음식은 언제나 옳지...");

                }
            } else if (food == 2) {
                System.out.println("[중식]");
                System.out.println("흠.. 소고기는 나중에 먹을까? 중식이 땡기네. 배달시킬까?");
                System.out.println("1.배달을 시킨다  2.식당으로 간다");
                int delivery = sc.nextInt(); // 배달 여부 Y/N
                if (delivery == 1) {
                    System.out.println("배달하면 배달의 민족이지!");
                    System.out.println("뭘 먹어볼까아?");
                    System.out.println("1.짜장면  2.짬뽕  3.짬짜면");
                    int chinese = sc.nextInt();
                    if (chinese == 1){
                        System.out.println("[짜장면을 주문한다]");
                        System.out.println("역시 중국집하면 윤기 좌르륵 흐르는 짜장면은 언제나 옳지..(군침)");
                    }else if(chinese ==2){
                        System.out.println("[짬뽕을 주문한다]");
                        System.out.println("칼칼한 국물에 면과 건더기를 함께 호로록 먹는 그 맛은 못참지...(군침)");
                    }else{
                        System.out.println("[짬짜면을 주문한다]");
                        System.out.println("후욱 그 어느 하나도 포기할수 없다...! 이런 메뉴는 누가 만든걸까..(군침)");
                    }
                    System.out.println("--------------------------------------------");
                    System.out.println("[식사를 마쳤다]");
                    System.out.println("아 배부르다. 역시 중국음식은 언제 먹어도 맛있어...");
                } else {
                    System.out.println("맛있는 중식집은 서니베일에 China Palace!");
                    System.out.println("--------------------------------------------");
                    System.out.println("[식당에 도착했다]");
                    System.out.println("뭘 먹어볼까아?");
                    System.out.println("1.짜장면  2.짬뽕  3.짬짜면");
                    int chinese = sc.nextInt();
                    if (chinese == 1){
                        System.out.println("[짜장면을 주문한다]");
                        System.out.println("역시 중국집하면 윤기 좌르륵 흐르는 짜장면은 언제나 옳지..(군침)");
                    }else if(chinese ==2){
                        System.out.println("[짬뽕을 주문한다]");
                        System.out.println("칼칼한 국물에 면과 건더기를 함께 호로록 먹는 그 맛은 못참지...(군침)");
                    }else{
                        System.out.println("[짬짜면을 주문한다]");
                        System.out.println("후욱 그 어느 하나도 포기할수 없다...! 이런 메뉴는 누가 만든걸까..(군침)");
                    }
                    System.out.println("--------------------------------------------");
                    System.out.println("[식사를 마쳤다]");
                    System.out.println("아 배부르다. 역시 중국음식은 언제 먹어도 맛있어...");
                }
            } else if (food == 3) {
                System.out.println("[일식]");
                System.out.println("흠.. 소고기는 나중에 먹을까? 일식이 땡기네. 배달시킬까?");
                System.out.println("1.배달을 시킨다  2.식당으로 간다");
                int delivery = sc.nextInt(); // 배달 여부 Y/N
                if (delivery == 1) {
                    System.out.println("배달하면 배달의 민족이지!");
                    System.out.println("뭘 먹어볼까아?");
                    System.out.println("1.초밥  2.회덮밥  3.튀김우동");
                    int japanese = sc.nextInt();

                    if (japanese == 1){
                        System.out.println("[초밥을 주문한다]");
                        System.out.println("양보단 질로 승부한다. 초밥 한점 들어서 간장에 와사비 살짝 뭍혀서 음미하면..(군침)");
                    }else if(japanese ==2){
                        System.out.println("[회덮밥을 주문한다]");
                        System.out.println("회도 먹고싶고 밥도 땡길때 고르는 욕심쟁이 메뉴! 고소한 밥에 양념장과 회가 어우러져...(군침)");
                    }else{
                        System.out.println("[튀김우동을 주문한다]");
                        System.out.println("김이 모락모락 나는 우동국물 위에 올려진 바삭한 튀김을 먹으면서 통통한 면을 흡입하면..(군침)");
                    }
                    System.out.println("--------------------------------------------");
                    System.out.println("[식사를 마쳤다]");
                    System.out.println("아 배부르다. 역시 일본음식은 언제 먹어도 맛있어...하지만 매일 못먹는 맛ㅜ");
                } else {
                    System.out.println("맛있는 일식집은 역시 Yokohama 레스토랑!");
                    System.out.println("--------------------------------------------");
                    System.out.println("[식당에 도착했다]");
                    System.out.println("뭘 먹어볼까아?");
                    System.out.println("1.초밥  2.회덮밥  3.튀김우동");
                    int japanese = sc.nextInt();
                    if (japanese == 1){
                        System.out.println("[초밥을 주문한다]");
                        System.out.println("양보단 질로 승부한다. 초밥 한점 들어서 간장에 와사비 살짝 뭍혀서 음미하면..(군침)");
                    }else if(japanese ==2){
                        System.out.println("[회덮밥을 주문한다]");
                        System.out.println("회도 먹고싶고 밥도 땡길때 고르는 욕심쟁이 메뉴! 고소한 밥에 양념장과 회가 어우러져...(군침)");
                    }else{
                        System.out.println("[튀김우동을 주문한다]");
                        System.out.println("김이 모락모락 나는 우동국물 위에 올려진 바삭한 튀김을 먹으면서 통통한 면을 흡입하면..(군침)");
                    }
                    System.out.println("--------------------------------------------");
                    System.out.println("[식사를 마쳤다]");
                    System.out.println("아 배부르다. 역시 일본음식은 언제 먹어도 맛있어...하지만 매일 못먹는 맛ㅜ");
                }
            } else {
                System.out.println("[소고기]");
                System.out.println("오늘은 소고기 먹방좀 해볼까! 잠깐 내가 무슨 부위를 샀더라?");
                System.out.println("1.목심  2.등심  3.채끝  4.안심  5.갈비  6.우둔");
                int beef = sc.nextInt(); //무슨 부위가 있는지 입력하기
                if(beef == 1 || beef == 2 || beef == 3 || beef == 4) {
                    if(beef == 1) {
                        System.out.println("[목심]");
                    } else if(beef == 2) {
                        System.out.println("[등심]");
                    } else if(beef == 3) {
                        System.out.println("[채끝]");
                    } else {
                        System.out.println("[안심]");
                    }
                    System.out.println("아 이건 구워먹어야 제맛이지 ㅎㅎ");
                } else if(beef == 6) {
                    System.out.println("[우둔]");
                    System.out.println("맛있는 불고기 해먹어야겠다 ㅎㅎ");
                } else {
                    System.out.println("[갈비]");
                    System.out.println("갈비는 잡고 뜯어야 제맛인데 어떻게 요리할까?");
                    System.out.println("1.구이  2.찜");
                    int galbi = sc.nextInt();
                    if (galbi == 1) {
                        System.out.println("갈비는 구워도 마싯지요!");
                        System.out.println("[갈비를 굽는다]");
                    } else {
                        System.out.println("대망의 갈비찜 한번 도전해볼까!");
                        System.out.println("[갈비찜을 만든다]");
                    }
                }
                System.out.println("--------------------------------------------");
                System.out.println("야무지게 먹겠습니다!");
                System.out.println("[맛있게 먹는다]");
            }
            System.out.println("--------------------------------------------");
            System.out.println("오늘 뭐처럼 쉬는데 뭐하고 쉴까아?");
            System.out.println("1.영화를 본다  2.유투브를 본다  3.게임을 한다");
            int happytime = sc.nextInt();

            if (happytime == 1) {
                System.out.println("[TV를 켠다]");
                System.out.println("아 무슨 영화를 볼까");
                System.out.println("1.액션영화  2.멜로영화  3.슬픈영화  4.공포영화");
                int movie = sc.nextInt();

                if (movie == 1) {
                    System.out.println("[액션영화를 본다]");
                    System.out.println("[두시간 후]");
                    System.out.println("아 피가 끓는구만 그런 의미에서 푸쉬업!");
                }else if(movie == 2){
                    System.out.println("[멜로영화를 본다]");
                    System.out.println("[두시간 후]");
                    System.out.println("아... 외롭다.. 흐규흐규");
                }else if(movie == 2){
                    System.out.println("[슬픈영화를 본다]");
                    System.out.println("[두시간 후]");
                    System.out.println("아니이 훌쩍 이건 아니지 ㅜㅜ 넘나 슬프자너어 ㅜㅠ");
                }else {
                    System.out.println("[공포영화를 본다]");
                    System.out.println("[두시간 후]");
                    System.out.println("아... 오늘 잠 다잤네...");
                }
            }else if(happytime == 2){
                System.out.println("[컴퓨터를 켠다]");
                System.out.println("유툽이나 봐야징~");
                System.out.println("--------------------------------------------");
                System.out.println("[세시간 후]");
                System.out.println("와 유투브 알고리즘은 역시 무서워");
            }else{
                System.out.println("[컴퓨터를 켠다]");
                System.out.println("오랜만에 롤이나 할까?");
                System.out.println("--------------------------------------------");
                System.out.println("[세시간 후]");
                System.out.println("[강등 실버-->브론즈]");
                System.out.println("으어아앙나ㅏ아ㅏㄱㄱ악~! 이런(*%#바른말?!)같은 놈들!!");
                System.out.println("--------------------------------------------");
                System.out.println("[롤을 삭제한다]");
                }
            }

            System.out.println("[저녁시간]");
            System.out.println("저녁도 먹었고 퇴근도 했겠다..ㅎㅎ 이제 뭘하지?");
            System.out.println("1.헬스장을 간다  2.집으로 간다  3.친구를 부른다");

            int afterwork = sc.nextInt();

            if (afterwork == 1) {
                System.out.println("헬스장이나 가볼까?!");
            } else if (afterwork == 2) {
                System.out.println("오늘은 피곤하니까 집에서 쉬어야지.");
                System.out.println("3분뒤...");
                System.out.println("안되, 근손실 온단말야!");
            } else {
                System.out.println("심심한데 친구나 부를까?");
                System.out.println("[전화중]");
                System.out.println("어이 뭐하고있어? 쉬고 있다고?");
                System.out.println("간만에 얼굴 좀 보자! 지금 나와.");
                System.out.println("어디서 만날거냐고? ㅇㅇ헬스장으로 와");
                System.out.println("[전화가 끊어진다]");
                System.out.println("허허 녀석 참..");
            }
            System.out.println("--------------------------------------------");
            System.out.println("[헬스장에 도착했다]");
            System.out.println("오늘은 가슴이랑 삼두 조지는 날~");
            System.out.println("--------------------------------------------");
            System.out.println("[두시간뒤..]");
            System.out.println("후욱후욱 맛있는 운동이었다...");
            System.out.println("이제 집에가서 쉬어야지");
            System.out.println("--------------------------------------------");
            System.out.println("[집에 도착했다]");
            System.out.println("홈 스윗 호옴~ 뭘하지?");
            System.out.println("1.씻는다  2.프로틴 쉐이크를 마신다");
            int afterhome = sc.nextInt();
            if (afterhome == 1){
                System.out.println("개운하게 씻어볼까요오옹~");
                System.out.println("[샤워를 마쳤다]");
                System.out.println("--------------------------------------------");
                System.out.println("자 이제 프로틴 쉐이크 한잔?");
                System.out.println("1.마신다  2.마신다");
                int shake = sc.nextInt();
                if (shake == 1) {
                    System.out.println("운동 후 프로틴 쉐이크는 못참아 후욱후욱");
                }else{
                    System.out.println("운동 후 프로틴 쉐이크는 못참아 후욱후욱");
                }
            }else{
                System.out.println("운동 후 프로틴 쉐이크를 마셔야 근손실이 안오니까");
                System.out.println("[프로틴 쉐이크를 마셨다]");
                System.out.println("자 이제 씻어볼깡?");
                System.out.println("1.샤워한다  2.안한다");
                int shower  = sc.nextInt();
                if (shower == 1) {
                    System.out.println("개운하게 씻어봅시다앙");
                    System.out.println("[샤워를 마쳤다]");
                }else{
                    System.out.println("으으 안돼 그냥 잤다간 땀냄ㅅ..");
                    System.out.println("[샤워를 하러 돌아선다]");
                }
            }
            System.out.println("--------------------------------------------");
            System.out.println("[잘준비를 하고 침대에 누웠다]");
            System.out.println("오늘도 수고했어 이제 잘까 아니면...");
            System.out.println("1.잔다  2.유툽하나만..?");
            int sleep  = sc.nextInt();
            if (sleep == 1) {
                System.out.println("그래 얼른 자자");
                System.out.println("[꿀잠을 잔다]");
            } else {
                System.out.println("음 자기전에 영상 하나만 볼까..?");
                System.out.println("--------------------------------------------");
                System.out.println("[2시간 후]");
                System.out.println("으어어ㅓ 망했드아ㅏ 얼른 자야해! 근손실 온다구!");
                System.out.println("[꿀잠을 잔다]");
            }

        }else if(day == 3){
            System.out.println("[수요일]");
            System.out.println("으어엇 일하는 날이네?! 빨리 씻어야지!");

        }else if(day == 4){
            System.out.println("[목요일]");
            System.out.println("으어엇 일하는 날이네?! 빨리 씻어야지!");

        }else if(day == 5){
            System.out.println("[금요일]");
            System.out.println("으어엇 일하는 날이네?! 빨리 씻어야지!");

        }else if(day == 6){
            System.out.println("[토요일]");
            System.out.println("아 토요일이네? 내가 제일 좋아하는 토요일❤");

        }else if(day == 7) {
            System.out.println("[일요일]");
            System.out.println("아 일요일이네? 일요일 죠아유웅❤");
        }
    }
}

        /*// 요일을 고르고 해당 요일에 따라 OUTPUT 이 달라짐.
        String day;
        day = sc.next();

            if(day=="1" ){
                System.out.println("[오늘은 월요일]");
                //월요일, 목요일 = 가슴, 삼두

                System.out.println("으어엇 일하는 날이네?! 지금 지금 몇시야?");
                System.out.println("1. 5시");
                System.out.println("2. 6시");
                System.out.println("3. 7시");
                System.out.println("4. 8시");

                int time = sc.nextInt(); // 일어난 시간을 입력
                System.out.println("[현재시간: 오전 " + time + "시]");

                if (time == 1) {
                    System.out.println("일찍 일어났다! 여유있게 아침도 먹고 출근준비 해야겠다ㅎㅎ 샤워전에 푸쉬업은 국룰 후후..");
                } else if (time == 2) {
                    System.out.println("출근시간까지 1시간 남았네 그런의미에서 푸쉬업 후후.");
                } else if (time == 3) {
                    System.out.println("우어어 빨리 가야겠다! 무산소 달리기 각이다.");
                } else if (time == 4) {
                    System.out.println("안돼에에ㅔ. 혼나겠다ㅜ 아니지 스트레스는 근손실 오니까 긍정적으로...아.. 뭐라 변명하지?;;");
                }
                // 먹고싶은 음식 종류를 고르고 식당에서 먹을건지 배달을 시킬건지 고르기
                System.out.println("[점심시간]");
                System.out.println("점심시간이네 뭐먹지? 한식/중식/일식/기타");
                String food = "일식"; // 먹고싶은 음식 종류
                char delivery = 'N'; // 배달 여부 Y/N

                if (food == "한식") {
                    System.out.println("[한식]");
                    System.out.println("한식이 땡기네. 배달시킬까? Y/N");
                    if (delivery == 'Y') {
                        System.out.println("배달하면 배달의 민족이지!");
                    } else {
                        System.out.println("맛있는 한식집은 El Camino Real 코리아타운으로!");
                    }
                } else if (food == "중식") {
                    System.out.println("[중식]");
                    System.out.println("중식이 땡기네. 배달시킬까? Y/N");
                    if (delivery == 'Y') {
                        System.out.println("배달하면 배달의 민족이지!");
                    } else {
                        System.out.println("맛있는 중식집은 서니베일에 China Palace!");
                    }
                } else if (food == "일식") {
                    System.out.println("[일식]");
                    System.out.println("일식이 땡기네. 배달시킬까? Y/N");
                    if (delivery == 'Y') {
                        System.out.println("배달하면 배달의 민족이지!");
                    } else {
                        System.out.println("맛있는 일식집은 역시 친구가 운영하는 Yokohama 레스토랑!");
                    }
                } else {
                    System.out.println("[음식]");
                    System.out.println("그럼 배달시킬까? Y/N");
                    if (delivery == 'Y') {
                        System.out.println("배달하면 배달의 민족이지!");
                    } else {
                        System.out.println("얼른 Yelp 앱으로 찾아보자!");
                    }
                }
                System.out.println("[저녁시간]");
                System.out.println("저녁도 먹었고 퇴근도 했겠다..ㅎㅎ 지금 몇시지?");

                int AWtime = 8;// 퇴근 및 식사후 남는시간에 뭘할까?
                System.out.println("[현재시간: 오후 " + AWtime + "시]");

                if (AWtime <= 8) {
                    System.out.println("오우 시간이 좀 남는데 헬스장이나 가볼까?! 오늘은 가슴이랑 삼두 조지는 날~");
                } else if (AWtime == 9) {
                    System.out.println("움 시간이 1시간 정도니까 짧고 굵게 헬스?! 가슴이라도 조져야지.");
                } else if (AWtime == 10) {
                    System.out.println("우음 뭐 간단하게 푸쉬업만 하자.");
                } else {
                    System.out.println("휴우... 그냥 자자 휴식도 운동의 일부니까.");
                }

            }else if(day=="화" || day=="금") {
                //화요일, 금요일 = 등, 이두

                    System.out.println("하아아암 잘잤다. 지금 몇시지?");
                    int time = 5; // 일어난 시간을 입력
                    System.out.println("[현재시간: 오전 " + time + "시]");

                    if (time <= 5) {
                        System.out.println("일찍 일어났다! 여유있게 아침도 먹고 출근준비 해야겠다ㅎㅎ 샤워전에 푸쉬업은 국룰 후후..");
                    } else if (time == 6) {
                        System.out.println("출근시간까지 1시간 남았네 그런의미에서 푸쉬업 후후.");
                    } else if (time == 7) {
                        System.out.println("우어어 빨리 가야겠다! 무산소 달리기 각이다.");
                    } else if (time >= 8) {
                        System.out.println("안돼에에ㅔ. 혼나겠다ㅜ 아니지 스트레스는 근손실 오니까 긍정적으로...아.. 뭐라 변명하지?;;");
                    }
                    // 먹고싶은 음식 종류를 고르고 식당에서 먹을건지 배달을 시킬건지 고르기
                    System.out.println("[점심시간]");
                    System.out.println("점심시간이네 뭐먹지? 한식/중식/일식/기타");
                    String food = "일식" ; // 먹고싶은 음식 종류
                    char delivery = 'N' ; // 배달 여부 Y/N

                    if(food == "한식") {
                        System.out.println("[한식]");
                        System.out.println("한식이 땡기네. 배달시킬까? Y/N");
                        if(delivery == 'Y') {
                            System.out.println("배달하면 배달의 민족이지!");
                        } else {
                            System.out.println("맛있는 한식집은 El Camino Real 코리아타운으로!");
                        }
                    } else if(food == "중식") {
                        System.out.println("[중식]");
                        System.out.println("중식이 땡기네. 배달시킬까? Y/N");
                        if(delivery == 'Y') {
                            System.out.println("배달하면 배달의 민족이지!");
                        } else {
                            System.out.println("맛있는 중식집은 서니베일에 China Palace!");
                        }
                    } else if(food == "일식") {
                        System.out.println("[일식]");
                        System.out.println("일식이 땡기네. 배달시킬까? Y/N");
                        if(delivery == 'Y') {
                            System.out.println("배달하면 배달의 민족이지!");
                        } else {
                            System.out.println("맛있는 일식집은 역시 친구가 운영하는 Yokohama 레스토랑!");
                        }
                    } else {
                        System.out.println("[음식]");
                        System.out.println("그럼 배달시킬까? Y/N");
                        if(delivery == 'Y') {
                            System.out.println("배달하면 배달의 민족이지!");
                        } else {
                            System.out.println("얼른 Yelp 앱으로 찾아보자!");
                        }
                    }
                    System.out.println("[저녁시간]");
                    System.out.println("저녁도 먹었고 퇴근도 했겠다..ㅎㅎ 지금 몇시지?");

                    int AWtime = 8;// 퇴근 및 식사후 남는시간에 뭘할까?
                    System.out.println("[현재시간: 오후 " + AWtime + "시]");

                    if(AWtime<=8) {
                        System.out.println("오우 시간이 좀 남는데 헬스장이나 가볼까?! 오늘은 등, 이두 조지는 날~");
                    } else if(AWtime==9) {
                        System.out.println("움 시간이 1시간 정도니까 짧고 굵게 헬스?! 등이라도 조져야지.");
                    } else if(AWtime==10) {
                        System.out.println("우음 뭐 간단하게 풀업만 하자.");
                    } else {
                        System.out.println("휴우... 그냥 자자 휴식도 운동의 일부니까.");
                    }
            }else if(day=="수" || day=="토") {
                //수요일, 토요일 = 하체, 어깨

                System.out.println("하아아암 잘잤다. 지금 몇시지?");
                int time = 5; // 일어난 시간을 입력
                System.out.println("[현재시간: 오전 " + time + "시]");

                if (time <= 5) {
                    System.out.println("일찍 일어났다! 여유있게 아침도 먹고 출근준비 해야겠다ㅎㅎ 샤워전에 푸쉬업은 국룰 후후..");
                } else if (time == 6) {
                    System.out.println("출근시간까지 1시간 남았네 그런의미에서 푸쉬업 후후.");
                } else if (time == 7) {
                    System.out.println("우어어 빨리 가야겠다! 무산소 달리기 각이다.");
                } else if (time >= 8) {
                    System.out.println("안돼에에ㅔ. 혼나겠다ㅜ 아니지 스트레스는 근손실 오니까 긍정적으로...아.. 뭐라 변명하지?;;");
                }
                // 먹고싶은 음식 종류를 고르고 식당에서 먹을건지 배달을 시킬건지 고르기
                System.out.println("[점심시간]");
                System.out.println("점심시간이네 뭐먹지? 한식/중식/일식/기타");
                String food = "일식" ; // 먹고싶은 음식 종류
                char delivery = 'N' ; // 배달 여부 Y/N

                if(food == "한식") {
                    System.out.println("[한식]");
                    System.out.println("한식이 땡기네. 배달시킬까? Y/N");
                    if(delivery == 'Y') {
                        System.out.println("배달하면 배달의 민족이지!");
                    } else {
                        System.out.println("맛있는 한식집은 El Camino Real 코리아타운으로!");
                    }
                } else if(food == "중식") {
                    System.out.println("[중식]");
                    System.out.println("중식이 땡기네. 배달시킬까? Y/N");
                    if(delivery == 'Y') {
                        System.out.println("배달하면 배달의 민족이지!");
                    } else {
                        System.out.println("맛있는 중식집은 서니베일에 China Palace!");
                    }
                } else if(food == "일식") {
                    System.out.println("[일식]");
                    System.out.println("일식이 땡기네. 배달시킬까? Y/N");
                    if(delivery == 'Y') {
                        System.out.println("배달하면 배달의 민족이지!");
                    } else {
                        System.out.println("맛있는 일식집은 역시 친구가 운영하는 Yokohama 레스토랑!");
                    }
                } else {
                    System.out.println("[음식]");
                    System.out.println("그럼 배달시킬까? Y/N");
                    if(delivery == 'Y') {
                        System.out.println("배달하면 배달의 민족이지!");
                    } else {
                        System.out.println("얼른 Yelp 앱으로 찾아보자!");
                    }
                }
                System.out.println("[저녁시간]");
                System.out.println("저녁도 먹었고 퇴근도 했겠다..ㅎㅎ 지금 몇시지?");

                int AWtime = 8;// 퇴근 및 식사후 남는시간에 뭘할까?
                System.out.println("[현재시간: 오후 " + AWtime + "시]");

                if(AWtime<=8) {
                    System.out.println("오우 시간이 좀 남는데 헬스장이나 가볼까?! 오늘은 하체, 어깨 조지는 날~");
                } else if(AWtime==9) {
                    System.out.println("움 시간이 1시간 정도니까 짧고 굵게 헬스?! 하체라도 조져야지.");
                } else if(AWtime==10) {
                    System.out.println("우음 뭐 간단하게 스쿼트만 하자.");
                } else {
                    System.out.println("휴우... 그냥 자자 휴식도 운동의 일부니까.");
                }
            } else {

                //일요일
                System.out.println("하아아암 잘잤다. 지금 몇시지?");
                int time = 5;
                // 일어난 시간을 입력
                System.out.println("[현재시간: 오전 " + time + "시]");

                if (time <= 5) {
                    System.out.println("아 오늘은 주말이지 허헣 더 자야지. 휴식도 운동의 일부...드르렁");
                    }
                }
                // 먹고싶은 음식 종류를 고르고 식당에서 먹을건지 배달을 시킬건지 고르기
                System.out.println("[점심시간]");
                System.out.println("점심시간이네 뭐먹지? 한식/중식/일식/기타/요리");
                String food = "요리" ; // 먹고싶은 음식 종류

                if(food == "한식") {
                    System.out.println("[한식]");
                    System.out.println("한식이 땡기네. 배달시킬까? Y/N");
                    char delivery = 'N' ; // 배달 여부 Y/N
                    if(delivery == 'Y') {
                        System.out.println("배달하면 배달의 민족이지!");
                    } else {
                        System.out.println("맛있는 한식집은 El Camino Real 코리아타운으로!");
                    }
                } else if(food == "중식") {
                    System.out.println("[중식]");
                    System.out.println("중식이 땡기네. 배달시킬까? Y/N");
                    char delivery = 'N' ; // 배달 여부 Y/N
                    if(delivery == 'Y') {
                        System.out.println("배달하면 배달의 민족이지!");
                    } else {
                        System.out.println("맛있는 중식집은 서니베일에 China Palace!");
                    }
                } else if(food == "일식") {
                    System.out.println("[일식]");
                    System.out.println("일식이 땡기네. 배달시킬까? Y/N");
                    char delivery = 'N' ; // 배달 여부 Y/N
                    if(delivery == 'Y') {
                        System.out.println("배달하면 배달의 민족이지!");
                    } else {
                        System.out.println("맛있는 일식집은 역시 친구가 운영하는 Yokohama 레스토랑!");
                    }
                } else if(food == "요리") {
                    System.out.println("[요리]");
                    System.out.println("오늘은 내가 요리사~ 지금 냉장고에 뭐가있지? 소고기/돼지고기/닭고기/계란/없음");
                    String fridge = "소고기"; // 냉장고에 무슨 요리가 있는지 고르기

                    if(fridge == "소고기") {
                        System.out.println("오늘은 소고기 먹방좀 해볼까! 잠깐 이게 무슨 부위지? 목심/등심/채끝/안심/갈비/우둔");
                        String beef = "갈비"; //무슨 부위가 있는지 입력하기

                        if(beef == "목심" || beef == "등심" || beef == "채끝" || beef == "안심") {
                            if(beef == "목심") {
                                System.out.println("[목심]");
                            } else if(beef == "등심") {
                                System.out.println("[등심]");
                            } else if(beef == "채끝") {
                                System.out.println("[채끝]");
                            } else {
                                System.out.println("[안심]");
                            }
                            System.out.println("아 이건 구워먹어야 제맛이지 ㅎㅎ");
                        } else if(beef == "우둔") {
                            System.out.println("[우둔]");
                            System.out.println("맛있는 불고기 해먹어야겠다 ㅎㅎ");
                        } else if(beef == "갈비") {
                            System.out.println("[갈비]");
                            System.out.println("갈비는 잡고 뜯어야 제맛인데 어떻게 요리할까? 구이/찜");
                            String galbi = "구이";
                            if (galbi == "구이") {
                                System.out.println("갈비는 구워도 마싯지요!");
                            } else {
                            System.out.println("대망의 갈비찜 한번 도전해볼까!");
                            }
                        } else {
                            System.out.println("아 이건 무슨 부위인지 모르겠네;; 구워봐야지ㅎㅎ");
                        }
                    } else if(fridge == "돼지고기" ) {
                        System.out.println("아  요리해야징!");
                    } else if(fridge == "닭고기" ) {
                        System.out.println("아 오늘은 주말이니까 그냥 여유있게 닭가슴살 요리해야징!");
                    } else if(fridge == "계란" ) {
                        System.out.println("아 오늘은 주말이니까 그냥 여유있게 닭가슴살 요리해야징!");
                    } else {
                        System.out.println("아 오늘은 주말이니까 그냥 여유있게 닭가슴살 요리해야징!");
                    }

                } else {
                    System.out.println("[음식]");
                    System.out.println("그럼 배달시킬까? Y/N");
                    char delivery = 'N' ; // 배달 여부 Y/N
                    if(delivery == 'Y') {
                        System.out.println("배달하면 배달의 민족이지!");
                    } else {
                        System.out.println("아 오늘은 주말이니까 그냥 여유있게 닭가슴살 요리해야징!");
                    }
                }
                System.out.println("[저녁시간]");
                System.out.println("저녁도 소화가 됬겠다..ㅎㅎ 지금 몇시지?");

                int AWtime = 8;
                // 식사후 남는시간에 뭘할까?
                System.out.println("[현재시간: 오후 " + AWtime + "시]");

                if(AWtime<=8) {
                    System.out.println("오우 소화도 됬겠다, 헬스장이나 가볼까?!");
                } else if(AWtime==9) {
                    System.out.println("야밤 헬스가 최고지!");
                } else if(AWtime==10) {
                    System.out.println("아 헬스장 닫았나? 우음 그럼 홈트각이네 후후.");
                } else {
                    System.out.println("아 오늘은 헬스 유트브 보면서 자야겠다");
                }
    }*/




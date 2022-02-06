import java.util.Scanner;

class CountryClub {

    String name;

    int distance1w;
    int distance2w;
    int distance3w;
    int distance4w;
    int distance5w;
    int distance6w;

    int distance1r;
    int distance2r;
    int distance3r;
    int distance4r;
    int distance5r;
    int distance6r;

    int score = 23;

    void choiceCC() {
        System.out.println("\n" + "안녕하세요, 오늘의 "+name+ " 안내를 돕는 보이스 캐디입니다." + "\n");
        Golf.time_delay1();
        //원래는 6홀
        System.out.println("게임은 총 3홀이며 우선, 게임 시작 전 플레이어를 설정해봅시다.");
        System.out.println("플레이어는 중간에 변경이 불가능하며, 성별에 따라 나이에 따라 비거리 차이가 발생합니다."+ "\n");
        Golf.time_delay15();
        System.out.println( "Man은 WhiteTee Woman은 RedTee가 적용되어 각 홀의 비거리가 조정됩니다."+"\n"+"남은 비거리가 5M이하면 자동 concede 처리 됩니다."+"\n");
        Golf.time_delay15();

        System.out.println("아래 각 플레이어의 정보를 확인하시고 신중한 선택 부탁드릴게요~"+"\n");
        Golf.time_delay15();
        System.out.println("===================================================================================================="+"\n");
        Golf.time_delay2();
        System.out.println("YoungMan ▶ Driver: 200-220M Wood7,4: 180-200M Utility: 145-180M Iron: 20-145M Putter: 5-20M");
        System.out.println("OldMan ▶ Driver: 180-200M Wood7,4: 160-180M Utility: 125-160M Iron: 20-125M Putter: 5-20M");
        System.out.println("YoungWoman ▶ Driver: 160-180M Wood7,4: 140-160M Utility: 105-140M Iron: 20-105M Putter: 5-20M");
        System.out.println("OldWoman ▶ Driver: 140-160M Wood7,4: 120-140M Utility: 100-120M Iron: 20-100M Putter: 5-20M");
        Golf.time_delay2();
        System.out.println("\n"+"====================================================================================================");
        Golf.time_delay4();

    }

    void hole1() {

        System.out.println(name+"의 1홀로 이동중입니다.");

        System.out.println(".....");
        Golf.time_delay1();
        System.out.println(".....");
        Golf.time_delay1();
        System.out.println(".....");
        Golf.time_delay2();

        System.out.println("\n"+"안녕하세요, 보이스캐디입니다. 이번 1홀에 대해 설명해드리겠습니다.");
        Golf.time_delay1();
        System.out.println("1홀은 "+"홀로 비거리는 총 WhiteTee: "+distance1w+"M  RedTee: "+distance1r+"M 입니다.");
        Golf.time_delay1();
        System.out.println("페어웨이가 넓은 홀로 그대로 진행해주시면 됩니다.");

    }
}
class Player {
    String pl_name;
    int my_distance;

    void choicePlayer() {
        Scanner sc = new Scanner(System.in);

        while(true) {

        System.out.println("원하시는 플레이어를 선택해주세요.");
        System.out.println("1. YoungMan 2. OldMan 3. YoungWoman 4. OldWoman");
            int character=sc.nextInt();
            if(character==1) {
                Golf.time_delay1();
                System.out.println("선택하신 1. YoungMan의 기본 비거리 정보를 다시 한번 말씀드리겠습니다."+"\n");
                Golf.time_delay1();
                System.out.println("YoungMan ▶ Driver: 200-220M Wood7,4: 180-200M Utility: 145-180M Iron: 20-145M Putter: 5-20M");
                Golf.time_delay1();
                System.out.println("맞으시다면 '1'을 입력하여 계속 진행해주시고, 잘못 누르셨다면 '2'를 입력하여 새로운 플레이어를 선택해주세요.");
                while (true) {

                    int check_pl = sc.nextInt();
                    if (check_pl == 1) {
                        System.out.println("네! 설정을 완료하였습니다. 그럼 이제, 게임하러 떠나보실까요~~~~~?");
                        break;
                    } else if (check_pl == 2) {
                        choicePlayer();
                        break;
                    } else {
                        System.out.println("1,2번 중 알맞은 응답을 선택해주세요.");
                    }
                    } break;
            }else if(character==2) {
                Golf.time_delay1();
                System.out.println("선택하신 2. OldMan의 기본 비거리 정보를 다시 한번 말씀드리겠습니다.");
                Golf.time_delay1();
                System.out.println("OldMan ▶ Driver: 180-200M Wood7,4: 160-180M Utility: 125-160M Iron: 20-125M Putter: 5-20M");
                Golf.time_delay1();
                System.out.println("맞으시다면 '1'을 입력하여 계속 진행해주시고, 잘못 누르셨다면 '2'를 입력하여 새로운 플레이어를 선택해주세요.");
                while (true) {

                    int check_pl = sc.nextInt();
                    if (check_pl == 1) {
                        System.out.println("네! 설정을 완료하였습니다. 그럼 이제, 게임하러 떠나보실까요~~~~~?");
                        break;
                    } else if (check_pl == 2) {
                        choicePlayer();
                        break;
                    } else {
                        System.out.println("1,2번 중 알맞은 응답을 선택해주세요.");
                    }
                } break;
            } else if(character==3) {
                Golf.time_delay1();
                System.out.println("선택하신 3. YoungWoman의 기본 비거리 정보를 다시 한번 말씀드리겠습니다.");
                Golf.time_delay1();
                System.out.println("YoungWoman ▶ Driver: 160-180M Wood7,4: 140-160M Utility: 105-140M Iron: 20-105M Putter: 5-20M");
                Golf.time_delay1();
                System.out.println("맞으시다면 '1'을 입력하여 계속 진행해주시고, 잘못 누르셨다면 '2'를 입력하여 새로운 플레이어를 선택해주세요.");
                while (true) {

                    int check_pl = sc.nextInt();
                    if (check_pl == 1) {
                        System.out.println("네! 설정을 완료하였습니다. 그럼 이제, 게임하러 떠나보실까요~~~~~?");
                        break;
                    } else if (check_pl == 2) {
                        choicePlayer();
                        break;
                    } else {
                        System.out.println("1,2번 중 알맞은 응답을 선택해주세요.");
                    }
                } break;
            } else if(character==4) {
                Golf.time_delay1();
                System.out.println("선택하신 4. OldWoman의 기본 비거리 정보를 다시 한번 말씀드리겠습니다.");
                Golf.time_delay1();
                System.out.println("OldWoman ▶ Driver: 140-160M Wood7,4: 120-140M Utility: 100-120M Iron: 20-100M Putter: 5-20M");
                Golf.time_delay1();
                System.out.println("맞으시다면 '1'을 입력하여 계속 진행해주시고, 잘못 누르셨다면 '2'를 입력하여 새로운 플레이어를 선택해주세요.");
                while (true) {

                    int check_pl = sc.nextInt();
                    if (check_pl == 1) {
                        System.out.println("네! 설정을 완료하였습니다. 그럼 이제, 게임하러 떠나보실까요~~~~~?");
                        break;
                    } else if (check_pl == 2) {
                        choicePlayer();
                        break;
                    } else {
                        System.out.println("1,2번 중 알맞은 응답을 선택해주세요.");
                    }
                } break;
            } else {
                    System.out.println("1,2,3,4번 중 원하시는 플레이어를 다시 선택해주세요.");
                }

            }
        }
}


public class Golf {
    public static void main(String[] args) {

        System.out.println("           "+"*******************"+"\n"+"    "+"**********************************");
        time_delay1();
        System.out.println("************ WELCOME GOLF LAND ************");
        time_delay1();
        System.out.println("    "+"**********************************"+"\n"+"           "+"*******************"+"\n");
        time_delay1();

        Scanner sc = new Scanner(System.in);
        System.out.println("원하시는 C.C를 선택해주세요.");
        System.out.println("1. 기흥C.C 2. 88C.C 3. 김포C.C");
        int cc = sc.nextInt();
        while (true) {
            if (cc == 1) {
                CountryClub cc1 = new CountryClub();
                cc1.name="기흥 C.C";
                cc1.distance1w = 333;
                cc1.distance1r=299;

                cc1.distance2w=184;
                cc1.distance2r=163;

                cc1.distance3w=335;
                cc1.distance3r=308;

                cc1.distance4w=513;
                cc1.distance4r=463;

                cc1.distance5w=138;
                cc1.distance5r=133;

                cc1.distance6w=318;
                cc1.distance6r=293;
                cc1.choiceCC();
                Player pl1 = new Player();
                pl1.choicePlayer();
                cc1.hole1();


            } else if (cc == 2) {
                CountryClub cc2 = new CountryClub();
                cc2.name="88 C.C";
            } else if (cc == 3) {
                CountryClub cc3 = new CountryClub();
                cc3.name="김포 C.C";
            } else {
                System.out.println("1,2,3번 중 원하시는 C.C를 다시 선택해주세요.");
            }
            cc = sc.nextInt();
        }

    }

    public static void time_delay1() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(" ");
        }
    }
    public static void time_delay15() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            System.out.println(" ");
        }
    }
    public static void time_delay2() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(" ");
        }
    }
    public static void time_delay4() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println(" ");
        }
    }

    //나중에 각 C.C의 각 홀이 다른 par3,4,5 순서 배열
    public static void p3() {

    }

    public static void p4() {

    }

    public static void p5() {

    }


    //나중에 각 C.C의 각 홀마다 다른 위험요소 심기
    public static void bunker() {

    }
    public static void hazard() {

    }
    public static void rough() {

    }

}

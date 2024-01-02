package Chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        // 조건문 ElseIf

        // 한라봉 에이드가 있다면 +1
        // 또는 망고 주스가 있으면 +1
        // 또는 아이스 아메리카노 +1

        boolean hanlabongAde = false;
        boolean mangojuice = false;

        if (hanlabongAde) {
            System.out.println("한라봉 에이드 +1");
        } else if (mangojuice){
            System.out.println("망고 주스 +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("음료 주문 완료 #1");
        //한라봉이 있으면 한라봉, 한라봉이 없고 망고가 있으면 망고, 한라봉과 망고가 없으면 아아

    // else if 는 여러번 사용가능
        mangojuice = false;
        hanlabongAde = false;
        boolean orangejuice= true;
        if (hanlabongAde){
            System.out.println("한라봉 에이드 +1");
        } else if (mangojuice){
            System.out.println("망고 주스 +1");
        } else if (orangejuice){
            System.out.println("오렌지 주스 +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("음료 주문 완료 #2");
    }






}



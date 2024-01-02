package Chap_04;

public class _04_Switchcase {
    public static void main(String[] args) {
        // Switch Case
        // 1등: 전액
        // 2등: 반액
        // 3등: 반액
        // 그 외: 장학금 대상 아님

        //if else 문 이용
        int rangking = 2; // 등 수
        if (rangking ==1) {
            System.out.println("전액 장학금");
        } else if (rangking==2){
            System.out.println("반액 장학금");
        }else if (rangking==3){
            System.out.println("반액 장학금");
        }else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");

        //Switch case 문을 이용
        rangking = 3;
        switch (rangking) {
            case 1:
                System.out.println("전액 장학금");
                System.out.println("등 수 : 1등");
                break;
            case 2:
                System.out.println("반액 장학금");
                System.out.println("등 수 : 2등");
                break;
            case 3:
                System.out.println("반액 장학금");
                System.out.println("등 수 : 3등");
                break;
            default:
                System.out.println("장학금 대상 아님");
                System.out.println("등 수 : 대상 아님");
        }
        System.out.println("조회 완료 #2");

        //중고 상품의 등급에 따른 가격 책정
        int grade = 2; //1등급
        int price = 7000; //기본 가격
        switch (grade) {
            case 1:
                price += 1000; // price = price +1000;
            case 2: //break 문이 없어서 break까지 price 만 뽑아서 더해짐
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade +" 등급 제품의 가격 :" + price+" 원");



        // ex 범위에 해당하는 값에는 If else,
        // 값에 해당하면 switch
        int score = 95;
        if (score >=90)
            System.out.println("A");
        else if (score >=80)
            System.out.println("B");
    }
}

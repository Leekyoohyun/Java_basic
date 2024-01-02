package Chap_04;

//주차 요금 시간당 4000원
// 최대요금 30000원
// 경차나 장애인 차량 50%할인

public class _Quiz_04 {
    public static void main(String[] args) {
        int hour=5; //주차 시간
        int price = hour*4000; //시간당 주차요금
        boolean issmallcar = true; //경차 여부
        boolean Disable = false; // 장애인 여부
        if (price>30000){
            price=30000;
        } // 최대요금 설정

        //경차나 장애인 차량인경우 할인
        if (issmallcar || Disable) {
            price =price/2; //할인 적용
        }
        System.out.println("주차요금은"+ price+"원 "+ "입니다.");
    }
}

package Chap_04;

public class _01_if {
    public static void main(String[] args) {
        //조건문 If
        //if 문 내에서 하나의 문장을 실행하면 {}생략 가능
        int hour = 15; // 오전 10시
        if (hour < 14) {
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷 추가");
        }   //if 문 안에 있는 것들은 출력되지 않음
        System.out.println("커피 주문 완료 #1");

        //오후 2시 이전, 모닝 커피를 마시지 않은 경우?
        hour = 10;
        boolean morningCoffee = false; //모닝 커피
        // if (hour < 14 && morningCoffee == false) {
        if (hour < 14 && !morningCoffee) {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #2");

        // 오후 2시 이후이거나 모닝 커피를 마신 경우?
        hour = 15;
        morningCoffee = true;
        // if (hour > 14 || morningCoffee == true){
        if (hour >14 || morningCoffee){
            System.out.println("아이스 아메리카노 (디카페인) +1 ");
        }
        System.out.println("커피 주문 완료 #3");


    }
}

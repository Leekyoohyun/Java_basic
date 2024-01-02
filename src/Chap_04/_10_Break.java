package Chap_04;

public class _10_Break {
    public static void main(String[] args) {
        // Break
        //치킨집에서 매일 20마리만 판매, 1인 1마리
        //50명 대기

        //for 문
        int max = 20;
        for (int i= 1; i< 51; i++){
            System.out.println(i+ "번 손님 주문하신 치킨 나왔습니다 !");
            if (i==max){
                System.out.println("금일 재료 소진");
                break;  //반복문으로 탈출
            }
        }
        System.out.println("영업 종료");

        System.out.println("----------------------");

        //While 문
        int index=1;// 대기번호
        while (index <51){
            System.out.println(index +" 번 손님 주문하신 치킨 나왔습니다.");
            if (index == max){
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
            index = index+1;
            System.out.println("영업 종료");
        }


    }
}

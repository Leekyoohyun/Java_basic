package Chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue
        //노쇼 손님
        int max = 20;   //최대 수량
        int sold = 0;   //현재 수량
        int noshow = 17; //대기 번호 17번이 노쇼함
        for (int i = 1; i<51; i++){
            System.out.println(i+" 번 손님 치킨 나왔습니다.");

            //치킨을 가져가는 상황
            if(i==noshow){
                System.out.println(i+"번 손님이 치킨을 안가져가서 다른사람 줌");
                continue;
            }

            sold++; //판매 처리
            if (sold==max){
                System.out.println("금일 재료가 모두 소진");
                break;
            }

            System.out.println("-------------------");

            //While 문
            int index = 1; //손님 번호
            while(index <51){
                System.out.println(index+" 번 손님 주문하신 치킨 나왔습니다.");
                sold++; //판매처리
                if (index == noshow){
                    System.out.println(index+ "번 노쇼");
                    index++;
                    continue;
                }
                if (index==max){
                    System.out.println("재료소진");
                    index++;
                    break;
                }


            }
            System.out.println("금일 영업 종료");
        }
    }
}

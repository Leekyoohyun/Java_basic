package Chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열(Array): 같은 자료형의 값 여러 개를 저장하는 연속된 공간
        // 다시 말하면 같은 타입인 변수 여러 개를 하나의 묶음으로 다루는 매커니즘
        String coffeeRoss = "아메리카노";
        String coffeeRachel = "카페모카";
        String coffeeChandler = "라떼";
        String  coffeeMonica = "카푸치노";

        System.out.println(coffeeRoss+" 하나"); // 아메리카노 하나
        System.out.println(coffeeRachel+ " 하나");
        System.out.println(coffeeChandler+" 하나");
        System.out.println(coffeeMonica+" 하나");
        System.out.println("주세요");

        // 배열 선언 첫 번째 방법
        //String[] coffees = new String[4];

        //배열 선언 두 번째 방법
        //String coffees[] = new[4]; 위랑 똑같음
//        coffees[0] = "아메리카노"; //index 값 (항상 0부터 시작)
//        coffees[1] = "카페모카";
//        coffees[2]= "라떼";
//        coffees[3]= "카푸치노";

        // 배열 선언 세 번째 방법
        //String[] coffees = new String[] {"아메리카노", "카페모카","라떼", "카푸치노"};

        //배열 선언 네 번째 방법
        String[] coffees ={"아메리카노", "카페모카","라떼", "카푸치노"};

        System.out.println("-------------------------");

        //커피 주문
        System.out.println(coffees[0]+" 하나"); //아메리카노 하나
        System.out.println(coffees[1]+" 하나");
        coffees[2]= "에스프레소"; // 값 변경
        System.out.println(coffees[2]);
        System.out.println(coffees[3]);
        System.out.println("주세요");

        //다른 자료형
        int[] i = new int[3];
        i[0]= 1;
        i[1]= 2;
        i[2]=3;
        double[] d =new double[]{10.0,11.2,13.3};
        boolean[] b = {true, true, false};
        System.out.println(d[2]);
        System.out.println(d.length);




    }
}

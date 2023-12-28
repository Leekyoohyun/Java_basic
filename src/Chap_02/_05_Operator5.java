package Chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        //삼항 연산자
        // 결과 = (조건) ? (참인 경우 결과값) : (거짓의 경우 결과값)
        // 이 조건이 참이면 외쪽항이 결과에 들어가고, 거짓이면 오른쪽이 결과임
        int x = 5;
        int y = 3;
        int max = (x > y) ? (x) : (y);
        System.out.println(max); //5
        // x가 y 보다 크니까 왼쪽 항인 x 출력

        int min = (x < y) ? (x) : (y);
        System.out.println(min); //3

        boolean b = (x == y) ? true : false;
        System.out.println(b); //false


        x=3;
        y=3;
        String s = (x !=y) ? "달라요" : "같아요";
        System.out.println(s); //같아요




    }
}

package Chap_06;

public class _07_VariableScope {        // 사용 불가능한 영역들
    public static void methodA(){
        //System.out.println(number);
        //System.out.println(result);
    }

    public static void methodB(){
        int result = 1; //지역 변수
    }
    public static void main(String[] args) {
        int number = 3;

        //System.out.println(result);

        for (int i =0; i < 5; i++) {
            System.out.println(i);
        }
        // System.out.println(i);
    }
}

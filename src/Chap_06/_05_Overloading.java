package Chap_06;

public class _05_Overloading {
    public static int getPower(int number){
        return number*number;
    }

    public static int getPower(String strNumber){
        int number= Integer.parseInt(strNumber);
        return number*number;
    }

    public static int getPower(int number, int exponent){
        int result = 1;
        for (int i=0; i<exponent;i++){
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        //메소드 오버로딩
        // 같은 이름의 메소드를 여러번 선언
        // 1. Parameter의 Type이 다르거나
        // 2. Parameter의 갯수가 다르거나
        System.out.println(getPower(3));
        System.out.println(getPower("4")); //4*4 =16
        System.out.println(getPower(3,3));

    }
}

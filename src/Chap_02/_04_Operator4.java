package Chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        //논리 연산자
        boolean 김치찌개 = true;
        boolean 계란말이 = true;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 || 계란말이 || 제육볶음); //3개 중에 하나라도 true --> true
        System.out.println(김치찌개 && 계란말이 && 제육볶음); //모두 true-> true출력

        System.out.println((5 > 3) && (3>1)); //5가 3보다 크고, 3은 1보다 크다 true
        System.out.println((5>3) &&(3<1)); //false

        //Or 연산
        System.out.println((5>3) || (3>1)); //둘 중 하나라도 만족하나
        System.out.println((5>3) || (3<1)); //둘중 하나 만족하기 때문에 true
        System.out.println((5<3) || (3<1)); //둘 다 틀려서 false

        //논리 부정 연산자
        System.out.println(!true); //true의 반대 값인 false 출력
        System.out.println(!false);// true 출력
        System.out.println(!(5 == 5)); // false 출력
        System.out.println(!(5 == 3)); //true 출력




    }
}

package Chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자

        //일반 연산
        System.out.println(4+2); //6
        System.out.println(4-2); //2
        System.out.println(4*2); //8
        System.out.println(4/2); //2
        System.out.println(5/2); //2 소수점 버려진다
        System.out.println(2/4); //0 소수점 버려진다
        System.out.println(4%2); //0 나머지 연산
        System.out.println(5%2); //1 나머지 1

        //우선 순위 연산
        System.out.println(2+2*2); //6
        System.out.println((2+2)*2); //8

        //변수를 이용한 연산
        int a =20;
        int b =10;
        int c;

        c= a+b;
        System.out.println(c);    //30

        c= a-b;
        System.out.println(c); //10

        //증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val); //10
        // val=val+1; // 1더해주기
        // val++; //위에거랑 같음
        // ++val; // 전위형: 값이 참조되기 전에 값을 증가시킨다.
        System.out.println(val); //10
        System.out.println(++val); //11
        System.out.println(val); //11

        val =10;
        System.out.println(val); //10
        System.out.println(val++); //10
        System.out.println(val); //11

        // 더 쉬운예제 전위형, 후위형
        int i=10 ,j=10;
        System.out.println(i++); //10
        System.out.println(++j); //11
        System.out.println(i);   //11
        System.out.println(j);   //11

        //은행 대기번호 표
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++); //대기인원 : 0
        System.out.println("대기 인원 : " + waiting++); //대기인원 : 1
        System.out.println("대기 인원 : " + waiting++); //대기인원 : 2
        System.out.println("총 대기 인원 : " + waiting); //총 대기인원 : 3



    }
}

package Chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        // 문자열 변환
        System.out.println(s.replace("and", ","));
        System.out.println(s.indexOf("J")); //7 :이걸로 J위치 정보 안다
        System.out.println(s.substring(7));//인덱스 기준 7 부터 시작(이전 내용 삭제)
        System.out.println(s.indexOf("."));
        //Java글자가 시작하는 위치 부터 . 이 시작하는 위치 바로 앞까지
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf(".")));
        //시작 위치부터 끝 위치 "직전"

        //공백 제거
        s = "        I love Java.             ";
        System.out.println(s); //공백포함
        System.out.println(s.trim()); //공백 삭제

        //문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2);
        System.out.println(s1 + "," + s2); //이럴 수 있는데 귀찮다
        System.out.println(s1.concat(",").concat(s2)); // Java, Python



    }
}

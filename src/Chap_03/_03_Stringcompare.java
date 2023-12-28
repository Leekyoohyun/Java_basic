package Chap_03;

public class _03_Stringcompare {
    public static void main(String[] args) {
        //문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2)); //false
        System.out.println(s1.equals("Java")); //true
        System.out.println(s2.equals("python")); //false

        //대소문자 구분없이 문자열 내용이 같은지 여부 체크
        System.out.println(s2.equalsIgnoreCase("python"));

        //문자열 비교 심화
        s1 = "1234"; //벽에 붙은 메모지의 비밀번호 정보
        s2 = "1234";
        System.out.println(s1.equals(s2)); //true (내용 비교)
        System.out.println(s1 == s2); //true (참조 비교)


        //이렇게 정의하면 내용은 같지만 참조 부분이 다르다. ****
        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); //true
        System.out.println((s1 == s2)); //false

        // 문자열 비교할 때 내용 비교하고 싶으면 s.equals() 쓰는거 기억!!

    }
}

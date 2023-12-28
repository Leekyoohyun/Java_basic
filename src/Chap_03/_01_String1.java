package Chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        //문자열의 길이
        System.out.println(s.length()); //29

        // 대소문자 변환
        System.out.println(s.toUpperCase()); //대문자로
        System.out.println(s.toLowerCase()); //소문자로

        //포함 관계
        System.out.println(s.contains("Java")); //true
        //Java라는 단어가 포함되어 있나?
        System.out.println(s.contains("C#")); //false
        System.out.println(s.indexOf("Java")); //Java위치열의 위치정보
        System.out.println(s.indexOf("C#")); //-1 :포함되어있지 않으면 -1반환
        System.out.println(s.indexOf("and")); //처음위치
        System.out.println(s.lastIndexOf("and")); //마지막에 위치하는 위치정보
        System.out.println(s.startsWith("I like"));// 이 문자열로 시작한다면 true, 아니라면 false









    }
}

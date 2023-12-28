package Chap_03;

public class _04_escapesequence {
    public static void main(String[] args) {
        //특수 문자 or 이스케이프 문자
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        // \n: 줄바꿈
        System.out.println("자바가\n너무\n재밌어요");

        // \t: 탭
        // 해물파전     9000원
        // 김치전      8000원
        // 부추전      8000원
        System.out.println("해물파전\t9000원"); //띄워쓰기

        System.out.println("C:\\Program Files\\Java"); //역슬래시 두번
        // \\: 역슬래시

        //단비가 "냐옹" 이라고 했어요
        // \": 큰 따옴표
        System.out.println("단비가 \"냐용\"이라고 했어요");

        // \': 작은 따옴표
        // 단비가 '뭘 봐?' 라는 표정을 지었어요
        System.out.println("단비가 \'뭘 봐?\' 라는 표정을 지었어요");

        char c = 'A';
        c= '\'';
        System.out.println(c);

    }
}

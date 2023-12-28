package Chap_01;

public class _07_Typecasting {
    public static void main(String[] args) {
        //형 변환 TypeCasting
        //정수->실수형
        //실수형->정수형
        //int score=93+98.8;  형이 달라서 에러뜸

        // int to float, double
        int score= 93;
        System.out.println(score); //93 print됨
        System.out.println((float)score); //float으로 변환하니까 93.0 print
        System.out.println((double)score); // 93.0

        //float, double to int
        float score_f=93.3F;
        double score_d=98.8;
        System.out.println((int)score_f); //93.3 --> 93 정수로 print됨
        System.out.println((int)score_d); //98.8 --> 98 정수로 print됨

        //정수+실수 연산
        score = 93 +(int) 98.8; //93+98
        System.out.println(score); //191

        score_d= (double)93+98.8; //93 double로 변환한다. 191.8 print됨
        System.out.println(score_d);

        // 변수에 형 변환된 데이터 집어넣기
        double convertedScoreDouble = score; //191 --> 191.0으로 형변환
        //int --> long --> float --> double (자동 형 변환)

        //int convertedScoreInt = score_d; // 191.8 --> 191 ERROR
        int convertedScoreInt = (int)score_d; //이래야 ERROR안뜸

        //숫자를 문자열로
        String s1 =String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1); //93으로 출력

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2); //98.8

        //문자열 --> 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i); //93 print
        double d = Double.parseDouble("98.8");
        System.out.println(d);

        //int error = Integer.parseInt("자바"); 에러!!




    }
}

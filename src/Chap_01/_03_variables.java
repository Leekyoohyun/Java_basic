package Chap_01;

public class _03_variables {
    public static void main(String[] args) {
        String name="이규현";
        int hour=8;

        System.out.println(name + hour +"공부 시작");
        System.out.println(name +hour +"공부 종료");

        double score = 90.5;
        char grade= 'A';
        name="김차민";
        System.out.println(name+"의 평균 학점은"+grade+"점수는"+score);

        boolean pass= false;
        System.out.println(name+"이번 시험에 합격했는가?"+pass);

        double d =3.14123456789;
        float f= 3.14123456789F;
        System.out.println(d);
        System.out.println(f);

        //int i = 100000000000000000;   안됨 숫자 너무큼 int는 21억까지

        long l= 100000000000000L;
        l=1_000_000_000_000L;
        System.out.println(l);

       // int,long, float, double,


    }
}

package ReviewAll;

public class ArraysStudy {
    public static void main(String[] args) {
        String[] names1 = {"규현", "유림", "감자"};
        System.out.println(names1[2]); // print 감자 ---> [2]: 2는 index

        String[] names2 = null;
        names2 = new String[] {"규현", "유림", "감자"};
        System.out.println(names2[1]); // print 유림(index1)

        // new Operator로 Array 생성
        // 타입[] 변수 = new 타입[길이];
        // 타입[] 변수 = null; --> 변수 = new 타입[길이];

        int[] intArray = new int[5];
        int[] score1 = new int[30];
        // 이렇게 배열을 생성 후, 데이터를 저장하는 방법. 이게 중요

        score1[0] = 40;
        score1[1] = 80;
        score1[2] = 50;

        System.out.print("배열 생성 후 저장: ");
        System.out.println(score1[3]+score1[1]);


    }
}

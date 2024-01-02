package Chap_04;

public class _07_Dowhile {
    public static void main(String[] args) {
        //반복문 Dowhile
        int distance = 25;
        int move = 0;   //현재 이동거리
        int height = 2; //키 2미터
        while (move + height< distance){
            System.out.println("발차기 계속");
            System.out.println("현재 이동거리"+ move);
            move = move +3;

        }
        System.out.println("도착");

        System.out.println("-------반복문 #1 ------");

        //키가 엄청 큰사람
        move = 0;
        height = 25; //키가 25m
        while (move + height< distance){
            System.out.println("발차기 계속");
            System.out.println("현재 이동거리"+ move);
            move = move +3;

        }
        System.out.println("도착");

        System.out.println("-------반복문 #2 ------");

        //Do while 반복문
        do {
            System.out.println("발차기를 계속");
            System.out.println("현재 이동 거리:"+ move);
            move = move +3;
        } while (move +height < distance);
        System.out.println("도착");




    }
}

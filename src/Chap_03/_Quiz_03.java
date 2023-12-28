package Chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String s = "970515-1234567";
        System.out.println(s.substring(0,8)); //0 위치부터 8위치 직전까지 잘라준다.

        System.out.println(s.substring(0, s.indexOf("-")+2));
        //하이픈 위치 찾아서 +2해준거 직전까지 짤라주라는 명령
    }
}

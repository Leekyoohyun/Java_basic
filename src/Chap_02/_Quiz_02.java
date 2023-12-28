package Chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
       float x= 115;
       float y= 121;
       String s = (x<120) ? "키가 115cm 이므로 탑승 불가합니다": "false";
       String s1 = (y>120) ? "키가 121cm 이므로 탑승 가능합니다" : "false";
       System.out.println(s);
       System.out.println(s1);

    }
}

package Chap_01;

public class _Quiz_01 {
    public static void main(String[] args) {
        String bus_number = "1234 상암08";
        String min = "분";
        String kilometer = "km";
        int time1 = 3;
        int time2 = 5;
        float distance1 = 1.5F;
        float distance2 = 0.8F;
        System.out.println(time1 + min + " 후에" + bus_number+"가 도착합니다.");
        System.out.println("남은 거리는"+distance2+kilometer+"입니다.");
        System.out.println(time2 + min + " 후에" + bus_number+"가 도착합니다.");
        System.out.println("남은 거리는"+ distance1+kilometer+"입니다.");


    }
}

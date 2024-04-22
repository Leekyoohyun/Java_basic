package Chap_06;

public class _08_MainMethod {
    public static void main(String[] args) {    //이게 Main Method 였다!!
        // args 라는 String[] 배열을 전달 값으로 받는 메소드
        for (String s : args) {
            System.out.println(s);
        }

        // 1. 도서 조회
        // 2. 도서 대출
        // 3. 도서 반납
        if (args.length==1){
            switch (args[0]){
                case "1":
                    System.out.println("도서 조회 메뉴입니다.");
                    break;
                case "2":
                    System.out.println("도서 대출 메뉴입니다.");
                    break;
                case "3":
                    System.out.println("도서 반납 메뉴입니다.");
                    break;
                default:
                    System.out.println("잘못 입력 하셨습니다.");
                    break;
            }
        } else {
            System.out.println("사용법 1~3 중에 입력해주세요.");   // length가 1이 아니기 때문에 이게 출력됨
        }

    }
}

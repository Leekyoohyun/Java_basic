package Chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        // 배열의 순회
        String[] coffees = new String[] {"아메리카노", "카페모카","라떼", "카푸치노"};

        for (int i = 0; i<4; i++){  //for 반복문에서 i는 0부터 4직전까지 순회
            System.out.println(coffees[i]+" 하나");
        }
        System.out.println("주세요");

        System.out.println("--------------");

        //배열의 길이를 이횽한 순회
        for (int i = 0; i<coffees.length; i++){  //for 반복문에서 i는 0부터 4직전까지 순회
            System.out.println(coffees[i]+" 하나");
        }
        System.out.println("주세요");

        System.out.println("------------------");

        //enhanced for (for-each) 반복문
        for (String coffee:
             coffees) {
            System.out.println(coffee+ " 하나");
        }
        System.out.println("주세요");

    }
}

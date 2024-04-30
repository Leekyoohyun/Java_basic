package ReviewAll;

import java.util.Scanner;


public class ForExample1 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=0; i<11; i++){
            sum=sum+i;
        }
        System.out.println(sum);

        System.out.println("메시지 입력");
        System.out.println("프로그램 종료 하려면 q 눌러");

        Scanner scanner = new Scanner(System.in);
        String inputString;

        do{
            System.out.print(" > ");
            inputString = scanner.nextLine();
            System.out.println(inputString);
        } while (! inputString.equals("q"));

        System.out.println();
        System.out.println("프로그램 종료");



    }


    public static void do_While(String[] args){

    }
}

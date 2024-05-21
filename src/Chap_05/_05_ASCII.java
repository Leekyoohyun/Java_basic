package Chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        // 아스키 코드(ANSI): 미국 표준 코드 (참고*)
        char c = 'A';
        System.out.println(c);
        System.out.println((int)c); //A는 아스키코드로 65

        c='B';
        System.out.println(c);
        System.out.println((int)c);

        c='C';
        System.out.println(c);
        System.out.println((int)c);

        c++;
        System.out.println(c);
        System.out.println((int)c);

        //세로크기 10* 가로크기 15
        String[][] seats3= new String[10][15];
        char ch ='A';
        for (int i = 0; i<seats3.length; i++){
            for(int j =0;j<seats3[i].length;j++){
                seats3[i][j]= String.valueOf(ch) +(j+1);
            }
            ch++;

        }
        for (int i =0; i<seats3.length; i++){
            for(int j = 0; j<seats3[i].length ; j++){
                System.out.print(seats3[i][j]+ " ");
            }
            System.out.println();
        }
    }
}

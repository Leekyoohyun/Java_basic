package Chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        //배열을 활용해 쇼핑몰에서 구매 가능한 신발사이즈 옵션 출력
        // 신발 사이즈는 250~295, 5씩 증가
        //신발 사이즈 수는 10가지
        //

        String[][] size= {
                {"250","255","260"},
                {"265","270","275"},
                {"280","285","290"},
                {"295"}
        };
        for(int i = 0; i< size.length;i++){
            for(int j =0; j<size[i].length;j++){
                System.out.print(size[i][j]);
            }
            System.out.println();
            size[1][1]="__"; //270사이즈 나감
        }

       // 다른 방향
        int[] sizeArray = new int[10];
        for (int i=0; i< sizeArray.length; i++){
            sizeArray[i]= 250+ (5*i);
        }
        for (int size1 :
                sizeArray) {
            System.out.println("사이즈 "+size1+" (재고 있음)");
        }
    }
}

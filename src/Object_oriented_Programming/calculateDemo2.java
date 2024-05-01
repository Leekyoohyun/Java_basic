package Object_oriented_Programming;

public class calculateDemo2 {
    public static void sum(int left, int right){
        System.out.println(left+right);
    }
    public static void main(String[] args) {
        sum(10,20);
        sum(20,40);
        System.out.println();
        System.out.println();
        System.out.println();

        int i;
        for(i=10; i<=40; i++){
            if(i==10){
                sum(i,i*2);
            }
              if(i==20){
                  sum(i,i*2);
              }
          }
    }
}

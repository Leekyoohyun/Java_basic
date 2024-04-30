package ReviewAll;

public class MethodDemo2 {
    public static void numbering(int init, int limit){
        int i= init;
        while(i<=limit){
            System.out.println(i);
            i++;
        }
    }

    public static String numbering2(int init, int limit){
        int i= init;
        String output ="";
        while(i<limit){
            output +=i;
            i++;
        }
        return output;
    }

    public static void main(String[] args){
        numbering(2, 9);

        String result = numbering2(1,9);
        System.out.println(result);
    }
}

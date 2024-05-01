package ReviewAll;

public class loginDemo {
    public static void main(String[] args) {
        args[0]="kyoohyun";
        args[1]="12341234";
        String id = args[0];
        String password = args[1];
        if(id.equals("kyoohyun")){
            if(password.equals("12341234")){
                System.out.println("correct");
            }else{
                System.out.println("wrong");
             }
        }else {
            System.out.println("wrong");
        }




    }
}

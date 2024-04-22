package Chap_06;

public class _04_ParameterAndReturn {

//    public static void power(int number){ //number: Parameter, 매개변수
//        int result = number*number;
//        System.out.println(number+number+"의 2 승은 "+result);
//    }

    public static int getPower(int number) {
       return number*number;

    }
//
//    public static void powerByExp(int number, int exponent){
//        int result=1;
//        for (int i=0; i<exponent; i++){
//            result *= number; // result=result*number
//        }
//        System.out.println(number+" 의 "+ exponent+" 승은 "+ result);
//    }

    public static int getPowerByExp(int number, int exponent){
        int result = 1;
        for (int i=0; i<exponent;i++){
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        //전달 값과 반환 값이 함께 있는 메소드
        int retVal = getPower(2); //2*2=4
        System.out.println(retVal);

        retVal= getPower(3);
        System.out.println(retVal);

        retVal=getPowerByExp(3,3); //3의 3승 27
        System.out.println(retVal);

        retVal= getPowerByExp(10,10);
        System.out.println(retVal);

        retVal = getPowerByExp(2,2);
        System.out.print(retVal);


    }
}

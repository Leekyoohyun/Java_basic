package Object_oriented_Programming;

public class CalculatorDemo_2 {
    public static void main(String[] args) {
        Calculator_2 c1 = new Calculator_2();
        System.out.println(c1.PI); // 인스턴스를 통해 PI 접근
        c1.setOperands(10,20);
        c1.sum(); // 30출력

        Calculator_2 c2 = new Calculator_2();
        System.out.println(c2.PI);
        c2.setOperands(20,40);
        c2.sum(); // 60출력

        Calculator_2.base= 10;

        //40출력
        c1.sum();

        //70출력
        c2.sum();

        System.out.println(Calculator_2.PI);
        // 클래스를 통해서 PI 접근
    }
}

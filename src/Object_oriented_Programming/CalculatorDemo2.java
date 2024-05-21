package Object_oriented_Programming;

public class CalculatorDemo2 {

    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        c1.setOperands(10,20);
        c1.sum();
        c1.avg();


        Calculator c2 = new Calculator();
        c1.setOperands(20,40);
        c1.sum();
        c1.avg();


    }
}

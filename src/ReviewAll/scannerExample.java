package ReviewAll;
import java.util.Scanner;

public class scannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            System.out.println(sc.nextInt()*1000);
        }
        sc.close();
    }
}

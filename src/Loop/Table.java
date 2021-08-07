package Loop;
import java.util.Scanner;
public class Table {
    public static int enterNumber(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        return n;
    }
    public static void madeTable(int n) {
        int product = 0;
        for (int i = 1; i < 10; i++) {
            product = n * i;
            System.out.println(n + "*" + i + "=" + product);
        }
    }
    public static void main(String[] args) {
        int number = enterNumber();
        madeTable(number);
    }
}

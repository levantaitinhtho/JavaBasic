package Loop;
import java.util.Scanner;
public class CupInterger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        cupInterger(n);
    }
    public static void cupInterger(int n){
        int i = 2;
        if (n == 1) {
            System.out.println(n + " = " + n);
        } else {
            System.out.print(n + " = ");
            while (n != 1) {
                if (n % i == 0) {
                    System.out.print(i + " * ");
                    n /= i;
                } else {
                    ++i;
                }
            }
            System.out.print("\b\b\b");
        }
    }
}

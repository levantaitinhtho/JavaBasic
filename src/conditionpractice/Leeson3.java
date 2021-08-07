package conditionpractice;
import java.util.Scanner;
public class Leeson3 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 19;
        int d = 201;
        int k = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age");
        int age = sc.nextInt();
        k = (age - a <= 0) ? a : (age - b < 18) ? b : (age - c < 200) ? c : d;

        switch (k) {
            case 0: {
                System.out.println("Erorr");
                break;
            }
            case 1: {
                System.out.println("Children");
                break;
            }
            case 19: {
                System.out.println("Mature");
                break;
            }
            default:
                System.out.println("Ghost");
                break;
        }
    }
}
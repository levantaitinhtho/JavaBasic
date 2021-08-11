package Arrays;
import java.util.Scanner;
public class Lesson1 {
    public static void main(String[] args) {
        int[] a = Enter();
        printArray(a);
        int sum = sumArray(a);
        evenNumber(a);
    }
    public static int[] Enter() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Number: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Import Array: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void printArray(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int sumArray( int[] arr ) {
        int sum = arr[0] + arr[arr.length - 1];
        System.out.println(sum);
        return sum;
    }
    public static void evenNumber( int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i] + " ");
            }
        }
    }
}

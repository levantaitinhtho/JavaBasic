package Loop;
import java.util.Scanner;
class Week{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch (number){
            case 1:
                System.out.println("Erorr");
                break;
            case 2:
                System.out.println("MONDAY");
                break;
            case 3:
                System.out.println("TUESDAY");
                break;
            case 4:
                System.out.println("WEDNESDAY");
                break;
            case 5:
                System.out.println("THURSDAY");
                break;
            case 6:
                System.out.println("FRIDAY");
                break;
            case 7:
                System.out.println("SATURDAY");
                break;
            case 0:
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("The number is invalid");
        }
    }
}

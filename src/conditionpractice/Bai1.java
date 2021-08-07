package conditionpractice;
import java.util.Scanner;
class Lesson1 {
    public static int enterNumber(){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        return number;
    }
    public static void checkNumber(int number){
        if(number % 2==0){
            System.out.println("Is an even number");
        }
        else{
            System.out.println("Is odd");
        }
    }
    public static void main(String[] args) {
        int number = enterNumber();
        checkNumber(number);
    }
}

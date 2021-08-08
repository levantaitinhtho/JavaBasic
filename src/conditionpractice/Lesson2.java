package conditionpractice;
import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        checkMaxValue(a,b);
    }
    public static void checkMaxValue(int a, int b) {
        if (a > b) {
            System.out.println("MaxValue ="+a);
        } else if(a<b) {
            System.out.println("MaxValue= "+b);
        }
        else{
            System.out.println("two equal numbers");
        }
    }

}
package Loop;
import java.util.Scanner;
 public class Month {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int month = sc.nextInt();
         switch (month){
             case 1:
             case 3:
             case 5:
             case 7:
             case 8:
             case 10:
             case 12:
                 System.out.println("Là tháng có 31 ngày");
                 break;
             case 4:
             case 6:
             case 9:
             case 11:
                 System.out.println("Là tháng có 30 ngày");
                 break;
             case 2:
                 System.out.println("Là tháng có 28 hoặc 29 ngày");
                 break;
             default:
                 System.out.println("Erorr");
         }
     }
}
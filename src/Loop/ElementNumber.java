package Loop;
import java.util.Scanner;
public class ElementNumber {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       if(checkElementNumber(n)==true){
           System.out.println("A Element Number");
       }
       else{
           System.out.println("Not A Element Number");
       }
    }
    public static boolean checkElementNumber(int n){
        if(n<0 || n==1){
            return false;
        }
        else{
            for(int i=2;i<n-1;i++){
                if(n%i==0){
                    return false;
                }
                else{
                    return true;
                }
            }
        }
        return true;
    }
}






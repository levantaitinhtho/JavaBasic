package Loop;
import java.util.Scanner;
public class ElementNumber2 {
    boolean checkElementNumber(int n){
        if(n<=2){
            return true;
        }else {
            for(int i =2;i<=Math.sqrt(n);i++){
                if(n % i == 0)
                    return false;
            }
        }
        return true;
    }
    void inputElementNumber(int n){
        for(int i = 1 ;i<n;i++){
            if(checkElementNumber(i)){
                System.out.print(" " +i);
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ElementNumber2 lk = new ElementNumber2();
        System.out.println("Enter n : = \n");
        int n = sc.nextInt();
        lk.inputElementNumber(n);
    }
}



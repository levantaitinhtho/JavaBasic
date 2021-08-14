package Loop;
import java.util.Scanner;
public class EnumerateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int dem=0;
        int begin=2;
        while(dem<n){
            if(checkElement(begin)){
                System.out.print(begin+" ");
                dem++;
            }
            begin++;
        }
    }
    public static boolean checkElement(int n){
        if(n<2){
            return false;
        }
        else{
            for(int i=2;i<Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }
}

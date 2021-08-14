package Loop;
import java.util.Scanner;
public class EnumerateFibonanci {
    public static void main(String[] args) {
        display();
    }
    public static long enumerateFibonaci(int n){
        long f0=0 ,f1=1,fn=0;
        if(n==0 || n==1){
            fn=n;
        }
        else{
            for(int i=2;i<=n;i++){
                fn=f0+f1;
                f0=f1;
                f1=fn;
            }
        }
        return fn;
        }
        public static void display(){
        Scanner sc= new Scanner(System.in);
            System.out.println("Enter n: ");
        int n = sc.nextInt();
        int count =0;
        for(int i=0;i<n;i++){
            System.out.println("fi"+i+"="+enumerateFibonaci(i));
            count++;
        }
    }
}


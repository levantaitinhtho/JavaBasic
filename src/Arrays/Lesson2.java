package Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Lesson2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = enterArray();
        increaseArray(a);
        int maximum =maxArray(a);
        System.out.println("Max=:"+maximum);
        int minximum = minArray(a);
        System.out.println("Min= "+minximum);
        searchArray(a);
    }
    public static int[] enterArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Aray Number: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Import Array: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void increaseArray(int arr[]){
        for ( int i=0;i<arr.length;i++){
            arr[i]+=1;
            System.out.print(arr[i]+" ");
        }

    }
    public static int maxArray(int arr[]){
        int MaxValue=arr[0];
        for ( int i=1;i<arr.length;i++){
            if(arr[i]>MaxValue){
                MaxValue=arr[i];
            }
        }
        return MaxValue;
    }
    public static int  minArray(int arr[]){
        int MinValue=arr[0];
        for ( int i=1;i<arr.length;i++){
            if(arr[i]<MinValue){
                MinValue=arr[i];
            }
        }
        return MinValue;
    }
    public static void searchArray(int arr[]){
        Scanner sc = new Scanner(System.in);
        int dem=0;
        Vector<Integer> index = new Vector<Integer>();
        for( int i=0;i<arr.length;i++){
            if(arr[i]==10){
                index.add(i);
                dem+=1;
            }
        }
        if(dem==0){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Các tọa độ bằng 10 là :\n");
            index.forEach(System.out::println);
        }
    }
}

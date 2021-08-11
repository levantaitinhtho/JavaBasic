package vn.viettuts.baitap.array;

import java.util.Scanner;
public class Option {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number in the Array: ");
        int n = scanner.nextInt();
        // khởi tạo arr
        int [] arr = new int [n];
        System.out.print("Import Number: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        System.out.println("Location Insert :");
        int k = scanner.nextInt();
        System.out.print("Enter x = ");
        int x = scanner.nextInt();
        int index=1;
        System.out.printf("\nInsert %d into Array, we are:\n ", x);
         insertArray(arr,n,k,x);
        System.out.println("\nAnd after delete: ");
        deleteArray(arr,n,index);
    }
    public static void insertArray(int[] arr,int n,int k,int x)
    {
        int[] newa =new int[n+1];
        n=newa.length-1;
        for(int i =0;i<n;i++)
        {
            newa[i]=arr[i];
        }
        //1 2 3 4 5 0
        for(int i =n ;i>k;i-- ){
            newa[i]=newa[i-1];
        }
        newa[k]=x;
        for(int i =0;i<=n;i++)
        {
            System.out.print(newa[i]+" ");
        }
    }
    public static void deleteArray(int[] arr,int n,int index ) {
        for(int i=index;i<n-1;i++)
        {
            arr[i]=arr[i+1];
        }
        n = n-1;
        for(int i =0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void show(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
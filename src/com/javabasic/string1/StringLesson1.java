package com.javabasic.string1;
import java.util.Scanner;
import java.lang.String;
class StringLession1{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String s = sc.next();
            System.out.println(" Vị trí của kí tự a là : "+ s.indexOf("a") + " và "+ s.lastIndexOf("a"));
        }
    }

/*package com.javabasic.string1;
import java.lang.String;
import java.util.Scanner;

public class StringLesson1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        char c = sc.next().charAt(0);
        for ( int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                System.out.print(i+" ");
    }

        }
    }
}*/
package studentmanagement;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student std1 = new Student(2,"VANTAI","CNTT",8,9);
        Student std2 = new Student();
        System.out.println("Enter Information Student: ");
        getInfo();
        System.out.println("----------------");
        Student std3 = new Student();
        System.out.println("Enter Information Student: ");
        getInfo();
        System.out.println("Information All Student Entered");
        showInfo(std1);
        showInfo(std2);
        showInfo(std3);
    }
    public static Student getInfo(){
        Scanner input = new Scanner(System.in);
        System.out.println("ID: ");
        int ID = Integer.parseInt(input.nextLine());
        System.out.println("Name: ");
        String name = input.nextLine();
        System.out.println("Major: ");
        String major = input.nextLine();
        System.out.println("Theory Score: ");
        float theoryScore = input.nextFloat();
        System.out.println("Pratice Score: ");
        float praticeScore = input.nextFloat();
        return new Student(ID,name,major,theoryScore,praticeScore);
    }
    public static void showInfo(Student student){
        System.out.println(student.toString());
        System.out.println("Calculate Average Score:"+student.calculateAverageScore());
    }
}

package student;
import java.util.Scanner;
public class MainStudent {
    public static void main(String[] args) {
        Student [] students = new Student[10];
        students[0]=getStudentInfo();
        System.out.println(students[0]);
        students[0].study("Toan");
        students[0].payFee();
        students[0].doExample("Languages");
    }
    public static Student getStudentInfo(){
        Student s = null;
        String name,address,email,numberphone,id;
        float fee;
        Scanner sc= new Scanner(System.in);
        System.out.println("ID: ");
        id = sc.nextLine();
        System.out.println("Full name: ");
        name = sc.nextLine();
        System.out.println("Address: ");
        address = sc.nextLine();
        System.out.println("Email: ");
        email = sc.nextLine();
        System.out.println("Number Phone: ");
        numberphone = sc.nextLine();
        System.out.println("Fee: ");
        fee =  sc.nextFloat();

        s = new Student(name,address,email,numberphone,id,fee);
        return s;
    }
}

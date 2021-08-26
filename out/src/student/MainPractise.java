package student;
import java.util.Scanner;
public class MainPractise {
    public static void main(String[] args) {
        Practise[] pr = new Practise[10];
        pr[0] = display();
        System.out.println(pr[0]);
        pr[0].doExample("English");
    }
    public static Practise display(){
        Practise pr = null;
        Scanner sc= new Scanner(System.in);
        String id,name,birthday,phonenumber,gender;
        System.out.println("ID: ");
        id = sc.nextLine();
        System.out.println("Name is: ");
        name = sc.nextLine();
        System.out.println("Birthday: ");
        birthday = sc.nextLine();
        System.out.println("Phone Number");
        phonenumber = sc.nextLine();
        System.out.println("Gender: ");
        while(true){
            String markGender = sc.nextLine();
            boolean check = pr.setGender(markGender);
            if(check){
                break;
            }
        }
        pr = new Practise(id,name,birthday,phonenumber,gender);
        return pr;
    }
}


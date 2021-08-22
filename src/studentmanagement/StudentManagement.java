package studentmanagement;

public class StudentManagement {
    public static void main(String[] args) {
        Student sv1 = new Student(01,"VANTAI","CNTT",10,10);
        sv1.showInfo();
        Student sv2 = new Student();
        System.out.println("Enter Information SV2");
        sv2.getInfo();
        sv2.showInfo();
        Student sv3 = new Student();
        System.out.println("-----------------------");
        System.out.println("Enter Information SV3");
        sv3.getInfo();
        sv3.showInfo();

    }

}

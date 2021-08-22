package employeemanagement;
import java.util.Scanner;
public class Officer {
    private int level;
    private String department;

    public Officer() {
    }

    public Officer(int level, String department) {
        this.level = level;
        this.department = department;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void inputInfo(){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter Level: ");
        level = Integer.parseInt(input.nextLine());
        System.out.println("Enter Department: ");
        department = input.nextLine();
    }
    public void showInfo(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Officer{" +
                "level=" + level +
                ", department='" + department + '\'' +
                '}';
    }
}

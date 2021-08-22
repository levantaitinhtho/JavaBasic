package employeemanagement;
import java.util.Scanner;
public class Employee {
    protected int ID;
    protected String name;
    protected String gender;
    protected String dayOfBirth;
    protected String address;

    public Employee() {
    }

    public Employee(int ID, String name, String gender, String dayOfBirth, String address) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.dayOfBirth = dayOfBirth;
        this.address = address;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void inputEmployee(){
        Scanner input = new Scanner(System.in);
        System.out.println("----------------------");
        System.out.println("ID: ");
        ID = Integer.parseInt(input.nextLine());
        System.out.println("Name: " );
        name = input.nextLine();
        System.out.println("Gender: ");
        gender = input.nextLine();
        System.out.println("Day Of Birth: ");
        dayOfBirth = input.nextLine();
        System.out.println("Address is: ");
        address = input.nextLine();
    }
    public void showInfo(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

package student;
import java.util.Scanner;
public class Student {
    private String name;
    private String address;
    private String email;
    private String numberphone;
    private String id;
    private float fee;
    public Student(){

    }
    public Student(String name, String address, String email, String numberphone, String id, float fee) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.numberphone = numberphone;
        this.id = id;
        this.fee = fee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumberphone() {
        return numberphone;
    }

    public void setNumberphone(String numberphone) {
        this.numberphone = numberphone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getFee() {
        return fee;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", numberphone='" + numberphone + '\'' +
                ", id='" + id + '\'' +
                ", fee=" + fee +
                '}';
    }
    void study(String subject ){
        System.out.println(this.name+" is study "+subject);
    }
    void doExample(String subject){
        System.out.println(this.name +" doing "+subject+" exam ");
    }
    void payFee(){
        System.out.println("Fee of "+this.name+" is "+this.fee);
    }
    void doQuiz(String subject){
        System.out.println(this.name+" doing quiz"+subject);
    }
}

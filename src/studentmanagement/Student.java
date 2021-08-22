package studentmanagement;
import java.util.Scanner;
public class Student {
    private int ID;
    private String name;
    private String major;
    private float theoryScore;
    private float praticeScore;

    public Student() {
    }

    public Student(int ID, String name, String major, float theoryScore, float praticeScore) {
        this.ID = ID;
        this.name = name;
        this.major = major;
        this.theoryScore = theoryScore;
        this.praticeScore = praticeScore;
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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public float getTheoryScore() {
        return theoryScore;
    }

    public void setTheoryScore(float theoryScore) {
        this.theoryScore = theoryScore;
    }

    public float getPraticeScore() {
        return praticeScore;
    }

    public void setPraticeScore(float praticeScore) {
        this.praticeScore = praticeScore;
    }
    public float calculateAverageScore(){
        return (getTheoryScore() - getPraticeScore())/2;
    }
    public void getInfo(){
        Scanner input = new Scanner(System.in);
        System.out.println("ID: ");
        ID = Integer.parseInt(input.nextLine());
        System.out.println("Name: ");
        name = input.nextLine();
        System.out.println("Major: ");
        major = input.nextLine();
        System.out.println("Theory Score: ");
        theoryScore = input.nextFloat();
        System.out.println("Pratice Score: ");
        praticeScore = input.nextFloat();
    }
    public void showInfo(){
        System.out.println(toString());
        System.out.println("Calculate Average Score:"+calculateAverageScore());
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", theoryScore=" + theoryScore +
                ", praticeScore=" + praticeScore +
                '}';
    }
}

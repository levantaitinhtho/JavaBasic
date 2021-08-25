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

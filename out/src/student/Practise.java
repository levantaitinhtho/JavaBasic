package student;

public class Practise {
    private String id;
    private String name;
    private String birthday;
    private String phonenumber;
    private String gender;
    public Practise(){

    }

    public Practise(String id, String name, String birthday, String phonenumber, String gender) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.phonenumber = phonenumber;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirdthday() {
        return birthday;
    }

    public void setBirdthday(String birdthday) {
        this.birthday = birdthday;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getGender() {
        return gender;
    }

    public boolean setGender(String gender) {
        if (gender == "Male" || gender == "Female") {
            this.gender = gender;
            return true;
        } else {
            System.err.println("Enter Again: ");
            return false;
        }

    }
    void doExample(String subject){
        System.out.println(this.name+" doing homework "+subject+" yesterday");
    }
}
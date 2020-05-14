package StudentDatabase;

public class StudentFactory {
    //Properties
    private static int ID = 0;
    private String userID;
    private String name;
    private String SSN;
    private String email;
    private String phonne;
    private String city;
    private String state;
    private String courses;
    private static final int costOfCourse = 800;
    private int balance = 0;

    public StudentFactory(String name, String SSN) {
        ID++;
        this.name = name;
        this.SSN = SSN;
        setUserID();
        setEmail();
    }

    public String getPhonne() {
        return phonne;
    }

    public void setPhonne(String phonne) {
        this.phonne = phonne;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private void setEmail() {
        email = name.toLowerCase().replaceAll("\\s", "") + "." + ID + "@gmail.com";
        System.out.println("Your email address will be: " + email);
    }

    public String getEmail() {
        return email;
    }

    private void setUserID() {
        int max = 9000;
        int min = 1000;
        int rand = (int) (Math.random() * (max - min));
        rand = rand + min;
        userID = ID + "" + rand + SSN.substring(5);
        System.out.println("Your userID is: " + userID);
    }


    public void enroll(String course) {
        this.courses = this.courses + " " + course;
        balance = balance + costOfCourse;
    }

    public void payTuition(int amount) {
        System.out.println("Payment: $ " + amount);
        balance = balance - amount;
    }

    public void checkBalance() {
        System.out.println("Balance : " + balance);
    }

    public void showCourses() {
        System.out.println("Courses| " + courses);
    }

    @Override
    public String toString() {
        return "StudentFactory{" +
                "userID='" + userID + '\'' +
                ", name='" + name + '\'' +
                ", SSN='" + SSN + '\'' +
                ", email='" + email + '\'' +
                ", phonne='" + phonne + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", courses='" + courses + '\'' +
                ", balance=" + balance +
                '}';
    }
}
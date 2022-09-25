package Repeating;

public class StudentTest {
    public static void main(String[] args) {
        Student studentA = new Student("George","Mcalister",2022,4,"Computing Science");
        Student studentB = new Student("George","Double",2021,3,"Science");

        System.out.println(studentA);
        studentA.incrementExpectedYear();
        System.out.println(studentA);


        boolean compareStudent = studentB.equals(studentA);
        System.out.println(compareStudent);
    }
}

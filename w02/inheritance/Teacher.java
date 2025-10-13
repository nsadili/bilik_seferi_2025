package inheritance;

import java.time.LocalDate;
import java.util.Arrays;

public class Teacher extends Person {
    String department;
    String[] lessons;
    float salary;
    LocalDate startDate;

    public Teacher(
            String fName,
            String lName,
            Gender gender,
            LocalDate dob,
            String department,
            String[] lessons,
            float salary,
            LocalDate startDate) {
        super(fName, lName, gender, dob);

        this.department = department;
        this.lessons = lessons;
        this.salary = salary;
        this.startDate = startDate;
    }

    public short getExperience() {
        return (short) (LocalDate.now().getYear() - this.startDate.getYear());
    }

    @Override
    public String toString() {
        return "Teacher [department=" + department + ", lessons=" + Arrays.toString(lessons) + ", salary=" + salary
                + ", startDate=" + startDate + ", gender=" + gender + ", getfName()=" + getfName()
                + ", getExperience()=" + getExperience() + ", getlName()=" + getlName() + ", getGender()=" + getGender()
                + "]";
    }

    public void sayHello() {
        System.out.println("Teacher says hello!");
    }

    public void sayHello(String name, int times) {
        for (int i = 0; i < times; i++)
            System.out.println("Person says hello to " + name
                    + " " + times + " times !");

    }

    public static void staticMethod() {
        System.out.println("Static method of Teacher ");
    }

}

package inheritance;

import java.time.LocalDate;

enum GpaRange {
    FROM_91_TO_100(91, 100, 250),
    FROM_81_TO_90(81, 90, 200),
    FROM_71_TO_80(71, 80, 200),
    FROM_61_TO_70(61, 70, 150),
    FROM_51_TO_60(51, 60, 150),
    UP_TO_51(0, 50, 0);

    int from;
    int to;
    float stipend;

    GpaRange(int from, int to, float stipend) {
        this.from = from;
        this.to = to;
        this.stipend = stipend;
    }

    public static GpaRange getRange(float gpa) {
        GpaRange result;
        if (gpa >= FROM_91_TO_100.from && gpa <= FROM_91_TO_100.to) {
            result = FROM_91_TO_100;
        } else if (gpa >= FROM_81_TO_90.from && gpa <= FROM_81_TO_90.to) {
            result = FROM_81_TO_90;
        } else if (gpa >= FROM_71_TO_80.from && gpa <= FROM_71_TO_80.to) {
            result = FROM_71_TO_80;
        } else if (gpa >= FROM_61_TO_70.from && gpa <= FROM_61_TO_70.to) {
            result = FROM_61_TO_70;
        } else if (gpa >= FROM_51_TO_60.from && gpa <= FROM_51_TO_60.to) {
            result = FROM_51_TO_60;
        } else {
            result = UP_TO_51;
        }

        return result;
    }
}

public class Student extends Person {
    long id;
    float gpa;

    public Student(String fName, String lName, Gender gender, LocalDate dob, long id, float gpa) {
        super(fName, lName, gender, dob);
        this.id = id;
        this.gpa = gpa;
    }

    float calculateStipend() {
        return GpaRange.getRange(this.gpa).stipend;
    }

    public void sayHello() {
        System.out.println("Student says hello!");
    }
}

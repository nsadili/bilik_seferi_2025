package inheritance;

import java.time.LocalDate;

/*
 * TODO:
 * local, object
 * object fields (primitive, reference)
 * string 
 */

enum Gender {
    MALE, FEMALE, OTHER;
}

public class Person {
    private String fName;
    private String lName;
    public Gender gender;
    private LocalDate dob;

    

    public Person(String fName, String lName, Gender gender, LocalDate dob) {
        this.fName = fName;
        this.lName = lName;
        this.gender = gender;
        this.dob = dob;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person [fName=" + fName + ", lName=" + lName + ", gender=" + gender + ", dob=" + dob + "]";
    }
}
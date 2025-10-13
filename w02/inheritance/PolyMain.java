package inheritance;

import java.time.LocalDate;

public class PolyMain {
    public static void main(String[] args) {

        Student studentOrkhan = new Student("Orkhan", "Ibrahimov", Gender.MALE, LocalDate.of(2004, 6, 15), 10001, 91);

        // System.out.println(studentOrkhan instanceof Person);
        // System.out.println(studentOrkhan instanceof Student);
        // System.out.println(p instanceof Student);

        Person[] persons = new Person[3];
        persons[0] = new Person("Mammad", "Valiyev", Gender.MALE, LocalDate.of(2002, 4, 22));
        persons[2] = new Teacher("Nuraddin", "Sadili", Gender.MALE, LocalDate.of(1993, 6, 11),
                "Programming", null, 5000, LocalDate.of(2020, 9, 3));
        persons[1] = new Student("Orkhan", "Ibrahimov", Gender.MALE, LocalDate.of(2004, 6, 15), 10001, 91);

        (new PolyMain()).salamla(persons);
    }

    void salamla(Person[] adamlar) {
        if (adamlar == null)
            return;

        for (var adam : adamlar) {
            if (adam.getfName().equals("Orkhan"))
                System.out.print("Lucky you => ");

            adam.sayHello();

            if (adam instanceof Teacher) {
                System.out.println("Xeyirli olsun: "
                        + ((Teacher) adam).getExperience());
            } else if (adam instanceof Student) {
                System.out.println("Bereketli olsun: "
                        + ((Student) adam).calculateStipend());
            }
        }
    }
}

package inheritance;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Teacher teacherNuraddin = new Teacher("Nuraddin", "Sadili", Gender.MALE, LocalDate.of(1993, 6, 11),
                "Programming", null, 5000, LocalDate.of(2020, 9, 3));
        Student studentOrkhan = new Student("Orkhan", "Ibrahimov", Gender.MALE, LocalDate.of(2004, 6, 15), 10001, 91);
        // System.out.println(teacherNuraddin);

        // System.out.println(studentOrkhan);
        // System.out.println();
        // System.out.println("Get shellen: " + studentOrkhan.calculateStipend());

        // teacherNuraddin.sayHello();

        // System.out.println(studentOrkhan instanceof Person);
        // System.out.println(studentOrkhan instanceof Student);
        // System.out.println(studentOrkhan instanceof Teache r);

        // teacherNuraddin.sayHello();
        // teacherNuraddin.sayHello("Mammad");
        // teacherNuraddin.sayHello("Amil", 5);
        // teacherNuraddin.sayHello(5, 3);

        Person memmed = new Teacher("Nuraddin", "Sadili", Gender.MALE, LocalDate.of(1993, 6, 11),
                "Programming", null, 5000, LocalDate.of(2020, 9, 3));
        memmed.sayHello("Nuraddin");

        ((Teacher)memmed).staticMethod();
    }
}

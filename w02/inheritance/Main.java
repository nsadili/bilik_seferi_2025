package inheritance;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Teacher teacherNuraddin = new Teacher("Nuraddin", "Sadili", Gender.MALE, LocalDate.of(1993,6, 11), "Programming", null, 5000, LocalDate.of(2020, 9, 3));
        Student studentOrkhan = new Student("Orkhan", "Ibrahimov", Gender.MALE, LocalDate.of(2004, 6, 15), 10001, 91);
        System.out.println(teacherNuraddin);
        
        System.out.println(studentOrkhan);
        System.out.println();
        System.out.println("Get shellen: " + studentOrkhan.calculateStipend());
    }
}

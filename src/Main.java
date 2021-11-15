import people.Student;
import people.Teacher;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Teacher andries = new Teacher("Andries", 80, "CIN");
        Teacher loek = new Teacher("Andries", 80, "CIN");
        Student me = new Student("Mischa", 19, "SDE", andries);
        Student random = new Student("Yessss", 21, "CIN", loek);

        System.out.println(me.toString());
        System.out.println(random.toString());
        System.out.println(andries.toString());

        andries = null;
        loek = null;
        me = null;
        random = null;
    }
}

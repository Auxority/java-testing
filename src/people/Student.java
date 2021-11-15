package people;

public class Student extends Person {
    private Teacher favTeacher;

    public Student(String name, int age, String course, Teacher favTeacher) {
        super(name, age, course);
        this.favTeacher = favTeacher;
    }

    public String toString() {
        return String.format("%s And my favorite teacher is %s.", super.toString(), this.favTeacher.name);
    }
}
package people;

public abstract class Person {
    protected String name;
    protected int age;
    protected String favCourse;

    protected Person(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.favCourse = course;
    }

    public String toString() {
        return String.format("Hello my name is %s, I am %s years old and my favourite course is %s.", this.name, this.age, this.favCourse);
    }

    public String introduce() {
        return this.toString();
    }

    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    protected String getCourse() {
        return favCourse;
    }

    protected void setCourse(String course) {
        this.favCourse = course;
    }

    protected void setName(String name) {
        this.name = name;
    }
    
    protected String getName() {
        return this.name;
    }
}

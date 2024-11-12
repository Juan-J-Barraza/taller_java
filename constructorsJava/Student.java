package constructorsJava;

public class Student {
    
    private String name;
    private int age;
    private String course;

    public Student() {
        this.name = "Jose";
        this.age = 20;
        this.course = "math";
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public Student(String name, int age, String course) {
        this(name, age);
        this.course = course;
    }

    @Override
    public String toString() {
        String student;
        student = "Student : " + " name: " + this.name + ", " +
                " age: " + this.age + ", " + " Course " + this.course;

        return student;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    
}

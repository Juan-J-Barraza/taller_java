package useToOverride;

public class Teacher extends Person {
    

    @Override
    public void presentation() {
        System.out.println("hi, i am a teacher");
    }
}

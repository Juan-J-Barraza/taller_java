package abstractClass;

public abstract class Employee {
    public abstract double calculateSalary();

    public void shwSalary(){
        System.out.println("teh salary is: " + calculateSalary());
    }
}

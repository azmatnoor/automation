package Mjuk19_package;

public class Employee {
    public String firstName;
    public String lastName;
    public int age;
    public double salary;
    //public int id=1;
    public Employee(String firstName, String lastName,int age,double salary ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        // this.id = ++id;
    }
    public void setName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
}

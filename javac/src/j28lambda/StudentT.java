package j28lambda;

public class StudentT {
    public int age;
    public String name;

    public StudentT(int a, String n)
    {
        this.age=a;
        this.name=n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString()
    {
        return "Age-"+age+"-"+"Name-"+name;
    }
}

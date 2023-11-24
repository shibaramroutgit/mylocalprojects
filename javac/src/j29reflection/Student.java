package j29reflection;

public class Student {



    public String name;
    public int age;
    private String mobile;

    public Student()
    {

    }
    public Student(String name, int age, String mobile)
    {
        this.name=name;
        this.age=age;
        this.mobile=mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    private String userAdress()
    {
        return name+"-"+mobile;
    }
    public String userInfo(String Name)
    {
        setName(Name);
       return this.name;
    }


}

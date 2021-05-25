package chapterExercise;

public class Homework02 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("jack",50,"教授",10000);
        System.out.println(teacher.introduce());
    }
}

class Teacher{
    private String name;
    private int age;
    private String post;
    private double salary;

    public String introduce(){
        return "name="+name+" age="+age+" post="+post+" salary="+salary;
    }

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Authoer extends Teacher{

    public Authoer(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public String introduce() {
        return "name="+getName()+" age="+getAge()+" post="+getPost()+
                " salary=" + getSalary();
    }
}

class exAuthoer extends Teacher{
    public exAuthoer(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public String introduce() {
        return "name="+getName()+" age="+getAge()+" post="+getPost()+" salary=" + getSalary()*1.2;
    }
}

class jiangshi extends Teacher{
    public jiangshi(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public String introduce() {
        return "name="+getName()+" age="+getAge()+" post="+getPost()+" salary=" + getSalary()*1.1;
    }
}
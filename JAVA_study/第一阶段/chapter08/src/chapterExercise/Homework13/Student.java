package chapterExercise.Homework13;

public class Student extends Person{
    private String stu_id;
    private String hobby = "足球";

    public Student(String name, char sex, int age, String stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }
    public void study(){
        System.out.println("我承诺，我会 好好学习");
    }

    @Override
    public String play() {
        return super.play()+hobby;
    }
    public void printInfo(){
        System.out.println("学生的信息:");
        super.printInfo();
        System.out.println("学号："+getStu_id());
        System.out.println(this.play());
        this.study();
    }
}

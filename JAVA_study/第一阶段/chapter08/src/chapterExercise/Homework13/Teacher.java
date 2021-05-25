package chapterExercise.Homework13;

public class Teacher extends Person {
    private int work_age;
    private String hobby = "象棋";

    public Teacher(String name, char sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }
    public void teach(){
        System.out.println("我承诺，我会认真教课");
    }

    @Override
    public String play() {
        return super.play()+hobby;
    }
    public void printInfo(){
        System.out.println("老师的信息:");
        super.printInfo();
        System.out.println("工龄："+work_age);
        System.out.println(this.play());
        this.teach();
    }
}


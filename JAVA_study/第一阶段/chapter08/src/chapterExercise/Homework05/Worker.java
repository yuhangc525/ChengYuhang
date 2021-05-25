package chapterExercise.Homework05;

public class Worker extends Employee{
    public Worker(String name, double sal) {
        super(name, sal);
    }

    @Override
    public void printSal() {
        System.out.println("工人工资：");
        super.printSal();
    }
}

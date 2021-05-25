package chapterExercise.Homework05;

public class Peasant extends Employee{
    public Peasant(String name, double sal) {
        super(name, sal);
    }

    @Override
    public void printSal() {
        System.out.println("农民工资：");
        super.printSal();
    }
}

package chapterExercise.Homework05;

public class Teacher extends Employee{
    private double classSal;
    private int classDay;

    public Teacher(String name, double sal, double classSal, int classDay) {
        super(name, sal);
        this.classSal = classSal;
        this.classDay = classDay;
    }

    @Override
    public void printSal() {
        System.out.println("教师工资：");
        System.out.println(getName()+" salary:"+(getSal()*getSalMonth()+classSal*classDay));
    }
}

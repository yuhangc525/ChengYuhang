package chapterExercise;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, int days, double grade) {
        super(name, salary, days, grade);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void Salary() {
        System.out.println("manage:"+getName()+" salary:"+(bonus+getDays()*getSalary()*getGrade()));
    }
}

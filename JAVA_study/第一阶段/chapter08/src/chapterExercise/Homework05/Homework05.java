package chapterExercise.Homework05;

public class Homework05 {
    public static void main(String[] args) {
        Worker jack = new Worker("jack", 5000);
        jack.printSal();
        Teacher huang = new Teacher("huang", 6000, 200, 30);
        huang.setSalMonth(13);
        huang.printSal();
        Scientist yuan = new Scientist("yuan", 8000, 20000);
        yuan.printSal();


    }
}

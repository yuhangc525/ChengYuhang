package chapterExercise;

public class Homework01 {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person("jack",20,"student");
        persons[1] = new Person("monkey",13,"baby");
        persons[2] = new Person("jack",35,"teacher");

        for (int i = 0; i < 3; i++) {
            for(int j = i+1;j < 3; j++){
                if(persons[i].getAge()<persons[j].getAge()){
                    Person temp=null;
                    temp = persons[i];
                    persons[i] = persons[j];
                    persons[j] = temp;
                }
            }

        }
        for (int i = 0; i < 3; i++) {
            System.out.println(persons[i]);

        }
    }
}

class Person{
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}

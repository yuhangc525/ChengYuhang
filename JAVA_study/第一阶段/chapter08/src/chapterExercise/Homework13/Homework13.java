package chapterExercise.Homework13;

public class Homework13 {
    public static void main(String[] args) {
        Person[] persons = new Person[4];
        persons[0] = new Student("jack",'男',15,"002311");
        persons[1] = new Student("david",'男',21,"004545");
        persons[2] = new Teacher("li",'女',46,6);
        persons[3] = new Teacher("zhang",'女',34,2);
//        persons[3].printInfo();
        Person temp;
        for (int i = 0; i < persons.length; i++) {
            for(int j = i+1;j < persons.length;j++){
                if(persons[i].getAge()<persons[j].getAge()){
                    temp = persons[i];
                    persons[i] = persons[j];
                    persons[j] = temp;
                }
            }
        }
        for (int i = 0; i < persons.length; i++) {
            persons[i].printInfo();
        }
    }
}

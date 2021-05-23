package com.cheng.poly_.polyarr;

public class Ployarr {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("jack",20);
        persons[1] = new Student("jack",18,100);
        persons[2] = new Teacher("scott",30,100);
        persons[3] = new Teacher("dahuang",29,1000);
        persons[4] = new Student("liang",18,99);

        for (int i = 0; i < persons.length; i++) {
//            System.out.println(persons[i].say());
            if (persons[i] instanceof Student) {
                Student student = (Student) persons[i];
                student.study();
            }else if(persons[i] instanceof Teacher){
                Teacher teacher = (Teacher) persons[i];
                teacher.teach();
            }else{
                System.out.println("Wrong");
            }
        }
    }
}

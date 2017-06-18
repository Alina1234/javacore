package com.alina1234.runners;

import com.alina1234.app.classwork.lessonOOP.Person;
import com.alina1234.app.classwork.lessonOOP.Student;
import com.alina1234.app.classwork.lessonOOP.Teacher;

/**
 * Created by agr on 6/8/2017.
 */
public class OverrideRunner {
    public static void main(String[] args) {
        Student student = new Student ("Egor", "kit center");
        System.out.println(student.getResponse("What is class?"));

        Teacher teacher = new Teacher("Ivan", "kit center");
        System.out.println(teacher.getResponse("What time is it now?"));

        Person person = new Student("Ilya", "kit center");
        System.out.println(person.getResponse("What is class?"));

        person = new Teacher("Evgeniy", "kit center");
        System.out.println(teacher.getResponse("What time is now?"));
    }
}

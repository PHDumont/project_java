package javacore.Aintroductionclasses.test;

import javacore.Aintroductionclasses.domain.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.age = 21;
        student.name = "Pedro";
        student.gender = 'M';

        System.out.println(student.age);
        System.out.println(student.name);
        System.out.println(student.gender);
    }
}

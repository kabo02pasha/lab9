package ru.mirea.lab9.number2;

import java.util.ArrayList;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Pavel", 100));
        students.add(new Student("Ahmed", 77));
        students.add(new Student("Habib", 66));
        students.add(new Student("Artem", 99));

        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.quickSort(students,0, students.size()-1);
        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getExamScore());
        }
    }
}

package ru.mirea.lab9.number2;
import java.util.Comparator;
import java.util.List;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        double gpa1 = o1.getExamScore();
        double gpa2 = o2.getExamScore();
        return Double.compare(gpa2, gpa1);
    }

    public void quickSort(List<Student> students, int low, int high) {
        if (low < high) {
            int Index = partition(students, low, high);
            quickSort(students, low, Index - 1);
            quickSort(students, Index + 1, high);
        }
    }

    public int partition(List<Student> students, int low, int high) {
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (compare(students.get(j), students.get(high)) > 0) {
                i++;
                Student temp = students.get(i);
                students.set(i, students.get(j));
                students.set(j, temp);
            }
        }
        Student temp = students.get(i + 1);
        students.set(i + 1, students.get(high));
        students.set(high, temp);

        return i + 1;
    }
}
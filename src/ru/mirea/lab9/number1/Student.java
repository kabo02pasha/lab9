package ru.mirea.lab9.number1;

public class Student implements Comparable<Student> {
    private final int iDNumber;
    private final String name;

    public Student(int iDNumber, String name) {
        this.iDNumber = iDNumber;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getiDNumber() {
        return iDNumber;
    }

    @Override
    public String toString() {
        return "student{" +
                "iDNumber=" + iDNumber +
                '}';
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.iDNumber, other.iDNumber);
    }
}

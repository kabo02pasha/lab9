package ru.mirea.lab9.number2;
public class Student {
    public String name;
    public int examScore;

    public Student(String name, int examScore) {
        this.name = name;
        this.examScore = examScore;
    }

    public int getExamScore() {
        return examScore;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", examScore=" + examScore +
                '}';
    }
}
package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


import java.util.ArrayList;

public class ClassroomTest {
    Classroom classroom;
    Student[] students;

    @Before
    public void initialize() {
        students = new Student[30];
        Double[] student1Score = new Double[]{95.0};
        Double[] student2Score = new Double[]{90.0};

        Student student1 = new Student("John", "Jacobs", student1Score);
        Student student2 = new Student("Lewis", "Little", student2Score);
        students[0] = student1;
        students[1] = student2;
        classroom = new Classroom(students);

    }

    @Test
    public void getStudents() {
        Student[] expected = students;
        Student[] actual = classroom.getStudents();
        assertEquals(expected, actual);
    }

    @Test
    public void getAverageExamScore() {
        Double expected = 92.5;
        Double actual = classroom.getAverageExamScore();
        assertEquals(expected, actual);
    }

    @Test
    public void addStudent() {
    }

    @Test
    public void removeStudent() {
    }

    @Test
    public void getStudentByScore() {
    }

    @Test
    public void getGradeBook() {
    }

    @Test
    public void getStudentCount() {
        int expected = 2;
        int actual = classroom.getStudentCount();
        assertEquals(expected, actual);
    }
}

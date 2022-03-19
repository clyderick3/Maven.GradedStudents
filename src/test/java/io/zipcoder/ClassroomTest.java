package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.Arrays;

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
        // : Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = {100.0, 150.0, 250.0, 0.0};
        Student student = new Student("Leon", "Hunter", examScores);

        // When
        Student[] preEnrollment = classroom.getStudents();
        classroom.addStudent(student);
        Student[] postEnrollment = classroom.getStudents();

        // Then
        String preEnrollmentAsString = Arrays.toString(preEnrollment);
        String postEnrollmentAsString = Arrays.toString(postEnrollment);

        System.out.println("===========================");
        System.out.println(preEnrollmentAsString);
        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);
    }

    @Test
    public void removeStudent() {
        // : Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = {100.0, 150.0, 250.0, 0.0};
        Student student = new Student("Leon", "Hunter", examScores);

        // When
        classroom.addStudent(student);
        Student[] preEnrollment = classroom.getStudents();
        classroom.removeStudent(student.getFirstName(), student.getLastName());
        Student[] postEnrollment = classroom.getStudents();

        // Then
        String preEnrollmentAsString = Arrays.toString(preEnrollment);
        String postEnrollmentAsString = Arrays.toString(postEnrollment);

        System.out.println("===========================");
        System.out.println(preEnrollmentAsString);
        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);
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

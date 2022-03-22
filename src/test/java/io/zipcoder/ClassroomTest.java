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
        //Given
        Double[] examScores = {60.0, 50.0, 40.0, 30.0}; //Average score would be 45.0.
        Double[] examScores1 = {0.0, 0.0, 0.0, 10.0}; //Average score would be 2.5 for 4 tests.
        Double[] examScores2 = {100.0, 90.0, 100.0, 85.0};
        Double[] examScores3 = {50.0, 75.0, 80.0, 85.0};
        Double[] examScores4 = {0.0, 0.0};
        Double[] examScores5 = {85.0, 85.0, 85.0};

        Student s = new Student("Charles", "Minor", examScores);
        Student s1 = new Student("Miguel", "Major", examScores1);
        Student s2 = new Student("Antonio", "Biggs", examScores2);
        Student s3 = new Student("Sal", "Little", examScores3);
        Student s4 = new Student("Marcus", "Jack", examScores4);
        Student s5 = new Student("Chris", "Jill", examScores5);

        // When
        Student[] student = {s, s1, s2, s3, s4, s5};
        Classroom englishClass = new Classroom(student);
        Student[] postEnrollment = englishClass.getStudents();
        englishClass.getStudentByScore();
        Student[] afterSorting = englishClass.getStudents();

        // Then
        String postEnrollmentAsString = Arrays.toString(postEnrollment);
        System.out.println(postEnrollmentAsString);
        System.out.println(Arrays.toString(afterSorting));
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

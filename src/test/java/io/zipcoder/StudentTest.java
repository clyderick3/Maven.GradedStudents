package io.zipcoder;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class StudentTest {
    Student student;

    @Before
    public void initialize() {
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {100.0, 95.0, 123.0, 96.0};
        student = new Student(firstName, lastName, examScores);
    }

    @Test
    public void constructorTest() {
        //Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {100.0, 95.0, 123.0, 96.0};
        Student student = new Student(firstName, lastName, examScores);
        //When
        String actualFirstName = student.getFirstName();
        String actualLastName = student.getLastName();
        int actualExamScoresLength = student.getNumbersOfExamsTaken();
        //Then
        assertEquals(firstName, actualFirstName);
        assertEquals(lastName, actualLastName);
        assertEquals(examScores.length, actualExamScoresLength);
    }

    @Test
    public void getFirstNameTest() {
        //Given
        String firstName = "Kevin";
        String lastName = "Hunter";
        Double[] examScores = {100.0, 95.0, 123.0, 96.0};
        Student student = new Student(firstName, lastName, examScores);
        //When
        String actualFirstName = student.getFirstName();
        //Then
        assertEquals(firstName, actualFirstName);
    }

    @Test
    public void setFirstNameTest() {
        //Given
        String firstName = "Kevin";
        String lastName = "Hunter";
        Double[] examScores = {100.0, 95.0, 123.0, 96.0};
        Student student = new Student("Leon", lastName, examScores);
        student.setFirstName(firstName);
        //When
        String actualFirstName = student.getFirstName();
        //Then
        assertEquals(firstName, actualFirstName);
    }

    @Test
    public void getLastNameTest() {
        //Given
        String firstName = "Kevin";
        String lastName = "Hunter";
        Double[] examScores = {100.0, 95.0, 123.0, 96.0};
        Student student = new Student(firstName, lastName, examScores);
        //When
        String actualLastName = student.getLastName();
        //Then
        assertEquals(lastName, actualLastName);
    }

    @Test
    public void setLastNameTest() {
        //Given
        String firstName = "Kevin";
        String lastName = "Kidd";
        Double[] examScores = {100.0, 95.0, 123.0, 96.0};
        Student student = new Student(firstName, "King", examScores);
        student.setLastName(lastName);
        //When
        String actualLastName = student.getLastName();
        //Then
        assertEquals(lastName, actualLastName);
    }

    @Test
    public void getExamScoresTest() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {100.0, 95.0, 123.0, 96.0};
        Student student = new Student(firstName, lastName, examScores);

        // When
        String actual = student.getExamScores();
        String expected = "Exam Scores:\n" +
                "Exam 1 -> 100.0\n" +
                "Exam 2 -> 95.0\n" +
                "Exam 3 -> 123.0\n" +
                "Exam 4 -> 96.0\n";

        // Then
        assertEquals(expected, actual);

    }

    @Test
    public void getFirstName() {
        String firstName = "Michael";
        String lastName = "Brooks";
        Double[] examScores = {100.0, 95.0, 123.0, 96.0};
        Student students = new Student(firstName, lastName, examScores);
        assertEquals(firstName, students.getFirstName());
    }

    @Test
    public void setFirstName() {
        //Given
        String firstName = "Mercy";
        String lastName = "Grace";
        Double[] examScores = {100.0, 95.0, 123.0, 96.0};
        Student student = new Student(firstName, lastName, examScores);
        //When
        student.setFirstName("Mary");
        String expected = "Mary";
        //Then
        assertEquals(expected, student.getFirstName());

    }

    @Test
    public void getLastName() {
        String firstName = "Michael";
        String lastName = "Jackson";
        Double[] examScores = {100.0, 95.0, 123.0, 96.0};
        Student students = new Student(firstName, lastName, examScores);
        assertEquals(lastName, students.getLastName());
    }

    @Test
    public void setLastName() {
        //Given
        String firstName = "Grace";
        String lastName = "Grammer";
        Double[] examScores = {100.0, 95.0, 123.0, 96.0};
        Student student = new Student(firstName, lastName, examScores);
        //When
        student.setLastName("Gladstone");
        String expected = "Gladstone";
        //Then
        assertEquals(expected, student.getLastName());
    }

    @Test
    public void getExamScores() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {75.0, 95.0, 50.0};
        Student student = new Student(firstName, lastName, examScores);

        // When
        String output = student.getExamScores();
        String result = "Exam Scores:\nExam 1 -> 75.0\nExam 2 -> 95.0\nExam 3 -> 50.0\n";
        // Then
        assertEquals(result, output);
    }

    @Test
    public void getNumbersOfExamsTaken() {
        //Given an array of numbers.
        Double[] exams = {100.0, 95.0, 65.0};
        //When
        Student student = new Student("Jared", "Jones", exams);

        //Then
        // assertEquals(3, student.getNumbersOfExamsTaken());
        System.out.println(student.getNumbersOfExamsTaken());
    }

    @Test
    public void addExamScore() {
        //Given
        Double[] exams = {100.0, 95.0, 65.0};
        //When
        Student student = new Student("Jared", "Jones", exams);
        student.addExamScore(42.0);
        //Then
        System.out.println(student.getExamScores());
    }

    @Test
    public void setExamScore() {
        //Given
        Double[] exams = {100.0, 95.0, 65.0};
        //When
        Student student = new Student("Jared", "Jones", exams);
        student.setExamScore(1, 97.0);
        //Then
        System.out.println(student.getExamScores());
    }

    @Test
    public void getAverageExamScore() {
        Double expected = 103.5;
        Double actual = student.getAverageExamScore();
        assertEquals(expected, actual);
    }

    @Test
    public void testToString() {
        //Given
        Double[] exams = {100.0, 95.0, 65.0};
        //When
        Student student = new Student("Jacob", "Jack", exams);
        String result = student.toString();
        //Then
        System.out.println(result);
    }
}
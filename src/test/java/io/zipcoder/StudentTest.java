package io.zipcoder;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

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
    }

    @Test
    public void setFirstName() {
    }

    @Test
    public void getLastName() {
    }

    @Test
    public void setLastName() {
    }

    @Test
    public void getExamScores() {
    }

    @Test
    public void getNumbersOfExamsTaken() {
    }

    @Test
    public void addExamScore() {
    }

    @Test
    public void setExamScore() {
    }

    @Test
    public void getAverageExamScore() {
        Double expected = 103.5;
        Double actual = student.getAverageExamScore();
        assertEquals(expected, actual);
    }

    @Test
    public void testToString() {
    }
}
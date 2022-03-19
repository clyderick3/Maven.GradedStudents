package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void constructorTest() {
        //Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, examScores);
        //When
        String actualFirstName = student.getFirstName();
        String actualLastName = student.getLastName();
        int actualExamScoresLength = student.getNumbersOfExamsTaken();
        //Then
        Assert.assertEquals(firstName, actualFirstName);
        Assert.assertEquals(lastName, actualLastName);
        Assert.assertEquals(examScores.length, actualExamScoresLength);
    }

    @Test
    public void getFirstNameTest(){
        //Given
        String firstName = "Kevin";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, examScores);
        //When
        String actualFirstName = student.getFirstName();
        //Then
        Assert.assertEquals(firstName, actualFirstName);
    }

    @Test
    public void setFirstNameTest(){
        //Given
        String firstName = "Kevin";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student("Leon", lastName, examScores);
        student.setFirstName(firstName);
        //When
        String actualFirstName = student.getFirstName();
        //Then
        Assert.assertEquals(firstName, actualFirstName);
    }

    @Test
    public void getLastNameTest(){
        //Given
        String firstName = "Kevin";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, examScores);
        //When
        String actualLastName = student.getLastName();
        //Then
        Assert.assertEquals(lastName, actualLastName);
    }

    @Test
    public void setLastNameTest(){
        //Given
        String firstName = "Kevin";
        String lastName = "Kidd";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, "King", examScores);
        student.setLastName(lastName);
        //When
        String actualLastName = student.getLastName();
        //Then
        Assert.assertEquals(lastName, actualLastName);
    }

    @Test
    public void getExamScoresTest() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        String actual = student.getExamScores();
        String expected = "Exam Scores:\n" +
                            "Exam 1 -> 100.0\n" +
                             "Exam 2 -> 95.0\n" +
                             "Exam 3 -> 123.0\n" +
                            "Exam 4 -> 96.0\n";

        // Then
        Assert.assertEquals(expected, actual);

    }

}
package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    String firstName;
    String lastName;
    ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>(Arrays.asList(examScores));
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getExamScores() {
        //need to iterate through the list to get every exam score.
        String result = "Exam Scores:\n";
        int index = 1;
        for (int i = 0; i < examScores.size() ; i++) {
            result += "Exam " + index + " -> " + examScores.get(i) + "\n";
            index++;
        }
        return result;
    }

    public Integer getNumbersOfExamsTaken() {
        return this.examScores.size();
    }

    public void addExamScore(double examScore) {
        //Call this method so it adds another exam to this list.
        this.examScores.add(examScore);
    }

    public void setExamScore(int examNumber, double newScore) {
        this.examScores.add(examNumber, newScore);
    }
}


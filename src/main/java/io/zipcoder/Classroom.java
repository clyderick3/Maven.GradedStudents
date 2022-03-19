package io.zipcoder;

import java.util.*;
import java.util.stream.Collectors;

public class Classroom {

    Student[] students;
    int maxStudents;

    public Classroom() {
        this(30);
    }

    public Classroom(int maxStudents) {
        this.students = new Student[maxStudents];
        this.maxStudents = maxStudents;
    }

    public Classroom(Student[] array) {
        this.students = array;
        this.maxStudents = array.length;
    }

    public Student[] getStudents() {
        return students;
    }

    public Double getAverageExamScore() {
        Double result = 0.0;
        for (int i = 0; i < getStudentCount(); i++) {
            result += students[i].getAverageExamScore();
        }
        result = result / students.length;
        return result;
    }

    public boolean addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                return true;
            }
        }
        System.out.println("Classroom is at capacity.");
        return false;

    }

    public boolean removeStudent(String firstName, String lastName) {

        for (int i = 0; i < students.length; i++) {
            if (students[i].getFirstName().equals(firstName) &&
                    students[i].getLastName().equals(lastName)) {
                students[i] = null;
                List<Student> sortedList = Arrays.stream(students).sorted(Comparator.nullsLast(Comparator.comparing(Student::getLastName))).collect((Collectors.toList()));
                students = sortedList.toArray(new Student[students.length]);
                return true;
            }
        }
        return false;
    }

    public Student[] getStudentByScore() {
        // Sorting list using stream (Let's you use Comparator and lambdas. nullsLast means put nulls at the end.
        // Student::(what you're sorting by).
        //Collect turns the stream back into a list.
        List<Student> sortedList = Arrays.stream(students).sorted(Comparator.nullsLast(Comparator.comparing(Student::getAverageExamScore))).collect((Collectors.toList()));
        return sortedList.toArray(new Student[students.length]);

    }

    public Map<Student, String> getGradeBook() {
        Map<Student, String> result = new HashMap();
        //if there are nulls it won't work with the length of the students.
        int countToStudents = getStudentCount();
        int top10 = (int) Math.ceil(10.0 / 100.0 * countToStudents);
        int top29 = (int) Math.ceil(29.0 / 100.0 * countToStudents);
        int top50 = (int) Math.ceil(50.0 / 100.0 * countToStudents);
        int top89 = (int) Math.ceil(89.0 / 100.0 * countToStudents);
        Student[] toLoop = getStudentByScore();

        for (int i = 0; i < toLoop.length; i++) {
            if (i + 1 <= top10) {
                result.put(toLoop[i], "A");
            } else if (i + 1 <= top29) {
                result.put(toLoop[i], "B");
            } else if (i + 1 <= top50) {
                result.put(toLoop[i], "C");
            } else if (i + 1 <= top89) {
                result.put(toLoop[i], "D");
            } else {
                result.put(toLoop[i], "F");
            }
        }

        return result;
    }

    public int getStudentCount() {
        int count = 0;
        Student[] toLoop = getStudentByScore();
        for (int i = 0; i < toLoop.length; i++) {
            if (toLoop[i] != null) {
                count++;
            }
        }

        return count;

    }
}

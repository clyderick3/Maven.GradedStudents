package io.zipcoder;

import java.util.*;
import java.util.stream.Collectors;

public class Classroom {

    Student[] students;

    public Classroom() {
        this.students = new Student[30];
    }

    public Classroom(Integer maxNumberOfStudents) {
        this.students = new Student[maxNumberOfStudents];
    }

    public Classroom(Student[] newStudentArray) {
        this.students = new Student[newStudentArray.length];
        for (int i = 0; i < newStudentArray.length; i++) {
            students[i] = newStudentArray[i];
        }
    }

    public Student[] getStudents() {
        return students;
    }

    public Double getAverageExamScore() {
        Double result = 0.0;
        for (int i = 0; i < getStudentCount(); i++) {
            result += students[i].getAverageExamScore();
        }
        result = result / getStudentCount();
        return result;
    }

    public void addStudent(Student student) {
        ArrayList<Student> addStudentArray = new ArrayList<>
                (Arrays.asList(this.students)); // might be the issue - it creates a list from
        addStudentArray.add(student);  // the parameter 'Student student' instead of the class
        this.students = addStudentArray.toArray(new Student[0]);   // same concept as removing a student

        System.out.println("Classroom is at capacity.");
    }

    public void removeStudent(String firstName, String lastName) {
        ArrayList<Student> removeStudentArray = new ArrayList<>(Arrays.asList(students));
        for (int i = 0; i < removeStudentArray.size(); i++) {
            if (removeStudentArray.get(i) != null) {
                String actualFirstName = removeStudentArray.get(i).getFirstName();
                String actualLastName = removeStudentArray.get(i).getLastName();
                if (actualFirstName == firstName && actualLastName == lastName) {
                    removeStudentArray.remove(i);
                }
            }
        }
        this.students = removeStudentArray.toArray(new Student[0]);
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

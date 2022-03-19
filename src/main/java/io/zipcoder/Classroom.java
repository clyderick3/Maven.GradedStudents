package io.zipcoder;

public class Classroom {

    Student[] students;
    int maxStudents;

    public Classroom() {
        this(30);
    }

    public Classroom (int maxStudents){
        this.students = new Student [maxStudents];
        this.maxStudents = maxStudents;
    }

    public Classroom (Student[] array){
        this.students = array;
        this.maxStudents = array.length;
    }

    public Student[] getStudents() {
        return students;
    }

    public Double getAverageExamScore(){
        Double result = 0.0;
        for (int i = 0; i < students.length; i++){
                result += students[i].getAverageExamScore();
            }
                result = result / students.length;
        return result;
        }

        public boolean addStudent (Student student){
        for (int i = 0; i < students.length ; i++){
            if (students[i] == null) {
                students[i] = student;
                return true;
            }
        }
            System.out.println("Classroom is at capacity.");
            return false;

        }

        public boolean removeStudent (String firstName, String lastName){
        for (int i = 0; i < students.length ; i++){
            if (students[i].getFirstName().equals(firstName) &&
            students[i].getLastName().equals(lastName))
        }
        }



    }

package ALGO_3.data;

public class Student {
    private String surname;
    private String prename;
    private int matriculationNumber;
    private int course;


    public Student(String surname, String prename, int matriculationNumber, int course) {
        this.surname = surname;
        this.prename = prename;
        this.matriculationNumber = matriculationNumber;
        this.course = course;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPrename() {
        return prename;
    }

    public void setPrename(String prename) {
        this.prename = prename;
    }

    public int getMatriculationNumber() {
        return matriculationNumber;
    }

    public void setMatriculationNumber(int matriculationNumber) {
        this.matriculationNumber = matriculationNumber;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "surname='" + surname + '\'' +
                ", prename='" + prename + '\'' +
                ", matriculationNumber=" + matriculationNumber +
                ", course=" + course +
                '}';
    }
}

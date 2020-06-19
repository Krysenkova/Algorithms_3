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

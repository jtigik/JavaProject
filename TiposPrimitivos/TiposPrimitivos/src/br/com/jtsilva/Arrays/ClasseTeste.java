package br.com.jtsilva.arrays;

public class ClasseTeste extends StudentRecord {
    public ClasseTeste(String studentName, double[] testScores) {
        super(studentName, testScores);
    }

    public static void main(String[] args) {
        double[] scores = { 85.5, 90.0, 78.5, 92.5 };
        StudentRecord student1 = new StudentRecord("Alice", scores);
        student1.displayStudentInfo();
    }

}

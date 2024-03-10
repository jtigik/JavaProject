package br.com.jtsilva.tipos;

public class StudentRecordMain {
    public static void main(String[] args) {
        double[] scores = { 85.5, 90.0, 78.5, 92.5 };
        StudentRecord student1 = new StudentRecord("Alice", scores);
        student1.displayStudentInfo();
    }
}

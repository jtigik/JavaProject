package br.com.jtsilva.tipos;

public class StudentRecord {
    private String studentName;
    private double[] testScores;

    // Constructor to initialize student name and scores
    public StudentRecord(String studentName, double[] testScores) {
        this.studentName = studentName;
        this.testScores = testScores;
    }

    // Calculate average test score
    public double calculateAverageScore() {
        double sum = 0;
        for (double score : testScores) {
            sum += score;
        }
        return sum / testScores.length;
    }

    // Display student information
    public void displayStudentInfo() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Test Scores:");
        for (double score : testScores) {
            System.out.print(score + " ");
        }
        System.out.println("\nAverage Score: " + calculateAverageScore());
    }
}

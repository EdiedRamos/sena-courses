/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package learningactivity4;

/**
 *
 * @author ediei
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class LearningActivity4 {

    /**
     * @param args the command line arguments
     */
    private static final Scanner scanner = new Scanner(System.in);
    private static final int STUDENTS = 5;

    private static void calculateAverageUsingFor() {
        double average = 0.0, grade;
        for (int i = 0; i < STUDENTS; i++) {
            System.out.println("Nota del estudiante #" + (i + 1));
            grade = scanner.nextInt();
            average += grade;
        }
        average /= STUDENTS;
        System.out.println("El promedio es: " + average);
    }
    
    private static void calculateAverageUsingWhile() {
        double average = 0.0, grade;
        int i = 0;
        while (i++ < STUDENTS) {
            System.out.println("Nota del estudiante #" + (i));
            grade = scanner.nextInt();
            average += grade;
        }
        average /= STUDENTS;
        System.out.println("El promedio es: " + average);
    }
    
    private static void calculateAverageUsingDoWhile() {
        double average = 0.0, grade;
        int i = 0;
        do {
            System.out.println("Nota del estudiante #" + (i+1));
            grade = scanner.nextInt();
            average += grade;
        } while(++i < STUDENTS);
        average /= STUDENTS;
        System.out.println("El promedio es: " + average);
    }

    public static void main(String[] args) {
        // TODO code application logic here

        String option;

        try {

            do {
                System.out.println("\n\nSeleccione la materia:");
                System.out.println("[1]. Matemáticas.\n[2].Español.\n[3]. Inglés.\n[4]. Salir");

                option = scanner.nextLine();

                switch (option) {
                    case "1":
                        calculateAverageUsingFor();
                        break;
                    case "2":
                        calculateAverageUsingWhile();
                        break;
                    case "3":
                        calculateAverageUsingDoWhile();
                        break;
                    case "4":
                        System.out.println("Adios.");
                        break;
                    default:
                        System.out.println("Opción incorrecta.");
                }

            } while (!option.equals("4"));

        } catch (InputMismatchException ex) {
            System.out.println("Parece que has digitado algo incorrectamente.");
        }
    }

}

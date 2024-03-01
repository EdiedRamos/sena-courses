/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package learningactivity3;

/**
 *
 * @author ediei
 */

import java.util.Scanner;

public class LearningActivity3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        int a, b, c, height;
        double area = 0;

        System.out.println("Ingrese el lado del primer triángulo:");
        a = scanner.nextInt();
        
        System.out.println("Ingrese lado del segundo triángulo:");
        b = scanner.nextInt();
        
        System.out.println("Ingrese lado del tercer triángulo:");
        c = scanner.nextInt();
        
        System.out.println("Ingrese la altura del triángulo:");
        height = scanner.nextInt();
        
        int equalSides = 0;
        
        if (a == b) equalSides++;
        if (b == c) equalSides++;
        if (a == c) equalSides++;
        
        String triangleType = "Desconocido";
        
        switch (equalSides) {
            case 0:
                triangleType = "Escaleno";
                area = 1.0 / 2 * a * height;
                break;
            case 2:
                triangleType = "Isósceles";
                area = 1.0 / 2 * a * height;
                break;
            case 3:
                triangleType = "Equilátero";
                area = (Math.sqrt(3) / 4) * a * a;
                break;
        }
        
        double angleA = Math.acos((double)(b * b + c * c - a * a) / (double)(2 * b * c));
        double angleB = Math.acos((double)(a * a + c * c - b * b) / (double)(2 * a * c));
        double angleC = Math.acos((double)(a * a + b * b - c * c) / (double)(2 * a * b));
        
        System.out.println("Tipo de triángulo: " + triangleType);
        System.out.println("Valor del ángulo A: " + angleA);
        System.out.println("Valor del ángulo B: " + angleB);
        System.out.println("Valor del ángulo C: " + angleC);
        System.out.println("Área del triángulo: " +  area);
    }
    
}

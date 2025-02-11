package tarea1;

import java.util.Scanner;

public class Problema5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de x: ");
        double x = sc.nextDouble();
        
        double y = 5 * Math.pow(x, 3) - Math.pow(x, 2) + Math.sqrt(x) - 1;
        
        System.out.println("Evaluando el valor de x, el resultado es: " + y);
    }
}

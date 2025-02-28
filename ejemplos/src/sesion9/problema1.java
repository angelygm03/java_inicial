package sesion9;

import java.util.Scanner;

public class problema1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalMayores = 0, totalMenores = 0;
        int sumaMayores = 0, sumaMenores = 0;

        for (int i = 1; i <= 30; i++) {
            System.out.print(i + ". Ingresa el nombre: ");
            String nombre = scanner.nextLine();
            
            System.out.print("Ingresa la edad de " + nombre + ": ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            
            // Clasificar según la edad
            if (edad >= 18) {
                totalMayores++;
                sumaMayores += edad;
            } else {
                totalMenores++;
                sumaMenores += edad;
            }
        }
        double promedioMayores;
        if (totalMayores > 0) {
            promedioMayores = (double) sumaMayores / totalMayores;
        } else {
            promedioMayores = 0;
        }
        double promedioMenores;
        if (totalMenores > 0) {
            promedioMenores = (double) sumaMenores / totalMenores;
        } else {
            promedioMenores = 0;
        }
        System.out.println("Promedio de edades de los mayores de edad: " + promedioMayores);
        System.out.println("Promedio de edades de los menores de edad: " + promedioMenores);
    }
}


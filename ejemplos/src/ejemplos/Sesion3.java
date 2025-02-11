package ejemplos;

import java.util.Scanner;

public class Sesion3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre:");
        String nombre = sc.nextLine();
        System.out.println("Bienvenido " + nombre + ". Ingrese su edad: ");
        int edad = sc.nextInt();
        System.out.println("Ingrese su estatura:");
        double est = sc.nextDouble();
        System.out.println("Los datos ingresados son:");
        System.out.println("Nombre: " + nombre + " Edad: " + edad + " Estatura: " +est);
    }
}

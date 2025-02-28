package sesion5;

import java.util.Scanner;

public class ejemplo1 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int n1;
        int n2;
        System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese numero dividendo: ");
        n1 = sc.nextInt();
        System.out.println("Ingrese un numero divisor: ");
        n2 = sc.nextInt();
        if (n2 != 0) {
            System.out.println("El numero si puede ser divisor");
            System.out.println("El resutado de la division es: " + n1/n2);        
        }
        System.out.println(nombre + " Fin del programa.");
    }
}

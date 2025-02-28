package sesion10;

import java.util.Scanner;

public class problema3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        
        do {
            System.out.println("----- Menú -----");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opc = sc.nextInt();

            if (opc == 5) {
                System.out.println("¡Hasta luego!");
                break;
            }
            System.out.print("Ingresa el primer número: ");
            double num1 = sc.nextDouble();
            System.out.print("Ingresa el segundo número: ");
            double num2 = sc.nextDouble();
         } while (opc != 5);
    }
}


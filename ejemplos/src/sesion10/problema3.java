package sesion10;

import java.util.Scanner;

public class problema3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("------ Menu ------");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Ingresa una opcion: ");
            int opc = sc.nextInt();
            
            if (opc == 5) {
                System.out.println("Fin del programa");
                break;
            }
            System.out.println("Ingrese el primer numero: ");
            double num1 = sc.nextDouble();
            System.out.println("Ingrese el segundo numero: ");
            double num2 = sc.nextDouble();
        }
    }
}

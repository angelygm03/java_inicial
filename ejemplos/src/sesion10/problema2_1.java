package sesion10;

import java.util.Scanner;

public class problema2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int num = 0;
        
         do {
            System.out.print("Ingrese un numero positivo o negativo: ");
            num = sc.nextInt();
            
            // Solo sumar los números positivos
            if (num >= 0) {
                suma = (num + suma);
            }
        } while (num >= 0); 

        System.out.println("La suma total de los números ingresados es: " + suma);
    }
}

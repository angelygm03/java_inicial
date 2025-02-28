package sesion9;

import java.util.Scanner;

public class problema3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        int cant = 0;
        for (int i = 1; i <= 100; i++) {
            System.out.print("Ingrese un numero " + i + ": ");
            int numero = scanner.nextInt();
            if (numero % 2 != 0) {
                cant++;
            }
        }
        System.out.println("Cantidad de numeros impares ingresados: " + cant);
    }
}

